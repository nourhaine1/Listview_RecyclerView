package com.example.atelierrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var recycler:RecyclerView
       val data =ArrayList<String>()
       lateinit var adapter:customAdapter


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //charger le data
        for (i in 0..40)
            data.add("item$i")

        recycler=findViewById(R.id.rv)
        //create adapter
       adapter=customAdapter(data)
        //create layout Manager of recycle

        val layoutRecycler=LinearLayoutManager(applicationContext)
        //add layoutmanager to recycle
        recycler.layoutManager=layoutRecycler
        //link adapter to recyler
        recycler.adapter=adapter
    }
}