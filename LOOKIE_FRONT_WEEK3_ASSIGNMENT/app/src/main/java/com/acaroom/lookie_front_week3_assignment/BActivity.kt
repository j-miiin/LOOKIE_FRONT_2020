package com.acaroom.lookie_front_week3_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        back.setOnClickListener {
            val intent = Intent(this@BActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
