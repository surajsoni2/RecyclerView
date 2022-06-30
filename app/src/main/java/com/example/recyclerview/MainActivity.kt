package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //ViewBinding of activity_main.xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val adapter = MainAdapter(TaskList.taskList)
        binding?.taskRv?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding?.taskRv?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}