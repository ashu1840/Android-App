package com.Ashu.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DEMOActivity extends Activity {
    /** Called when the activity is first created. */
	EditText captureetj;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        captureetj=(EditText)findViewById(R.id.captureet);
        
    }
    public void display(View v)
    {
    	String msg=captureetj.getText().toString();
    Toast.makeText(getApplicationContext(), "Hello Ashu, how're you?"+msg,1000).show();	
    }
    public void callfriend(View v){
    	Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:8283835150"));
    	startActivity(i);
    }
    public void openwebpage(View v)
    {
    	Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/"));
    	startActivity(i);	
    }
}
