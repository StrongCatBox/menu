package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar =findViewById(R.id.toolbar);
        fab =findViewById(R.id.fab);
        setSupportActionBar(toolbar);
       getSupportActionBar().setDisplayShowTitleEnabled(false);

       fab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Snackbar s = Snackbar.make(view, "mon texte a afficher",Snackbar.LENGTH_LONG);
               s.setAction("Action", new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(MainActivity.this, "vous avez lancé une action", Toast.LENGTH_SHORT).show();
                   }
               });
               s.show();

           }// fin du Onclick fab
       });//fin de l'interface listener sur fab
    }// fin de oncreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.action1){
            Toast.makeText(this, "vous avez fais le choix "+ item, Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.action2){
            Toast.makeText(this, "vous avez fais le choix "+ item, Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.action3){
            Toast.makeText(this, "vous avez fais le choix "+ item, Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.action4){
            Toast.makeText(this, "vous avez fais le choix "+ item, Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}//fin de classe