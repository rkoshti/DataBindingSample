package com.rajesh.binding.adapter;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.rajesh.binding.R;
import com.squareup.picasso.Picasso;



public final class ImageBinder {

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Context context = imageView.getContext();
        Picasso.with(context).load(url).placeholder(R.mipmap.ic_launcher).into(imageView);
    }
}