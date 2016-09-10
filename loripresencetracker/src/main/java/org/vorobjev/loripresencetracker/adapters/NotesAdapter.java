package org.vorobjev.loripresencetracker.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.vorobjev.loripresencetracker.R;
import org.vorobjev.presencetracker.db.NoteEntity;
import org.vorobjev.presencetracker.utils.DateUtils;

import java.util.Collection;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NotesAdapter extends org.vorobjev.presencetracker.adapters.NotesAdapter {

    public NotesAdapter(Activity context, Collection<NoteEntity> list) {
        super(context, R.layout.item_note, list);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = mContext.getLayoutInflater().inflate(R.layout.item_note, null);
            ViewHolder viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            view = convertView;
        }
        NoteEntity note = (NoteEntity) getItem(position);
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.date.setText(DateUtils.DATE_FORMAT.format(note.getDate()));
        holder.time.setText(String.format("%s - %s", DateUtils.TIME_FORMAT.format(note.getBeginTime()), DateUtils.TIME_FORMAT.format(note.getEndTime())));
        return updateVisibility(view, note);
    }

    class ViewHolder {
        @Bind(R.id.date)
        TextView date;
        @Bind(R.id.time)
        TextView time;
        // TODO divider
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
