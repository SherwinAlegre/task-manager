package com.example.taskmanager_lm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager_lm.ui.theme.TaskManagerLMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerLMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ChecknText(firstLine: String, secondLine: String) {
    val checkpic = painterResource(id = R.drawable.check)
    Box(modifier = Modifier.fillMaxHeight().fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally).wrapContentHeight(Alignment.CenterVertically)) {
        Column {
            Image(
                painter = checkpic,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .wrapContentHeight(CenterVertically)
            )
            Text(
                text = firstLine,
                fontSize = 24.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(top = 24.dp, bottom = 8.dp)
            )
            Text(
                text = secondLine,
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskManagerLMTheme {
        ChecknText(
            firstLine = stringResource(
                id = R.string.first_text),
            secondLine = stringResource(
                id = R.string.second_text)
        )
    }
}