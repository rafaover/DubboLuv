package com.feeltheboard.dubboluv.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Destination(
    val id: Int,
    @StringRes val titleId: Int,
    @DrawableRes val destinationImageId: Int,
    @StringRes val descriptionId: Int,
    @StringRes val addressId: Int,
//    @StringRes val phoneId: Int,
//    @StringRes val websiteId: Int,
//    @StringRes val hoursId: Int,
)
