package com.example.affirmations

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn

class MyViewModel : ViewModel() {
    val pager = Pager(PagingConfig(pageSize = 2)) {
            MyPagingSource()
    }

    val pagingDataFlow = pager.flow
        .cachedIn(viewModelScope)
}