package com.example.mad_practical_5.screen.components

import android.icu.lang.UCharacter
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_practical_5.ui.theme.MAD_practical_5Theme
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.input.KeyboardType


@Composable
fun FormField(label:String,
              textState:String,
              onTextChange:(String)->Unit,
              isPasswordField:Boolean=false,
              isNumber:Boolean=false){
    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
        if (!isNumber){
            OutlinedTextField(value = textState,
                onValueChange = onTextChange,
                modifier = Modifier.padding(start = 16.dp),
                textStyle = LocalTextStyle.current.copy(fontSize = 20.sp),
                visualTransformation = (
                        if (isPasswordField)
                            PasswordVisualTransformation()
                        else
                            VisualTransformation.None
                        ),
                label = { Text("Enter $label") },
                placeholder = { Text("Enter $label") }
            )
        }
        else
            NumericOutLinedTextField(label=label, value = textState,modifier=Modifier.padding(start=16.dp).weight(2f), onValueChange = onTextChange)
    }
}

@Composable
fun NumericOutLinedTextField(label: String,
                             value: String,
                             modifier: Modifier,
                             onValueChange: (String) -> Unit) {

    OutlinedTextField(
        value = value,
        onValueChange = {
            newValue->
            if (newValue.all { it.isDigit() } }){
                onValueChange(newValue)
            }
        },
        Modifier = modifier,
        label = { Text("Enter $label") },
        textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
        placeholder = { Text("Enter $label") },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
        visualTransformation = VisualTransformation.None)

    // TODO("Not yet implemented") // Removed as it was causing a crash and was not needed
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MAD_practical_5Theme{
        FormField("Android","",{})
    }

}