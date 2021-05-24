package com.example.andtrnlist

import android.os.Bundle
import android.os.Debug
import android.util.Log
import android.webkit.ConsoleMessage
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.Console

class MainActivity : AppCompatActivity() {

    private lateinit var listRecycle: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listRecycle = findViewById(R.id.lists_recyclerview)
        Log.d("MYTAG", "Message")
        listRecycle.layoutManager = LinearLayoutManager(this)
        listRecycle.adapter = ListSelectionRecyclerViewAdapter()
    }
}




