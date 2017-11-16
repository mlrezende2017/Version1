package br.com.lojadancart.dancart;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("http://www.lojadancart.com.br");
        myWebView.setWebViewClient(new WebViewClient());
        myWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                WebView myWebView = (WebView) findViewById(R.id.webView);
                myWebView = (WebView) findViewById(R.id.webView);
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                String url = "https://api.whatsapp.com/send?phone=5531999991270";
                myWebView.setWebViewClient(new WebViewClient(){
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView myWebView, String url) {
                        if( url.startsWith("http:") || url.startsWith("https:") ) {
                            return false;
                        }

                        // Otherwise allow the OS to handle things like tel, mailto, etc.
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                        startActivity( intent );
                        return true;
                    }
                });
                myWebView.loadUrl(url);

                //PackageManager pm = getPackageManager();
                //try {

                //    Intent waIntent = new Intent(Intent.ACTION_SEND);
                //    waIntent.setType("text/plain");
                //    String text = "Loja Dançart +55(31)99999-1270";
                //    String apinumero = "api.whatsapp.com/send?phone=5531999991270";

                //    PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                    //Check if package exists or not. If not then code
                    //in catch block will be called
                //    waIntent.setPackage("com.whatsapp");

                //   waIntent.putExtra(Intent.EXTRA_TEXT, text);
                //   startActivity(Intent.createChooser(waIntent, ""));

               //} catch (PackageManager.NameNotFoundException e) {
               //     Snackbar.make(view, "Tire suas dúvidas pelo Whatsapp! (31)99999-1270.", Snackbar.LENGTH_LONG)
               //             .setAction("Action", null).show();
               // }

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

        if (id == R.id.nav_home) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        } else if (id == R.id.nav_ballet) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br/catalogo/ballet");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        } else if (id == R.id.nav_jazz) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br/catalogo/jazz");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        } else if (id == R.id.nav_salao) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br/catalogo/danca-de-salao");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        } else if (id == R.id.nav_ventre) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br/catalogo/danca-do-ventre");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        } else if (id == R.id.nav_minist) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br/catalogo/ministerio-de-danca");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        } else if (id == R.id.nav_gin) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br/catalogo/ginastica-ritmica");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        } else if (id == R.id.nav_moda) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br/catalogo/moda-danca");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        } else if (id == R.id.nav_diversos) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br/catalogo/diversos");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        } else if (id == R.id.nav_contato) {
            WebView myWebView = (WebView) findViewById(R.id.webView);
            myWebView.loadUrl("http://www.lojadancart.com.br/contato");
            myWebView.setWebViewClient(new WebViewClient());
            myWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
