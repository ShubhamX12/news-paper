package com.example.myapplication;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.*;
import android.widget.Toast;
import com.example.myapplication.R;
import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void s(View v)
    {
    try{
    ApplicationInfo ai=getApplicationContext().getApplicationInfo();
    String path=ai.sourceDir;
      Intent i=new Intent(Intent.ACTION_SEND);
      i.setType("application/vnd.android.package-archive");
      
      
      i.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(new File(path)));
      
      startActivity(Intent.createChooser(i,"share using"));
      }catch(Exception e){
        
        Toast.makeText(this,""+e,Toast.LENGTH_SHORT).show();
        
      }
    }
    public void h(View v)
    {
      Intent i=new Intent(this,sa.class);
      startActivity(i);
    }
    public void c(View v)
    {
      try
      {
        System.exit(0);
      }
      catch(Exception e){}
    }

}
