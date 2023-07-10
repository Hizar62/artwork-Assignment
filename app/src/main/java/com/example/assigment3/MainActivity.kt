package com.example.assigment3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material3.Card
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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
                    ArtSpace()
                }
            }
        }
    }
}

@Composable
fun ArtWork_image(imageResource:Int, textResource:String, titleResource:String ) {
    Column() {
        Image(painter = painterResource(id = imageResource), contentDescription = null,
                modifier = Modifier
                    .padding(20.dp)
                    .border(border = BorderStroke(2.dp, Color.Gray), shape = RectangleShape)
                    .height(450.dp)
                    .width(350.dp)
                    .shadow(elevation = 4.dp, shape = RectangleShape)
                    .padding(20.dp))


        Card(modifier= Modifier.padding(horizontal = 20.dp, vertical = 100.dp).align(Alignment.CenterHorizontally).fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text =titleResource, fontSize = 32.sp, fontWeight = FontWeight.Medium)
                Text(text =textResource, fontSize = 16.sp, fontWeight = FontWeight.Bold)

            }
        }


    }
}

@Composable
fun ArtSpace(){

    var result by remember{
        mutableStateOf(0)
    }

    Column() {
        when(result){
            1 -> ArtWork_image(imageResource = R.drawable.italy,
                textResource = stringResource(id = R.string.italy_dec),
                titleResource = stringResource(id = R.string.italy_street) )

            2 -> ArtWork_image(imageResource = R.drawable.milywa,
                textResource = stringResource(id = R.string.milywa_dec),
                titleResource = stringResource(id = R.string.mily_wa) )

            3 -> ArtWork_image(imageResource = R.drawable.sunset,
                textResource = stringResource(id = R.string.sunset_dec),
                titleResource = stringResource(id = R.string.sun_set) )

            4 -> ArtWork_image(imageResource = R.drawable.mountain,
                textResource = stringResource(id = R.string.mountain_dec),
                titleResource = stringResource(id = R.string.mountain) )

            else -> ArtWork_image(imageResource = R.drawable.jureslam,
                textResource = stringResource(id = R.string.jureslam_dec),
                titleResource = stringResource(id = R.string.jureslam) )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(0.dp, alignment = Alignment.CenterHorizontally),

            modifier = Modifier.padding(bottom= 10.dp). align(Alignment.CenterHorizontally)){

            Button(onClick = { result-- }, modifier = Modifier.padding(start = 20.dp,end=20.dp)) {
                Text(text = "Previous")
            }
            Button(onClick = { result++ },modifier = Modifier.padding(start = 20.dp,end=20.dp)) {
                Text(text = "  Next  ")
            }
        }
    }
    

        


}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assigment3Theme {
        ArtSpace()
    }
}