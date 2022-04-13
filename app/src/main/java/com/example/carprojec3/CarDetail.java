package com.example.carprojec3;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.net.URI;

public class CarDetail extends Activity {
    ViewFlipper v_fllipper;
    Intent intent;
    Button mbtn_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cardetail);


        // 버튼
        mbtn_url= findViewById(R.id.mbtn_url);

        Intent intent = getIntent(); // 보내온 Intent를 얻는다


        // 버튼 클릭시
        mbtn_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Uri 를 문자열로 받아 온뒤 Uri로 바꿔준다.
                Uri uri = Uri.parse(getIntent().getStringExtra("Uri"));
                // uri 변수에 들어있는 주소를 Intent로 연결한다.
                Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                // intent로 실행 시켜준다.
                startActivity(intent1);
            }
        });

        // 가져온 이미지를 getIntExtra로 받아 int로 저장해 놓는다
        int images [] = {getIntent().getIntExtra("img2",0),
                        getIntent().getIntExtra("img3",0),
                        getIntent().getIntExtra("img4",0)};

        // 이미지 슬라이더를 찾는다
        v_fllipper = findViewById(R.id.image_slide);

        // for 문을 이용해 이미지를 반복시킨다.
        for(int image : images) {
            fllipperImages(image);
        }



        TextView carName = (TextView)findViewById(R.id.textView1);
        TextView carSize = (TextView)findViewById(R.id.textView2);
        TextView carPrice = (TextView)findViewById(R.id.textView3);
        TextView carEngine = (TextView)findViewById(R.id.textView4);
        TextView carDisp = (TextView)findViewById(R.id.textView5);
        TextView carFuel = (TextView)findViewById(R.id.textView6);
        TextView carPower = (TextView)findViewById(R.id.textView7);
        TextView carTorque = (TextView)findViewById(R.id.textView8);
        TextView carMpg = (TextView)findViewById(R.id.textView9);

        carName.setText(intent.getStringExtra("Name"));
        carSize.setText(intent.getStringExtra("Size"));
        carPrice.setText(intent.getStringExtra("Price"));
        carEngine.setText(intent.getStringExtra("Engine"));
        carDisp.setText(intent.getStringExtra("Disp"));
        carFuel.setText(intent.getStringExtra("Fuel"));
        carPower.setText(intent.getStringExtra("Power"));
        carTorque.setText(intent.getStringExtra("Torque"));
        carMpg.setText(intent.getStringExtra("Mpg"));
    } // end of onCreate

    // 이미지 슬라이더 구현 메서드
    public void fllipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_fllipper.addView(imageView);      // 이미지 추가
        v_fllipper.setFlipInterval(4000);       // 자동 이미지 슬라이드 딜레이시간(1000 당 1초)
        v_fllipper.setAutoStart(true);          // 자동 시작 유무 설정

        // animation
        v_fllipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_fllipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

} // end of class

