package com.example.carprojec3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Car> al = new ArrayList<Car>();  // 차 이름 담을 리스트

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        int data1 = getIntent().getIntExtra("sedan",0);

        if(data1 == 5){
            al.add(new Car(R.drawable.avante,R.drawable.avante1,R.drawable.avante2,R.drawable.avante3,"아반떼","준중형 세단","1,570만원","I4",
                    "1,598cc","가솔린","123hp","15.7kg.m","14.4~15.4km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/avante/intro"));

            al.add(new Car(R.drawable.sonata,R.drawable.sonata1,R.drawable.sonata2,R.drawable.sonata3,"쏘나타","중형 세단","2,547만원","I4",
                    "1,591cc","가솔린","180hp","27kg.m","13.2~13.8km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/sonata/intro"));

            al.add(new Car(R.drawable.grandeur,R.drawable.grandeur1,R.drawable.grandeur2,R.drawable.grandeur3,"그랜저","준대형 세단","3,303만원","I4",
                    "2,497cc","가솔린","198hp","25.3kg.m","11.1~11.9km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/grandeur/intro"));

            al.add(new Car(R.drawable.veloster,R.drawable.veloster1,R.drawable.veloster2,R.drawable.veloster3,"벨로스터","준중형 해치백","3,019만원","I4",
                    "1,353cc","가솔린","140hp","24.7kg.m","13.1km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/veloster-n/intro"));

            al.add(new Car(R.drawable.g70,R.drawable.g701,R.drawable.g702,R.drawable.g703,"제네시스 G70","중형 세단","4,035만원","I4",
                    "1,998cc","가솔린","252hp","36kg.m","10.7km/ℓ",
                    "https://www.genesis.com/kr/ko/models/luxury-sedan-genesis/g70/highlights.html"));

            al.add(new Car(R.drawable.g80,R.drawable.g801,R.drawable.g802,R.drawable.g803,"제네시스 G80","준대형 세단","5,311만원","I4",
                    "2,151cc","디젤","210hp","45kg.m","14.6km/ℓ",
                    "https://www.genesis.com/kr/ko/models/luxury-sedan-genesis/g80/highlights.html"));

            al.add(new Car(R.drawable.g90,R.drawable.g901,R.drawable.g902,R.drawable.g903,"제네시스 G90","대형 세단","8,957만원","V6",
                    "3,470cc","가솔린","380hp","54kg.m","9.3km/ℓ",
                    "https://www.genesis.com/kr/ko/models/luxury-sedan-genesis/g90/highlights.html"));


        }else{
            al.add(new Car(R.drawable.venue,R.drawable.venue1,R.drawable.venue2,R.drawable.venue3,"베뉴","소형 SUV","1,689만원","I4",
                    "1,598cc","가솔린","123hp","15.7kg.m","13.3~13.7km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/venue/intro"));

            al.add(new Car(R.drawable.kona,R.drawable.kona1,R.drawable.kona2,R.drawable.kona3,"코나","소형 SUV","1,962만원","I4",
                    "1,598cc","가솔린","198hp","27kg.m","12.7~13.9km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/kona/intro"));

            al.add(new Car(R.drawable.tucson,R.drawable.tucson1,R.drawable.tucson2,R.drawable.tucson3,"투싼","준중형 SUV","2,435만원","I4",
                    "1,598cc","가솔린","180hp","27kg.m","12~12.5km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/tucson/intro"));

            al.add(new Car(R.drawable.santafe,R.drawable.santafe1,R.drawable.santafe2,R.drawable.santafe3,"싼타페","중형 SUV","3,156만원","I4",
                    "2,151cc","디젤","202hp","45kg.m","13.7~14.1km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/santafe/intro"));

            al.add(new Car(R.drawable.palisade,R.drawable.palisade1,R.drawable.palisade2,R.drawable.palisade3,"펠리세이드","준대형 SUV","3,606만원","I4",
                    "2,199cc","디젤","202hp","45kg.m","11.7~12.1km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/palisade/intro"));

            al.add(new Car(R.drawable.staria,R.drawable.staria1,R.drawable.staria2,R.drawable.staria3,"스타리아","대형 RV","2,516만원","I4",
                    "2,199cc","디젤","177hp","44kg.m","11.3~12.3km/ℓ",
                    "https://www.hyundai.com/kr/ko/e/vehicles/staria/intro"));

            al.add(new Car(R.drawable.nexo,R.drawable.nexo1,R.drawable.nexo2,R.drawable.nexo3,"넥쏘","중형 SUV","6,765만원","NO",
                    "NO","수소","113kW","395Nm","93.7~96.2km/kg",
                    "https://www.hyundai.com/kr/ko/e/vehicles/nexo/intro"));

            al.add(new Car(R.drawable.ioniq,R.drawable.ioniq1,R.drawable.ioniq2,R.drawable.ioniq3,"아이오닉 5","준중형 SUV","4,695만원","NO",
                    "NO","전기","125kW","350Nm","4.5~5.1km/kWh",
                    "https://www.hyundai.com/kr/ko/e/vehicles/ioniq5/intro"));
            al.add(new Car(R.drawable.casper,R.drawable.casper1,R.drawable.casper2,R.drawable.casper3,"캐스퍼","경형 SUV","2,000만원","I3",
                    "998cc","가솔린","76hp","9.7kg.m","13.8~14.3km/ℓ",
                    "https://casper.hyundai.com/"));

            al.add(new Car(R.drawable.gv60,R.drawable.gv601,R.drawable.gv602,R.drawable.gv603,"제네시스 GV60","준중형 SUV","5,990만원","NO",
                    "NO","전기","168kW","350Nm","5.1km/kWh",
                    "https://www.genesis.com/kr/ko/models/luxury-suv-genesis/gv60/highlights.html"));

            al.add(new Car(R.drawable.gv70,R.drawable.gv701,R.drawable.gv702,R.drawable.gv703,"제네시스 GV70","중형 SUV","4,791만원","I4",
                    "2,151cc","디젤","210hp","45kg.m","13.5km/ℓ",
                    "https://www.genesis.com/kr/ko/models/luxury-suv-genesis/gv70/highlights.html"));

            al.add(new Car(R.drawable.gv80,R.drawable.gv801,R.drawable.gv802,R.drawable.gv803,"제네시스 GV80","준대형 SUV","6,136만원","I4",
                    "2,497cc","가솔린","304hp","43kg.m","9.7km/ℓ",
                    "https://www.genesis.com/kr/ko/models/luxury-suv-genesis/gv80/highlights.html"));

        }





        MyAdapter adapter = new MyAdapter(
                getApplicationContext(), // 현재화면의 제어권자
                R.layout.row,  // 리스트뷰의 한행의 레이아웃
                al);         // 데이터

        ListView lv = (ListView)findViewById(R.id.listView1);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // 상세정보 화면으로 이동하기(인텐트 날리기)
                // 1. 다음화면을 만든다
                // 2. AndroidManifest.xml 에 화면을 등록한다
                // 3. Intent 객체를 생성하여 날린다
                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        CarDetail.class); // 다음넘어갈 화면

                // intent 객체에 데이터를 실어서 보내기
                // 리스트뷰 클릭시 인텐트 (Intent) 생성하고 position 값을 이용하여 인텐트로 넘길값들을 넘긴다
                intent.putExtra("img", al.get(position).img);
                intent.putExtra("img2", al.get(position).img2);
                intent.putExtra("img3", al.get(position).img3);
                intent.putExtra("img4", al.get(position).img4);


                intent.putExtra("Name", al.get(position).Name);
                intent.putExtra("Size", al.get(position).Size);
                intent.putExtra("Price", al.get(position).Price);
                intent.putExtra("Engine", al.get(position).Engine);
                intent.putExtra("Disp", al.get(position).Disp);
                intent.putExtra("Fuel", al.get(position).Fuel);
                intent.putExtra("Power", al.get(position).Power);
                intent.putExtra("Torque", al.get(position).Torque);
                intent.putExtra("Mpg", al.get(position).Mpg);
                intent.putExtra("Uri",al.get(position).Uri);

                startActivity(intent);


            }
        });
    } // end of onCreate
} // end of class

class MyAdapter extends BaseAdapter { // 리스트 뷰의 어뎁터
    Context context;
    int layout;
    ArrayList<Car> al;
    LayoutInflater inf;
    public MyAdapter(Context context, int layout, ArrayList<Car> al) {
        this.context = context;
        this.layout = layout;
        this.al = al;
        inf = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return al.size();
    }
    @Override
    public Object getItem(int position) {
        return al.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView = inf.inflate(layout, null);
        }

        ImageView carImage = (ImageView)convertView.findViewById(R.id.imageView1);

        TextView carName = (TextView)convertView.findViewById(R.id.textView1);
        TextView carSize = (TextView)convertView.findViewById(R.id.textView2);


        Car m = al.get(position);
        carImage.setImageResource(m.img);

        carName.setText(m.Name);
        carSize.setText(m.Size);

        return convertView;
    }
}

class Car { // 자바빈
    int img; // 차 이미지
    int img2;
    int img3;
    int img4;

    String Name = "";   // 차 Name(이름)
    String Size = "";   // 차 Size(크기)
    String Price = "";  // 차 Price(가격)
    String Engine = ""; // 차 Engine(엔진)
    String Disp = "";   // 차 Disp(배기율)
    String Fuel = "";   // 차 Fuel(연료)
    String Power = "";  // 차 Power(최대마력)
    String Torque = ""; // 차 Torque(최대토크)
    String Mpg = "";    // 차 Mpg(연비)
    String Uri = "";    // 차 Url

    public Car(int img,int img2,int img3,int img4,String Name, String Size,String Price,String Engine,String Disp,
               String Fuel,String Power,String Torque,String Mpg, String Uri) {
        super();

        this.img = img;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;

        this.Name = Name;
        this.Size = Size;
        this.Price = Price;
        this.Engine = Engine;
        this.Disp = Disp;
        this.Fuel = Fuel;
        this.Power = Power;
        this.Torque = Torque;
        this.Mpg = Mpg;
        this.Uri = Uri;

    }
    public Car() {}
}


