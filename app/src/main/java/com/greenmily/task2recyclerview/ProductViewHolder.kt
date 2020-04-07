package com.greenmily.task2recyclerview


import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.next_activity.view.*

class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(item: ProductData) = with(itemView) {
        image.setImageResource(item.image)
        name.text = item.name
        price.text = item.price
    }
}