package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.view.*;
import android.os.Bundle;
import com.example.myapplication.R;

public class sa extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sa);

    }
    public void s(View v)
    {
      Intent i=new Intent(this,web.class);
      
      i.putExtra("s","https://m.lokmat.com/");
      
      startActivity(i);
    }
    public void l(View v)
    {
      Intent i=new Intent(this,web.class);
      
      i.putExtra("s","http://newspaper.pudhari.co.in/index.php");
      
      startActivity(i);
    }
    public void p(View v)
    {
      try
      {
        Intent i=new Intent(this,web.class);
      
      i.putExtra("s","http://epaper.esakal.com/FlashClient/Client_Panel_ipad.aspx?undefined#currPage=1");
      
      startActivity(i);
      }
      catch(Exception e){}
    }

}