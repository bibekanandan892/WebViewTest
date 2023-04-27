package com.bibekanandan892.webviewtest.screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bibekanandan892.webviewtest.R
import com.bibekanandan892.webviewtest.ui.theme.AppBlack

@Composable
fun CustomTextField(
    title: String = "title",
    color: Color = AppBlack,
    font: Int = R.font.roboto_medium,
    textSize: Dp = 14.dp,
    textAlign: TextAlign = TextAlign.Center,
    onClick: () -> Unit = {},
) {
    Text(text = title,
        style = TextStyle(color = color,
            fontFamily = FontFamily(fonts = listOf(Font(font))),
            fontSize = dpToSp(dp = textSize),
            textAlign = textAlign)
    )
}

@Composable
fun dpToSp(dp: Dp) = with(LocalDensity.current) { dp.toSp() }
