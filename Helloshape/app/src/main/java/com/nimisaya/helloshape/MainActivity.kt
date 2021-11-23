package com.nimisaya.helloshape

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimisaya.helloshape.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                ShapesLayout()
            }
        }
    }
}

@Composable
fun ShapesLayout() {
    Column(Modifier.padding(16.dp, 16.dp)) {
        Text(text = "Shapes", fontSize = 32.sp)
        Spacer(Modifier.height(8.dp))
        Shapes()
    }
}

@Composable
fun Shapes() {
    val padding = 8.dp
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Shape(RectangleShape, Purple200)
        Spacer(Modifier.size(padding))
        Shape(CutCornerShape(8.dp), Purple500)
        Spacer(Modifier.size(padding))
        Shape(RoundedCornerShape(12.dp), Purple700)
        Spacer(Modifier.size(padding))
        Shape(CircleShape, Teal200)
    }
}

@Composable
fun Shape(shape: Shape, color: Color) {
    Box(
        Modifier
            .size(32.dp)
            .clip(shape)
            .background(color)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        ShapesLayout()
    }
}
