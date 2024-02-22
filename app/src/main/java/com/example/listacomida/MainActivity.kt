package com.example.listacomida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listacomida.model.Platillo
import com.example.listacomida.ui.theme.ListaComidaTheme

var desayuno=Platillo(R.string.desayuno,R.drawable.desayuno,R.string.precio_desayuno,R.string.descuento_desayuno)
var hamburger=Platillo(R.string.hamburger,R.drawable.hamburger,R.string.precio_hamburger,R.string.descuento_hamburger)
var pizza=Platillo(R.string.pizza,R.drawable.pizza,R.string.precio_pizza,R.string.descuento_pizza)
var postre=Platillo(R.string.postre,R.drawable.postre,R.string.precio_postre,R.string.descuento_postre)
var pozole=Platillo(R.string.pozole,R.drawable.pozole,R.string.precio_pozole,R.string.descuento_pozole)
var taco=Platillo(R.string.tacos,R.drawable.tacos,R.string.precio_tacos,R.string.descuento_tacos)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaComidaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //MenuCard(platillo = taco)
                    val platillos = listOf<Platillo>(desayuno, hamburger, pizza, postre, pozole,
                        taco)
                    MenuCardList(platilloList = platillos)
                }
            }
        }
    }
}

@Composable
fun MenuCard(platillo: Platillo, modifier:Modifier = Modifier){
    Card(
        modifier = Modifier
        .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 20.dp
        )
    ){
        Column {
            Row{
                Image(
                    painter = painterResource(id = platillo.drawableResourceId),
                    contentDescription = stringResource(id=platillo.stringResourceId),
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                        .padding(2.dp),
                    contentScale = ContentScale.Crop
                )
                Column(
                    verticalArrangement = Arrangement.Center){
                    Text(
                        text = LocalContext.current.getString(platillo.stringResourceId),
                        modifier = Modifier
                            .padding(horizontal = 22.dp)
                            .padding(top = 22.dp),
                        style = MaterialTheme.typography.displayLarge,
                    )
                    Text(
                        text= LocalContext.current.getString(platillo.precioResourceId),
                        modifier = Modifier.padding(horizontal=22.dp),
                        style = MaterialTheme.typography.displayMedium,
                    )
                    Text(
                        text= LocalContext.current.getString(platillo.descuentoResourceId),
                        modifier = Modifier.padding(horizontal=22.dp),
                        style = MaterialTheme.typography.bodyLarge,
                        color= Color.Blue,
                    )
                }
            }
        }
    }
}

@Composable
fun MenuCardList(platilloList:List<Platillo>,modifier: Modifier=Modifier){
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier=modifier
    ){
        items(platilloList){
            platillo-> MenuCard(
                platillo = platillo,
                modifier=Modifier.padding(18.dp)
                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPlatilloPreview(){
    ListaComidaTheme {
        MenuCard(platillo = Platillo(R.string.tacos,R.drawable.tacos,R.string.precio_tacos,R.string.descuento_tacos))
    }
}
