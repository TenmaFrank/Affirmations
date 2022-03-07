package com.tenmafrank.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.tenmafrank.affirmations.adapter.ItemAdapter
import com.tenmafrank.affirmations.data.DataSource
import com.tenmafrank.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.textView.text = getString(R.string.total_affirmations, DataSource.affirmationsList.size.toString())
        initRecyclerView()
    }
    private fun initRecyclerView(){
        binding.affirmationsRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.affirmationsRecyclerView.adapter = ItemAdapter(DataSource.affirmationsList,this)
    }
}