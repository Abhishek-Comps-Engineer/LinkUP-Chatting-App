package com.abhishek.internships.identifier.linkup.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.abhishek.internships.identifier.linkup.screen.home.ChatModel


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {
    val chatData= listOf<ChatModel>(
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM"),
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM"),
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM"),
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM"),
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM"),
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM"),
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM"),
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM"),
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM"),
        ChatModel(R.drawable.rashmika, "Rashmika", "Hello", "10:00 AM")
    )

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
                        .padding(horizontal=16.dp, vertical = 4.dp)
                        .align(Alignment.CenterStart),
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    color = colorResource(id = R.color.prussian_blue),
                    style = MaterialTheme.typography.headlineMedium
                )

                Row(
                    modifier = Modifier.align(Alignment.CenterEnd)
                ) {

                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }

            HorizontalDivider()

            LazyColumn() {
                items(chatData){
                    ChatItem(chatModel = it)
                }
            }

        }
    }


}