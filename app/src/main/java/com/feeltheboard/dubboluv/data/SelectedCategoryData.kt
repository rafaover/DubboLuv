package com.feeltheboard.dubboluv.data

import com.feeltheboard.dubboluv.R
import com.feeltheboard.dubboluv.model.Destination

val SelectedAsianFood: List<Destination> = listOf(
    Destination(
        // Tanoshi
        id = 1,
        titleId = R.string.tanoshi_title,
        destinationImageId = R.drawable.tanoshi,
        descriptionId = R.string.tanoshi_description,
        addressId = R.string.tanoshi_address,
    ),
    Destination(
        // Rose Garden
        id = 2,
        titleId = R.string.rosegarden_title,
        destinationImageId = R.drawable.rosegarden,
        descriptionId = R.string.rosegarden_description,
        addressId = R.string.rosegarden_address,
    ),
    Destination(
        // Amazing Thai
        id = 3,
        titleId = R.string.amazingthai_title,
        destinationImageId = R.drawable.amazingthai,
        descriptionId = R.string.amazingthai_description,
        addressId = R.string.amazingthai_address,
    ),
)

val SelectedCafe: List<Destination> = listOf(
    Destination(
        // Auctioneer
        id = 1,
        titleId = R.string.auctioneer_title,
        destinationImageId = R.drawable.auctioneercafe,
        descriptionId = R.string.auctioneer_description,
        addressId = R.string.auctioneer_address,
    ),
    Destination(
        // Creo Cafe
        id = 2,
        titleId = R.string.creo_title,
        destinationImageId = R.drawable.creocafe,
        descriptionId = R.string.creo_description,
        addressId = R.string.creo_address,
    ),
    Destination(
        // Dripp
        id = 3,
        titleId = R.string.dripp_title,
        destinationImageId = R.drawable.drippcafe,
        descriptionId = R.string.dripp_description,
        addressId = R.string.dripp_address,
    ),
)