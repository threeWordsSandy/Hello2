package com.example.sandy.hello2;

import android.graphics.drawable.shapes.RectShape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sandy on 2/4/17.
 */

public class Sanbox extends RectShape {
    private List<String> mGreetings = new ArrayList<>();

    public Sanbox(List<String> mGreetings) {
        this.mGreetings = mGreetings;
    }

    @Override
    public boolean hasAlpha() {
//        return super.hasAlpha();
        return true;
    }

    @Override
    public String toString() {
        return "Sanbox{" +
                "mGreetings=" + mGreetings +
                '}';
    }

    public boolean add(String s) {
        return mGreetings.add(s);
    }

    public List<String> getmGreetings() {
        return mGreetings;
    }

    public void setmGreetings(List<String> mGreetings) {
        this.mGreetings = mGreetings;
    }

}
