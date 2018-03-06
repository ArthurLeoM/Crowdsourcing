package com.arthur.myapplication;

/**
 * Created by Leo on 2018/3/3.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class TaskAdapter extends ArrayAdapter<Task_Lists>{
    public TaskAdapter(Context context, int resource, List<Task_Lists> objects)
    {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Task_Lists task = getItem(position);
        View OneTaskView = LayoutInflater.from(getContext()).inflate(R.layout.task_item, parent,false);
        TextView textView = (TextView) OneTaskView.findViewById(R.id.task_name_view);
        TextView subtextView = (TextView) OneTaskView.findViewById(R.id.task_desc_view);
        textView.setText(task.GetName());
        subtextView.setText(task.GetDesc());

        return OneTaskView;

    }

}
