package com.feeltheboard.dubboluv.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.feeltheboard.dubboluv.R

val AveriaSerifLibre = FontFamily(
    Font(R.font.averia_serif_libre_regular),
)

val AbrilFatFace = FontFamily(
    Font(R.font.abril_fatface_regular)
)
val Montserrat = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_bold, FontWeight.Bold),
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = AveriaSerifLibre,
        fontWeight=FontWeight.Bold,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Montserrat,
        fontWeight=FontWeight.Normal,
        fontSize=20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Montserrat,
        fontWeight=FontWeight.Bold,
        fontSize=12.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Montserrat,
        fontWeight=FontWeight.Normal,
        fontSize=14.sp
    )
)