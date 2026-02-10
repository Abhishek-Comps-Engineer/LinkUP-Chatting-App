package com.abhishek.internships.identifier.linkup.screen.welcomeui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhishek.internships.identifier.linkup.R


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun WelcomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.ic_welcome),
            contentDescription = "Welcome Illustration",
            modifier = Modifier.size(280.dp),
            colorFilter = ColorFilter.tint(
                colorResource(id = R.color.prussian_blue)
            )
        )

        Spacer(modifier = Modifier.size(24.dp))

        Text(
            text = "Welcome to LinkUp",
            fontSize = 24.sp,
            fontFamily = FontFamily(Font(R.font.poppins_bold)),
            color = colorResource(id = R.color.prussian_blue)
        )

        Spacer(modifier = Modifier.size(16.dp))

        // Privacy & Terms text
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Text(text = "Read our ")
                Text(
                    text = "Privacy Policy",
                    color = colorResource(id = R.color.teal_700)
                )
                Text(text = " and")
            }

            Row {
                Text(text = "accept the ")
                Text(
                    text = "Terms of Service",
                    color = colorResource(id = R.color.teal_700)
                )
            }
        }

        Spacer(modifier = Modifier.size(32.dp))

        Button(
            onClick = { /* TODO: Navigate */ },
            modifier = Modifier
                .size(width = 280.dp, height = 45.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.prussian_blue)
            )
        ) {
            Text(
                text = "Agree and Continue",
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}
