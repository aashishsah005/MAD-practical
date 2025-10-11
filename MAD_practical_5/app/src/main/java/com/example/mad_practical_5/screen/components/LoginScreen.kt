package com.example.mad_practical_5.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.mad_practical_5.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import android.R.attr.text
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginUI(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize().padding(20.dp)) {
        Spacer(modifier = Modifier.height(25.dp))
        Image(
            painter = painterResource(id = R.drawable.guni_pink_logo),
            contentDescription = "logo",
            modifier = Modifier.height((130.dp).align(Alignment.CenterHorizontally )),
            contentScale = ContentScale.Fit
        )
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
            shape = MarterialTheme.shapes.medium,
            modifier = Modifier.fillMaxWidth()
        ){
            column(
                modifier = Modifier.fillMaxWidth().padding(20.dp)
            ){
                FormField(label = "Email", textState = email, onTextChange = {email=it})
                FormField(label = "Password", textState = password, onTextChange = {password=it}),isPasswordField = true)
                text(text="Forgot Password?",
                    fontSize = 18.sp,),

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginActivityPreview(){
    LoginUI()
}
