package com.example.recycleviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewdemo.data.Product
import com.example.recycleviewdemo.data.ProductAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pList: List<Product> = listOf(Product("Pen", 1.20),
            Product("Pencil", 0.80),
            Product("Nitro 5", 4500.00))

        val recyclerView: RecyclerView = findViewById(R.id.myRecycleView)
        recyclerView.adapter = ProductAdapter(pList)
        recyclerView.layoutManager = LinearLayoutManager(application)
        recyclerView.setHasFixedSize(true)
    }
}