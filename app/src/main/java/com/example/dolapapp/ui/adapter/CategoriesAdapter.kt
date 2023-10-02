package com.example.dolapapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dolapapp.data.entity.Category
import com.example.dolapapp.databinding.CategoryCardDesignBinding

class CategoriesAdapter(val context: Context, val categoriesLit: List<Category>):
    RecyclerView.Adapter<CategoriesAdapter.CategoryCardDesignHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryCardDesignHolder {
        val binding = CategoryCardDesignBinding.inflate(LayoutInflater.from(context), parent, false)

        return CategoryCardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryCardDesignHolder, position: Int) {

        val category = categoriesLit[position]

        val design = holder.design

        design.categoryImageView.setImageResource(
            context.resources.getIdentifier(category.imageName, "drawable", context.packageName)
        )

        design.categoryTextView.text = category.name

    }

    override fun getItemCount(): Int {
        return categoriesLit.size
    }

    inner class CategoryCardDesignHolder(val design: CategoryCardDesignBinding): RecyclerView.ViewHolder(design.root)

}