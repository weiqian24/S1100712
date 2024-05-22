package com.example.s1100712

import android.app.Activity
import android.content.Intent
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
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.s1100712.ui.theme.S1100712Theme

class SecondAcyivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1100712Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
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
    val context = LocalContext.current  //取得App的運行環境
    val activity = (context as Activity)  //取得App運行的活動
    Column {
        Image(
            painter = painterResource(id = R.drawable.maria),
            contentDescription = "",
            modifier = Modifier
        )
        Text(text = "主要機構",
            color = Color.Red,
            modifier = Modifier)


        Text(text = "關於App作者：",
            modifier = Modifier)
        Image(
            painter = painterResource(id = R.drawable.me),
            contentDescription = "",
            modifier = Modifier.size(360.dp)
        )
        Button(

                onClick = {

                    val intent = Intent(activity, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                    context.startActivity(intent)
                    activity.finish()
                })
        {
            Text(text = "服務總覽")

        }




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