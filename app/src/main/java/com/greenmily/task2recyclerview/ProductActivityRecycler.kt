package com.greenmily.task2recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductActivityRecycler(
    private val items: List<ProductData>,
    private val callBack: ProductInteractionCallBack
): RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder =
        ProductViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.next_activity, parent, false)
        )


    override fun getItemCount(): Int = items.size



    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = items[position]
        holder.apply {
            bind(item)
            itemView.setOnClickListener {
                callBack.onClick(item)
            }
        }
    }
}

