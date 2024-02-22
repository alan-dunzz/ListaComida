package com.example.listacomida.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.listacomida.R

// Set of Material typography styles to start with

val GochiHand = FontFamily(
    Font(R.font.gochihand_regular),
)

val PlayfairDisplay = FontFamily(
    Font(R.font.playfairdisplay_black),
    Font(R.font.playfairdisplay_bold),
    Font(R.font.playfairdisplay_medium),
    Font(R.font.playfairdisplay_regular),
    Font(R.font.playfairdisplay_semibold)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = GochiHand,
        fontWeight = FontWeight.Normal,
        fontSize =  30.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = PlayfairDisplay,
        fontWeight = FontWeight.Bold,
        fontSize =  20.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = GochiHand,
        fontWeight = FontWeight.Normal,
        fontSize =  20.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = PlayfairDisplay,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)