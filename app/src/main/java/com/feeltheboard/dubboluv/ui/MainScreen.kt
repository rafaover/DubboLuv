package com.feeltheboard.dubboluv.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.feeltheboard.dubboluv.R
import com.feeltheboard.dubboluv.ui.components.DubboLuvAppTopBar
import com.feeltheboard.dubboluv.ui.components.HomeScreenCategoryList
import com.feeltheboard.dubboluv.ui.components.SelectedCategoryDestinationList
import com.feeltheboard.dubboluv.utils.ScreenContentType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DubboLuvApp(
    windowSize: WindowWidthSizeClass
) {
    val viewModel: CategoriesViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    val contentType: ScreenContentType

    when(windowSize) {
        WindowWidthSizeClass.Compact -> {
            contentType = ScreenContentType.CATEGORIES
        }
        WindowWidthSizeClass.Medium -> {
            contentType = ScreenContentType.CATEGORIES
        }
        WindowWidthSizeClass.Expanded -> {
            contentType = ScreenContentType.CATEGORIES_AND_DESTINATIONS
        } else -> {
            contentType = ScreenContentType.CATEGORIES
        }
    }

    Scaffold (
        topBar = {
            DubboLuvAppTopBar(
                isShowingCategoryList = uiState.isShowingCategoryList,
                onBackButtonClick = {
                    viewModel.navigateToCategoryListPage()
                }
            )
        }
    ) { innerPadding ->
        if (contentType == ScreenContentType.CATEGORIES_AND_DESTINATIONS){
            SelectedCategoryDestinationList(
                contentPadding = innerPadding,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
                destinationList = uiState.selectedCategoryList,
                onBackPressed = {
                    viewModel.navigateToCategoryListPage()
                },
            )
        } else {
            if (uiState.isShowingCategoryList) {
                HomeScreenCategoryList(
                    contentPadding = innerPadding,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
                    onClick = {
                        viewModel.updateCurrentCategory(it)
                        viewModel.updateSelectedCategoryList(it.destinations)
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