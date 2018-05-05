package com.example.allaccess.marketschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Scheduled extends AppCompatActivity {
    String mondayArray [] = {"Hinsdale","IL", "June4","September30", "8:00AM", "1:00PM"};
    String tuesdayArray [] = {"Woodstock", "IL","May1", "October16", "8:00AM", "1:00PM"};
    String wednesdayArray [] = {"Gray's Lake", "IL","June6", "September26", "3:00PM", "7:00PM"};
    String thursdayArray[] = {"Lake Geneva", "WI", "May17", "October18", "8:00AM","1:00PM"};
    String fridayArray[] = {"Schaumburg", "IL", "June1", "October26", "7:00AM", "2:00PM"};
    String saturdayArray[] = {"Beloit", "WI", "May3", "October27", "8:00AM", "1:00PM"};
    String sundayArray[] = {"Racine", "WI", "April29", "October28", "10:00AM", "2:00PM"};
    String progAide;



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

            CheckBox checkSchedule = findViewById(R.id.cboxScheduled);
            CheckBox checkRemove = findViewById(R.id.cboxRemove);

            String marketTown;
            String marketState;
            String marketStart;
            String marketEnd;
            String timeStart;
            String timeEnd;
            String fileName;


            @Override
            public void onClick(View view) {


                if (checkSchedule.isChecked() && checkRemove.isChecked()){
                    Toast.makeText(getApplicationContext(),"You may only ADD or REMOVE, not both", Toast.LENGTH_LONG).show();
                    checkSchedule.toggle();
                    checkRemove.toggle();
                }//------- END IF

                String seeSpinner = dayOfWeek.getSelectedItem().toString();
                fileName = seeSpinner + ".txt";
                StringBuilder pa = new StringBuilder();

                switch (seeSpinner) {
                    case "Monday":
                        marketTown = mondayArray[0];
                        marketState = mondayArray[1];
                        marketStart = mondayArray[2];
                        marketEnd = mondayArray[3];
                        timeStart = mondayArray[4];
                        timeEnd = mondayArray[5];
                        if (checkSchedule.isChecked()) {
                            File file = new File(getFilesDir(), fileName);
                            PrintStream output = null;
                            try {
                                output = new PrintStream(file);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            pa.append(seeSpinner);
                            int index = 0;
                            while(index < mondayArray.length){
                                if (mondayArray[index] != null){
                                    output.println(mondayArray[index]);
                                    pa.append(mondayArray[index]);
                                }
                                index = index + 1;
                            }

                            output.close();
                            progAide = "Could have written to: " + "\n" + file + "\n\n" + pa;
                            checkSchedule.toggle();
                        }

                        if(checkRemove.isChecked()){
                            File file = new File(getFilesDir(), fileName);
                            Scanner input = null;
                            int index = 0;
                            try {
                                input = new Scanner(file);

                            } catch (FileNotFoundException e) {
                                Toast.makeText(getApplicationContext(),"in Monday read catch FileNotFoundException" + e, Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                            while(index < mondayArray.length){
                                if (mondayArray[index] != null){
                                mondayArray[index]= input.next();
                                index = index + 1;
                                }
                            }

                            progAide = "read from Monday: " + mondayArray[0] + mondayArray[1]+ mondayArray[2] + ":" + mondayArray[3]+ mondayArray[4] + mondayArray[5];
                            input.close();
                        }
                        break;
                    case "Tuesday":
                        marketTown = tuesdayArray[0];
                        marketState = tuesdayArray[1];
                        marketStart = tuesdayArray[2];
                        marketEnd = tuesdayArray[3];
                        timeStart = tuesdayArray[4];
                        timeEnd = tuesdayArray[5];
                        if (checkSchedule.isChecked()) {
                            File file = new File(getFilesDir(), fileName);
                            PrintWriter output = null;
                            try {
                                output = new PrintWriter(file);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            output.append(seeSpinner);
                            for (int i = 0; i < tuesdayArray.length; i++){
                                output.append(tuesdayArray[i]);
                                pa.append(tuesdayArray[i]);
                            }
                            output.close();
                            progAide = "Could have written to: " + "\n" + file + "\n\n" + pa;
                            checkSchedule.toggle();
                        }
                        break;
                    case "Wednesday":
                        marketTown = wednesdayArray[0];
                        marketState = wednesdayArray[1];
                        marketStart = wednesdayArray[2];
                        marketEnd = wednesdayArray[3];
                        timeStart = wednesdayArray[4];
                        timeEnd = wednesdayArray[5];
                        if (checkSchedule.isChecked()) {
                            File file = new File(getFilesDir(), fileName);
                            PrintWriter output = null;
                            try {
                                output = new PrintWriter(file);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            output.append(seeSpinner);
                            for (int i = 0; i < wednesdayArray.length; i++){
                                output.append(wednesdayArray[i]);
                                pa.append(wednesdayArray[i]);
                            }
                            output.close();
                            progAide = "Could have written to: " + "\n" + file + "\n\n" + pa;
                            checkSchedule.toggle();
                        }
                        break;
                    case "Thursday":
                        marketTown = thursdayArray[0];
                        marketState = thursdayArray[1];
                        marketStart = thursdayArray[2];
                        marketEnd = thursdayArray[3];
                        timeStart = thursdayArray[4];
                        timeEnd = thursdayArray[5];
                        if (checkSchedule.isChecked()) {
                            File file = new File(getFilesDir(), fileName);
                            PrintWriter output = null;
                            try {
                                output = new PrintWriter(file);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            output.append(seeSpinner);
                            for (int i = 0; i < thursdayArray.length; i++){
                                output.append(thursdayArray[i]);
                                pa.append(thursdayArray[i]);
                            }
                            output.close();
                            progAide = "Could have written to: " + "\n" + file + "\n\n" + pa;
                            checkSchedule.toggle();
                        }
                        break;
                    case "Friday":
                        marketTown = fridayArray[0];
                        marketState = fridayArray[1];
                        marketStart = fridayArray[2];
                        marketEnd = fridayArray[3];
                        timeStart = fridayArray[4];
                        timeEnd = fridayArray[5];
                        if (checkSchedule.isChecked()) {
                            File file = new File(getFilesDir(), fileName);
                            PrintWriter output = null;
                            try {
                                output = new PrintWriter(file);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            output.append(seeSpinner);
                            for (int i = 0; i < fridayArray.length; i++){
                                output.append(fridayArray[i]);
                                pa.append(fridayArray[i]);
                            }
                            output.close();
                            progAide = "Could have written to: " + "\n" + file + "\n\n" + pa;
                            checkSchedule.toggle();
                        }
                        break;
                    case "Saturday":
                        marketTown = saturdayArray[0];
                        marketState = saturdayArray[1];
                        marketStart = saturdayArray[2];
                        marketEnd = saturdayArray[3];
                        timeStart = saturdayArray[4];
                        timeEnd = saturdayArray[5];
                        if (checkSchedule.isChecked()) {
                            File file = new File(getFilesDir(), fileName);
                            PrintWriter output = null;
                            try {
                                output = new PrintWriter(file);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            output.append(seeSpinner);
                            for (int i = 0; i < saturdayArray.length; i++){
                                output.append(saturdayArray[i]);
                                pa.append(saturdayArray[i]);
                            }
                            output.close();
                            progAide = "Could have written to: " + "\n" + file + "\n\n" + pa;
                            checkSchedule.toggle();
                        }
                        break;
                    case "Sunday":
                        marketTown = sundayArray[0];
                        marketState = sundayArray[1];
                        marketStart = sundayArray[2];
                        marketEnd = sundayArray[3];
                        timeStart = sundayArray[4];
                        timeEnd = sundayArray[5];
                        if (checkSchedule.isChecked()) {
                            File file = new File(getFilesDir(), fileName);
                            PrintWriter output = null;
                            try {
                                output = new PrintWriter(file);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            output.append(seeSpinner);
                            for (int i = 0; i < sundayArray.length; i++){
                                output.append(sundayArray[i]);
                                pa.append(sundayArray[i]);
                            }
                            output.close();
                            progAide = "Could have written to: " + "\n" + file + "\n\n" + pa;
                            checkSchedule.toggle();
                        }
                        break;
                }


                // MAY 1 this reads file nor delete
/*                if (checkRemove.isChecked()) {
                    //Delete a file ? myContext.deleteFile(fileName);
                    progAide = readFile(fileName);
                }*/

                showTown.setText(marketTown);
                showState.setText(marketState);
                showDate1.setText(marketStart);
                showDate2.setText(marketEnd);
                showTime1.setText(timeStart);
                showTime2.setText(timeEnd);
                programAide.setText(progAide);
            }



        });//--------- END onClickListener
    }

}
