package com.feeltheboard.dubboluv.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.feeltheboard.dubboluv.R
import com.feeltheboard.dubboluv.model.Category

@Composable
fun CategoryCard(
    category: Category,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column(modifier = modifier) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(R.dimen.padding_small))
            ) {
                Image(
                    modifier = modifier
                        .size(dimensionResource(R.dimen.image_size))
                        .padding(dimensionResource(R.dimen.padding_small))
                        .clip(MaterialTheme.shapes.small),
                    painter = painterResource(category.categoryIconId),
                    contentScale = ContentScale.Crop,
                    contentDescription = stringResource(category.categoryTitleId)
                )
                Text(
                    text = stringResource(category.categoryTitleId),
                    style = MaterialTheme.typography.displayMedium
                )
            }
        }
    }
}