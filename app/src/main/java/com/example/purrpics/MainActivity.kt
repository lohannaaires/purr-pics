package com.example.purrpics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.action_bar)

        viewManager = GridLayoutManager(this, 3)

        val catsList = ArrayList<Int>()

        catsList.add(R.drawable.cat_01)
        catsList.add(R.drawable.cat_02)
        catsList.add(R.drawable.cat_03)
        catsList.add(R.drawable.cat_04)
        catsList.add(R.drawable.cat_05)
        catsList.add(R.drawable.cat_06)
        catsList.add(R.drawable.cat_07)
        catsList.add(R.drawable.cat_08)
        catsList.add(R.drawable.cat_09)
        catsList.add(R.drawable.cat_10)
        catsList.add(R.drawable.cat_11)
        catsList.add(R.drawable.cat_12)
        catsList.add(R.drawable.cat_13)
        catsList.add(R.drawable.cat_14)
        catsList.add(R.drawable.cat_15)

        viewAdapter = CatsGridAdapter(catsList)

        recyclerView = findViewById<RecyclerView>(R.id.cats_recycler_view).apply {

            setHasFixedSize(true)

            layoutManager = viewManager

            adapter = viewAdapter

        }

    }
}