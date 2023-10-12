package com.feeltheboard.dubboluv.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.feeltheboard.dubboluv.R
import com.feeltheboard.dubboluv.model.Destination

@Composable
fun DestinationCard(
    destination: Destination,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .height(dimensionResource(R.dimen.destination_card_height)),
        elevation = CardDefaults.elevatedCardElevation()
    ) {
        Box {
            Column {
                Image(
                    painter = painterResource(destination.destinationImageId),
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(dimensionResource(id = R.dimen.destination_image_height))
                        .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp)),
                )
                Text(
                    text = stringResource(destination.titleId),
                    modifier = Modifier
                        .padding(dimensionResource(R.dimen.padding_medium)),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onPrimaryContainer

                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DestinationCardPreview() {
    DestinationCard(
        destination = Destination(
            id = 1,
            destinationImageId = R.drawable.rosegarden,
            titleId = R.string.rosegarden_title,
            descriptionId = R.string.rosegarden_description,
            addressId = R.string.rosegarden_address,
        )
    )
}