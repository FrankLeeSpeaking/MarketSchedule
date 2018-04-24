package com.example.allaccess.marketschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class Scheduled extends AppCompatActivity {
    String mondayArray [] = {"Hinsdale","IL", "June 4","September 30", "8:00 AM", "1:00 PM"};
    String tuesdayArray [] = {"Woodstock", "IL","May 1", "October 16", "8:00 AM", "1:00 PM"};
    String wednesdayArray [] = {"Gray's Lake", "IL","June 6", "September 26", "3:00 PM", "7:00 PM"};
    String thursdayArray[] = {"Lake Geneva", "WI", "May 17", "October 18", "8:00 AM","1:00 PM"};
    String fridayArray[] = {"Schaumburg", "IL", "June 1", "October 26", "7:00 AM", "2:00 PM"};
    String saturdayArray[] = {"Beloit", "WI", "May 3", "October 27", "8:00 AM", "1:00 PM"};
    String sundayArray[] = {"Racine", "WI", "April 29", "October 28", "10:00 AM", "2:00 PM"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduled);

        Button checkSchedule = findViewById(R.id.btnCheckSchedule);
        checkSchedule.setOnClickListener(new View.OnClickListener() {

            final TextView showTown = findViewById(R.id.txtTown);
            final TextView showState = findViewById(R.id.txtState);
            final TextView showDate1 = findViewById(R.id.txtViewStart);
            final TextView showDate2 = findViewById(R.id.txtViewEnd);
            final TextView showTime1 = findViewById(R.id.txtOpen);
            final TextView showTime2 = findViewById(R.id.txtClose);
            final TextView programAide = findViewById(R.id.txtProgAid);
            final Spinner dayOfWeek = findViewById(R.id.spnWeekDays);

            String marketTown;
            String marketState;
            String marketStart;
            String marketEnd;
            String timeStart;
            String timeEnd;

            @Override
            public void onClick(View view) {

                boolean isChecked = false;
                String seeSpinner = dayOfWeek.getSelectedItem().toString();

                switch (seeSpinner) {
                    case "Monday":
                        marketTown = mondayArray[0];
                        marketState = mondayArray[1];
                        marketStart = mondayArray[2];
                        marketEnd = mondayArray[3];
                        timeStart = mondayArray[4];
                        timeEnd = mondayArray[5];
                        isChecked = true;
                        break;
                    case "Tuesday":
                        marketTown = tuesdayArray[0];
                        marketState = tuesdayArray[1];
                        marketStart = tuesdayArray[2];
                        marketEnd = tuesdayArray[3];
                        timeStart = tuesdayArray[4];
                        timeEnd = tuesdayArray[5];
                        isChecked = true;
                        break;
                    case "Wednesday":
                        marketTown = wednesdayArray[0];
                        marketState = wednesdayArray[1];
                        marketStart = wednesdayArray[2];
                        marketEnd = wednesdayArray[3];
                        timeStart = wednesdayArray[4];
                        timeEnd = wednesdayArray[5];
                        isChecked = true;
                        break;
                    case "Thursday":
                        marketTown = thursdayArray[0];
                        marketState = thursdayArray[1];
                        marketStart = thursdayArray[2];
                        marketEnd = thursdayArray[3];
                        timeStart = thursdayArray[4];
                        timeEnd = thursdayArray[5];
                        isChecked = true;
                        break;
                    case "Friday":
                        marketTown = fridayArray[0];
                        marketState = fridayArray[1];
                        marketStart = fridayArray[2];
                        marketEnd = fridayArray[3];
                        timeStart = fridayArray[4];
                        timeEnd = fridayArray[5];
                        isChecked = true;
                        break;
                    case "Saturday":
                        marketTown = saturdayArray[0];
                        marketState = saturdayArray[1];
                        marketStart = saturdayArray[2];
                        marketEnd = saturdayArray[3];
                        timeStart = saturdayArray[4];
                        timeEnd = saturdayArray[5];
                        isChecked = true;
                        break;
                    case "Sunday":
                        marketTown = sundayArray[0];
                        marketState = sundayArray[1];
                        marketStart = sundayArray[2];
                        marketEnd = sundayArray[3];
                        timeStart = sundayArray[4];
                        timeEnd = sundayArray[5];
                        isChecked = true;
                        break;
                }


                showTown.setText(marketTown);
                showState.setText(marketState);
                showDate1.setText(marketStart);
                showDate2.setText(marketEnd);
                showTime1.setText(timeStart);
                showTime2.setText(timeEnd);
            }


    });//--------- END onCreate
}}
