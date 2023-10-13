package com.feeltheboard.dubboluv.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.feeltheboard.dubboluv.R
import com.feeltheboard.dubboluv.data.categoryList
import com.feeltheboard.dubboluv.ui.components.CategoriesAndDestinationsList
import com.feeltheboard.dubboluv.ui.components.DubboLuvAppTopBar
import com.feeltheboard.dubboluv.ui.components.HomeScreenCategoryList
import com.feeltheboard.dubboluv.ui.components.SelectedCategoryDestinationList
import com.feeltheboard.dubboluv.utils.ScreenContentType

@Composable
fun DubboLuvApp(
    windowSize: WindowWidthSizeClass,
    onBackPressed: () -> Unit,
) {
    val viewModel: CategoriesViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    val contentType: ScreenContentType = when(windowSize) {
        WindowWidthSizeClass.Compact -> ScreenContentType.CATEGORIES
        WindowWidthSizeClass.Medium -> ScreenContentType.CATEGORIES
        WindowWidthSizeClass.Expanded -> ScreenContentType.CATEGORIES_AND_DESTINATIONS
        else -> ScreenContentType.CATEGORIES
    }

    Scaffold (
        topBar = {
            DubboLuvAppTopBar(
                isShowingCategoryList = uiState.isShowingCategoryList,
                onBackButtonClick = { viewModel.navigateToCategoryListPage() },
                windowSize = windowSize
            )
        }
    ) { innerPadding ->
        if (contentType == ScreenContentType.CATEGORIES_AND_DESTINATIONS){
            CategoriesAndDestinationsList(
                categoryList = categoryList,
                destinationList = uiState.selectedCategoryList,
                onClick = {category ->
                    viewModel.updateCurrentCategory(category)
                    viewModel.updateSelectedCategoryList(category.destinations)
                    viewModel.navigateToSelectedCategoryPage()
                          },
                onBackPressed = onBackPressed,
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_medium)),
                contentPadding = innerPadding,
            )
        } else {
            if (uiState.isShowingCategoryList) {
                HomeScreenCategoryList(
                    categoryList = categoryList,
                    contentPadding = innerPadding,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
                    onClick = {category ->
                        viewModel.updateCurrentCategory(category)
                        viewModel.updateSelectedCategoryList(category.destinations)
                        viewModel.navigateToSelectedCategoryPage()
                    }
                )
            } else {
                SelectedCategoryDestinationList(
                    contentPadding = innerPadding,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
                    destinationList = uiState.selectedCategoryList,
                    onBackPressed = {
                        viewModel.navigateToCategoryListPage()
                    },
                )
            }
        }
    }
}