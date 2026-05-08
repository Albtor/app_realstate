package com.example.app_realstate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.app_realstate.ui.theme.App_realstateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

//        setContent {
//            App_realstateTheme {
//                HomePage()
//            }
//        }

        setContentView(R.layout.activity_main)
    }
}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomePage() {
//
//    var searchText by remember { mutableStateOf("") }
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(
//                        text = "Real Estate World",
//                        fontWeight = FontWeight.Bold
//                    )
//                },
//                navigationIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Home,
//                        contentDescription = "Logo",
//                        modifier = Modifier.padding(start = 12.dp)
//                    )
//                }
//            )
//        },
//
//        bottomBar = {
//            BottomAppBar {
//
//                IconButton(onClick = { }) {
//                    Icon(
//                        imageVector = Icons.Default.AccountCircle,
//                        contentDescription = "Account"
//                    )
//                }
//
//                Spacer(modifier = Modifier.weight(1f))
//
//                IconButton(onClick = { }) {
//                    Icon(
//                        imageVector = Icons.Default.Favorite,
//                        contentDescription = "Favorites"
//                    )
//                }
//
//                Spacer(modifier = Modifier.weight(1f))
//
//                IconButton(onClick = { }) {
//                    Icon(
//                        imageVector = Icons.Default.Home,
//                        contentDescription = "Mortgages"
//                    )
//                }
//            }
//        }
//
//    ) { innerPadding ->
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(innerPadding)
//                .padding(16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Top
//        ) {
//
//            Spacer(modifier = Modifier.height(20.dp))
//
//            // Search Bar
//            OutlinedTextField(
//                value = searchText,
//                onValueChange = { searchText = it },
//                modifier = Modifier.fillMaxWidth(),
//                placeholder = {
//                    Text("Search houses, cities, apartments...")
//                },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Search,
//                        contentDescription = "Search"
//                    )
//                },
//                shape = RoundedCornerShape(20.dp)
//            )
//
//            Spacer(modifier = Modifier.height(30.dp))
//
//            // Main House Card
//            Card(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(300.dp),
//                shape = RoundedCornerShape(24.dp),
//                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
//            ) {
//
//                Box {
//
//                    // Replace this image later with your own imagecardCornerRadius
//                    Image(
//                        painter = painterResource(id = R.drawable.house_main),
//                        contentDescription = "House Image",
//                        modifier = Modifier.fillMaxSize(),
//                        contentScale = ContentScale.Crop
//                    )
//
//                    Box(
//                        modifier = Modifier
//                            .align(Alignment.BottomStart)
//                            .fillMaxWidth()
//                            .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.85f))
//                            .padding(16.dp)
//                    ) {
//                        Column {
//                            Text(
//                                text = "$450,000",
//                                style = MaterialTheme.typography.headlineSmall,
//                                fontWeight = FontWeight.Bold
//                            )
//
//                            Text(
//                                text = "Modern House in Madrid",
//                                style = MaterialTheme.typography.bodyLarge
//                            )
//                        }
//                    }
//                }
//            }
//
//            Spacer(modifier = Modifier.height(24.dp))
//
//            Text(
//                text = "Find your dream home today",
//                style = MaterialTheme.typography.titleMedium
//            )
//        }
//    }
//}