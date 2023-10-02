package com.example.dolapapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dolapapp.data.entity.Product
import com.example.dolapapp.databinding.ProductCardDesignBinding


class ProductsAdapter(val context: Context, val productList: List<Product>):
    RecyclerView.Adapter<ProductsAdapter.ProductCardDesignHolder>() {

    inner class ProductCardDesignHolder(val design: ProductCardDesignBinding): RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCardDesignHolder {
        val binding = ProductCardDesignBinding.inflate(LayoutInflater.from(context), parent, false)

        return ProductCardDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductCardDesignHolder, position: Int) {

        val product = productList[position]
        val design = holder.design

        design.productImageView.setImageResource(
            context.resources.getIdentifier(product.imageName, "drawable", context.packageName)
        )

        design.productDescriptionTextView.text = product.name
        design.productPriceTextView.text = product.price
        design.productSizeTextView.text = product.size

    }

}