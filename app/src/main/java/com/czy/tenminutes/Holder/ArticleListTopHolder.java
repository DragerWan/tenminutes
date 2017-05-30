package com.czy.tenminutes.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.czy.tenminutes.R;
import com.czy.tenminutes.View.Banner;


/**
 * Created by ZY on 2016/7/30.
 * 文章顶部Banner
 */
public class ArticleListTopHolder extends RecyclerView.ViewHolder {

    public Banner banner;

    public ArticleListTopHolder(View itemView) {
        super(itemView);
        banner = (Banner) itemView.findViewById(R.id.banner);
    }
}

