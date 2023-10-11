package com.feeltheboard.dubboluv.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.dubboluv.R
import com.feeltheboard.dubboluv.data.SelectedAsianFood
import com.feeltheboard.dubboluv.model.Category

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryCard(
    onCardClick: (Category) -> Unit,
    category: Category,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(dimensionResource(R.dimen.category_card_height)),
        onClick = { onCardClick(category) },
        elevation = CardDefaults.cardElevation(
                dimensionResource(R.dimen.elevation_cards)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = modifier.size(dimensionResource(R.dimen.icon_category_card_size)),
                painter = painterResource(category.categoryIconId),
                contentDescription = stringResource(category.categoryTitleId),
                tint = MaterialTheme.colorScheme.secondary,
            )
            Text(
                text = stringResource(category.categoryTitleId),
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CategoryCardPreview() {
    CategoryCard(
        onCardClick = {},
        Category(
            id = 1,
            categoryTitleId = R.string.category1_asianfood,
            categoryIconId = R.drawable.asian_food_24,
            destinations = SelectedAsianFood

        ),
    )
}