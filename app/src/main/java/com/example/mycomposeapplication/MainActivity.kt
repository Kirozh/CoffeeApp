package com.example.mycomposeapplication

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycomposeapplication.ui.theme.MyComposeApplicationTheme
import com.example.mycomposeapplication.ui.theme.Typography

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    Column() {
//                        Greeting("Android")
//                        CustomText("Privet")
//                    }
//                    CustomLayout()
                    ExpandableCard()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun CustomText(text: String) {
    Text(
        text = text,
        style = Typography.h5
    )
}

@ExperimentalMaterialApi
@Composable
fun CustomLayout() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box (
            modifier = Modifier.background(MaterialTheme.colors.secondary),
            contentAlignment = Alignment.Center
        ) {
            Box (
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(MaterialTheme.colors.primary),

            ) { }
//            Text(
//                text = "I love Android",
//                fontSize = 24.sp
//            )

        }
    }

}

@Composable
fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .weight(weight),
        color = color
    ) {}
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeApplicationTheme {
//        Row(
//            modifier = Modifier.fillMaxSize(),
//            horizontalArrangement = Arrangement.Start
//        ) {
//            CustomItem(weight = 3.0f, color = MaterialTheme.colors.primary)
//            CustomItem(weight = 1.0f, color = MaterialTheme.colors.secondary)
//        }
        ExpandableCard()
    }
}