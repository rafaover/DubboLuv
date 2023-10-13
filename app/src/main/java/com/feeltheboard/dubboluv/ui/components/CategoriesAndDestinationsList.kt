package com.feeltheboard.dubboluv.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.feeltheboard.dubboluv.data.SelectedAsianFood
import com.feeltheboard.dubboluv.data.categoryList
import com.feeltheboard.dubboluv.model.Category
import com.feeltheboard.dubboluv.model.Destination

@Composable
fun CategoriesAndDestinationsList(
    onClick: (Category) -> Unit,
    onBackPressed: () -> Unit,
    categoryList: List<Category>,
    destinationList: List<Destination>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
//    Log.d("CategoriesAndDestinations", "Destination List: $destinationList")
    Row(modifier = modifier.fillMaxWidth()) {
        HomeScreenCategoryList(
            onClick = onClick,
            contentPadding = contentPadding,
            categoryList = categoryList,
            modifier = Modifier
                .weight(1f)
        )
        SelectedCategoryDestinationList(
            onBackPressed = onBackPressed,
            destinationList = destinationList,
            modifier = Modifier.weight(2f),
            contentPadding = contentPadding
        )
    }
}

@Composable
@Preview(showBackground = true, device = Devices.TABLET)
fun CategoriesAndDestinationsListPreview() {
    CategoriesAndDestinationsList(
        onClick = {},
        onBackPressed = {},
        categoryList = categoryList,
        destinationList = SelectedAsianFood,
    )
}