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
        if (Constants.choice.equals("Announcer")) {
            url = "https://playoverwatch.com/en-us/heroes/";
        }

        else if (Constants.choice.equals("Bastion")) {
            url = "https://playoverwatch.com/en-us/heroes/bastion/";
        }

        else if (Constants.choice.equals("D.Va")) {
            url = "https://playoverwatch.com/en-us/heroes/dva/";
        }

        else if (Constants.choice.equals("Genji")) {
           url = "https://playoverwatch.com/en-us/heroes/genji/";
        }

        else if (Constants.choice.equals("Hanzo")) {
            url = "https://playoverwatch.com/en-us/heroes/hanzo/";
        }

        else if (Constants.choice.equals("Junkrat")) {
            url = "https://playoverwatch.com/en-us/heroes/junkrat/";
        }

        else if (Constants.choice.equals("Lucio")) {
            url = "https://playoverwatch.com/en-us/heroes/lucio/";
        }

        else if (Constants.choice.equals("McCree")) {
            url = "https://playoverwatch.com/en-us/heroes/mccree/";
        }

        else if (Constants.choice.equals("Mei")) {
            url = "https://playoverwatch.com/en-us/heroes/mei/";
        }

        else if (Constants.choice.equals("Mercy")) {
            url = "https://playoverwatch.com/en-us/heroes/mercy/";
        }

        else if (Constants.choice.equals("Pharah")) {
            url = "https://playoverwatch.com/en-us/heroes/pharah/";
        }

        else if (Constants.choice.equals("Reaper")) {
            url = "https://playoverwatch.com/en-us/heroes/reaper/";
        }

        else if (Constants.choice.equals("Reinhardt")) {
            url = "https://playoverwatch.com/en-us/heroes/reinhardt/";
        }

        else if (Constants.choice.equals("Roadhog")) {
            url = "https://playoverwatch.com/en-us/heroes/roadhog/";
        }

        else if (Constants.choice.equals("Soldier: 76")) {
            url = "https://playoverwatch.com/en-us/heroes/soldier-76/";
        }

        else if (Constants.choice.equals("Symmetra")) {
            url = "https://playoverwatch.com/en-us/heroes/symmetra/";
        }

        else if (Constants.choice.equals("Torbjorn")) {
            url = "https://playoverwatch.com/en-us/heroes/torbjorn/";
        }

        else if (Constants.choice.equals("Tracer")) {
            url = "https://playoverwatch.com/en-us/heroes/tracer/";
        }

        else if (Constants.choice.equals("Widowmaker")) {
            url = "https://playoverwatch.com/en-us/heroes/widowmaker/";
        }

        else if (Constants.choice.equals("Winston")) {
            url = "https://playoverwatch.com/en-us/heroes/winston/";
        }

        else if (Constants.choice.equals("Zarya")) {
            url = "https://playoverwatch.com/en-us/heroes/zarya/";
        }

        else if (Constants.choice.equals("Zenyatta")) {
            url = "https://playoverwatch.com/en-us/heroes/zenyatta/";
        }

        else {
            Toast.makeText(InfoActivity.this, "?????", Toast.LENGTH_SHORT).show();
            url = "https://playoverwatch.com/en-us/heroes/";
        }


    return url;



    }

}
