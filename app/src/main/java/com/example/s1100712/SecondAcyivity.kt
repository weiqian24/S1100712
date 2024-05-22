package com.example.s1100712

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.s1100712.ui.theme.S1100712Theme

class SecondAcyivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1100712Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*Greeting2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    SecondScreen()
                }
            }
        }
    }

    private fun SecondScreen() {
        TODO("Not yet implemented")
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(navController: NavController) {

    Row {
        Image(
            painter = painterResource(id = R.drawable.maria),
            contentDescription = "",
            modifier = Modifier
        )
        Text(text = "主要機構",
            color = Color.Red,
            modifier = Modifier)

    }



}


@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {

}





@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    S1100712Theme {
        Greeting2("Android")
    }
}