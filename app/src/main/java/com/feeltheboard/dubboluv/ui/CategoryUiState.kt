package com.feeltheboard.dubboluv.ui

import com.feeltheboard.dubboluv.data.categoryList
import com.feeltheboard.dubboluv.model.Category
import com.feeltheboard.dubboluv.model.Destination

data class CategoryUiState(
    val selectedCategoryList: List<Destination> = emptyList(),
    val currentCategory: Category = categoryList[0],
    val isShowingCategoryList: Boolean = true,
)
