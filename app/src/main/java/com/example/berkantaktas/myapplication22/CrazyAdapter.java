package com.example.berkantaktas.myapplication22;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CrazyAdapter extends ArrayAdapter<Note> {

    private final LayoutInflater inflater;
    private final Context context;
    private ViewHolder holder;
    private final ArrayList<Note> notes;

  public CrazyAdapter(Context context, ArrayList<Note> notes)
  {
      super(context,0, notes);
      this.context = context;
      this.notes = notes;
      inflater = LayoutInflater.from(context);

  }

    @Override
    public int getCount() {
        return notes.size();
    }

    @Override
    public Note getItem(int position) {
        return notes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return notes.get(position).hashCode();
    }



    public View getView(int position, View v, ViewGroup parent)
    {

        if(v== null)
        {
            v = inflater.inflate(R.layout.entity_note, null);
            holder = new ViewHolder();
            holder.noteSubjLabel = (TextView) v.findViewById(R.id.entity_note_subject_text);
            holder.noteContentLabel = (TextView) v.findViewById(R.id.entity_note_content_text);
            holder.noteDate = (TextView) v.findViewById(R.id.entity_note_duedate_date);
            v.setTag(holder);
        }
        else {
            holder = (ViewHolder)v.getTag();
        }
        Note note = notes.get(position);
        if(note != null)
        {
            holder.noteSubjLabel.setText(note.getSubject());
            holder.noteContentLabel.setText(note.getContent());
            holder.noteDate.setText(note.getDuedate());
        }



        return v;
    }
    //View Holder Pattern for better performance
    private static class ViewHolder {
        TextView noteSubjLabel;
        TextView noteContentLabel;
        TextView noteDate;
    }
}

