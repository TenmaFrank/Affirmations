package com.tenmafrank.affirmations.adapter


import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tenmafrank.affirmations.R
import com.tenmafrank.affirmations.databinding.ItemAffirmationBinding
import com.tenmafrank.affirmations.model.Affirmations

class itemViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemAffirmationBinding.bind(view)

    fun render(affirmations: Affirmations, context: Context){
        binding.principalText.text = context.resources.getString(affirmations.affirmationResourceId)
    }
}