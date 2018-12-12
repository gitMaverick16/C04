package com.example.sergio.ihc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.sergio.ihc.Fragmentos.fragmento_carro;
import com.example.sergio.ihc.Fragmentos.fragmento_cuerda;
import com.example.sergio.ihc.Fragmentos.fragmento_informe;
import com.example.sergio.ihc.Fragmentos.fragmento_inicio;
import com.example.sergio.ihc.Fragmentos.fragmento_login;
import com.example.sergio.ihc.Fragmentos.fragmento_percusion;
import com.example.sergio.ihc.Fragmentos.fragmento_stock;
import com.example.sergio.ihc.Fragmentos.fragmento_viento;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        CargarFragmento(new fragmento_inicio());
        navigationView.getMenu().getItem(0).setChecked(true);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            CargarFragmento(new fragmento_inicio());
        } else if (id == R.id.nav_gallery) {
            CargarFragmento(new fragmento_login());
        } else if (id == R.id.nav_slideshow) {
            CargarFragmento(new fragmento_carro());
        } else if (id == R.id.nav_manage) {
            CargarFragmento(new fragmento_informe());
        } else if (id == R.id.nav_manages) {
            CargarFragmento(new fragmento_stock());
        } else if (id == R.id.nav_share) {
            CargarFragmento(new fragmento_cuerda());
        }else if (id == R.id.nav_send) {
            CargarFragmento(new fragmento_viento());
        }else if (id == R.id.nav_sendas) {
            CargarFragmento(new fragmento_percusion());
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void CargarFragmento(Fragment fragmento){
        FragmentManager manager=getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.contenedorFragmento, fragmento).commit();
    }
}
