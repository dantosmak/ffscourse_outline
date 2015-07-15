package com.tmaklabs.smart.cacsaffs;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by TMAK on 5/27/2015.
 */
public class NavDrawerAdapter extends ArrayAdapter<Model> {





        Context context;
        List<Model> drawerItemList;
        int layoutResID;

        public NavDrawerAdapter(Context context, int layoutResourceID,
                                   List<Model> listItems) {
            super(context, layoutResourceID, listItems);
            this.context = context;
            this.drawerItemList = listItems;
            this.layoutResID = layoutResourceID;

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            DrawerItemHolder drawerHolder;
            View view = convertView;

            if (view == null) {
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                drawerHolder = new DrawerItemHolder();

                view = inflater.inflate(layoutResID, parent, false);
                drawerHolder.ItemName = (TextView) view
                        .findViewById(R.id.item_title);
                drawerHolder.icon = (ImageView) view.findViewById(R.id.item_icon);

                view.setTag(drawerHolder);

            } else {
                drawerHolder = (DrawerItemHolder) view.getTag();

            }

            Model dItem = (Model) this.drawerItemList.get(position);

            drawerHolder.icon.setImageDrawable(view.getResources().getDrawable(
                    dItem.getImgResID()));
            drawerHolder.ItemName.setText(dItem.getItemName());

            return view;
        }

        private static class DrawerItemHolder {
            TextView ItemName;
            ImageView icon;
        }
    }