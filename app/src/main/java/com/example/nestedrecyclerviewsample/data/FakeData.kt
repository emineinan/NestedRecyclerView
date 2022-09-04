package com.example.nestedrecyclerviewsample.data

import com.example.nestedrecyclerviewsample.data.model.Book
import com.example.nestedrecyclerviewsample.data.model.Collection
import com.example.nestedrecyclerviewsample.util.Images

object FakeData {
    private val books = listOf(
        Book(Images.imageUrl0),
        Book(Images.imageUrl1),
        Book(Images.imageUrl2),
        Book(Images.imageUrl3),
        Book(Images.imageUrl4),
        Book(Images.imageUrl5),
        Book(Images.imageUrl6),
        Book(Images.imageUrl7),
        Book(Images.imageUrl8),
        Book(Images.imageUrl9),
    )

    val collections = listOf(
        Collection("All Books", books),
        Collection("Want to Read", books.reversed()),
        Collection("Summer Reads", books.shuffled()),
        Collection("September Reads", books),
    )
}