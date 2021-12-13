package com.nimisaya.messageui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Nimi", "G\'day people"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row {
        ProfilePicture()

        Spacer(modifier = Modifier.width(16.dp))
        Column(Modifier.padding(16.dp)) {
            Text(text = msg.author, fontWeight = FontWeight.Bold)
            Text(text = msg.body)
        }
    }
}

@Composable
fun ProfilePicture(){
    Box() {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Contact profile picture background colour",
        )
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Contact profile picture",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MessageCard(Message(author = "PersonName", body = "I\'m a Message"))
}
