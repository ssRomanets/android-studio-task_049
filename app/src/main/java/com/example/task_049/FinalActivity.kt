package com.example.task_049

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_049.databinding.ActivityFinalBinding

class FinalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(R.style.finalTheme)

        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.returnBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}