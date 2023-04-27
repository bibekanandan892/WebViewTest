package com.bibekanandan892.webviewtest.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bibekanandan892.webviewtest.ticket_status.TicketSuccessStatusDto
import com.bibekanandan892.webviewtest.R
import com.bibekanandan892.webviewtest.ui.theme.AppBlue

@Composable
fun TicketSuccessStatusScreen() {
    Scaffold(modifier = Modifier.fillMaxSize(), topBar = { TopBar()}) {
        Column(
            modifier = Modifier
                .padding(it)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(50.dp))
            Image(painter = painterResource(id = R.drawable.ic_success_icon),
                contentDescription = "success icon",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(55.dp))
            Spacer(modifier = Modifier.height(20.dp))
            CustomTextField(title = "Transaction Successful!!", textSize = 18.dp, color = AppBlue, font = R.font.roboto_bold)

        }
    }
}