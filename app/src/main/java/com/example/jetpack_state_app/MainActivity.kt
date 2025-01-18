package com.example.jetpack_state_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_state_app.ui.theme.Jetpack_state_appTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackStateAppUi()
        }
    }

}


@Composable
fun JetPackStateAppUi() {
//    Declaring the initisal values
    var treasure = remember { mutableStateOf(0) }
    var diretction = remember { mutableStateOf("North") }
    var stormOrTreasure = remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 30.dp)
        ) {
            Text(text = "Treasure found: ${treasure.value}")
            Spacer(Modifier.height(20.dp))
            Text(text = "Current Direction: ${diretction.value}")
            Spacer(Modifier.height(20.dp))
            Text(text = "Strom Ahead: ${stormOrTreasure.value}")
        }
//       Selecting buttons
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = {
                    diretction.value = "East"
                    if (Random.nextBoolean()) {
                        treasure.value += 1
                        stormOrTreasure.value = "We found treasure yeah!!!"
                    } else {
                        stormOrTreasure.value = "Storm Ahead"
                    }
                }) {
                    Text(text = "Seal East")
                }
                Button(onClick = {
                    diretction.value = "West"
                    if (Random.nextBoolean()) {
                        treasure.value += 1
                        stormOrTreasure.value = "We found treasure yeah!!!"
                    } else {
                        stormOrTreasure.value = "Storm Ahead"
                    }
                }) {
                    Text(text = "Seal West")
                }

            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = {
                    diretction.value = "North"
                    if (Random.nextBoolean()) {
                        treasure.value += 1
                        stormOrTreasure.value = "We found treasure yeah!!!"
                    } else {
                        stormOrTreasure.value = "Storm Ahead"
                    }
                }) {
                    Text(text = "Seal North")
                }
                Button(onClick = {
                    diretction.value = "South"
                    if (Random.nextBoolean()) {
                        treasure.value += 1
                        stormOrTreasure.value = "We found treasure yeah!!!"
                    } else {
                        stormOrTreasure.value = "Storm Ahead"
                    }
                }) {
                    Text(text = "Seal South")
                }
            }
        }
    }
}






