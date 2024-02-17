package com.example.listacomida.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val stringResourceId: Int, //Se va a ocupar un recurso de cadena de texto y su identificador será entero
    @DrawableRes val drawableResourceId: Int,   //Se va a ocupar un recurso dibujable y su identificador será entero
    @StringRes val precioResourceId: Int,
    @StringRes val descuentoResourceId: Int
)
