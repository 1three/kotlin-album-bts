# kotlin-album-bts
[Kotlin] BTS 사진을 볼 수 있는 `안드로이드` 앨범 앱

![album-bts](https://github.com/1three/kotlin-album-bts/assets/94810322/8798ebf5-f28e-4c68-8157-44f9ebc4bb92)

<br>

## 📖 배운 점


#### 📄 _findViewById_

XML 레이아웃 파일에서 정의한 _id를 통해 뷰 요소를 찾아와,_ 사용할 수 있다.

```
val view = findViewById<View>(R.id.viewId)
```

#### 📄 _setOnClickListener_

이미지뷰에 클릭 이벤트를 설정할 수 있다.

```
view.setOnClickListener {
    // 클릭 이벤트 처리
}
```

#### 📄 _Intent_
데이터를 전달하거나, 화면 전환 등을 수행할 수 있다.

```
// 1. 작업에 사용하기 위해 `변수에 저장`
val intent = Intent(this, DetailActivity::class.java)

// 2. 다른 액티비티에서 getExtra 메서드를 사용해 가져올 수 있도록 `데이터를 추가`
intent.putExtra("key", value)

// 3. Intent를 전달하여 다른 액티비티를 시작할 수 있는 상태로 전환
startActivity(intent)

// 4. Intent에서 정수형 데이터 추출
val data = intent.getIntExtra("key", defaultValue)
```

#### 📄 _resources.getIdentifier_
리소스 ID(식별자)를 동적으로 가져올 수 있다.

```
val resourceId = resources.getIdentifier(resourceName, resourceType, packageName)
```

#### 📄 _setImageResource_
선택된 이미지를 화면(ImageView)에 표시(설정)할 수 있다.

```
imageView.setImageResource(resourceId)
```

<br>

## ⚙️ 응용

_MainActivity_ 에서 for문을 통해 반복적인 코드를 축소시켰습니다.
