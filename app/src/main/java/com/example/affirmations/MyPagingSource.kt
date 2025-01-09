package com.example.affirmations

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Affirmation
import kotlinx.coroutines.delay
import kotlin.math.max

// The initial key used for loading.
// This is the article id of the first article that will be loaded
private const val STARTING_KEY = 0
private const val LOAD_DELAY_MILLIS = 3000L

/**
 * A [PagingSource] that loads articles for paging. The [Int] is the paging key or query that is used to fetch more
 * data, and the [Article1] specifies that the [PagingSource] fetches an [Article] [List].
 */
class MyPagingSource : PagingSource<Int, Affirmation>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Affirmation> {
        // If params.key is null, it is the first load, so we start loading with STARTING_KEY
        val startKey = params.key ?: STARTING_KEY

        // We fetch as many articles as hinted to by params.loadSize
        val range = startKey.until(startKey + params.loadSize)

        // NOTE: In Production App, We fetch data from repository/api here.
        val affirmationList = Datasource().loadAffirmations() // Load data from source/repository/API

        val response = affirmationList.slice(range)

        // Simulate a delay for loads after the initial load
        if (startKey != STARTING_KEY) delay(LOAD_DELAY_MILLIS)
        return LoadResult.Page(
            data = response,
            prevKey = when (startKey) {
                STARTING_KEY -> null
                else -> when (val prevKey = ensureValidKey(key = range.first - params.loadSize)) {
                    // We're at the start, there's nothing more to load
                    STARTING_KEY -> null
                    else -> prevKey
                }
            },
            nextKey = range.last + 1
        )
    }

    // The refresh key is used for the initial load of the next PagingSource, after invalidation
    override fun getRefreshKey(state: PagingState<Int, Affirmation>): Int? {
        // In our case we grab the item closest to the anchor position
        // then return its id - (state.config.pageSize / 2) as a buffer
        val anchorPosition = state.anchorPosition ?: return null
        val item = state.closestItemToPosition(anchorPosition) ?: return null
        return ensureValidKey(key = item.id - (state.config.pageSize / 2))
    }

    /**
     * Makes sure the paging key is never less than [STARTING_KEY]
     */
    private fun ensureValidKey(key: Int) = max(STARTING_KEY, key)
}