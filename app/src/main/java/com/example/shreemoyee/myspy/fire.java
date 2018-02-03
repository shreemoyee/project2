package com.example.shreemoyee.myspy;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class fire extends AppCompatActivity {

    public   ImageView image;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //image = (ImageView) findViewById(R.id.imageView1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
        image =  findViewById(R.id.imageView1);
        //button = findViewById(R.id.exit);

        String str0=getIntent().getStringExtra("building");
        String str1=getIntent().getStringExtra("room");
        String str2=getIntent().getStringExtra("number");

/**        int i[]={R.drawable.groundfloorcon,R.drawable.groundfloorhod,R.drawable.groundfloorlab1,
                R.drawable.groundfloorlab2,R.drawable.groundflooroff,
                R.drawable.groundfloorstair,R.drawable.groundfloorstair2,R.drawable.groundfloorwash};**/
        String s=str0+str1+str2;
        if(s.equals("New Lecture Theater ComplexLab01")) {

            //image.setBackground(getResources().getDrawable(i[2]));
            //Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageDrawable(getResources().getDrawable(R.drawable.groundfloorlab1,getApplicationContext().getTheme()));
        }
        else if(s.equals("New Lecture Theater ComplexStair-well01")){
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.groundfloorstair);
        }

        else if(s.equals("New Lecture Theater ComplexStair-well02"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.groundfloorstair2);
        }
        else if(s.equals("New Lecture Theater ComplexWashrooms01"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.groundfloorwash);
        }
        else if(s.equals("New Lecture Theater ComplexLab02"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.groundfloorlab2);
        }

        else if(s.equals("Department of Computer Science and EngineeringLab01"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cselab1);
        }
        else if(s.equals("Department of Computer Science and EngineeringLecture Theater01"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cselt1);
        }
        else if(s.equals("Department of Computer Science and EngineeringLecture Theater02"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cselt2);
        }
        else if(s.equals("Department of Computer Science and EngineeringLab02"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cselab2);
        }
        else if(s.equals("Department of Computer Science and EngineeringOffice01"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cseoffice);
        }

        else if(s.equals("Department of Mathematical SciencesLab01"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cseoffice);
        }
        else if(s.equals("Department of Mathematical SciencesLab02"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cseoffice);
        }
        else if(s.equals("Department of Mathematical SciencesStaff01"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cseoffice);
        }
        else if(s.equals("Department of Mathematical SciencesStaff02"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cseoffice);
        }
        else if(s.equals("Department of Mathematical SciencesStaff03"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.cseoffice);
        }
        else{
            Toast.makeText(fire.this,
                    "You are currently in : " +
                            "\nBuilding: "+str0+
                            "\nRoom : "+ str1 +
                            "\nNumber : "+str2+
                            "s: "+s+ "Which has not been entered!\nSORRY!",
                    Toast.LENGTH_LONG).show();
        }
        Toast.makeText(fire.this,
                "You are currently in : " +
                        "\nBuilding: "+str0+
                        "\nRoom : "+ str1 +
                        "\nNumber : "+str2+
                "s: "+s,
                Toast.LENGTH_LONG).show();

        //image.setImageResource(R.drawable.groundfloor);

    }
}
