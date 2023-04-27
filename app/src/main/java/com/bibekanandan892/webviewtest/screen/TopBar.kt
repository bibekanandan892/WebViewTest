package com.bibekanandan892.webviewtest.screen

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(
    isStartScreen: Boolean = false,
    showCalendar: Boolean = false,
    onCalendarClick: ()-> Unit = {}
) {
    val context = LocalContext.current
    Surface() {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Image(modifier = Modifier
                .clickable {
                    if (isStartScreen) {
                        (context as Activity).finish()
                    }
                }
                .padding(horizontal = 25.dp, vertical = 15.dp),
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "back")
            if (showCalendar) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "select Date", modifier = Modifier.clickable {
                    onCalendarClick.invoke()
                }.padding(end = 30.dp))
            } else {
                Image(painter = painterResource(id = com.bibekanandan892.webviewtest.R.drawable.ic_launcher_background),
                    contentDescription = "back",
                    modifier = Modifier
                        .height(28.dp)
                        .padding(end = 25.dp))
            }


        }
    }


}
