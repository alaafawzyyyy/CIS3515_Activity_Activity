package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val textSize = intent.getIntExtra("textSize", 16) // Providing a safe default

        val lyricsDisplayTextView = findViewById<TextView>(R.id.lyricsDisplayTextView)

        lyricsDisplayTextView.textSize = textSize.toFloat()
    }
}
