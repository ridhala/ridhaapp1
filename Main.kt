package com.example.happybirthdayy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.happybirthdayy.ui.theme.HappyBirthdayyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayyTheme {
                Box( // Use Box for full-screen background
                    modifier = Modifier.fillMaxSize()
                ) {
                    // Image background
                    Image(
                        painter = painterResource(id = R.drawable.birthday), // Replace with your image resource name
                        contentDescription = "Birthday background",
                        modifier = Modifier.fillMaxSize()
                    )

                    // Greeting text on top
                    Greeting("RIDHA")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayyTheme {
        Box( // Use Box for full-screen background
            modifier = Modifier.fillMaxSize()
        ) {
            // Image background
            Image(
                painter = painterResource(id = R.drawable.birthday), // Replace with your image resource name
                contentDescription = "Birthday background",
                modifier = Modifier.fillMaxSize()
            )

            // Greeting text on top
            Greeting("RIDHA")
        }
    }
}