package com.feeltheboard.dubboluv.ui.components

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.feeltheboard.dubboluv.model.Destination

@Composable
fun SelectedCategoryScreen(
    onClick: (Destination) -> Unit,
    onBackPressed: () -> Unit,
    contentPadding: PaddingValues,
    destinationList: List<Destination>,
    modifier: Modifier = Modifier
) {
    BackHandler {
        onBackPressed()
    }

    Column {
       LazyColumn(
           contentPadding = contentPadding
       ) {
           items(destinationList) {
                DestinationCard(
                     destination = it,
                     modifier = modifier,
                     onCardClick = onClick
                )
           }
       }
    }
}