package com.feeltheboard.dubboluv.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp


val Shapes = Shapes(
    /** The default shape for category drawable. */
    small = RoundedCornerShape(80.dp),

    /** The main goal of this shape is to target the CARD composable.
    The card composable by default is a medium shape. So you do not need to specify it there.
    It will be applied automatically. */
//    medium = RoundedCornerShape(bottomStart = 12.dp),
    medium = RoundedCornerShape(12.dp),

    /** The default shape for the Selected Category Destinations Cards composable. */
    large = RoundedCornerShape(12.dp)
)