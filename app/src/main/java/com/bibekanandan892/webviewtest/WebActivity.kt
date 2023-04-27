package com.bibekanandan892.webviewtest

import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import com.bibekanandan892.webviewtest.screen.TicketSuccessStatusScreen
import com.bibekanandan892.webviewtest.ticket_status.TicketSuccessStatusDto
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.util.*


class WebActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var ticketSuccessStatusDto : TicketSuccessStatusDto? = null
        val intent = intent
        val data: Uri? = intent.data
        if (data != null) {
            val base64String = data.getQueryParameter("data")
            val decoder = Base64.getDecoder()
            val decodedBytes = decoder.decode(base64String)
            val decodedString = String(decodedBytes)
            ticketSuccessStatusDto= Json.decodeFromString<TicketSuccessStatusDto>(decodedString)
        }else{
            Toast.makeText(this, "else block", Toast.LENGTH_SHORT).show()
        }
        setContent {
            TicketSuccessStatusScreen()
        }
    }
}



