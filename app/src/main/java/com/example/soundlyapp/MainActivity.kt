package com.example.soundlyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.data.SourceLocation
import androidx.compose.ui.tooling.preview.Preview
import com.example.soundlyapp.ui.theme.SoundlyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var Bestofsounds by remember{
                mutableStateOf("")
            }

            var Playlists by remember{
                mutableStateOf("")
            }
          Column {
              Text("Soundly app")

              OutlinedTextField(
                  value = Bestofsounds,
                  onValueChange = {text ->
                      Bestofsounds = text
                  },
                  placeholder = {
                      Text("Enter playlist")
                  }
              )

              Row {
                  Button(onClick = {
                      Playlists=when(Bestofsounds){
                          "Kelvin momo" -> "Soul to Soul"
                          "Ciza" -> "Isaka"
                          "Artwork Sounds" -> "Heaven only knows"
                          "Mordecai" -> "Ngeke n'Believe"
                          else -> "Invalid BestofSounds!"
                      }
                  }) {

                      Text("Search")
                  }
                  Button(onClick = {
                      Bestofsounds =""
                         Playlists=""
                  }) {
                      Text("Clear")
                  }
              }
              Row {
                  Button(onClick = {/*TODO*/}) {
                      Text("Exit")
                  }
              }

              val playlist = arrayOf("Kelvin momo, Ciza,Heaven only knowa,Ngeke n'Believe")
              val rating = arrayOf("5,4,5,5,5")
              val comments = arrayOf("Chill song, Best dance song,memories,relaxed song")
              Text(text="playlist by $Bestofsounds is:")
              Text(text=playlist)
          }
        }
    }
}


private fun Any.Text(text: Array<String>) {

}








