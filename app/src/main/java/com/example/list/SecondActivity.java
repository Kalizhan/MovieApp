package com.example.list;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CarListAdapter carListAdapter;
    ArrayList<Car> carList;
    private RecyclerView.LayoutManager linearLayoutManager, gridLayoutManager;
    Button btnChange;
    Boolean layoutType = false;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerView);
        btnChange = findViewById(R.id.btnChange);
        carList = new ArrayList<>();
        carListAdapter = new CarListAdapter(carList, this);
        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(carListAdapter);

        carList.add(new Car("https://blogmedia.dealerfire.com/wp-content/uploads/sites/367/2017/09/Origin-of-the-Toyota-Logo_o.jpg", "Toyota", "Toyota Motor Corporation — крупнейшая японская автомобилестроительная корпорация, также предоставляющая финансовые услуги и имеющая несколько дополнительных направлений в бизнесе", "Japan"));
        carList.add(new Car("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Mercedes_Benz_Logo_11.jpg/1024px-Mercedes_Benz_Logo_11.jpg", "Mercedes-Benz", "Mercedes-Benz — торговая марка и одноимённая компания — производитель легковых автомобилей премиального класса, грузовых автомобилей, автобусов и других транспортных средств, входящая в состав немецкого концерна «Daimler AG»", "Germany"));
        carList.add(new Car("https://i.pinimg.com/originals/ff/eb/7c/ffeb7c470be1006c9a6c9ca744ae576d.jpg", "Rolls-Royce", "Rolls-Royce Motor Cars Ltd — английская компания, подразделение BMW AG, специализирующаяся на выпуске автомобилей класса люкс под маркой Rolls-Royce.", "Great Britain"));
        carList.add(new Car("https://moneyinc.com/wp-content/uploads/2018/07/bentley-logo-black-660x330.jpg", "Bentley", "Bentley Motors Ltd — британская автомобилестроительная компания, специализирующаяся на производстве автомобилей класса «люкс». С 1998 года входит в состав германского концерна Volkswagen Group.", "Great Britain"));
        carList.add(new Car("https://moneyinc.com/wp-content/uploads/2018/04/porsche-logo-emblem-3d-model-obj-ma-mb.jpg", "Porsche", "Bentley Motors Ltd — британская автомобилестроительная компания, специализирующаяся на производстве автомобилей класса «люкс». С 1998 года входит в состав германского концерна Volkswagen Group", "Germany"));
        carList.add(new Car("https://car-logos.net/wp-content/uploads/2018/09/aston-martin-logo.jpg", "Aston Martin", "Aston Martin Limited — английский производитель престижных спортивных автомобилей. У истоков марки стояли Лайонел Мартин и Роберт Бэмфорд.", "Great Britain"));
        carList.add(new Car("https://i.pinimg.com/originals/02/05/22/020522fbb8c2217b2a9e3741fe023fb4.jpg", "Koenigsegg", "Koenigsegg Automotive AB — шведская компания-производитель автомобилей спортивного класса. Основана в 1994 году Кристианом фон Кёнигсеггом. Изначально располагалась в Улофстрёме, впоследствии перебазировалась в Маргрететорп, возле Энгельхольма.", "Sweden"));
        carList.add(new Car("https://i.pinimg.com/originals/ba/f2/20/baf2202fbf0c99953e808de03a66892e.png", "Tesla", "Tesla — американская компания, производитель электромобилей и (через свой филиал SolarCity) решений для хранения электрической энергии.", "America"));

        btnChange.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                layoutType =! layoutType;
                if (layoutType){
                    recyclerView.setLayoutManager(gridLayoutManager);
                    carList.remove(0);
                }else{
                    recyclerView.setLayoutManager(linearLayoutManager);
                }


                carListAdapter.notifyDataSetChanged();
            }
        });
    }
}
