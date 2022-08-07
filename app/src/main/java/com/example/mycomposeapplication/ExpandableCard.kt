package com.example.mycomposeapplication

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycomposeapplication.ui.theme.Shapes

@ExperimentalMaterialApi
@Composable
fun ExpandableCard() {
    var state by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(targetValue = if (state) 180f else 0f)
    Card(
        modifier = Modifier
            .fillMaxSize()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = Shapes.medium
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Latte",
                    modifier = Modifier.weight(6f),
                    fontWeight = FontWeight.Bold,
                    maxLines = 1
                )
                IconButton(
                    modifier = Modifier
                        .alpha(ContentAlpha.medium)
                        .weight(1f)
                        .rotate(rotationState),
                    onClick = { state = !state }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "drop-down arrow"
                    )
                }
            }
            if (state) {
                Text(
                    text = "Латте – один из самых популярных кофейных напитков с молоком. " +
                            "Название напитка происходит от итальянского caffé latte, что означает " +
                            "«кофе с молоком». В составе латте – молоко и эспрессо, так же как в " +
                            "латте макиато и капучино. Однако у латте есть свои характерные " +
                            "особенности. ",
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}