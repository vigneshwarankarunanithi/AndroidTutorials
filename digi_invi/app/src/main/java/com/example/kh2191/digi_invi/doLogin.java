package com.example.kh2191.digi_invi;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.ExecutionException;

public class doLogin extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String url = "test";
        setContentView(R.layout.activity_do_login);
        this.setTitle("LOGIN");

        b1 = (Button) findViewById(R.id.btnLogin);
        try {
            b1.setOnClickListener(new View.OnClickListener()  {

                // TODO Auto-generated method stub
                public void onClick(View v){
//                    ProgressDialog progress = new ProgressDialog(doLogin.this);
//                    progress.setTitle("Loading");
//                    progress.setMessage("Wait while loading...");
//                    progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
//                    progress.show();
//                  //  networkcalls n = new networkcalls(null,null,0);
//                    try {
//                       // String result = n.execute().get();
//                      //  System.out.println("The result is"+result);
//                        progress.dismiss();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (ExecutionException e) {
//                        e.printStackTrace();
//                    }
                    Intent i = new Intent(getApplicationContext(),indexScreen.class);
                    startActivity(i);
                    setContentView(R.layout.activity_index_screen);
                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            Intent i = new Intent(getApplicationContext(),Login.class);
            startActivity(i);
            setContentView(R.layout.activity_login);
        }
        return super.onKeyDown(keyCode, event);
    }
}
