package com.example.yoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity
{
     int[] newArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        newArray= new int[] {
                R.id.Tree_pose,R.id.triangle,R.id.bridge_pose,R.id.child_pose,R.id.downdog_pose,R.id.plank_pose,
                R.id.deadbody_pose,R.id.boat_pose,R.id.highlung_pose,R.id.fish_pose
        };
    }


    public void ImageButtonClicked(View view)
    {
        for (int i=0; i<=newArray.length; i++)
        {
            if(view.getId()==newArray[i]) {
                int value = i + 1;
                Log.i(tag:"FIRST", String.valueOf(value));
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra(name:"Value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}