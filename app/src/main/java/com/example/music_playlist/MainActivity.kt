package com.example.music_playlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.music_playlist.ui.theme.Music_playlistTheme

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



                }
            }
        }





