package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination (){

    val mContext = LocalContext.current
    Column (modifier =
    Modifier
        .fillMaxSize()
    ){
        //Start of top app bar
        TopAppBar(title = { Text(text = "Destination", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu",
                        tint = Color.White)

                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent= Intent(Intent.ACTION_SEND)
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

        Box (
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(id = R.drawable.street), contentDescription = "street",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop)
            androidx.compose.material3.Text(text = "Lets plan your next vacation",
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                textAlign = TextAlign.Justify)

        }
        //End of box
        Spacer(modifier = Modifier.height(10.dp))
        //search bar
        var search by remember {
            mutableStateOf("")
        }
        OutlinedTextField(value = search, onValueChange ={search=it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder = {androidx.compose.material3.Text(text = "Whats your next destination ?")},
            leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "Search")}
        )
        //end of search bar
        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(text = "Recently viewed destinations .",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start = 20.dp))

        Spacer(modifier = Modifier.height(10.dp))
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //card 1
            Card (modifier =
            Modifier
                .width(200.dp)
                .height(250.dp)){
                Column {
                    Box (modifier =
                    Modifier
                        .height(150.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.window), contentDescription = "window",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    androidx.compose.material3.Text(text = "NewYork",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }

            }
            //End of card 1
            Spacer(modifier = Modifier.width(10.dp))
            //card 1
            Card (modifier =
            Modifier
                .width(200.dp)
                .height(250.dp)){
                Column {
                    Box (modifier =
                    Modifier
                        .height(150.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.window), contentDescription = "window",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    androidx.compose.material3.Text(text = "NewYork",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }

            }
            //End of card 1
        }
        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { mContext.startActivity(Intent(mContext,ExploreActivity::class.java)) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(
                text = "Buy tickets",)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()

}