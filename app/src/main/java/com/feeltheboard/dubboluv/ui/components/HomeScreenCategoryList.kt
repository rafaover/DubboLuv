package com.feeltheboard.dubboluv.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.feeltheboard.dubboluv.data.categoryList
import com.feeltheboard.dubboluv.model.Category

@Composable
fun HomeScreenCategoryList(
    contentPadding: PaddingValues,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = contentPadding
    ) {
        items(categoryList) {
            CategoryCard(
                modifier = modifier,
                category = it,
                onCardClick = onClick
            )
        }
    }
}