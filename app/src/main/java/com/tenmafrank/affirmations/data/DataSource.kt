 package com.tenmafrank.affirmations.data

import com.tenmafrank.affirmations.R
import com.tenmafrank.affirmations.model.Affirmations

class DataSource {
    companion object{
        val affirmationsList = listOf<Affirmations>(
            Affirmations(R.string.affirmation1),
            Affirmations(R.string.affirmation2),
            Affirmations(R.string.affirmation3),
            Affirmations(R.string.affirmation4),
            Affirmations(R.string.affirmation5),
            Affirmations(R.string.affirmation6),
            Affirmations(R.string.affirmation7),
            Affirmations(R.string.affirmation8),
            Affirmations(R.string.affirmation9),
            Affirmations(R.string.affirmation10)
        )
    }
}