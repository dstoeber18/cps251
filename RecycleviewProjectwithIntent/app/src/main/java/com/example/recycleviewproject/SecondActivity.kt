package com.example.recycleviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

import com.example.recycleviewproject.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras ?: return

        val itemTitle = extras.getString("qTitle")
        val itemDetails = extras.getString("qDetails")
        val itemImage = extras.getInt("qImage")

        binding.itemTitleText.text = itemTitle
        binding.itemDetailText.text = itemDetails
        binding.itemImageView.setImageResource(itemImage)
    }
}