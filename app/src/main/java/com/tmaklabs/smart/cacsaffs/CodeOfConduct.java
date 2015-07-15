package com.tmaklabs.smart.cacsaffs;


    import android.graphics.Color;
    import android.os.Build;
    import android.support.v7.app.ActionBarActivity;
    import android.os.Bundle;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.webkit.WebSettings;
    import android.webkit.WebView;

    import java.io.IOException;
    import java.io.InputStream;


    public class CodeOfConduct extends ActionBarActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_code_of_conduct);

            WebView fbrow = (WebView) findViewById(R.id.codeofconduct);
            fbrow.getSettings().setBuiltInZoomControls(true);
            fbrow.setBackgroundColor(Color.TRANSPARENT);
            if (Build.VERSION.SDK_INT >= 11){ // Android v3.0+
                fbrow.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
                }

            try {
                InputStream stream = this.getAssets().open("codeofconduct.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                fbrow.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;




        }



    }
