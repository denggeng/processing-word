package me.denggeng.processingword.sketch;

import android.app.Activity;

import me.denggeng.processingword.MainActivity;
import processing.core.PApplet;

/**
 * Created by root on 23/6/15.
 */
public class EmptySketch extends PApplet {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(1);
    }

}
