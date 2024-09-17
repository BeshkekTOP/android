package com.example.recycle_view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MemsAdapter extends RecyclerView.Adapter<MemsAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Mems> mems;
    private final Context context;

    public MemsAdapter(Context context, List<Mems> cats) {
        this.mems = cats;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public MemsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MemsAdapter.ViewHolder holder, int position) {
        Mems mem = mems.get(position);
        holder.memview.setImageResource(mem.getMemResource());
        holder.titleView.setText(mem.getName());
        holder.descriptionView.setText(mem.getdescription());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, Transmission.class);
            intent.putExtra("Title", mem.getName());
            intent.putExtra("description", mem.getdescription());
            intent.putExtra("image", mem.getMemResource());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView memview;
        final TextView titleView, descriptionView;

        ViewHolder(View view) {
            super(view);
            memview = view.findViewById(R.id.mem);
            titleView = view.findViewById(R.id.title);
            descriptionView = view.findViewById(R.id.description);
        }
    }
}