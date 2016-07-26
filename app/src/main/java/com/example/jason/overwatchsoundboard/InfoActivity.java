package com.example.jason.overwatchsoundboard;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jason Soliman on 7/26/2016.
 */

public class InfoActivity extends MenuActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        getSupportActionBar().setTitle(Constants.choice);
        TextView title = (TextView) findViewById(R.id.actionbartitle);
        title.setText(Constants.choice);


        String url = choice();
        myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl(url);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack())
        {
            myWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    private String choice() {
        String url;
        if (Constants.choice == "Announcer") {
            url = "https://playoverwatch.com/en-us/heroes/";
        }

        else if (Constants.choice == "Bastion") {
            url = "https://playoverwatch.com/en-us/heroes/bastion/";
        }

        else if (Constants.choice == "D.Va") {
            url = "https://playoverwatch.com/en-us/heroes/dva/";
        }

        else if (Constants.choice == "Genji") {
           url = "https://playoverwatch.com/en-us/heroes/genji/";
        }

        else if (Constants.choice == "Hanzo") {
            url = "https://playoverwatch.com/en-us/heroes/hanzo/";
        }

        else if (Constants.choice == "Junkrat") {
            url = "https://playoverwatch.com/en-us/heroes/junkrat/";
        }

        else if (Constants.choice == "Lucio") {
            url = "https://playoverwatch.com/en-us/heroes/lucio/";
        }

        else if (Constants.choice == "McCree") {
            url = "https://playoverwatch.com/en-us/heroes/mccree/";
        }

        else if (Constants.choice == "Mei") {
            url = "https://playoverwatch.com/en-us/heroes/mei/";
        }

        else if (Constants.choice == "Mercy") {
            url = "https://playoverwatch.com/en-us/heroes/mercy/";
        }

        else if (Constants.choice == "Pharah") {
            url = "https://playoverwatch.com/en-us/heroes/pharah/";
        }

        else if (Constants.choice == "Reaper") {
            url = "https://playoverwatch.com/en-us/heroes/reaper/";
        }

        else if (Constants.choice == "Reinhardt") {
            url = "https://playoverwatch.com/en-us/heroes/reinhardt/";
        }

        else if (Constants.choice == "Roadhog") {
            url = "https://playoverwatch.com/en-us/heroes/roadhog/";
        }

        else if (Constants.choice == "Soldier: 76") {
            url = "https://playoverwatch.com/en-us/heroes/soldier-76/";
        }

        else if (Constants.choice == "Symmetra") {
            url = "https://playoverwatch.com/en-us/heroes/symmetra/";
        }

        else if (Constants.choice == "Torbjorn") {
            url = "https://playoverwatch.com/en-us/heroes/torbjorn/";
        }

        else if (Constants.choice == "Tracer") {
            url = "https://playoverwatch.com/en-us/heroes/tracer/";
        }

        else if (Constants.choice == "Widowmaker") {
            url = "https://playoverwatch.com/en-us/heroes/widowmaker/";
        }

        else if (Constants.choice == "Winston") {
            url = "https://playoverwatch.com/en-us/heroes/winston/";
        }

        else if (Constants.choice == "Zarya") {
            url = "https://playoverwatch.com/en-us/heroes/zarya/";
        }

        else if (Constants.choice == "Zenyatta") {
            url = "https://playoverwatch.com/en-us/heroes/zenyatta/";
        }

        else {
            Toast.makeText(InfoActivity.this, "?????", Toast.LENGTH_SHORT).show();
            url = "https://playoverwatch.com/en-us/heroes/";
        }


    return url;



    }

}
