package com.abhishek.internships.identifier.linkup.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abhishek.internships.identifier.linkup.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = colorResource(id = R.color.prussian_blue),
                modifier = Modifier.size(58.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_chat),
                    contentDescription = "Add",
                    modifier = Modifier.size(28.dp)

                )
            }
        }
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {

            Box(modifier = Modifier.fillMaxWidth()){

                Text(text = "LinkUp",
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterStart),
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    color = colorResource(id = R.color.prussian_blue),
                    style = MaterialTheme.typography.headlineMedium
                )
            }
        }
    }


}