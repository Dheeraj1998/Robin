package com.example.robin;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TimeTableActivity extends AppCompatActivity implements View.OnClickListener {

    private SharedPreferences timetablePreferences;

    //region Variable declaration - Boolean
    private boolean tt_1;
    private boolean tt_2;
    private boolean tt_3;
    private boolean tt_4;
    private boolean tt_5;

    private boolean tt_6;
    private boolean tt_7;
    private boolean tt_8;
    private boolean tt_9;
    private boolean tt_10;

    private boolean tt_11;
    private boolean tt_12;
    private boolean tt_13;
    private boolean tt_14;
    private boolean tt_15;

    private boolean tt_16;
    private boolean tt_17;
    private boolean tt_18;
    private boolean tt_19;
    private boolean tt_20;

    private boolean tt_21;
    private boolean tt_22;
    private boolean tt_23;
    private boolean tt_24;
    private boolean tt_25;

    private boolean tt_26;
    private boolean tt_27;
    private boolean tt_28;
    private boolean tt_29;
    private boolean tt_30;

    private boolean tt_31;
    private boolean tt_32;
    private boolean tt_33;
    private boolean tt_34;
    private boolean tt_35;

    private boolean tt_36;
    private boolean tt_37;
    private boolean tt_38;
    private boolean tt_39;
    private boolean tt_40;

    private boolean tt_41;
    private boolean tt_42;
    private boolean tt_43;
    private boolean tt_44;
    private boolean tt_45;

    private boolean tt_46;
    private boolean tt_47;
    private boolean tt_48;
    private boolean tt_49;
    private boolean tt_50;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        //region Variable declaration - TextViews
        TextView tmtable_1 = (TextView) findViewById(R.id.tt_1);
        TextView tmtable_2 = (TextView) findViewById(R.id.tt_2);
        TextView tmtable_3 = (TextView) findViewById(R.id.tt_3);
        TextView tmtable_4 = (TextView) findViewById(R.id.tt_4);
        TextView tmtable_5 = (TextView) findViewById(R.id.tt_5);

        TextView tmtable_6 = (TextView) findViewById(R.id.tt_6);
        TextView tmtable_7 = (TextView) findViewById(R.id.tt_7);
        TextView tmtable_8 = (TextView) findViewById(R.id.tt_8);
        TextView tmtable_9 = (TextView) findViewById(R.id.tt_9);
        TextView tmtable_10 = (TextView) findViewById(R.id.tt_10);

        TextView tmtable_11 = (TextView) findViewById(R.id.tt_11);
        TextView tmtable_12 = (TextView) findViewById(R.id.tt_12);
        TextView tmtable_13 = (TextView) findViewById(R.id.tt_13);
        TextView tmtable_14 = (TextView) findViewById(R.id.tt_14);
        TextView tmtable_15 = (TextView) findViewById(R.id.tt_15);

        TextView tmtable_16 = (TextView) findViewById(R.id.tt_16);
        TextView tmtable_17 = (TextView) findViewById(R.id.tt_17);
        TextView tmtable_18 = (TextView) findViewById(R.id.tt_18);
        TextView tmtable_19 = (TextView) findViewById(R.id.tt_19);
        TextView tmtable_20 = (TextView) findViewById(R.id.tt_20);

        TextView tmtable_21 = (TextView) findViewById(R.id.tt_21);
        TextView tmtable_22 = (TextView) findViewById(R.id.tt_22);
        TextView tmtable_23 = (TextView) findViewById(R.id.tt_23);
        TextView tmtable_24 = (TextView) findViewById(R.id.tt_24);
        TextView tmtable_25 = (TextView) findViewById(R.id.tt_25);

        TextView tmtable_26 = (TextView) findViewById(R.id.tt_26);
        TextView tmtable_27 = (TextView) findViewById(R.id.tt_27);
        TextView tmtable_28 = (TextView) findViewById(R.id.tt_28);
        TextView tmtable_29 = (TextView) findViewById(R.id.tt_29);
        TextView tmtable_30 = (TextView) findViewById(R.id.tt_30);

        TextView tmtable_31 = (TextView) findViewById(R.id.tt_31);
        TextView tmtable_32 = (TextView) findViewById(R.id.tt_32);
        TextView tmtable_33 = (TextView) findViewById(R.id.tt_33);
        TextView tmtable_34 = (TextView) findViewById(R.id.tt_34);
        TextView tmtable_35 = (TextView) findViewById(R.id.tt_35);

        TextView tmtable_36 = (TextView) findViewById(R.id.tt_36);
        TextView tmtable_37 = (TextView) findViewById(R.id.tt_37);
        TextView tmtable_38 = (TextView) findViewById(R.id.tt_38);
        TextView tmtable_39 = (TextView) findViewById(R.id.tt_39);
        TextView tmtable_40 = (TextView) findViewById(R.id.tt_40);

        TextView tmtable_41 = (TextView) findViewById(R.id.tt_41);
        TextView tmtable_42 = (TextView) findViewById(R.id.tt_42);
        TextView tmtable_43 = (TextView) findViewById(R.id.tt_43);
        TextView tmtable_44 = (TextView) findViewById(R.id.tt_44);
        TextView tmtable_45 = (TextView) findViewById(R.id.tt_45);

        TextView tmtable_46 = (TextView) findViewById(R.id.tt_46);
        TextView tmtable_47 = (TextView) findViewById(R.id.tt_47);
        TextView tmtable_48 = (TextView) findViewById(R.id.tt_48);
        TextView tmtable_49 = (TextView) findViewById(R.id.tt_49);
        TextView tmtable_50 = (TextView) findViewById(R.id.tt_50);
        //endregion

        //region Function declaration - onClick for TextViews
        tmtable_1.setOnClickListener(this);
        tmtable_2.setOnClickListener(this);
        tmtable_3.setOnClickListener(this);
        tmtable_4.setOnClickListener(this);
        tmtable_5.setOnClickListener(this);

        tmtable_6.setOnClickListener(this);
        tmtable_7.setOnClickListener(this);
        tmtable_8.setOnClickListener(this);
        tmtable_9.setOnClickListener(this);
        tmtable_10.setOnClickListener(this);

        tmtable_11.setOnClickListener(this);
        tmtable_12.setOnClickListener(this);
        tmtable_13.setOnClickListener(this);
        tmtable_14.setOnClickListener(this);
        tmtable_15.setOnClickListener(this);

        tmtable_16.setOnClickListener(this);
        tmtable_17.setOnClickListener(this);
        tmtable_18.setOnClickListener(this);
        tmtable_19.setOnClickListener(this);
        tmtable_20.setOnClickListener(this);

        tmtable_21.setOnClickListener(this);
        tmtable_22.setOnClickListener(this);
        tmtable_23.setOnClickListener(this);
        tmtable_24.setOnClickListener(this);
        tmtable_25.setOnClickListener(this);

        tmtable_26.setOnClickListener(this);
        tmtable_27.setOnClickListener(this);
        tmtable_28.setOnClickListener(this);
        tmtable_29.setOnClickListener(this);
        tmtable_30.setOnClickListener(this);

        tmtable_31.setOnClickListener(this);
        tmtable_32.setOnClickListener(this);
        tmtable_33.setOnClickListener(this);
        tmtable_34.setOnClickListener(this);
        tmtable_35.setOnClickListener(this);

        tmtable_36.setOnClickListener(this);
        tmtable_37.setOnClickListener(this);
        tmtable_38.setOnClickListener(this);
        tmtable_39.setOnClickListener(this);
        tmtable_40.setOnClickListener(this);

        tmtable_41.setOnClickListener(this);
        tmtable_42.setOnClickListener(this);
        tmtable_43.setOnClickListener(this);
        tmtable_44.setOnClickListener(this);
        tmtable_45.setOnClickListener(this);

        tmtable_46.setOnClickListener(this);
        tmtable_47.setOnClickListener(this);
        tmtable_48.setOnClickListener(this);
        tmtable_49.setOnClickListener(this);
        tmtable_50.setOnClickListener(this);
        //endregion

        timetablePreferences = getApplicationContext().getSharedPreferences("TimeTable", 0);
        getTimeTable();

        Toast.makeText(getApplicationContext(), "Go back after setting up!", Toast.LENGTH_LONG).show();
    }

    public void getTimeTable(){
        //region Getting the timetable values
        tt_1 = timetablePreferences.getBoolean("tt_1", false);
        tt_2 = timetablePreferences.getBoolean("tt_2", false);
        tt_3 = timetablePreferences.getBoolean("tt_3", false);
        tt_4 = timetablePreferences.getBoolean("tt_4", false);
        tt_5 = timetablePreferences.getBoolean("tt_5", false);

        tt_6 = timetablePreferences.getBoolean("tt_6", false);
        tt_7 = timetablePreferences.getBoolean("tt_7", false);
        tt_8 = timetablePreferences.getBoolean("tt_8", false);
        tt_9 = timetablePreferences.getBoolean("tt_9", false);
        tt_10 = timetablePreferences.getBoolean("tt_10", false);

        tt_11 = timetablePreferences.getBoolean("tt_11", false);
        tt_12 = timetablePreferences.getBoolean("tt_12", false);
        tt_13 = timetablePreferences.getBoolean("tt_13", false);
        tt_14 = timetablePreferences.getBoolean("tt_14", false);
        tt_15 = timetablePreferences.getBoolean("tt_15", false);

        tt_16 = timetablePreferences.getBoolean("tt_16", false);
        tt_17= timetablePreferences.getBoolean("tt_17", false);
        tt_18 = timetablePreferences.getBoolean("tt_18", false);
        tt_19 = timetablePreferences.getBoolean("tt_19", false);
        tt_20 = timetablePreferences.getBoolean("tt_20", false);

        tt_21 = timetablePreferences.getBoolean("tt_21", false);
        tt_22 = timetablePreferences.getBoolean("tt_22", false);
        tt_23 = timetablePreferences.getBoolean("tt_23", false);
        tt_24 = timetablePreferences.getBoolean("tt_24", false);
        tt_25 = timetablePreferences.getBoolean("tt_25", false);

        tt_26 = timetablePreferences.getBoolean("tt_26", false);
        tt_27 = timetablePreferences.getBoolean("tt_27", false);
        tt_28 = timetablePreferences.getBoolean("tt_28", false);
        tt_29 = timetablePreferences.getBoolean("tt_29", false);
        tt_30 = timetablePreferences.getBoolean("tt_30", false);

        tt_31 = timetablePreferences.getBoolean("tt_31", false);
        tt_32 = timetablePreferences.getBoolean("tt_32", false);
        tt_33 = timetablePreferences.getBoolean("tt_33", false);
        tt_34 = timetablePreferences.getBoolean("tt_34", false);
        tt_35 = timetablePreferences.getBoolean("tt_35", false);

        tt_36 = timetablePreferences.getBoolean("tt_36", false);
        tt_37 = timetablePreferences.getBoolean("tt_37", false);
        tt_38 = timetablePreferences.getBoolean("tt_38", false);
        tt_39 = timetablePreferences.getBoolean("tt_39", false);
        tt_40 = timetablePreferences.getBoolean("tt_40", false);

        tt_41 = timetablePreferences.getBoolean("tt_41", false);
        tt_42 = timetablePreferences.getBoolean("tt_42", false);
        tt_43 = timetablePreferences.getBoolean("tt_43", false);
        tt_44 = timetablePreferences.getBoolean("tt_44", false);
        tt_45 = timetablePreferences.getBoolean("tt_45", false);

        tt_46 = timetablePreferences.getBoolean("tt_46", false);
        tt_47 = timetablePreferences.getBoolean("tt_47", false);
        tt_48 = timetablePreferences.getBoolean("tt_48", false);
        tt_49 = timetablePreferences.getBoolean("tt_49", false);
        tt_50 = timetablePreferences.getBoolean("tt_50", false);
        //endregion

        //region Setting up the timetable colors
        if(tt_1){
            findViewById(R.id.tt_1).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_2){
            findViewById(R.id.tt_2).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_3){
            findViewById(R.id.tt_3).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_4){
            findViewById(R.id.tt_4).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_5){
            findViewById(R.id.tt_5).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_6){
            findViewById(R.id.tt_6).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_7){
            findViewById(R.id.tt_7).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_8){
            findViewById(R.id.tt_8).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_9){
            findViewById(R.id.tt_9).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_10){
            findViewById(R.id.tt_10).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_11){
            findViewById(R.id.tt_11).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_12){
            findViewById(R.id.tt_12).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_13){
            findViewById(R.id.tt_13).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_14){
            findViewById(R.id.tt_14).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_15){
            findViewById(R.id.tt_15).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_16){
            findViewById(R.id.tt_16).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_17){
            findViewById(R.id.tt_17).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_18){
            findViewById(R.id.tt_18).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_19){
            findViewById(R.id.tt_19).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_20){
            findViewById(R.id.tt_20).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_21){
            findViewById(R.id.tt_21).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_22){
            findViewById(R.id.tt_22).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_23){
            findViewById(R.id.tt_23).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_24){
            findViewById(R.id.tt_24).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_25){
            findViewById(R.id.tt_25).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_26){
            findViewById(R.id.tt_26).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_27){
            findViewById(R.id.tt_27).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_28){
            findViewById(R.id.tt_28).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_29){
            findViewById(R.id.tt_29).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_30){
            findViewById(R.id.tt_30).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_31){
            findViewById(R.id.tt_31).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_32){
            findViewById(R.id.tt_32).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_33){
            findViewById(R.id.tt_33).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_34){
            findViewById(R.id.tt_34).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_35){
            findViewById(R.id.tt_35).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_36){
            findViewById(R.id.tt_36).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_37){
            findViewById(R.id.tt_37).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_38){
            findViewById(R.id.tt_38).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_39){
            findViewById(R.id.tt_39).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_40){
            findViewById(R.id.tt_40).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_41){
            findViewById(R.id.tt_41).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_42){
            findViewById(R.id.tt_42).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_43){
            findViewById(R.id.tt_43).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_44){
            findViewById(R.id.tt_44).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_45){
            findViewById(R.id.tt_45).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_46){
            findViewById(R.id.tt_46).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_47){
            findViewById(R.id.tt_47).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_48){
            findViewById(R.id.tt_48).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_49){
            findViewById(R.id.tt_49).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }

        if(tt_50){
            findViewById(R.id.tt_50).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
        }
        //endregion
    }

    @Override
    public void onClick(View v) {
        SharedPreferences.Editor timetableEditor = timetablePreferences.edit();

        //region Switch statements
        switch (v.getId()) {
            //region Button 1
            case R.id.tt_1:
                if(tt_1) {
                    findViewById(R.id.tt_1).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_1).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_1 = !tt_1;
                timetableEditor.putBoolean("tt_1", tt_1);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 2
            case R.id.tt_2:
                if(tt_2) {
                    findViewById(R.id.tt_2).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_2).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_2 = !tt_2;
                timetableEditor.putBoolean("tt_2", tt_2);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 3
            case R.id.tt_3:
                if(tt_3) {
                    findViewById(R.id.tt_3).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_3).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_3 = !tt_3;
                timetableEditor.putBoolean("tt_3", tt_3);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 4
            case R.id.tt_4:
                if(tt_4) {
                    findViewById(R.id.tt_4).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_4).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_4 = !tt_4;
                timetableEditor.putBoolean("tt_4", tt_4);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 5
            case R.id.tt_5:
                if(tt_5) {
                    findViewById(R.id.tt_5).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_5).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_5 = !tt_5;
                timetableEditor.putBoolean("tt_5", tt_5);
                timetableEditor.apply();
                break;
            //endregion

            //region Button 6
            case R.id.tt_6:
                if(tt_6) {
                    findViewById(R.id.tt_6).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_6).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_6 = !tt_6;
                timetableEditor.putBoolean("tt_6", tt_6);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 7
            case R.id.tt_7:
                if(tt_7) {
                    findViewById(R.id.tt_7).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_7).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_7 = !tt_7;
                timetableEditor.putBoolean("tt_7", tt_7);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 8
            case R.id.tt_8:
                if(tt_8) {
                    findViewById(R.id.tt_8).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_8).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_8 = !tt_8;
                timetableEditor.putBoolean("tt_8", tt_8);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 9
            case R.id.tt_9:
                if(tt_9) {
                    findViewById(R.id.tt_9).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_9).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_9 = !tt_9;
                timetableEditor.putBoolean("tt_9", tt_9);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 10
            case R.id.tt_10:
                if(tt_10) {
                    findViewById(R.id.tt_10).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_10).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_10 = !tt_10;
                timetableEditor.putBoolean("tt_10", tt_10);
                timetableEditor.apply();
                break;
            //endregion

            //region Button 11
            case R.id.tt_11:
                if(tt_11) {
                    findViewById(R.id.tt_11).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_11).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_11 = !tt_11;
                timetableEditor.putBoolean("tt_11", tt_11);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 12
            case R.id.tt_12:
                if(tt_12) {
                    findViewById(R.id.tt_12).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_12).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_12 = !tt_12;
                timetableEditor.putBoolean("tt_12", tt_12);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 13
            case R.id.tt_13:
                if(tt_13) {
                    findViewById(R.id.tt_13).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_13).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_13 = !tt_13;
                timetableEditor.putBoolean("tt_13", tt_13);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 14
            case R.id.tt_14:
                if(tt_14) {
                    findViewById(R.id.tt_14).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_14).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_14 = !tt_14;
                timetableEditor.putBoolean("tt_14", tt_14);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 15
            case R.id.tt_15:
                if(tt_15) {
                    findViewById(R.id.tt_15).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_15).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_15 = !tt_15;
                timetableEditor.putBoolean("tt_15", tt_15);
                timetableEditor.apply();
                break;
            //endregion

            //region Button 16
            case R.id.tt_16:
                if(tt_16) {
                    findViewById(R.id.tt_16).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_16).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_16 = !tt_16;
                timetableEditor.putBoolean("tt_16", tt_16);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 17
            case R.id.tt_17:
                if(tt_17) {
                    findViewById(R.id.tt_17).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_17).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_17 = !tt_17;
                timetableEditor.putBoolean("tt_17", tt_17);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 18
            case R.id.tt_18:
                if(tt_18) {
                    findViewById(R.id.tt_18).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_18).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_18 = !tt_18;
                timetableEditor.putBoolean("tt_18", tt_18);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 19
            case R.id.tt_19:
                if(tt_19) {
                    findViewById(R.id.tt_19).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_19).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_19 = !tt_19;
                timetableEditor.putBoolean("tt_19", tt_19);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 20
            case R.id.tt_20:
                if(tt_20) {
                    findViewById(R.id.tt_20).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_20).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_20 = !tt_20;
                timetableEditor.putBoolean("tt_20", tt_20);
                timetableEditor.apply();
                break;
            //endregion

            //region Button 21
            case R.id.tt_21:
                if(tt_21) {
                    findViewById(R.id.tt_21).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_21).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_21 = !tt_21;
                timetableEditor.putBoolean("tt_21", tt_21);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 22
            case R.id.tt_22:
                if(tt_22) {
                    findViewById(R.id.tt_22).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_22).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_22 = !tt_22;
                timetableEditor.putBoolean("tt_22", tt_22);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 23
            case R.id.tt_23:
                if(tt_23) {
                    findViewById(R.id.tt_23).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_23).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_23 = !tt_23;
                timetableEditor.putBoolean("tt_23", tt_23);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 24
            case R.id.tt_24:
                if(tt_24) {
                    findViewById(R.id.tt_24).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_24).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_24 = !tt_24;
                timetableEditor.putBoolean("tt_24", tt_24);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 25
            case R.id.tt_25:
                if(tt_25) {
                    findViewById(R.id.tt_25).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_25).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_25 = !tt_25;
                timetableEditor.putBoolean("tt_25", tt_25);
                timetableEditor.apply();
                break;
            //endregion

            //region Button 26
            case R.id.tt_26:
                if(tt_26) {
                    findViewById(R.id.tt_26).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_26).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_26 = !tt_26;
                timetableEditor.putBoolean("tt_26", tt_26);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 27
            case R.id.tt_27:
                if(tt_27) {
                    findViewById(R.id.tt_27).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_27).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_27 = !tt_27;
                timetableEditor.putBoolean("tt_27", tt_27);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 28
            case R.id.tt_28:
                if(tt_28) {
                    findViewById(R.id.tt_28).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_28).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_28 = !tt_28;
                timetableEditor.putBoolean("tt_28", tt_28);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 29
            case R.id.tt_29:
                if(tt_29) {
                    findViewById(R.id.tt_29).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_29).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_29 = !tt_29;
                timetableEditor.putBoolean("tt_29", tt_29);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 30
            case R.id.tt_30:
                if(tt_30) {
                    findViewById(R.id.tt_30).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_30).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_30 = !tt_30;
                timetableEditor.putBoolean("tt_30", tt_30);
                timetableEditor.apply();
                break;
            //endregion

            //region Button 31
            case R.id.tt_31:
                if(tt_31) {
                    findViewById(R.id.tt_31).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_31).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_31 = !tt_31;
                timetableEditor.putBoolean("tt_31", tt_31);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 32
            case R.id.tt_32:
                if(tt_32) {
                    findViewById(R.id.tt_32).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_32).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_32 = !tt_32;
                timetableEditor.putBoolean("tt_32", tt_32);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 33
            case R.id.tt_33:
                if(tt_33) {
                    findViewById(R.id.tt_33).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_33).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_33 = !tt_33;
                timetableEditor.putBoolean("tt_33", tt_33);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 34
            case R.id.tt_34:
                if(tt_34) {
                    findViewById(R.id.tt_34).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_34).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_34 = !tt_34;
                timetableEditor.putBoolean("tt_34", tt_34);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 35
            case R.id.tt_35:
                if(tt_35) {
                    findViewById(R.id.tt_35).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_35).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_35 = !tt_35;
                timetableEditor.putBoolean("tt_35", tt_35);
                timetableEditor.apply();
                break;
            //endregion

            //region Button 36
            case R.id.tt_36:
                if(tt_36) {
                    findViewById(R.id.tt_36).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_36).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_36 = !tt_36;
                timetableEditor.putBoolean("tt_36", tt_36);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 37
            case R.id.tt_37:
                if(tt_37) {
                    findViewById(R.id.tt_37).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_37).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_37 = !tt_37;
                timetableEditor.putBoolean("tt_37", tt_37);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 38
            case R.id.tt_38:
                if(tt_38) {
                    findViewById(R.id.tt_38).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_38).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_38 = !tt_38;
                timetableEditor.putBoolean("tt_38", tt_38);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 39
            case R.id.tt_39:
                if(tt_39) {
                    findViewById(R.id.tt_39).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_39).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_39 = !tt_39;
                timetableEditor.putBoolean("tt_39", tt_39);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 40
            case R.id.tt_40:
                if(tt_40) {
                    findViewById(R.id.tt_40).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_40).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_40 = !tt_40;
                timetableEditor.putBoolean("tt_40", tt_40);
                timetableEditor.apply();
                break;
            //endregion

            //region Button 41
            case R.id.tt_41:
                if(tt_41) {
                    findViewById(R.id.tt_41).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_41).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_41 = !tt_41;
                timetableEditor.putBoolean("tt_41", tt_41);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 42
            case R.id.tt_42:
                if(tt_42) {
                    findViewById(R.id.tt_42).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_42).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_42 = !tt_42;
                timetableEditor.putBoolean("tt_42", tt_42);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 43
            case R.id.tt_43:
                if(tt_43) {
                    findViewById(R.id.tt_43).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_43).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_43 = !tt_43;
                timetableEditor.putBoolean("tt_43", tt_43);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 44
            case R.id.tt_44:
                if(tt_44) {
                    findViewById(R.id.tt_44).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_44).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_44 = !tt_44;
                timetableEditor.putBoolean("tt_44", tt_44);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 45
            case R.id.tt_45:
                if(tt_45) {
                    findViewById(R.id.tt_45).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_45).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_45 = !tt_45;
                timetableEditor.putBoolean("tt_45", tt_45);
                timetableEditor.apply();
                break;
            //endregion

            //region Button 46
            case R.id.tt_46:
                if(tt_46) {
                    findViewById(R.id.tt_46).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_46).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_46 = !tt_46;
                timetableEditor.putBoolean("tt_46", tt_46);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 47
            case R.id.tt_47:
                if(tt_47) {
                    findViewById(R.id.tt_47).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_47).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_47 = !tt_47;
                timetableEditor.putBoolean("tt_47", tt_47);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 48
            case R.id.tt_48:
                if(tt_48) {
                    findViewById(R.id.tt_48).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_48).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_48 = !tt_48;
                timetableEditor.putBoolean("tt_48", tt_48);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 49
            case R.id.tt_49:
                if(tt_49) {
                    findViewById(R.id.tt_49).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_49).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_49 = !tt_49;
                timetableEditor.putBoolean("tt_49", tt_49);
                timetableEditor.apply();
                break;
            //endregion
            //region Button 50
            case R.id.tt_50:
                if(tt_50) {
                    findViewById(R.id.tt_50).setBackgroundColor(getResources().getColor(R.color.background_3));
                } else {
                    findViewById(R.id.tt_50).setBackgroundColor(getResources().getColor(R.color.colorTimeTable));
                }

                tt_50 = !tt_50;
                timetableEditor.putBoolean("tt_50", tt_50);
                timetableEditor.apply();
                break;
            //endregion
        }
        //endregion
    }
}
