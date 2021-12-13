package com.nimisaya.messageui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nimisaya.messageui.ui.theme.MessageUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("G\'day world!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Text("G\'day world!")
}
