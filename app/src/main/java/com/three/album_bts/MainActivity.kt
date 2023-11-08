package com.three.album_bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 화면 보이기
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 요소 클릭 확인
        for (i in 1..7) {
            val resourceId = resources.getIdentifier("bts_img_$i", "id", packageName)
            val imageView = findViewById<ImageView>(resourceId);
            imageView.setOnClickListener {
                Toast.makeText(this, "${i}번 사진을 선택", Toast.LENGTH_LONG).show()

                // 2. 요소 클릭 시, 다음 화면 전환 및 확대된 사진 보이기
                val intent = Intent(this, DetailActivity::class.java)
                intent.putExtra("imgNumber", i)
                startActivity(intent)
            }
        }
    }
}