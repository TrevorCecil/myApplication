package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(){
    val mContext = LocalContext.current
    Column (modifier = Modifier.fillMaxSize()){
        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Row {
                Image(painter = painterResource(id = R.drawable.paws),
                    contentDescription = " ", modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                androidx.compose.material3.Text(text = "Woof",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 5.dp,top = 10.dp)
                    )
            }
        }
        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(start = 10.dp, end = 10.dp),
                RoundedCornerShape(bottomStart = 20.dp, topEnd = 20.dp)
            ){
                Row {
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription ="Dog",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Column (modifier = Modifier.padding(start = 10.dp, top = 20.dp, bottom = 20.dp)){
                        androidx.compose.material3.Text(text = "Koda",
                            fontWeight = FontWeight.ExtraBold)
                        androidx.compose.material3.Text(text = "2 years old")
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(start = 10.dp, end = 10.dp),
                RoundedCornerShape(bottomStart = 20.dp, topEnd = 20.dp)
            ){
                Row {
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription ="Dog",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Column (modifier = Modifier.padding(start = 10.dp, top = 20.dp, bottom = 20.dp)){
                        androidx.compose.material3.Text(text = "Koda",
                            fontWeight = FontWeight.ExtraBold)
                        androidx.compose.material3.Text(text = "2 years old")
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(start = 10.dp, end = 10.dp),
                RoundedCornerShape(bottomStart = 20.dp, topEnd = 20.dp)
            ){
                Row {
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription ="Dog",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Column (modifier = Modifier.padding(start = 10.dp, top = 20.dp, bottom = 20.dp)){
                        androidx.compose.material3.Text(text = "Koda",
                            fontWeight = FontWeight.ExtraBold)
                        androidx.compose.material3.Text(text = "2 years old")
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(start = 10.dp, end = 10.dp),
                RoundedCornerShape(bottomStart = 20.dp, topEnd = 20.dp)
            ){
                Row {
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription ="Dog",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Column (modifier = Modifier.padding(start = 10.dp, top = 20.dp, bottom = 20.dp)){
                        androidx.compose.material3.Text(text = "Koda",
                            fontWeight = FontWeight.ExtraBold)
                        androidx.compose.material3.Text(text = "2 years old")
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(start = 10.dp, end = 10.dp),
                RoundedCornerShape(bottomStart = 20.dp, topEnd = 20.dp)
            ){
                Row {
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription ="Dog",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Column (modifier = Modifier.padding(start = 10.dp, top = 30.dp, bottom = 20.dp)){
                        androidx.compose.material3.Text(text = "Koda",
                            fontWeight = FontWeight.ExtraBold)
                        androidx.compose.material3.Text(text = "2 years old")
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(start = 10.dp, end = 10.dp),
                RoundedCornerShape(bottomStart = 20.dp, topEnd = 20.dp)
            ){
                Row {
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription ="Dog",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Column (modifier = Modifier.padding(start = 10.dp, top = 20.dp, bottom = 20.dp)){
                        androidx.compose.material3.Text(text = "Koda",
                            fontWeight = FontWeight.ExtraBold)
                        androidx.compose.material3.Text(text = "2 years old")
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(start = 10.dp, end = 10.dp),
                RoundedCornerShape(bottomStart = 20.dp, topEnd = 20.dp)
            ){
                Row {
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription ="Dog",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Column (modifier = Modifier.padding(start = 10.dp, top = 20.dp, bottom = 20.dp)){
                        androidx.compose.material3.Text(text = "Koda",
                            fontWeight = FontWeight.ExtraBold)
                        androidx.compose.material3.Text(text = "2 years old")
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(start = 10.dp, end = 10.dp),
                RoundedCornerShape(bottomStart = 20.dp, topEnd = 20.dp)
            ){
                Row {
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription ="Dog",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 20.dp, bottom = 20.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Column (modifier = Modifier.padding(start = 10.dp, top = 30.dp, bottom = 20.dp)){
                        androidx.compose.material3.Text(text = "Koda",
                            fontWeight = FontWeight.ExtraBold)
                        androidx.compose.material3.Text(text = "2 years old")
                    }
                }
            }


        }

    }

}

@Preview(showBackground = true)
@Composable
fun LoginPreview(){
    Login()
}