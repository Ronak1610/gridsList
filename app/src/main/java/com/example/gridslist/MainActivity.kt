package com.example.gridslist

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.gridslist.data.DataSource
import com.example.gridslist.data.Topic
import com.example.gridslist.ui.theme.GridsListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GridsListTheme {
            Surface(
                ){
                dta()
                }
            }
        }
    }
}


@Composable
fun dta()

{ val layoutDirection = LocalLayoutDirection.current
Surface (modifier = Modifier
    .fillMaxSize()
    .systemBarsPadding()
    .padding(
        start = WindowInsets.safeDrawing
            .asPaddingValues()
            .calculateStartPadding(layoutDirection),
        end = WindowInsets.safeDrawing
            .asPaddingValues()
            .calculateEndPadding(layoutDirection))
    .background(color = Color.Gray)
){
Grid(data = DataSource.topics)
}
}







@Composable
fun Grid( data : List <Topic>,modifier: Modifier=Modifier,)
{
LazyVerticalGrid(columns = GridCells.Fixed(2),
    contentPadding = PaddingValues(top = 8.dp),
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    verticalArrangement = Arrangement.spacedBy(8.dp)) {

    items(data)
    {
         topics ->
            TopicCard( image =topics.imageResourceId , stringResourceId = topics.stringResourceId, number = topics.number)

    }
}
}
@Composable
fun TopicCard(image: Int, stringResourceId: Int, number: Int,modifier: Modifier=Modifier)
{
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(69.dp)
            .width(69.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceTint),


    ) {
        Row {
            Image(painter = painterResource(id = image),
                contentDescription = stringResource(id = stringResourceId) ,
                modifier= Modifier
                    .aspectRatio(1f)
                    .fillMaxHeight()
            )
            Column (modifier=Modifier.
            padding(
                top = 16.dp,
                start = 16.dp,
                end = 16.dp )
            ){
                Text(text = stringResource(id = stringResourceId), style = MaterialTheme.typography.labelMedium)
                Row (modifier = Modifier.
                padding(top = 8.dp,),
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.padding(start = 8.dp))
                    Text(text = number.toString(), style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding())
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GridsListTheme {
TopicCard(modifier = Modifier, image = R.drawable.geology, stringResourceId = R.string.Geography, number = 85)
    }
}