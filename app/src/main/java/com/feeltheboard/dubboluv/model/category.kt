package com.feeltheboard.dubboluv.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class category(
    val id: Int,
    @StringRes val categoryTitleId: Int,
    @DrawableRes val categoryIconId: Int,
    val destinations: List<destination>
)
