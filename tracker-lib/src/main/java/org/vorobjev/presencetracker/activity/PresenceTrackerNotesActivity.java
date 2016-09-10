package org.vorobjev.presencetracker.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import org.vorobjev.presencetracker.adapters.NotesAdapter;

import javax.inject.Inject;

public class PresenceTrackerNotesActivity extends Activity {

    @Inject
    public NotesAdapter notesAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }


}
