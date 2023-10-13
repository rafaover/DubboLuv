package com.feeltheboard.dubboluv.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.feeltheboard.dubboluv.model.Category

@Composable
fun HomeScreenCategoryList(
    categoryList: List<Category>,
    contentPadding: PaddingValues,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = contentPadding,
        modifier = modifier
    ) {
        items(categoryList) {category ->
            CategoryCard(
                category = category,
                onCardClick = onClick
            )
        }
    }
}