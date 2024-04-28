package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnrestart, btnexit;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int isX =1;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        AlertDialog.Builder exit=new AlertDialog.Builder(this);
//        exit.setTitle("Exit Alert");
//        exit.setIcon(R.drawable.baseline_exit_to_app_24);
//        exit.setMessage("do you want to exit?");
//        exit.setCancelable(false);
////        exit.setMessage("are you sure you want to exit?");
//        exit.setPositiveButton("yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//                System.exit(0);
//            }
//        });
//        exit.setNegativeButton("no", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });


        btnrestart=findViewById(R.id.button2);
        btnexit=findViewById(R.id.button);
        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reStart();
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "you are leaving app", Toast.LENGTH_SHORT).show();
//                System.exit(0);
//                exit.show();
                Exit();
            }
        });

        init();




    }

    private void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
    }
    public void onClick(View view){
        Button current = (Button) view;
        if(current.getText().toString().equals("")) {
            count++;
            if (isX == 1) {
                isX = 0;
                current.setText("X");

            } else {
                isX = 1;
                current.setText("O");

            }
            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                //condition
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                     //Result(b1);
                    toastMsg(b1);

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                     //Result(b4);
                    toastMsg(b4);

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                     //Result(b7);
                    toastMsg(b7);

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                     //Result(b1);
                    toastMsg(b1);

                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    //Result(b2);
                    toastMsg(b2);

                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    //Result(b3);
                    toastMsg(b3);

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    //Result(b1);
                    toastMsg(b1);

                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    //Result(b3);
                    toastMsg(b3);

                } else if (count==9) {
                     //String  a="z";
                     //Result(a);
                    Toast.makeText(this, "XO DRAW!", Toast.LENGTH_SHORT).show();


                }

            }
        }

    }
    public void reStart(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        isX=1;


    }
    public void toastMsg(String str){
        Toast.makeText(this, str+" WINNER!", Toast.LENGTH_SHORT).show();
        reStart();

    }
    public void Exit(){
        AlertDialog.Builder exit=new AlertDialog.Builder(this);
        exit.setTitle("Exit Alert");
        exit.setIcon(R.drawable.baseline_exit_to_app_24);
        exit.setMessage("do you want to exit?");
        exit.setCancelable(false);
//        exit.setMessage("are you sure you want to exit?");
        exit.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });
        exit.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        exit.show();

    }
//    public void Result(String a){
////        Dialog result=new Dialog(this);
//        if(a=="X"){
////            result.setContentView(R.layout.dialog_x_win);
////            result.show();
//            xResult();
//        } else if (a=="o") {
//            //result.setContentView(R.layout.dialog_o_win);
//            //result.show();
//            oResult();
//        } else if (a=="z") {
//            //result.setContentView(R.layout.dialog_draw);
//            //result.show();
//            drawResult();
//        }
//    }
//    public void xResult(){
//        Dialog xwin = new Dialog(this);
//        xwin.setContentView(R.layout.dialog_x_win);
//        xwin.show();
//    }
//    public void oResult(){
//        Dialog owin = new Dialog(this);
//        owin.setContentView(R.layout.dialog_o_win);
//        owin.show();
//    }
//    public void drawResult(){
//        Dialog draw = new Dialog(this);
//        draw.setContentView(R.layout.dialog_draw);
//        draw.show();
//    }

}