package com.example.assigment3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assigment3.ui.theme.Assigment3Theme
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Surface
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assigment3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtWork()
                }
            }
        }
    }
}

@Composable
fun ArtWork( modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {

//        Image


            Image(painter = painterResource(id = R.drawable.milky), contentDescription = "Milky way",
            modifier = Modifier.fillMaxSize().fillMaxWidth().padding(bottom=200.dp))

//        Description
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "ArtWork Title")
            Text(text = "ArtWork Artist (Year)")
        }

//        Buttons
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
            ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp).clip(shape = RoundedCornerShape(8.dp))) {
                Text(text = "Previous")
            }
            Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp).clip(shape = RoundedCornerShape(8.dp))) {
                Text(text = "  Next  ")
            }
        }



    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assigment3Theme {
        ArtWork()
    }
}