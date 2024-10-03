package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TaskCompletedScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskCompletedScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed), // Asegúrate de tener esta imagen en drawable
            contentDescription = null,
            modifier = Modifier.size(120.dp)
        )

        Text(
            text = stringResource(id = R.string.all_tasks_completed),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )

        Text(
            text = stringResource(id = R.string.nice_work),
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCompletedScreenPreview() {
    TaskManagerTheme {
        TaskCompletedScreen()
    }
}
