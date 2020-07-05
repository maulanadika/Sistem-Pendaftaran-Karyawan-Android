package com.example.ptsuksesapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ptsuksesapp.Model.User;
import com.example.ptsuksesapp.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<User> userList;

    public UserAdapter(Context mCtx, List<User> userList) {
        this.mCtx = mCtx;
        this.userList = userList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_data, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        User user = userList.get(position);

        //loading the image

        holder.nama.setText(user.getNama());
        holder.id.setText(user.getId());
        holder.nohp.setText(String.valueOf(user.getNohp()));
        holder.pendidikan.setText(user.getPendidikan());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView id, nama, nohp, pendidikan;

        public ProductViewHolder(View itemView) {
            super(itemView);

//            id = itemView.findViewById(R.id.id);
//            nama = itemView.findViewById(R.id.nama);
//            nohp = itemView.findViewById(R.id.nohp);
//            pendidikan = itemView.findViewById(R.id.pendidikan);
        }
    }
}
