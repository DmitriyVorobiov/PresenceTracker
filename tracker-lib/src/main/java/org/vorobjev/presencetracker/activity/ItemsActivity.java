package org.vorobjev.presencetracker.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import org.vorobjev.presencetracker.adapters.ItemsAdapter;

import javax.inject.Inject;

public class ItemsActivity extends Activity {

    @Inject
    public ItemsAdapter notesAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }


}
