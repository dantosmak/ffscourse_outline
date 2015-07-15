package com.tmaklabs.smart.cacsaffs;

/**
 * Created by TMAK on 5/27/2015.
 */
public class Model {

    String ItemName;
    int imgResID;

    public Model(String itemName, int imgResID) {
        super();
        ItemName = itemName;
        this.imgResID = imgResID;
    }

    public String getItemName() {
        return ItemName;
    }
    public void setItemName(String itemName) {
        ItemName = itemName;
    }
    public int getImgResID() {
        return imgResID;
    }
    public void setImgResID(int imgResID) {
        this.imgResID = imgResID;
    }

}