package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class itemAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<item> itemList;

    public itemAdapter(Context context, int layout, List<item> itemList) {
        this.context = context;
        this.layout = layout;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView image;
        TextView title,text;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null)
        {
            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(layout,null);
            viewHolder=new ViewHolder();
            viewHolder.image=convertView.findViewById(R.id.image);
            viewHolder.title=convertView.findViewById(R.id.title);
            viewHolder.text=convertView.findViewById(R.id.text);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.image.setImageResource(itemList.get(position).getImage());
        viewHolder.text.setText(itemList.get(position).getText());
        viewHolder.title.setText(itemList.get(position).getTitle());
        return convertView;
    }
}
