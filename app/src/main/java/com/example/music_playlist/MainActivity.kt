package com.example.music_playlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Set the app UI using Jetpack Compose
        setContent {
            // State variable to switch between "main" and "playlist" screen
            var currentScreen by remember { mutableStateOf("main") }

            //Parallel arrays to store song the details playlist

            val songTitles = remember { mutableStateListOf<String>() }
            val artistNames = remember { mutableStateListOf<String>() }
            val ratings = remember { mutableStateListOf<String>() }
            val comments = remember { mutableStateListOf<String>() }

            // State variables to hold input field values
            var songtitle by remember { mutableStateOf("") }
            var artistname by remember { mutableStateOf("") }
            var rating by remember { mutableStateOf("") }
            var comment by remember { mutableStateOf("") }

            // State for displaying input error messages
            var error by remember { mutableStateOf("") }

            // Root layout: vertical stack of components with padding and background color
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF5F5F5)) // Light grey background
                    .padding(24.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                when (currentScreen){

                    //First screen: User input form to add playlist
                    "main"->{
                        Text("Add Playlist", fontSize = 22.sp)

                        Spacer(modifier=Modifier.height(12.dp))

                        //Text fields for user input

                        OutlinedTextField(value = songtitle, onValueChange = { songtitle = it }, label = { Text("song title") })
                    }
                }

            }
        }
    }
}





