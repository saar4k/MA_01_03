package com.example.ma_01_03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
//import android.util.Log;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    static String textViewString = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Textfeld für Ein- und Ausgabe
        TextView textView_01 = (TextView) findViewById(R.id.textViewResult);

        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewString == "0") {
                    textViewString = "0";
                } else {
                    textViewString += "0";
                }
                textView_01.setText(textViewString);
            }
        });


        Button buttonKomma = findViewById(R.id.buttonKomma);
        buttonKomma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewString += ",";
                textView_01.setText(textViewString);
            }
        });


        Button buttonEquals = findViewById(R.id.buttonEquals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Scanner in = new Scanner(textViewString.replace(',', '.'));
                // 2 Listen mit Zahlen und Operatoren füllen
                List<Double> numbers= new LinkedList<>();
                List<String> operators= new LinkedList<>();

                numbers.add(Double.parseDouble(in.next()));

                while(in.hasNext()){
                    operators.add(in.next());
                    numbers.add(Double.parseDouble(in.next()));
                }
                in.close();

                // Erst die Punktrechnungen durchführen, Werte in Liste mit Ergebnissen überschreiben
                // und 'verbrauchte' Operatoren und Zahlen löschen
                for(int i = 0; i < operators.size(); i++){
                    double tmp = 0;
                    switch(operators.get(i)){
                        case "\u00F7":
                            if(numbers.get(i+1) == 0){
                                throw new IllegalArgumentException("Can not divide by 0!");
                            }
                            tmp += numbers.get(i) / numbers.get(i+1);
                            numbers.set(i, tmp);
                            numbers.remove(i+1);
                            operators.remove(i);
                            break;

                        case "\u00D7":
                            tmp += numbers.get(i) * numbers.get(i+1);
                            numbers.set(i, tmp);
                            numbers.remove(i+1);
                            operators.remove(i);
                            break;
                    }
                }


                //Strichrechnungen durchführen
                double result = numbers.get(0);
                for(int i = 0; i < operators.size(); i++) {
                    switch(operators.get(i)) {
                        case "+":
                            result += numbers.get(i+1);
                            break;
                        case "-":
                            result -= numbers.get(i+1);
                            break;

                    }
                }

                //Formatierung -> Nachkommastellen (kann man auch beliebig anders machen)
                if(result - Math.floor(result) == 0){
                    textViewString = String.format("%.0f", result).replace('.', ',');
                } else {
                    textViewString = String.format("%.2f", result).replace('.', ',');
                }
                textView_01.setText(textViewString);
            }
        });



        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ohne diese If-Else-Anweisungen wuerde bei leerem View 01 stehen und nicht 1.
                if (textViewString == "0") {
                    textViewString = "1";
                } else {
                    textViewString += "1";
                }
                textView_01.setText(textViewString);
            }
        });


        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ohne diese If-Else-Anweisungen wuerde bei leerem View 02 stehen und nicht 2.
                if (textViewString == "0") {
                    textViewString = "2";
                } else {
                    textViewString += "2";
                }
                textView_01.setText(textViewString);
            }
        });


        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewString == "0") {
                    textViewString = "3";
                } else {
                    textViewString += "3";
                }
                textView_01.setText(textViewString);
            }
        });


        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewString == "0") {
                    textViewString = "4";
                } else {
                    textViewString += "4";
                }
                textView_01.setText(textViewString);
            }
        });


        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewString == "0") {
                    textViewString = "5";
                } else {
                    textViewString += "5";
                }
                textView_01.setText(textViewString);
            }
        });


        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewString == "0") {
                    textViewString = "6";
                } else {
                    textViewString += "6";
                }
                textView_01.setText(textViewString);
            }
        });


        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewString == "0") {
                    textViewString = "7";
                } else {
                    textViewString += "7";
                }
                textView_01.setText(textViewString);
            }
        });


        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewString == "0") {
                    textViewString = "8";
                } else {
                    textViewString += "8";
                }
                textView_01.setText(textViewString);
            }
        });


        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewString == "0") {
                    textViewString = "9";
                } else {
                    textViewString += "9";
                }
                textView_01.setText(textViewString);
            }
        });


        Button buttonplus = findViewById(R.id.buttonplus);
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewString += " + ";
                textView_01.setText(textViewString);
            }
        });


        Button buttonminus = findViewById(R.id.buttonminus);
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewString += " - ";
                textView_01.setText(textViewString);
            }
        });


        Button buttonX = findViewById(R.id.buttonX);
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewString += " \u00D7 ";
                textView_01.setText(textViewString);
            }
        });


        Button buttonDivision = findViewById(R.id.buttonDivision);
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewString += " \u00F7 ";
                textView_01.setText(textViewString);
            }
        });


        Button buttonC = findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewString = "0";
                textView_01.setText(textViewString);
            }
        });


        Button buttonCE = findViewById(R.id.buttonCE);
        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {
                // Ohne die Abfrage == 1, waere das Feld dann leer
                if (textViewString == "0" || textViewString.length() == 1) {
                    textViewString = "0";
                } else if (textViewString.charAt(textViewString.length()-1) == '\u0020') {
                    textViewString = textViewString.substring(0, textViewString.length()-3);
                } else {
                    textViewString = textViewString.substring(0, textViewString.length()-1);
                }
                textView_01.setText(textViewString);
            }
        });
    }

}
