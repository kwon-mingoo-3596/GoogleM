package com.example.googlem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Map;


public class MainActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        button2 = findViewById( R.id.button2 );
        button2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View View) {
                Intent intent = new Intent( MainActivity.this, WebViewDemo.class );
                startActivity( intent );

            }
        });
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {

        mMap = googleMap;
        Marker SMU, res, res1, res2, res3, res4, res5;
        LatLng SMU_P = new LatLng(36.798788102874184, 127.07589443409849);
        LatLng res_P= new LatLng(36.7977460986324, 127.06250078327842);
        LatLng res1_P= new LatLng(36.79699388083385, 127.06209680067984);
        LatLng res2_P= new LatLng(36.79682316282798, 127.06114426017513);
        LatLng res3_P= new LatLng(36.798315554655424, 127.05906692722235);
        LatLng res4_P= new LatLng(36.79770987109501, 127.06284810471352);
        LatLng res5_P= new LatLng(36.79773963628263, 127.06193493203682);

        SMU = googleMap.addMarker(new MarkerOptions()
                .position(SMU_P)
                .title("현재 위치")
                .snippet("선문대학교")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
        );
        SMU.showInfoWindow();



        res = googleMap.addMarker(new MarkerOptions()
                .position(res_P)
                .title("등촌샤브 칼국수")
                .snippet("음식점")
        );
        res.showInfoWindow();

        res1 = googleMap.addMarker(new MarkerOptions()
                .position(res1_P)
                .title("농부바베큐")
                .snippet("음식점")
        );
        res1.showInfoWindow();

        res2 = googleMap.addMarker(new MarkerOptions()
                .position(res2_P)
                .title("멘야마쯔리")
                .snippet("음식점")
        );
        res2.showInfoWindow();

        res3 = googleMap.addMarker(new MarkerOptions()
                .position(res3_P)
                .title("크라운호프")
                .snippet("술집")
        );
        res3.showInfoWindow();

        res4 = googleMap.addMarker(new MarkerOptions()
                .position(res4_P)
                .title("맛내음 왕소금구이")
                .snippet("음식점")
        );
        res4.showInfoWindow();

        res5 = googleMap.addMarker(new MarkerOptions()
                .position(res5_P)
                .title("광시곱마담")
                .snippet("음식점")
        );
        res5.showInfoWindow();


        /*MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SMU_P);
        markerOptions.title("선문대학교");
        markerOptions.snippet("현재 위치");
        mMap.addMarker(markerOptions);


        MarkerOptions markerOptions1 = new MarkerOptions();
        markerOptions.position(res_P);
        markerOptions.title("123");
        markerOptions.snippet("123");
        mMap.addMarker(markerOptions1);
        MarkerOptions markerOptions3 = new MarkerOptions();
        MarkerOptions markerOptions4 = new MarkerOptions();
        MarkerOptions markerOptions5 = new MarkerOptions();
        MarkerOptions markerOptions6 = new MarkerOptions();
        MarkerOptions markerOptions7 = new MarkerOptions();
        */


        // 기존에 사용하던 다음 2줄은 문제가 있습니다.

        // CameraUpdateFactory.zoomTo가 오동작하네요.
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(SEOUL));
        //mMap.animateCamera(CameraUpdateFactory.zoomTo(10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SMU_P, 20));


    }
}