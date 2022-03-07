package com.tenmafrank.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmations (
    @StringRes val affirmationResourceId: Int,
    @DrawableRes val imageResourceId: Int) {
}