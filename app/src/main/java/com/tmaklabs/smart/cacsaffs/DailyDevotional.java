package com.tmaklabs.smart.cacsaffs;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.DatePicker;
import android.widget.TextView;

import com.suredigit.inappfeedback.FeedbackDialog;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;


public class DailyDevotional extends ActionBarActivity {

    DateFormat formatme = DateFormat.getDateInstance();

    Calendar c = Calendar.getInstance();
    static final int dialog_id = 1;
    int yr, month, day, dayOfYear;
    WebView browser;

    TextView dateLabel;
    private FeedbackDialog feedBackDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_devotional);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.ic_launcher);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        dateLabel = (TextView) findViewById(R.id.dateText);


        browser = (WebView) findViewById(R.id.webKit);
        browser.getSettings().setBuiltInZoomControls(true);


        yr = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        dateLabel.setText(formatme.format(c.getTime()));
        dayOfYear = c.get(Calendar.DAY_OF_YEAR);

        updateBrowser();


    }

    public void setBrowDate() {
        yr = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        dateLabel.setText(formatme.format(c.getTime()));
        dayOfYear = c.get(Calendar.DAY_OF_YEAR);

        updateBrowser();

        showDialog(dialog_id);

    }

    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case dialog_id:
                return new DatePickerDialog(this, d, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener d =
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    yr = year;
                    month = monthOfYear;
                    day = dayOfMonth;
                    c.set(Calendar.YEAR, yr);
                    c.set(Calendar.MONTH, month);
                    c.set(Calendar.DAY_OF_MONTH, day);
                    dayOfYear = c.get(Calendar.DAY_OF_YEAR);


                    dateLabel.setText(formatme.format(c.getTime()));
                    updateBrowser();

                }
            };


    public void updateBrowser() {
        if (c.get(Calendar.DAY_OF_YEAR) == 1) {
            try {
                InputStream stream = this.getAssets().open("1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);
                browser.requestFocus(View.FOCUS_DOWN);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (c.get(Calendar.DAY_OF_YEAR) == 2) {
            try {
                InputStream stream = this.getAssets().open("2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (c.get(Calendar.WEEK_OF_YEAR) == 3) {
            try {
                InputStream stream = this.getAssets().open("3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (c.get(Calendar.WEEK_OF_YEAR) == 4) {
            try {
                InputStream stream = this.getAssets().open("4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (c.get(Calendar.WEEK_OF_YEAR) == 5) {
            try {
                InputStream stream = this.getAssets().open("5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 6) {
            try {
                InputStream stream = this.getAssets().open("6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 7) {
            try {
                InputStream stream = this.getAssets().open("7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 8) {
            try {
                InputStream stream = this.getAssets().open("8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 9) {
            try {
                InputStream stream = this.getAssets().open("9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 10) {
            try {
                InputStream stream = this.getAssets().open("10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 11) {
            try {
                InputStream stream = this.getAssets().open("11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 12) {
            try {
                InputStream stream = this.getAssets().open("12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 13) {
            try {
                InputStream stream = this.getAssets().open("13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 14) {
            try {
                InputStream stream = this.getAssets().open("14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 15) {
            try {
                InputStream stream = this.getAssets().open("15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 16) {
            try {
                InputStream stream = this.getAssets().open("16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 17) {
            try {
                InputStream stream = this.getAssets().open("17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 18) {
            try {
                InputStream stream = this.getAssets().open("18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 19) {
            try {
                InputStream stream = this.getAssets().open("19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 20) {
            try {
                InputStream stream = this.getAssets().open("20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 21) {
            try {
                InputStream stream = this.getAssets().open("21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 22) {
            try {
                InputStream stream = this.getAssets().open("22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 23) {
            try {
                InputStream stream = this.getAssets().open("23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 24) {
            try {
                InputStream stream = this.getAssets().open("24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 25) {
            try {
                InputStream stream = this.getAssets().open("25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 26) {
            try {
                InputStream stream = this.getAssets().open("26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 27) {
            try {
                InputStream stream = this.getAssets().open("27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 28) {
            try {
                InputStream stream = this.getAssets().open("28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 29) {
            try {
                InputStream stream = this.getAssets().open("29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 30) {
            try {
                InputStream stream = this.getAssets().open("30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 31) {
            try {
                InputStream stream = this.getAssets().open("31.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 32) {
            try {
                InputStream stream = this.getAssets().open("f1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 33) {
            try {
                InputStream stream = this.getAssets().open("f2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 34) {
            try {
                InputStream stream = this.getAssets().open("f3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 35) {
            try {
                InputStream stream = this.getAssets().open("f4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 36) {
            try {
                InputStream stream = this.getAssets().open("f5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 37) {
            try {
                InputStream stream = this.getAssets().open("f6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 38) {
            try {
                InputStream stream = this.getAssets().open("f7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 39) {
            try {
                InputStream stream = this.getAssets().open("f8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 40) {
            try {
                InputStream stream = this.getAssets().open("f9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 41) {
            try {
                InputStream stream = this.getAssets().open("f10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 42) {
            try {
                InputStream stream = this.getAssets().open("f11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 43) {
            try {
                InputStream stream = this.getAssets().open("f12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 44) {
            try {
                InputStream stream = this.getAssets().open("f13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 45) {
            try {
                InputStream stream = this.getAssets().open("f14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 46) {
            try {
                InputStream stream = this.getAssets().open("f15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 47) {
            try {
                InputStream stream = this.getAssets().open("f16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 48) {
            try {
                InputStream stream = this.getAssets().open("f17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 49) {
            try {
                InputStream stream = this.getAssets().open("f18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 50) {
            try {
                InputStream stream = this.getAssets().open("f19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 51) {
            try {
                InputStream stream = this.getAssets().open("f20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 52) {
            try {
                InputStream stream = this.getAssets().open("f21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 53) {
            try {
                InputStream stream = this.getAssets().open("f22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 54) {
            try {
                InputStream stream = this.getAssets().open("f23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 55) {
            try {
                InputStream stream = this.getAssets().open("f24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 56) {
            try {
                InputStream stream = this.getAssets().open("f25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 57) {
            try {
                InputStream stream = this.getAssets().open("f26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 58) {
            try {
                InputStream stream = this.getAssets().open("f27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } else if (dayOfYear == 59) {
            try {
                InputStream stream = this.getAssets().open("f28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;

        }else if(dayOfYear == 60) {
            try {
                InputStream stream = this.getAssets().open("m1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 61) {
            try {
                InputStream stream = this.getAssets().open("m2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 62) {
            try {
                InputStream stream = this.getAssets().open("m3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 63) {
            try {
                InputStream stream = this.getAssets().open("m4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 64) {
            try {
                InputStream stream = this.getAssets().open("m5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 65) {
            try {
                InputStream stream = this.getAssets().open("m6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 66) {
            try {
                InputStream stream = this.getAssets().open("m7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 67) {
            try {
                InputStream stream = this.getAssets().open("m8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 68) {
            try {
                InputStream stream = this.getAssets().open("m9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 69) {
            try {
                InputStream stream = this.getAssets().open("m10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 70) {
            try {
                InputStream stream = this.getAssets().open("m11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 71) {
            try {
                InputStream stream = this.getAssets().open("m12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 72) {
            try {
                InputStream stream = this.getAssets().open("m13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 73) {
            try {
                InputStream stream = this.getAssets().open("m14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 74) {
            try {
                InputStream stream = this.getAssets().open("m15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 75) {
            try {
                InputStream stream = this.getAssets().open("m16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 76) {
            try {
                InputStream stream = this.getAssets().open("m17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 77) {
            try {
                InputStream stream = this.getAssets().open("m18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 78) {
            try {
                InputStream stream = this.getAssets().open("m19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 79) {
            try {
                InputStream stream = this.getAssets().open("m20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 80) {
            try {
                InputStream stream = this.getAssets().open("m21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 81) {
            try {
                InputStream stream = this.getAssets().open("m22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 82) {
            try {
                InputStream stream = this.getAssets().open("m23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 83) {
            try {
                InputStream stream = this.getAssets().open("m24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;

        }else if(dayOfYear == 84) {
            try {
                InputStream stream = this.getAssets().open("m25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 85) {
            try {
                InputStream stream = this.getAssets().open("m26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 86) {
            try {
                InputStream stream = this.getAssets().open("m27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 87) {
            try {
                InputStream stream = this.getAssets().open("m28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 88) {
            try {
                InputStream stream = this.getAssets().open("m29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 89) {
            try {
                InputStream stream = this.getAssets().open("m30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 90) {
            try {
                InputStream stream = this.getAssets().open("m31.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 91) {
            try {
                InputStream stream = this.getAssets().open("a1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 92) {
            try {
                InputStream stream = this.getAssets().open("a2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 93) {
            try {
                InputStream stream = this.getAssets().open("a3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 94) {
            try {
                InputStream stream = this.getAssets().open("a4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 95) {
            try {
                InputStream stream = this.getAssets().open("a5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 96) {
            try {
                InputStream stream = this.getAssets().open("a6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 97) {
            try {
                InputStream stream = this.getAssets().open("a7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 98) {
            try {
                InputStream stream = this.getAssets().open("a8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 99) {
            try {
                InputStream stream = this.getAssets().open("a9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 100) {
            try {
                InputStream stream = this.getAssets().open("a10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 101) {
            try {
                InputStream stream = this.getAssets().open("a11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 102) {
            try {
                InputStream stream = this.getAssets().open("a12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 103) {
            try {
                InputStream stream = this.getAssets().open("a13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 104) {
            try {
                InputStream stream = this.getAssets().open("a14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 105) {
            try {
                InputStream stream = this.getAssets().open("a15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 106) {
            try {
                InputStream stream = this.getAssets().open("a16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 107) {
            try {
                InputStream stream = this.getAssets().open("a17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 108) {
            try {
                InputStream stream = this.getAssets().open("a18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 109) {
            try {
                InputStream stream = this.getAssets().open("a19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 110) {
            try {
                InputStream stream = this.getAssets().open("a20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 111) {
            try {
                InputStream stream = this.getAssets().open("a21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 112) {
            try {
                InputStream stream = this.getAssets().open("a22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 113) {
            try {
                InputStream stream = this.getAssets().open("a23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 114) {
            try {
                InputStream stream = this.getAssets().open("a24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 115) {
            try {
                InputStream stream = this.getAssets().open("a25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 116) {
            try {
                InputStream stream = this.getAssets().open("a26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 117) {
            try {
                InputStream stream = this.getAssets().open("a27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 118) {
            try {
                InputStream stream = this.getAssets().open("a28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 119) {
            try {
                InputStream stream = this.getAssets().open("a29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 120) {
            try {
                InputStream stream = this.getAssets().open("a30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 121) {
            try {
                InputStream stream = this.getAssets().open("ma1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 122) {
            try {
                InputStream stream = this.getAssets().open("ma2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 123) {
            try {
                InputStream stream = this.getAssets().open("ma3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 124) {
            try {
                InputStream stream = this.getAssets().open("ma4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 125) {
            try {
                InputStream stream = this.getAssets().open("ma5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 126) {
            try {
                InputStream stream = this.getAssets().open("ma6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 127) {
            try {
                InputStream stream = this.getAssets().open("ma7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 128) {
            try {
                InputStream stream = this.getAssets().open("ma8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 129) {
            try {
                InputStream stream = this.getAssets().open("ma9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 130) {
            try {
                InputStream stream = this.getAssets().open("ma10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 131) {
            try {
                InputStream stream = this.getAssets().open("ma11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 132) {
            try {
                InputStream stream = this.getAssets().open("ma12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 133) {
            try {
                InputStream stream = this.getAssets().open("ma13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 134) {
            try {
                InputStream stream = this.getAssets().open("ma14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 135) {
            try {
                InputStream stream = this.getAssets().open("ma15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 136) {
            try {
                InputStream stream = this.getAssets().open("ma16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 137) {
            try {
                InputStream stream = this.getAssets().open("ma17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 138) {
            try {
                InputStream stream = this.getAssets().open("ma18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 139) {
            try {
                InputStream stream = this.getAssets().open("ma19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 140) {
            try {
                InputStream stream = this.getAssets().open("ma20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 141) {
            try {
                InputStream stream = this.getAssets().open("ma21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 142) {
            try {
                InputStream stream = this.getAssets().open("ma22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 143) {
            try {
                InputStream stream = this.getAssets().open("ma23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 144) {
            try {
                InputStream stream = this.getAssets().open("ma24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 145) {
            try {
                InputStream stream = this.getAssets().open("ma25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 146) {
            try {
                InputStream stream = this.getAssets().open("ma26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 147) {
            try {
                InputStream stream = this.getAssets().open("ma27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 148) {
            try {
                InputStream stream = this.getAssets().open("ma28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 149) {
            try {
                InputStream stream = this.getAssets().open("ma29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 150) {
            try {
                InputStream stream = this.getAssets().open("ma30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 151) {
            try {
                InputStream stream = this.getAssets().open("ma31.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 152) {
            try {
                InputStream stream = this.getAssets().open("j1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 153) {
            try {
                InputStream stream = this.getAssets().open("j2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 154) {
            try {
                InputStream stream = this.getAssets().open("j3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 155) {
            try {
                InputStream stream = this.getAssets().open("j4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 156) {
            try {
                InputStream stream = this.getAssets().open("j5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 157) {
            try {
                InputStream stream = this.getAssets().open("j6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 158) {
            try {
                InputStream stream = this.getAssets().open("j7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 159) {
            try {
                InputStream stream = this.getAssets().open("j8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 160) {
            try {
                InputStream stream = this.getAssets().open("j9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 161) {
            try {
                InputStream stream = this.getAssets().open("j10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 162) {
            try {
                InputStream stream = this.getAssets().open("j11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 163) {
            try {
                InputStream stream = this.getAssets().open("j12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 164) {
            try {
                InputStream stream = this.getAssets().open("j13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 165) {
            try {
                InputStream stream = this.getAssets().open("j14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 166) {
            try {
                InputStream stream = this.getAssets().open("j15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 167) {
            try {
                InputStream stream = this.getAssets().open("j16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 168) {
            try {
                InputStream stream = this.getAssets().open("j17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }else if(dayOfYear == 169) {
            try {
                InputStream stream = this.getAssets().open("j18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 170) {
            try {
                InputStream stream = this.getAssets().open("j19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 171) {
            try {
                InputStream stream = this.getAssets().open("j20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 172) {
            try {
                InputStream stream = this.getAssets().open("j21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 173) {
            try {
                InputStream stream = this.getAssets().open("j22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 174) {
            try {
                InputStream stream = this.getAssets().open("j23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 175) {
            try {
                InputStream stream = this.getAssets().open("j24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 176) {
            try {
                InputStream stream = this.getAssets().open("j25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 177) {
            try {
                InputStream stream = this.getAssets().open("j26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 178) {
            try {
                InputStream stream = this.getAssets().open("j27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 179) {
            try {
                InputStream stream = this.getAssets().open("j28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 180) {
            try {
                InputStream stream = this.getAssets().open("j29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 181) {
            try {
                InputStream stream = this.getAssets().open("j30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 182) {
            try {
                InputStream stream = this.getAssets().open("ju1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 183) {
            try {
                InputStream stream = this.getAssets().open("ju2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 184) {
            try {
                InputStream stream = this.getAssets().open("ju3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 185) {
            try {
                InputStream stream = this.getAssets().open("ju4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 186) {
            try {
                InputStream stream = this.getAssets().open("ju5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 187) {
            try {
                InputStream stream = this.getAssets().open("ju6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 188) {
            try {
                InputStream stream = this.getAssets().open("ju7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 189) {
            try {
                InputStream stream = this.getAssets().open("ju8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;

        }else if(dayOfYear == 190) {
            try {
                InputStream stream = this.getAssets().open("ju9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 191) {
            try {
                InputStream stream = this.getAssets().open("ju10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 192) {
            try {
                InputStream stream = this.getAssets().open("ju11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 193) {
            try {
                InputStream stream = this.getAssets().open("ju12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 194) {
            try {
                InputStream stream = this.getAssets().open("ju13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 195) {
            try {
                InputStream stream = this.getAssets().open("ju14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 196) {
            try {
                InputStream stream = this.getAssets().open("ju15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 197) {
            try {
                InputStream stream = this.getAssets().open("ju16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 198) {
            try {
                InputStream stream = this.getAssets().open("ju17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 199) {
            try {
                InputStream stream = this.getAssets().open("ju18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 200) {
            try {
                InputStream stream = this.getAssets().open("ju19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 201) {
            try {
                InputStream stream = this.getAssets().open("ju20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 202) {
            try {
                InputStream stream = this.getAssets().open("ju21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 203) {
            try {
                InputStream stream = this.getAssets().open("ju22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 204) {
            try {
                InputStream stream = this.getAssets().open("ju23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 205) {
            try {
                InputStream stream = this.getAssets().open("ju24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 206) {
            try {
                InputStream stream = this.getAssets().open("ju25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 207) {
            try {
                InputStream stream = this.getAssets().open("ju26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 208) {
            try {
                InputStream stream = this.getAssets().open("ju27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 209) {
            try {
                InputStream stream = this.getAssets().open("ju28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 210) {
            try {
                InputStream stream = this.getAssets().open("ju29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 211) {
            try {
                InputStream stream = this.getAssets().open("ju30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 212) {
            try {
                InputStream stream = this.getAssets().open("ju31.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 213) {
            try {
                InputStream stream = this.getAssets().open("au1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 214) {
            try {
                InputStream stream = this.getAssets().open("au2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 215) {
            try {
                InputStream stream = this.getAssets().open("au3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 216) {
            try {
                InputStream stream = this.getAssets().open("au4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 217) {
            try {
                InputStream stream = this.getAssets().open("au5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 218) {
            try {
                InputStream stream = this.getAssets().open("au6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 219) {
            try {
                InputStream stream = this.getAssets().open("au7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 220) {
            try {
                InputStream stream = this.getAssets().open("au8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 221) {
            try {
                InputStream stream = this.getAssets().open("au9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 222) {
            try {
                InputStream stream = this.getAssets().open("au10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 223) {
            try {
                InputStream stream = this.getAssets().open("au11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 224) {
            try {
                InputStream stream = this.getAssets().open("au12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 225) {
            try {
                InputStream stream = this.getAssets().open("au13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 226) {
            try {
                InputStream stream = this.getAssets().open("au14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 227) {
            try {
                InputStream stream = this.getAssets().open("au15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 228) {
            try {
                InputStream stream = this.getAssets().open("au16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 229) {
            try {
                InputStream stream = this.getAssets().open("au17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 230) {
            try {
                InputStream stream = this.getAssets().open("au18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 231) {
            try {
                InputStream stream = this.getAssets().open("au19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 232) {
            try {
                InputStream stream = this.getAssets().open("au20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 233) {
            try {
                InputStream stream = this.getAssets().open("au21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 234) {
            try {
                InputStream stream = this.getAssets().open("au22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 235) {
            try {
                InputStream stream = this.getAssets().open("au23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 236) {
            try {
                InputStream stream = this.getAssets().open("au24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 237) {
            try {
                InputStream stream = this.getAssets().open("au25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 238) {
            try {
                InputStream stream = this.getAssets().open("au26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 239) {
            try {
                InputStream stream = this.getAssets().open("au27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 240) {
            try {
                InputStream stream = this.getAssets().open("au28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 241) {
            try {
                InputStream stream = this.getAssets().open("au29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 242) {
            try {
                InputStream stream = this.getAssets().open("au30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 243) {
            try {
                InputStream stream = this.getAssets().open("au31.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 244) {
            try {
                InputStream stream = this.getAssets().open("s1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 245) {
            try {
                InputStream stream = this.getAssets().open("s2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 246) {
            try {
                InputStream stream = this.getAssets().open("s3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 247) {
            try {
                InputStream stream = this.getAssets().open("s4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 248) {
            try {
                InputStream stream = this.getAssets().open("s5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 249) {
            try {
                InputStream stream = this.getAssets().open("s6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 250) {
            try {
                InputStream stream = this.getAssets().open("s7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 251) {
            try {
                InputStream stream = this.getAssets().open("s8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 252) {
            try {
                InputStream stream = this.getAssets().open("s9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 253) {
            try {
                InputStream stream = this.getAssets().open("s10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 254) {
            try {
                InputStream stream = this.getAssets().open("s11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 255) {
            try {
                InputStream stream = this.getAssets().open("s12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 256) {
            try {
                InputStream stream = this.getAssets().open("s13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 257) {
            try {
                InputStream stream = this.getAssets().open("s14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 258) {
            try {
                InputStream stream = this.getAssets().open("s15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 259) {
            try {
                InputStream stream = this.getAssets().open("s16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 260) {
            try {
                InputStream stream = this.getAssets().open("s17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 261) {
            try {
                InputStream stream = this.getAssets().open("s18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 262) {
            try {
                InputStream stream = this.getAssets().open("s19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 263) {
            try {
                InputStream stream = this.getAssets().open("s20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 264) {
            try {
                InputStream stream = this.getAssets().open("s21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 265) {
            try {
                InputStream stream = this.getAssets().open("s22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 266) {
            try {
                InputStream stream = this.getAssets().open("s23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 267) {
            try {
                InputStream stream = this.getAssets().open("s24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 268) {
            try {
                InputStream stream = this.getAssets().open("s25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 269) {
            try {
                InputStream stream = this.getAssets().open("s26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 270) {
            try {
                InputStream stream = this.getAssets().open("s27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 271) {
            try {
                InputStream stream = this.getAssets().open("s28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 272) {
            try {
                InputStream stream = this.getAssets().open("s29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 273) {
            try {
                InputStream stream = this.getAssets().open("s30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 274) {
            try {
                InputStream stream = this.getAssets().open("O1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 275) {
            try {
                InputStream stream = this.getAssets().open("O2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 276) {
            try {
                InputStream stream = this.getAssets().open("O3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 277) {
            try {
                InputStream stream = this.getAssets().open("O4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 278) {
            try {
                InputStream stream = this.getAssets().open("O5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 279) {
            try {
                InputStream stream = this.getAssets().open("O6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 280) {
            try {
                InputStream stream = this.getAssets().open("O7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 281) {
            try {
                InputStream stream = this.getAssets().open("O8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 282) {
            try {
                InputStream stream = this.getAssets().open("O9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 283) {
            try {
                InputStream stream = this.getAssets().open("O10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 284) {
            try {
                InputStream stream = this.getAssets().open("O11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 285) {
            try {
                InputStream stream = this.getAssets().open("O12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 286) {
            try {
                InputStream stream = this.getAssets().open("O13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 287) {
            try {
                InputStream stream = this.getAssets().open("O14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 288) {
            try {
                InputStream stream = this.getAssets().open("O15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 289) {
            try {
                InputStream stream = this.getAssets().open("O16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 290) {
            try {
                InputStream stream = this.getAssets().open("O17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 291) {
            try {
                InputStream stream = this.getAssets().open("O18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 292) {
            try {
                InputStream stream = this.getAssets().open("O19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 293) {
            try {
                InputStream stream = this.getAssets().open("O20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 294) {
            try {
                InputStream stream = this.getAssets().open("O21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 295) {
            try {
                InputStream stream = this.getAssets().open("O22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 296) {
            try {
                InputStream stream = this.getAssets().open("O23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 297) {
            try {
                InputStream stream = this.getAssets().open("O24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 298) {
            try {
                InputStream stream = this.getAssets().open("O25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 299) {
            try {
                InputStream stream = this.getAssets().open("O26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 300) {
            try {
                InputStream stream = this.getAssets().open("O27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 301) {
            try {
                InputStream stream = this.getAssets().open("O28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 302) {
            try {
                InputStream stream = this.getAssets().open("O29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 303) {
            try {
                InputStream stream = this.getAssets().open("O30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 304) {
            try {
                InputStream stream = this.getAssets().open("O31.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 305) {
            try {
                InputStream stream = this.getAssets().open("N1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 306) {
            try {
                InputStream stream = this.getAssets().open("N2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 307) {
            try {
                InputStream stream = this.getAssets().open("N3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 308) {
            try {
                InputStream stream = this.getAssets().open("N4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 309) {
            try {
                InputStream stream = this.getAssets().open("N5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 310) {
            try {
                InputStream stream = this.getAssets().open("N6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 311) {
            try {
                InputStream stream = this.getAssets().open("N7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 312) {
            try {
                InputStream stream = this.getAssets().open("N8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 313) {
            try {
                InputStream stream = this.getAssets().open("N9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 314) {
            try {
                InputStream stream = this.getAssets().open("N10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 315) {
            try {
                InputStream stream = this.getAssets().open("N11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 316) {
            try {
                InputStream stream = this.getAssets().open("N12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 317) {
            try {
                InputStream stream = this.getAssets().open("N13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 318) {
            try {
                InputStream stream = this.getAssets().open("N14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 319) {
            try {
                InputStream stream = this.getAssets().open("N15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 320) {
            try {
                InputStream stream = this.getAssets().open("N16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 321) {
            try {
                InputStream stream = this.getAssets().open("N17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 322) {
            try {
                InputStream stream = this.getAssets().open("N18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 323) {
            try {
                InputStream stream = this.getAssets().open("N19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 324) {
            try {
                InputStream stream = this.getAssets().open("N20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 325) {
            try {
                InputStream stream = this.getAssets().open("N21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 326) {
            try {
                InputStream stream = this.getAssets().open("N22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 327) {
            try {
                InputStream stream = this.getAssets().open("N23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 328) {
            try {
                InputStream stream = this.getAssets().open("N24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 329) {
            try {
                InputStream stream = this.getAssets().open("N25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 330) {
            try {
                InputStream stream = this.getAssets().open("N26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 331) {
            try {
                InputStream stream = this.getAssets().open("N27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 332) {
            try {
                InputStream stream = this.getAssets().open("M28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 333) {
            try {
                InputStream stream = this.getAssets().open("N29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 334) {
            try {
                InputStream stream = this.getAssets().open("N30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 335) {
            try {
                InputStream stream = this.getAssets().open("d1.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 336) {
            try {
                InputStream stream = this.getAssets().open("d2.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 337) {
            try {
                InputStream stream = this.getAssets().open("d3.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 338) {
            try {
                InputStream stream = this.getAssets().open("d4.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 339) {
            try {
                InputStream stream = this.getAssets().open("d5.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 340) {
            try {
                InputStream stream = this.getAssets().open("d6.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 341) {
            try {
                InputStream stream = this.getAssets().open("d7.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 342) {
            try {
                InputStream stream = this.getAssets().open("d8.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 343) {
            try {
                InputStream stream = this.getAssets().open("d9.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 344) {
            try {
                InputStream stream = this.getAssets().open("d10.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 345) {
            try {
                InputStream stream = this.getAssets().open("d11.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 346) {
            try {
                InputStream stream = this.getAssets().open("d12.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 347) {
            try {
                InputStream stream = this.getAssets().open("d13.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 348) {
            try {
                InputStream stream = this.getAssets().open("d14.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 349) {
            try {
                InputStream stream = this.getAssets().open("d15.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 350) {
            try {
                InputStream stream = this.getAssets().open("d16.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 351) {
            try {
                InputStream stream = this.getAssets().open("d17.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 352) {
            try {
                InputStream stream = this.getAssets().open("d18.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 353) {
            try {
                InputStream stream = this.getAssets().open("d19.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 354) {
            try {
                InputStream stream = this.getAssets().open("d20.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 355) {
            try {
                InputStream stream = this.getAssets().open("d21.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 356) {
            try {
                InputStream stream = this.getAssets().open("d22.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 357) {
            try {
                InputStream stream = this.getAssets().open("d23.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 358) {
            try {
                InputStream stream = this.getAssets().open("d24.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 359) {
            try {
                InputStream stream = this.getAssets().open("d25.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 360) {
            try {
                InputStream stream = this.getAssets().open("d26.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 361) {
            try {
                InputStream stream = this.getAssets().open("d27.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 362) {
            try {
                InputStream stream = this.getAssets().open("d28.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 363) {
            try {
                InputStream stream = this.getAssets().open("d29.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 364) {
            try {
                InputStream stream = this.getAssets().open("d30.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;
        }else if(dayOfYear == 365) {
            try {
                InputStream stream = this.getAssets().open("d31.html");
                int streamSize = stream.available();
                byte[] buffer = new byte[streamSize];
                stream.read(buffer);
                stream.close();
                String html = new String(buffer);
                browser.loadData(html, "text/html", "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            ;




        }




    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_daily_devotional, menu);
        return super.onCreateOptionsMenu(menu);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId()){
            case R.id.action_datepicker:
                setBrowDate();
                return true;
            case R.id.action_share:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, I am Using CACSA OAU Firm Foundation School App - download at ");
                String title = getResources().getString(R.string.chooser_title);
                Intent chooser = Intent.createChooser(shareIntent, title);
                if (shareIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(chooser);
                }



                return true;
            case R.id.action_outline:
                Intent outlineIntent = new Intent(DailyDevotional.this,
                        FFSManual.class);
                startActivity(outlineIntent);
                return true;

            case R.id.action_conduct:
                Intent codeIntent = new Intent(DailyDevotional.this,
                        CodeOfConduct.class);
                startActivity(codeIntent);
                return true;
            case R.id.action_anthem:
                Intent anthemIntent = new Intent(DailyDevotional.this,
                        SchoolAnthem.class);
                startActivity(anthemIntent);
                return true;
            case R.id.action_subgroup:
                Intent subIntent = new Intent(DailyDevotional.this,
                        SubGroups.class);
                startActivity(subIntent);
                return true;
            case R.id.action_devotional:
                AlertDialog.Builder dev = new AlertDialog.Builder(this);
                dev.setTitle("About the Devotional");

                LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.custom_dialog, null);

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setMovementMethod(LinkMovementMethod.getInstance());
                text.setText(Html.fromHtml("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                        "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                        "<head>\n" +
                        "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                        "<title></title>\n" +
                        "\n" +
                        "</head>\n" +
                        "\n" +
                        "<body>\n" +
                        "<span class=\"h\"><strong>Morning and Evening:Daily Readings</strong><br />\n" +
                        "<strong>Author(s):</strong> Spurgeon, Charles Haddon<br />\n" +
                        "<strong>Publisher:</strong> Grand Rapids, MI: Christian Classics Ethereal Library<br />\n" +
                        "<strong>Description:</strong> Organized by month, this devotional has a morning and<br />\n" +
                        "evening meditation for every day of the year. Although these<br />\n" +
                        "devotions are short in length, they are filled with spiritual<br />\n" +
                        "goodness. In just a few sentences, Spurgeon is able to con-vey the wisdom of Scripture with eloquence and pur pose.<br />\n" +
                        "These daily messages provide Christians with the spiritual<br />\n" +
                        "energy they need to begin and end each day . Spurgeon<br />\n" +
                        "weaves a verse of Scripture into each de votion, helping<br />\n" +
                        "readers draw deeper meaning out of the selected passages.<br />\n" +
                        "This powerful devotional provides Christians with the spiritual<br />\n" +
                        "nourishment required to strengthen their relationships with<br />\n" +
                        "God.Readers will find themselves inspired by Morning and<br />\n" +
                        "Evening:Daily Readings.<br />\n" +
                        "Emmalon Davis<br />\n" +
                        "CCEL Staff Wrtier<br />\n" +
                        "<strong>Subjects:</strong> Practical theology<br />\n" +
                        "Practical religion. The Christian lif e<br />\n" +
                        "Works of meditation and devotion </span>\n" +
                        "</body>\n" +
                        "</html>\n"));
                dev.setView(layout);
                AlertDialog holla = dev.show();


                return true;


            case R.id.action_feedback:
                ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (conMgr.getActiveNetworkInfo() == null) {


                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(
                            "Unable to connect, \nPlease check that you are connected \nto the internet and try again \n\nPlease reboot your phone if \nyour connection problem \npersists.")
                            .setTitle("Connection Error")
                            .setCancelable(false)
                            .setNeutralButton("Ok",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog,
                                                            int id) {

                                        }
                                    });

                    AlertDialog alert = builder.create();
                    alert.show();
                } else {


                    feedBackDialog.show();
                }
                return true;
            case R.id.action_about:

                AlertDialog.Builder oyanow = new AlertDialog.Builder(this);
                oyanow.setTitle("CACSA OAU FFS");
                oyanow.setIcon(R.drawable.ic_launcher);

                LayoutInflater inflateme = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
                View layoute = inflateme.inflate(R.layout.custom_dialog, null);

                TextView texter = (TextView) layoute.findViewById(R.id.text);
                texter.setMovementMethod(LinkMovementMethod.getInstance());
                texter.setText(Html.fromHtml("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                        "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                        "<head>\n" +
                        "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                        "<title></title>\n" +
                        "</head>\n" +
                        "\n" +
                        "<body>\n" +
                        "<p><strong>CACSA OAU FFS</strong> app is an android implementation of Christ  Apostolic Church Student Association OAU Firm Foundation School Manual.</p>\n" +
                        "<p><br />\n" +
                        "  Version 1.0</p>\n" +
                        "<p><br />\n" +
                        "  Developed by SmarT-Mak Labs     <a href=\"mailto:smartmaklabs@gmail.com\">smartmaklabs@gmail.com</a></p>\n" +
                        "<p>Copyright © 2015 Christ Apostolic Church Student Association  OAU. All rights reserved.</p>\n" +
                        "</body>\n" +
                        "</html>\n"));
                oyanow.setView(layoute);
                AlertDialog oya = oyanow.show();

                return true;

            default:
                return  super.onOptionsItemSelected(item);
        }

    }







}



