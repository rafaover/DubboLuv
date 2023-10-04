package com.feeltheboard.dubboluv.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.feeltheboard.dubboluv.ui.components.DubboLuvAppTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DubboLuvApp() {
    Scaffold (
        topBar = {
            DubboLuvAppTopBar()
        },
        content = {
            DubboLuvAppContent(paddingValues = it)
        }
    )
}

@Composable
fun DubboLuvAppContent(
    paddingValues: PaddingValues,
    modifier: Modifier = Modifier
) {
    TODO("Lazy Column with the categories and their data.")
}