package edu.gatech.cs2340.coffeespill.oasis.Controllers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

import edu.gatech.cs2340.coffeespill.oasis.R;

/**
 * Created by andrew_chang on 2018-03-22.
 */

public class SampleAdapter extends ArrayAdapter {

    public SampleAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, R.layout.custom_shelter_row, objects);

    }
}
