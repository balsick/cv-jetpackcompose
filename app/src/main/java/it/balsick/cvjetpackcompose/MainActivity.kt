package it.balsick.cvjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.guru.fontawesomecomposelib.FaIcon
import com.guru.fontawesomecomposelib.FaIconType
import com.guru.fontawesomecomposelib.FaIcons
import it.balsick.cvjetpackcompose.Data.personalInfo
import it.balsick.cvjetpackcompose.Data.skills
import it.balsick.cvjetpackcompose.Data.studies
import it.balsick.cvjetpackcompose.data.PersonalInfo
import it.balsick.cvjetpackcompose.data.Study
import it.balsick.cvjetpackcompose.ui.theme.CVJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CVJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CV()
                }
            }
        }
    }
}

@Composable
fun CV() {
    Surface(color = MaterialTheme.colors.background) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row() {
                Text(
                    text = "Enrico",
                    color = MaterialTheme.colors.secondary,
                    style = MaterialTheme.typography.h4 + TextStyle(fontWeight = FontWeight.Bold)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "Balsamo",
                    color = MaterialTheme.colors.onBackground,
                    style = MaterialTheme.typography.h4 + TextStyle(fontWeight = FontWeight.Bold)
                )
            }
            Text(
                text = "Software is my thing",
                style = MaterialTheme.typography.h6
            )
            Spacer(Modifier.height(4.dp))
            Image(
                painter = painterResource(id = R.drawable.me),
                contentDescription = "My avatar",
                modifier = Modifier
                    .clip(CircleShape)
                    .border(3.dp, MaterialTheme.colors.primary, CircleShape)
            )
            Spacer(Modifier.height(4.dp))
            SectionTitle(FaIcons.PersonBooth, "Personal Information")
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                content = { items(personalInfo) { item -> PersonalInfoComponent(item) } }
            )
            Separator()
            SectionTitle(FaIcons.Microchip, "Technologies")
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                content = { items(skills) { item -> SkillComponent(item) } }
            )
            Separator()
            SectionTitle(FaIcons.University, "University")
            LazyColumn(
                content = { items(studies) { item -> StudyComponent(item)} }
            )
        }
    }
}

@Composable
fun StudyComponent(item: Study) {
    TODO("Not yet implemented")
}

@Composable
fun SkillComponent(item: String) {
    Text(
        text = item,
        modifier = Modifier.wrapContentSize()
    )
}

@Composable
private fun Separator() {
    Spacer(modifier = Modifier.height(8.dp))
    Divider(
        color = MaterialTheme.colors.onBackground,
        thickness = 1.dp,
        modifier = Modifier.padding(horizontal = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
private fun SectionTitle(icon: FaIconType.SolidIcon, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(4.dp)
    ) {
        FaIcon(
            faIcon = icon,
            tint = MaterialTheme.colors.onBackground
        )
        Spacer(Modifier.width(4.dp))
        Text(
            text = text.uppercase(),
            style = MaterialTheme.typography.h6
        )
    }
}

@Composable
fun PersonalInfoComponent(item: PersonalInfo) {
    Row(modifier = Modifier.padding(2.dp)) {
        FaIcon(
            faIcon = item.icon,
            tint = MaterialTheme.colors.onBackground
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(text = item.text)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CVJetpackComposeTheme {
        CV()
    }
}