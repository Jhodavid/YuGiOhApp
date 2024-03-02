package com.johcode.yugiohapp.compose.ui.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.johcode.yugiohapp.compose.ui.Screen
import com.johcode.yugiohapp.data.CardEntity

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onCardClick: (CardEntity) -> Unit = {},
) {

    Scaffold {
        Column {
            TextButton(
                onClick = {
                    Log.i("asd", "")
                }
            ) {
                Text(text = "Prueba botón")
            }
        }
    }
}

