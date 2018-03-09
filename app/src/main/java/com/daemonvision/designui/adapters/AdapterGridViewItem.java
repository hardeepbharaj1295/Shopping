package com.daemonvision.designui.adapters;

import android.graphics.drawable.Drawable;

/**
 * Created by admin on 02/25/18.
 */

public class AdapterGridViewItem {
    Drawable image;
    String title;

    public AdapterGridViewItem(String title, Drawable image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Drawable getImage() {
        return this.image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
