package com.feeltheboard.dubboluv.ui

import androidx.lifecycle.ViewModel
import com.feeltheboard.dubboluv.data.categoryList
import com.feeltheboard.dubboluv.model.Category
import com.feeltheboard.dubboluv.model.Destination
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class CategoriesViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(CategoryUiState())
    val uiState = _uiState

    fun updateCurrentCategory(selectedCategory: Category) {
        _uiState.update {
            it.copy(currentCategory = selectedCategory)
        }
    }

    fun navigateToCategoryListPage() {
        _uiState.update {
            it.copy(isShowingCategoryList = true)
        }
    }

    fun navigateToSelectedCategoryPage() {
        _uiState.update {
            it.copy(isShowingCategoryList = false)
        }
    }
}

data class CategoryUiState(
    val selectedCategoryList: List<Destination> = emptyList(),
    val currentCategory: Category = categoryList[0],
    val isShowingCategoryList: Boolean = true,
)