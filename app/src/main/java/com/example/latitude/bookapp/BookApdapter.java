package com.example.latitude.bookapp;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BookApdapter extends BaseAdapter  {
    private List<Book> listContact;
    private Activity activity;

    public BookApdapter(List<Book> listContact, Activity activity) {
        this.listContact = listContact;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listContact.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.listbook_item, parent, false);
            ViewHolder holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.BooksTitle);
            holder.tvPhone = (TextView) convertView.findViewById(R.id.BooksAuthor);
            holder.ivAvatar = (ImageView) convertView.findViewById(R.id.booksimages);
            convertView.setTag(holder);
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        Book model = listContact.get(position);
        holder.tvName.setText(model.getName());
        holder.tvPhone.setText(model.getAuthor());
        holder.ivAvatar.setImageResource(model.getImage());

        return convertView;
    }

    //Tạo một lần duy nhất để tránh việc tạo nhiều lần làm chậm ứng dụng
    static class ViewHolder {
        TextView tvName;
        TextView tvPhone;
        ImageView ivAvatar;
    }
}
