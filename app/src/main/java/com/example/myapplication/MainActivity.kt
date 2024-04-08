package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()


        }
    }
}

@Composable
fun Text(){

    Column(modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        val mContext = LocalContext.current

        androidx.compose.material3.Text(text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic)
        androidx.compose.material3.Text(text = "Android is a mobile operating system based on a modified version of the " +
                "Linux kernel and other open-source software, " +
                "designed primarily for touchscreen mobile devices such " +
                "as smartphones and tablets.")
        Spacer(modifier = Modifier.height(20.dp))
        androidx.compose.material3.Text(
            text = "Types of cars",
            fontSize = 29.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline)
        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(
            text = "1: Ferrari")

        androidx.compose.material3.Text(
            text = "2: Porsche")

        androidx.compose.material3.Text(text = "3: Mitsubishi")

        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Button(
                onClick = {  mContext.startActivity(Intent(mContext,DestinationActivity::class.java)) },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                androidx.compose.material3.Text(
                    text = "Destination",)
            }
        }

        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            //Lottie Animation
            val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.destination))
            val progress by animateLottieCompositionAsState(composition)
            LottieAnimation(composition, progress,
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
        }

        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(text = "Description about Porsche:",
            fontSize = 30.sp,
            modifier = Modifier.background(color = Color.Red),
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Center)
        androidx.compose.material3.Text(text = "Porsche, is a German automobile manufacturer specializing in high-performance sports cars, SUVs and sedans, headquartered in Stuttgart, Baden-Württemberg, Germany.")
        Spacer(modifier = Modifier.height(20.dp))
        Divider()
        //centering an image
       Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
           Image(painter = painterResource(id = R.drawable.street),
               contentDescription = " ", modifier = Modifier
                   .size(100.dp)
                   .clip(shape = CircleShape),
               contentScale = ContentScale.Crop)
       }


        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
                      },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            androidx.compose.material3.Text(
                text = "Next",)
        }
        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,FirstScreenActivity::class.java))
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            androidx.compose.material3.Text(
                text = "Contact Us",)
        }

        
    }

}




@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()

}