package com.feeltheboard.dubboluv.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.dubboluv.R
import com.feeltheboard.dubboluv.ui.components.DubboLuvAppTopBar
import com.feeltheboard.dubboluv.ui.components.HomeScreenCategoryList
import com.feeltheboard.dubboluv.ui.components.SelectedCategoryDestinationList
import com.feeltheboard.dubboluv.ui.theme.DubboLuvTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DubboLuvApp() {
    val viewModel = CategoriesViewModel()
    val uiState by viewModel.uiState.collectAsState()
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
        if (uiState.isShowingCategoryList){
            HomeScreenCategoryList(
                contentPadding = innerPadding,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
                onClick = {
                    viewModel.updateCurrentCategory(it)
                    viewModel.navigateToSelectedCategoryPage()
                }
            )
        } else {
            SelectedCategoryDestinationList(
                onBackPressed = {
                    viewModel.navigateToCategoryListPage()
                },
                contentPadding = innerPadding,
                destinationList = uiState.selectedCategoryList,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DubboLuvAppPreview() {
    DubboLuvTheme(darkTheme = false) {
        DubboLuvApp()
    }
}

@Preview(showBackground = true)
@Composable
fun DubboLuvAppPreviewDarkTheme() {
    DubboLuvTheme(darkTheme = true) {
        DubboLuvApp()
    }
}