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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyForm()
        }
    }
}

@Composable
fun MyForm(){
    Column (modifier =
    Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.buss), contentScale = ContentScale.FillBounds)
        .verticalScroll(rememberScrollState())
    ){

        var firstname by remember {mutableStateOf("") }
        var lastname by remember {mutableStateOf("") }
        var email by remember {mutableStateOf("") }
        var password by remember {mutableStateOf("") }
        var contact by remember {mutableStateOf("") }
        var location by remember {mutableStateOf("") }

        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.register), contentDescription = "register",
                modifier = Modifier.size(100.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
        androidx.compose.material3.Text(
            text = "Create an account",
            fontSize = 29.sp,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold

            )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = firstname,
            onValueChange = {firstname = it},
            placeholder = { androidx.compose.material3.Text(text = "Firstname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person")},
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = lastname,
            onValueChange = {lastname = it},
            placeholder = { androidx.compose.material3.Text(text = "Lastname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person")},
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = email,
            onValueChange = {email = it},
            placeholder = { androidx.compose.material3.Text(text = "Email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email")},
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = password,
            onValueChange = {password = it},
            placeholder = { androidx.compose.material3.Text(text = "Password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "person")},
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = contact,
            onValueChange = {contact = it},
            placeholder = { androidx.compose.material3.Text(text = "Contact")},
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "contact")},
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = location , onValueChange = {location = it},
            placeholder = { androidx.compose.material3.Text(text = "Location")},
            leadingIcon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "contact")},
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )
        Spacer(modifier = Modifier.height(20.dp))
        Box (modifier =
        Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center

        ){
            Button(
                onClick = { },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                Text(
                    text = "Signup",)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        androidx.compose.material3.Text(
            text = "Already have an account ? Login",
            fontSize = 15.sp,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold

        )

    }


}

@Preview(showBackground = true)
@Composable
fun MyFormPreview(){
    MyForm()
}