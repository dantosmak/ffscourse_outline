package com.tmaklabs.smart.cacsaffs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.suredigit.inappfeedback.FeedbackDialog;

import java.util.ArrayList;
import java.util.List;


public class NavDrawerActivity extends ActionBarActivity {


    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    NavDrawerAdapter adapter;

    List<Model> dataList;
    private FeedbackDialog feedBackDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navdrawer);
        feedBackDialog = new FeedbackDialog(this, "AF-6F8C94B31507-CA");

        dataList = new ArrayList<Model>();
        mTitle = mDrawerTitle = getTitle();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,GravityCompat.START);


        dataList.add(new Model("FFS Outline", R.drawable.ic_home));
        dataList.add(new Model("Code of Conduct", R.drawable.ic_code_of_conduct));
        dataList.add(new Model("School Anthem", R.drawable.ic_school_anthem));
        dataList.add(new Model("CACSA Subgroups", R.drawable.ic_group));

        dataList.add(new Model("Daily Devotional", R.drawable.ic_devotional));
        dataList.add(new Model("Online Registration", R.drawable.ic_online));
        dataList.add(new Model("Share", R.drawable.ic_share));
        dataList.add(new Model("Feedback", R.drawable.ic_feedback));
        dataList.add(new Model("About", R.drawable.ic_action_about));


        adapter = new NavDrawerAdapter(this, R.layout.nav_item,
                dataList);
        mDrawerList.setAdapter(adapter);

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.drawable.ic_drawer, R.string.drawer_open,
                R.string.drawer_close) {
            public void onDrawerClosed(View view) {
                getSupportActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to
                // onPrepareOptionsMenu()
            }

            public void onDrawerOpened(View drawerView) {
                getSupportActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); // creates call to
                // onPrepareOptionsMenu()
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        if (savedInstanceState == null) {
            FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
            tx.replace(R.id.content_frame, new DefaultFragment());
            tx.commit();
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_navdrawer, menu);
        return true;
    }

    public void SelectItem(int position) {
        switch (position) {



            case 0:
                Intent mintent = new Intent(NavDrawerActivity.this,
                        FFSManual.class);
                startActivity(mintent);
                break;

            case 1:
                Intent codeintent = new Intent(NavDrawerActivity.this,
                        CodeOfConduct.class);
                startActivity(codeintent);
                break;
            case 2:
                Intent anthemintent = new Intent(NavDrawerActivity.this,
                        SchoolAnthem.class);
                startActivity(anthemintent);
                break;
            case 3:
                Intent subintent = new Intent(NavDrawerActivity.this,
                        SubGroups.class);
                startActivity(subintent);
                break;

            case 4:
                Intent devintent = new Intent(NavDrawerActivity.this,
                        DailyDevotional.class);
                startActivity(devintent);
                break;
            case 5:
                Intent webintent = new Intent(NavDrawerActivity.this,
                        OnlineReg.class);
                startActivity(webintent);
                break;
            case 6:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, I am Using CACSA OAU Firm Foundation School App - download at ");
                String title = getResources().getString(R.string.chooser_title);
                Intent chooser = Intent.createChooser(shareIntent, title);
                if (shareIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(chooser);
                }
                break;

            case 7:
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


                break;
            case 8:

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


                break;

        }

        // update selected item and title, then close the drawer
        mDrawerList.setItemChecked(position, true);
        setTitle(dataList.get(position).getItemName());
        mDrawerLayout.closeDrawer(mDrawerList);
    }


    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getSupportActionBar().setTitle(mTitle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        // Handle your other action bar items...

        return super.onOptionsItemSelected(item);
    }



    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content view
        boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
       // menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }

       private class DrawerItemClickListener implements
                     ListView.OnItemClickListener {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position,
                                 long id) {
             SelectItem(position);

            }
       }

}