package com.example.yoss.myrecyclerview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailPresident extends AppCompatActivity {

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_REMARK = "extra_remarks";
    public static String EXTRA_PHOTO = "extra_photo";
    public static String EXTRA_YEAR = "extra_year";
    public static String EXTRA_PARTAI = "extra_partai";
    private TextView presidentname;
    private TextView presidentremark;
    private TextView presidentyear;
    private TextView presidentpartai;
    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_president);

        presidentname = (TextView)findViewById(R.id.president_name);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        presidentname.setText(name);

        presidentremark = (TextView)findViewById(R.id.president_remark);
        String remark = getIntent().getStringExtra(EXTRA_REMARK);
        presidentremark.setText(remark);

        presidentyear = (TextView)findViewById(R.id.president_year);
        String year = getIntent().getStringExtra(EXTRA_YEAR);
        presidentyear.setText(":"+year);

        presidentpartai = (TextView)findViewById(R.id.president_partai);
        String partai = getIntent().getStringExtra(EXTRA_PARTAI);
        presidentpartai.setText(":"+partai);


        String urlPhoto = getIntent().getStringExtra(EXTRA_PHOTO);
        photo = (ImageView)findViewById(R.id.gambar_detail);
        loadPhoto(urlPhoto);



    }

    private void loadPhoto(String url){

        Picasso.with(this).load(url).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(photo,new com.squareup.picasso.Callback(){
                    @Override
                    public void onSuccess(){

                    }

                    @Override
                    public void onError(){

                    }
                });

    }
}
