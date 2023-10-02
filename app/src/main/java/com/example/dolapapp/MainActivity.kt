package com.example.dolapapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.dolapapp.data.entity.Category
import com.example.dolapapp.data.entity.Product
import com.example.dolapapp.databinding.ActivityMainBinding
import com.example.dolapapp.ui.adapter.CategoriesAdapter
import com.example.dolapapp.ui.adapter.ProductsAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.categoriesRV.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val categoryList: ArrayList<Category> = arrayListOf()

        val category1 = Category("Çok Favorilenenler", "category_heart_icon")
        val category2 = Category("Bedenim", "category_measure_icon")
        val category3 = Category("Markam", "category_tag_icon")
        val category4 = Category("Çok Değerlendirilenler", "category_star_icon")

        categoryList.add(category1)
        categoryList.add(category2)
        categoryList.add(category3)
        categoryList.add(category4)

        val adapter = CategoriesAdapter(this, categoryList)

        binding.categoriesRV.adapter = adapter

        binding.productsRV.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val productList: ArrayList<Product> = arrayListOf()

        val product1 = Product("Güzel Elbise", "XS", "250 TL", "product1_image")
        val product2 = Product("Hoş Elbise", "XS", "250 TL", "product2_image")
        val product3 = Product("Cici Elbise", "XS", "250 TL", "product3_image")
        val product4 = Product("Süper Elbise", "XS", "250 TL", "product4_image")

        productList.add(product1)
        productList.add(product2)
        productList.add(product3)
        productList.add(product4)

        val productsAdapter = ProductsAdapter(this, productList)

        binding.productsRV.adapter = productsAdapter

        setContentView(binding.root)
    }
}