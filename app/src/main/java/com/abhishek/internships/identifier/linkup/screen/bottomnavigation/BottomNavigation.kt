package com.abhishek.internships.identifier.linkup.screen.bottomnavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abhishek.internships.identifier.linkup.R


@Composable
@Preview
fun BottomNavigation() {

    BottomAppBar(
        tonalElevation = 12.dp,
        containerColor = Color.White
    ) {

        Row(){

            Column(

            ) {

                Icon(

                    painter = painterResource(id = R.drawable.ic_home),
                )
            }
        }

    }

}