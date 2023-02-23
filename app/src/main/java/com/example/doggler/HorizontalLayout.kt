package com.example.doggler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.doggler.model.DataSource
import com.example.doggler.model.ItemAdapter

class HorizontalLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horizontal_layout)

        val myDataset = DataSource().loadWebShows()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview_horizontal)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}