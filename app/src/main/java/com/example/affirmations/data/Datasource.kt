/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(1, R.string.affirmation1, R.drawable.image1),
            Affirmation(2, R.string.affirmation2, R.drawable.image2),
            Affirmation(3, R.string.affirmation3, R.drawable.image3),
            Affirmation(4, R.string.affirmation4, R.drawable.image4),
            Affirmation(5, R.string.affirmation5, R.drawable.image5),
            Affirmation(6, R.string.affirmation6, R.drawable.image6),
            Affirmation(7, R.string.affirmation7, R.drawable.image7),
            Affirmation(8, R.string.affirmation8, R.drawable.image8),
            Affirmation(9, R.string.affirmation9, R.drawable.image9),
            Affirmation(10, R.string.affirmation10, R.drawable.image10),
            Affirmation(11, R.string.affirmation11, R.drawable.image1),
            Affirmation(12, R.string.affirmation12, R.drawable.image2),
            Affirmation(13, R.string.affirmation13, R.drawable.image3),
            Affirmation(14, R.string.affirmation14, R.drawable.image4),
            Affirmation(15, R.string.affirmation15, R.drawable.image5),
            Affirmation(16, R.string.affirmation16, R.drawable.image6),
            Affirmation(17, R.string.affirmation17, R.drawable.image7),
            Affirmation(18, R.string.affirmation18, R.drawable.image8),
            Affirmation(19, R.string.affirmation19, R.drawable.image9),
            Affirmation(20, R.string.affirmation20, R.drawable.image10),
            Affirmation(21, R.string.affirmation21, R.drawable.image1),
            Affirmation(22, R.string.affirmation22, R.drawable.image2),
            Affirmation(23, R.string.affirmation23, R.drawable.image3),
            Affirmation(24, R.string.affirmation24, R.drawable.image4),
            Affirmation(25, R.string.affirmation25, R.drawable.image5),
            Affirmation(26, R.string.affirmation26, R.drawable.image6),
            Affirmation(27, R.string.affirmation27, R.drawable.image7),
            Affirmation(28, R.string.affirmation28, R.drawable.image8),
            Affirmation(29, R.string.affirmation29, R.drawable.image9),
            Affirmation(30, R.string.affirmation30, R.drawable.image10),
            Affirmation(31, R.string.affirmation31, R.drawable.image1),
            Affirmation(32, R.string.affirmation32, R.drawable.image2),
            Affirmation(33, R.string.affirmation33, R.drawable.image3),
            Affirmation(34, R.string.affirmation34, R.drawable.image4),
            Affirmation(35, R.string.affirmation35, R.drawable.image5),
            Affirmation(36, R.string.affirmation36, R.drawable.image6),
            Affirmation(37, R.string.affirmation37, R.drawable.image7),
            Affirmation(38, R.string.affirmation38, R.drawable.image8),
            Affirmation(39, R.string.affirmation39, R.drawable.image9),
            Affirmation(40, R.string.affirmation40, R.drawable.image10),
            Affirmation(41, R.string.affirmation41, R.drawable.image1),
            Affirmation(42, R.string.affirmation42, R.drawable.image2),
            Affirmation(43, R.string.affirmation43, R.drawable.image3),
            Affirmation(44, R.string.affirmation44, R.drawable.image4),
            Affirmation(45, R.string.affirmation45, R.drawable.image5),
            Affirmation(46, R.string.affirmation46, R.drawable.image6),
            Affirmation(47, R.string.affirmation47, R.drawable.image7),
            Affirmation(48, R.string.affirmation48, R.drawable.image8),
            Affirmation(49, R.string.affirmation49, R.drawable.image9),
            Affirmation(50, R.string.affirmation50, R.drawable.image10),
            Affirmation(51, R.string.affirmation51, R.drawable.image1),
            Affirmation(52, R.string.affirmation52, R.drawable.image2),
            Affirmation(53, R.string.affirmation53, R.drawable.image3),
            Affirmation(54, R.string.affirmation54, R.drawable.image4),
            Affirmation(55, R.string.affirmation55, R.drawable.image5),
            Affirmation(56, R.string.affirmation56, R.drawable.image6),
            Affirmation(57, R.string.affirmation57, R.drawable.image7),
            Affirmation(58, R.string.affirmation58, R.drawable.image8),
            Affirmation(59, R.string.affirmation59, R.drawable.image9),
            Affirmation(60, R.string.affirmation60, R.drawable.image10)
        )
    }
}
