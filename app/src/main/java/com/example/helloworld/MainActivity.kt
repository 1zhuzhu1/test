package com.example.helloworld
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 获取按钮实例
        val button: Button = findViewById(R.id.button)

        //获取文字实例
        val tXT : TextView = findViewById(R.id.textView)

        // 设置点击监听器
        button.setOnClickListener {
            button.text = getString(R.string.cilked)
            tXT.text = getString(R.string.English)
        }

    }
}