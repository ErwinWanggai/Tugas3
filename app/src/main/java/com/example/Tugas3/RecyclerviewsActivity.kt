package com.example.Tugas3

import Adapter
import ItemData
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewsActivity : AppCompatActivity() {
    private lateinit var exampleRecyclerView : RecyclerView
    private lateinit var listExample: ArrayList<ItemData>
    private lateinit var exampleAdapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerviews)

        exampleRecyclerView = findViewById(R.id.rv)
        listExample = ArrayList()

        listExample.add(ItemData(R.drawable.papeda,"Papeda", "Papua"))
        listExample.add(ItemData(R.drawable.pinang,"Pinang", "Papua"))
        listExample.add(ItemData(R.drawable.papeda,"Papeda", "Papua"))
//        listExample.add(ItemData(R.drawable.sabeta,"Sabeta", "Papua"))
//        listExample.add(ItemData(R.drawable.pinang,"Pinang", "Papua"))
//        listExample.add(ItemData(R.drawable.papeda,"Papeda", "Papua"))
//        listExample.add(ItemData(R.drawable.sabeta,"Sabeta", "Papua"))
//        listExample.add(ItemData(R.drawable.pinang,"Pinang", "Papua"))
//        listExample.add(ItemData(R.drawable.papeda,"Papeda", "Papua"))
//        listExample.add(ItemData(R.drawable.sabeta,"Sabeta", "Papua"))


        exampleRecyclerView.layoutManager = LinearLayoutManager(this)
        exampleRecyclerView.setHasFixedSize(true)
        exampleAdapter = Adapter(listExample)
        exampleRecyclerView.adapter = exampleAdapter
    }
}