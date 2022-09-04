package com.example.nestedrecyclerviewsample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nestedrecyclerviewsample.data.FakeData
import com.example.nestedrecyclerviewsample.databinding.ActivityMainBinding
import com.example.nestedrecyclerviewsample.ui.collections.CollectionsAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        binding.recyclerViewCollections.adapter = CollectionsAdapter(FakeData.collections)
    }
}