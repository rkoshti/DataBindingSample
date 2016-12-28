package com.rajesh.binding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rajesh.binding.Model.User;
import com.rajesh.binding.R;
import com.rajesh.binding.databinding.UserItemBinding;

import java.util.ArrayList;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.UserDataViewHolder> {

    ArrayList<User> list;

    public DataAdapter(ArrayList<User> listOfData) {

        this.list = listOfData;
    }

    @Override
    public UserDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View statusContainer = inflater.inflate(R.layout.user_item, parent, false);
        return new DataAdapter.UserDataViewHolder(statusContainer);
    }

    @Override
    public void onBindViewHolder(UserDataViewHolder holder, int position) {

        User user = list.get(position);
        holder.bind(user);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserDataViewHolder extends RecyclerView.ViewHolder {

        private UserItemBinding userItemBinding;

        public UserDataViewHolder(View itemView) {
            super(itemView);
            userItemBinding = DataBindingUtil.bind(itemView);
        }

        public void bind(User user) {
            userItemBinding.setUser(user);
        }

    }
}
