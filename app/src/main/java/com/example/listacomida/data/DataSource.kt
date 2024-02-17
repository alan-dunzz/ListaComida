package com.example.listacomida.data

import com.example.listacomida.R
import com.example.listacomida.model.Platillo

class DataSource {
    fun LoadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno,R.drawable.desayuno,R.string.precio_desayuno,R.string.descuento_desayuno),
            Platillo(R.string.hamburger,R.drawable.hamburger,R.string.precio_hamburger,R.string.descuento_hamburger),
            Platillo(R.string.pizza,R.drawable.pizza,R.string.precio_pizza,R.string.descuento_pizza),
            Platillo(R.string.postre,R.drawable.postre,R.string.precio_postre,R.string.descuento_postre),
            Platillo(R.string.pozole,R.drawable.pozole,R.string.precio_pozole,R.string.descuento_pozole),
            Platillo(R.string.tacos,R.drawable.tacos,R.string.precio_tacos,R.string.descuento_tacos),

        )
    }
}