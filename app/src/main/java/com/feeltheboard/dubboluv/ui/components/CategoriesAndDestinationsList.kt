package com.feeltheboard.dubboluv.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.feeltheboard.dubboluv.R
import com.feeltheboard.dubboluv.model.Category
import com.feeltheboard.dubboluv.model.Destination

@Composable
fun CategoriesAndDestinationsList(
    contentPadding: PaddingValues,
    onClick: (Category) -> Unit,
    onBackPressed: () -> Unit,
    destinationList: List<Destination>,
    modifier: Modifier = Modifier
) {
    Row {
        HomeScreenCategoryList(
            onClick = onClick,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = dimensionResource(R.dimen.padding_medium)),
            contentPadding = contentPadding,
        )
        SelectedCategoryDestinationList(
            onBackPressed = onBackPressed,
            destinationList = destinationList,
            modifier = Modifier
                .weight(2f),
            contentPadding = contentPadding,
        )
    }
}