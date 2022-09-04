package com.example.nestedrecyclerviewsample.ui.collections

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerviewsample.R
import com.example.nestedrecyclerviewsample.data.model.Collection
import com.example.nestedrecyclerviewsample.databinding.CollectionItemBinding
import com.example.nestedrecyclerviewsample.ui.book.BookAdapter

class CollectionsAdapter(private val collections: List<Collection>) :
    RecyclerView.Adapter<CollectionsAdapter.CollectionsViewHolder>() {

    class CollectionsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = CollectionItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.collection_item, parent, false)
        return CollectionsViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionsViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collections[position]
            textViewCollectionTitle.text = collection.title
            val booksAdapter = BookAdapter(collection.books)
            recyclerViewBooks.adapter = booksAdapter
        }
    }

    override fun getItemCount() = collections.size
}