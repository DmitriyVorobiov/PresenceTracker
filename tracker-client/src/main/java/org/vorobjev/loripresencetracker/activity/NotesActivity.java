package org.vorobjev.loripresencetracker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.vorobjev.loripresencetracker.R;
import org.vorobjev.loripresencetracker.adapters.NotesAdapter;
import org.vorobjev.presencetracker.activity.ItemsActivity;
import org.vorobjev.presencetracker.common.IntentAttributes;
import org.vorobjev.presencetracker.db.NoteEntity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class NotesActivity extends ItemsActivity {

    @Bind(R.id.jobs_list)
    ListView listView;

    @OnItemClick(R.id.jobs_list)
    void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(NotesActivity.this, NoteActivity.class).putExtra(IntentAttributes.ITEM_ID, ((NoteEntity) parent.getItemAtPosition(position)).getId()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        ButterKnife.bind(this);
        notesAdapter = new NotesAdapter(this, getFakeNotes());
        listView.setEmptyView(findViewById(android.R.id.empty));
        listView.setAdapter(notesAdapter);
    }

    public List getFakeNotes() {
        List list = new LinkedList<NoteEntity>();
        NoteEntity fake1 = new NoteEntity();
        fake1.setBeginTime(System.currentTimeMillis() - 60 * 60 * 1000);
        fake1.setEndTime(System.currentTimeMillis() + 60 * 60 * 1000);
        fake1.setDate(new Date(System.currentTimeMillis()));
        fake1.setId(1);

        NoteEntity fake2 = new NoteEntity();
        fake2.setBeginTime(System.currentTimeMillis() - 2 * 60 * 60 * 1000);
        fake2.setEndTime(System.currentTimeMillis() + 2 * 60 * 60 * 1000);
        fake2.setDate(new Date(System.currentTimeMillis()));
        fake2.setId(2);

        NoteEntity fake3 = new NoteEntity();
        fake3.setBeginTime(System.currentTimeMillis() - 3 * 60 * 60 * 1000);
        fake3.setEndTime(System.currentTimeMillis() + 3 * 60 * 60 * 1000);
        fake3.setDate(new Date(System.currentTimeMillis()));
        fake3.setId(3);

        list.add(fake1);
        list.add(fake2);
        list.add(fake3);

        return list;
    }
}
