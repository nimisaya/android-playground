package com.nimisaya.messageui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nimisaya.messageui.ui.theme.MessageUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent{
                MessageUITheme {
                    MessageCard(Message("Nimi", "G\'day people"))
                }
            }
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row(Modifier.padding(16.dp)) {
        ProfilePicture()

        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = msg.author,
                style = MaterialTheme.typography.subtitle2,
                color = MaterialTheme.colors.secondaryVariant
                )
            Spacer(modifier= Modifier.height(4.dp))
            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp){
                Text(
                    text = msg.body,
                    modifier = Modifier.padding(all = 8.dp),
                    style = MaterialTheme.typography.subtitle2,
                )
            }
        }
    }
}

@Composable
fun ProfilePicture(){
    Box(modifier = Modifier
        .size(48.dp)
        .clip(CircleShape)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Contact profile picture background",
            modifier = Modifier.border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
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
    MessageUITheme {
        MessageCard(Message(author = "PersonName", body = "I\'m a Message"))
    }
}
