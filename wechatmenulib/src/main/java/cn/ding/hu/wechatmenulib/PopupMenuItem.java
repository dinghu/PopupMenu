package cn.ding.hu.wechatmenulib;

import android.view.View;



public class PopupMenuItem {

    private String item;
    private int itemResId = View.NO_ID;

    public PopupMenuItem(String item) {
        this.item = item;
    }

    public PopupMenuItem(String item, int itemResId) {
        this.item = item;
        this.itemResId = itemResId;
    }

    public PopupMenuItem() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getItemResId() {
        return itemResId;
    }

    public void setItemResId(int itemResId) {
        this.itemResId = itemResId;
    }
}
