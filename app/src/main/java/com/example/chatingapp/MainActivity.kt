package com.example.chatingapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chatingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.verticalRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val items = listOf(
            MessengerItem(R.drawable.person, "John", "Active now"),
            MessengerItem(R.drawable.person1, "Alice", "2h ago"),
            MessengerItem(R.drawable.person2, "David", "Offline"),
            MessengerItem(R.drawable.person3, "Emma", "Online"),
            MessengerItem(R.drawable.person4, "Michael", "1d ago"),
            MessengerItem(R.drawable.person5, "Sophia", "Offline"),
            MessengerItem(R.drawable.person6, "William", "Online"),
            MessengerItem(R.drawable.person7, "Olivia", "2d ago"),
            MessengerItem(R.drawable.person8, "Daniel", "Offline"),
            MessengerItem(R.drawable.person9, "Ava", "Online"),
            MessengerItem(R.drawable.person10, "James", "1w ago"),
            MessengerItem(R.drawable.person11, "Luna", "Just now")
        )

        val adapter = MessengerAdapter(items)
        binding.verticalRecyclerView.adapter = adapter

    }
}