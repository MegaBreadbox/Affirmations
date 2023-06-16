package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//Each affirmation contains one image and string.
//The resource ids are how to move data from classes to composables
//This is like the design of a single element

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
