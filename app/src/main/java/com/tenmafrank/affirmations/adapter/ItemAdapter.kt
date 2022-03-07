package com.tenmafrank.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tenmafrank.affirmations.R
import com.tenmafrank.affirmations.model.Affirmations

class ItemAdapter(private val dataset: List<Affirmations>,
                  private val context: Context): RecyclerView.Adapter<itemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return itemViewHolder(layoutInflater.inflate(R.layout.item_affirmation,parent,false))
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val item = dataset[position]
        holder.render(item,context)
    }

    override fun getItemCount() = dataset.size
}