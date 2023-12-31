package com.three.album_bts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 화면 보이기
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // 1. MainActivity에서 전달한 사진 번호 가져오기
        val imgNumber = intent.getIntExtra("imgNumber", 1)

        // 2. 선택된 사진의 리소스 id 가져오기
        val resourceId = resources.getIdentifier("bts_$imgNumber", "drawable", packageName)

        // 3. imgView에 선택된 사진 설정
        val imgView = findViewById<ImageView>(R.id.detailImgView)
        imgView.setImageResource(resourceId)

    }
}