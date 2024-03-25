package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextPainter.paint
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){

    Column (modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.buss), contentScale = ContentScale.FillBounds))
    {

        val mContext = LocalContext.current

        //Start of top app bar
        TopAppBar(title = { androidx.compose.material3.Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu",
                        tint = Color.White)

                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "https://github.com/TrevorCecil/myApplication")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "share",
                tint = Color.White)
            }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "settings",
                        tint = Color.White)
                }
            })

        //End of top app bar
        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(
            text = "BREED OF DOGS",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 29.sp,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,)
        Spacer(modifier = Modifier.height(10.dp))
        // First row
       Row {
           Image(painter = painterResource(id = R.drawable.window), contentDescription = "window",
               modifier = Modifier.size(width = 200.dp, height = 150.dp))

           Spacer(modifier = Modifier.width(20.dp))

           Column {
               androidx.compose.material3.Text(text = "BULL DOG",
                   fontSize = 18.sp,
                   color = Color.White
               )
               androidx.compose.material3.Text(text = "Bull dog is an amazing dog",
                   color = Color.White)
           }
       }
        //End of first row

        Spacer(modifier = Modifier.height(10.dp))
        // Second row
        Row {
            Image(painter = painterResource(id = R.drawable.window), contentDescription = "window",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                androidx.compose.material3.Text(text = "BULL DOG",
                    fontSize = 18.sp,
                    color = Color.White)
                androidx.compose.material3.Text(text = "Bull dog is an amazing dog",
                    color = Color.White)
            }
        }
        //End of second row

        Spacer(modifier = Modifier.height(10.dp))
        // Third row
        Row {
            Image(painter = painterResource(id = R.drawable.window), contentDescription = "window",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                androidx.compose.material3.Text(text = "BULL DOG",
                    fontSize = 18.sp,
                    color = Color.White)
                androidx.compose.material3.Text(text = "Bull dog is an amazing dog",
                    color = Color.White)
            }
        }
        //End of third row

        Spacer(modifier = Modifier.height(10.dp))


        Row {
            Button(
                onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))

                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow back",
                    tint = Color.White)
                androidx.compose.material3.Text(
                    text = "Back",)
            }

            Spacer(modifier = Modifier.width(20.dp))

            Button(
                onClick = {mContext.startActivity(Intent(mContext,intentActivity::class.java))

                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                androidx.compose.material3.Text(
                    text = "Next",)
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "Forward ")
            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}
