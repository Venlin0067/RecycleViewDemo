package com.example.recycleviewdemo.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewdemo.R

class ProductAdapter(private val ProductList:List<Product>):
    RecyclerView.Adapter<ProductAdapter.MyViewHolder>() {

    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.tvName)
        val price: TextView = itemView.findViewById(R.id.tvPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.product_item, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentProduct = ProductList[position]

        holder.name.text = currentProduct.name
        holder.price.text = currentProduct.price.toString()
    }

    override fun getItemCount(): Int {
        return ProductList.size
    }
}