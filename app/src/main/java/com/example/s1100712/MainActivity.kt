package com.example.s1100712

import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.s1100712.ui.theme.S1100712Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1100712Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting()
                   // FirstScreen()
                    Main()

                }
            }
        }
    }
}




/*
@Composable
fun FirstScreen(navController: NavController){

    /*Column( modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    */
        Column {
            Image(
                painter = painterResource(id = R.drawable.maria),
                contentDescription = "",
                modifier = Modifier
            )
            Text(
                text = "簡介" ,
                color = Color.Blue,
                modifier = Modifier
            )
            /*Button(onClick = {
                navController.navigate("JumpSecond")
            }) {
                Text(text = "我是畫面1，按一下跳至畫面2")
            }*/

        }




    }*/

/*Composable
fun Column(modifier: Modifier, verticalArrangement: Arrangement.HorizontalOrVertical, horizontalAlignment: Alignment.Horizontal) {

}*/
@OptIn(ExperimentalMaterial3Api::class)
/*@Composable
fun Main() {
    val navController = rememberNavController()
    val context = LocalContext.current
    var showMenu by remember { mutableStateOf(false) }
    Column {
        TopAppBar(
            title = { Text(text = "") },
            navigationIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "您點選了導覽圖示", Toast.LENGTH_SHORT).show()
                })

                {
                    Icon(Icons.Default.Menu, contentDescription = "Navigation icon")
                }
                IconButton(
                    onClick = { showMenu = true }
                ) {
                    Icon(Icons.Default.MoreVert, contentDescription = "More")

                    DropdownMenu(
                        expanded = showMenu, onDismissRequest = { showMenu = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text("畫面1") },
                            onClick = { navController.navigate("JumpFirst")})

                        DropdownMenuItem(
                            text = { Text("畫面2") },
                            onClick = { navController.navigate("JumpSecond")})
                    }

                }

            }

        )

        val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "JumpFirst") {
        composable("JumpFirst") {
            FirstScreen(navController = navController)
        }
        composable("JumpSecond") {
            SecondScreen(navController = navController)
        }
    }
    }
}

*/

@Composable
fun FirstScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.maria),
            contentDescription = "",
            modifier = Modifier
        )
        Text(
            text = "簡介",
            color = Color.Blue,
            modifier = Modifier
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main() {
    val navController = rememberNavController()
    val context = LocalContext.current
    var showMenu by remember { mutableStateOf(false) }

    Column {
        TopAppBar(
            title = { Text(text = "") },
            navigationIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "您點選了導覽圖示", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(Icons.Default.Menu, contentDescription = "Navigation icon")
                }
            },
            actions = {
                IconButton(
                    onClick = { showMenu = true }
                ) {
                    Icon(Icons.Default.MoreVert, contentDescription = "More")
                    DropdownMenu(
                        expanded = showMenu, onDismissRequest = { showMenu = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text("畫面1") },
                            onClick = { navController.navigate("JumpFirst") }
                        )
                        DropdownMenuItem(
                            text = { Text("畫面2") },
                            onClick = { navController.navigate("JumpSecond") }
                        )
                    }
                }
            }
        )

        NavHost(navController = navController, startDestination = "JumpFirst") {
            composable("JumpFirst") {
                FirstScreen(navController = navController)
            }
            composable("JumpSecond") {
                SecondScreen(navController = navController)
            }
        }
    }
}











//@Preview(showBackground = true)
/*@Composable
fun GreetingPreview() {
    S1100712Theme {
        Greeting("Android")
    }
}*/