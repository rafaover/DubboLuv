package com.feeltheboard.dubboluv.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.dubboluv.ui.components.DubboLuvAppTopBar
import com.feeltheboard.dubboluv.ui.components.HomeScreenCategoryList
import com.feeltheboard.dubboluv.ui.theme.DubboLuvTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DubboLuvApp() {
    Scaffold (
        topBar = {
            DubboLuvAppTopBar()
        },
        content = {
            HomeScreenCategoryList(contentPadding = it)
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DubboLuvAppPreview() {
    DubboLuvTheme {
        DubboLuvApp()
    }
}