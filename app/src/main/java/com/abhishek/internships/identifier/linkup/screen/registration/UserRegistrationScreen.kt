package com.abhishek.internships.identifier.linkup.screen.registration

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhishek.internships.identifier.linkup.R


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun UserRegistrationScreen() {

    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("India") }
    var countryCode by remember { mutableStateOf("+91") }
    var phoneNumber by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Enter your phone number",
            fontSize = 22.sp,
            fontFamily = FontFamily(Font(R.font.poppins_bold)),
            color = colorResource(id = R.color.prussian_blue)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "LinkUp will need to verify your phone number.",
            fontSize = 14.sp,
            color = colorResource(id = R.color.gray)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Country selector
        Box(modifier = Modifier.fillMaxWidth()) {
            TextButton(
                onClick = { expanded = true },
                modifier = Modifier.fillMaxWidth()

            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = selectedCountry, fontSize = 16.sp, color = colorResource(id = R.color.prussian_blue))
                    Icon(Icons.Default.ArrowDropDown, contentDescription = null, Modifier.padding(horizontal = 10.dp))
                }
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                listOf(
                    "India" to "+91",
                    "USA" to "+1",
                    "China" to "+86",
                    "Russia" to "+7",
                    "Afghanistan" to "+93"
                ).forEach { (country, code) ->
                    DropdownMenuItem(
                        text = { Text(country) },
                        onClick = {
                            selectedCountry = country
                            countryCode = code
                            expanded = false
                        }
                    )
                }
            }
        }

        HorizontalDivider(
            thickness = 2.dp,
            color = colorResource(id = R.color.prussian_blue)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Phone input row (WhatsApp style)
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            OutlinedTextField(
                value = countryCode,
                onValueChange = {},
                enabled = false,
                modifier = Modifier.width(80.dp),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedTextColor = colorResource(id = R.color.prussian_blue),
                    unfocusedTextColor = colorResource(id = R.color.prussian_blue),

                    focusedIndicatorColor = colorResource(id = R.color.prussian_blue),
                    unfocusedIndicatorColor = colorResource(id = R.color.prussian_blue),

                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    cursorColor = colorResource(id = R.color.prussian_blue)
                )
            )

            Spacer(modifier = Modifier.width(8.dp))

            OutlinedTextField(
                value = phoneNumber,
                onValueChange = { phoneNumber = it },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedTextColor = colorResource(id = R.color.prussian_blue),
                    unfocusedTextColor = colorResource(id = R.color.prussian_blue),

                    focusedIndicatorColor = colorResource(id = R.color.prussian_blue),
                    unfocusedIndicatorColor = colorResource(id = R.color.prussian_blue),

                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    cursorColor = colorResource(id = R.color.prussian_blue)
                ),
                placeholder = {
                    Text("Phone number")
                }
            )
        }

        Spacer(modifier = Modifier.height(32.dp))


        Button(
            onClick = { /* TODO */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.prussian_blue)
            )
        ) {
            Text(
                text = "NEXT",
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )
        }

    }
}
