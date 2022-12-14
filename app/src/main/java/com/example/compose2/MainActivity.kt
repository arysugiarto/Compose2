package com.example.compose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose2.ui.theme.Compose2Theme
import org.w3c.dom.NameList

private val sampleName = listOf(
    "Andre",
    "Desta",
    "Parto",
    "Wendy",
    "Komeng",
    "Raffi Ahmad",
    "Andhika Pratama",
    "Vincent Ryan Rompies"
)


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose2Theme() {
                HelloJetpactkComposeApp()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(
        Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = painterResource(id = R.drawable.jetpack_compose),
            contentDescription = "Logo Jetpack Compose",
        modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = "Hello $name!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Hello ary")
        }

    }

}


@Composable
fun HelloJetpactkComposeApp() {
            Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            GreetingList(sampleName)
        }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun HelloJetpackComposePreview(){
        Compose2Theme {
            HelloJetpactkComposeApp()
        }
}
@Composable
fun GreetingList(names: List<String>){
    if (names.isNotEmpty()){
        Column {
            for (name in names){
                Greeting(name = name)
            }
        }
    }else{
        Text("No People to great :(" )
    }
}
