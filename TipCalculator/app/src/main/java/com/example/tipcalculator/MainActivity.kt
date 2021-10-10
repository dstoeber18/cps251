package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.round


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcTip(view: View) = if (tipInput.text.isNotEmpty()) {
        val totalBill = tipInput.text.toString().toDouble()
        val tip10 = totalBill * 1.10
        val tip15 = totalBill * 1.15
        val tip20 = totalBill * 1.20
        tipOutput.text = "The tips are as follows:" +
                "\n10% Tip: $" + "%.2f".format(tip10).toDouble() +
                "\n15% Tip: $" + "%.2f".format(tip15).toDouble() +
                "\n20% Tip: $" + "%.2f".format(tip20).toDouble()
    } else {
        tipOutput.text = getString(R.string.invalid_input)
    }
}