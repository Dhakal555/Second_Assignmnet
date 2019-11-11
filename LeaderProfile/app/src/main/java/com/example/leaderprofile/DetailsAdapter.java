package com.example.leaderprofile;

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


public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder> {
    Context mContext;
    List<Details> profileDetails;

    public DetailsAdapter(Context mContext, List<Details> profileDetails){
        this.mContext = mContext;
        this.profileDetails = profileDetails;
    }

    @NonNull
    @Override
    public DetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.profile, parent, false);
        return new DetailsViewHolder(view, mContext, profileDetails);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsViewHolder holder, int position) {
        Details details = profileDetails.get(position);
        holder.imgProfile.setImageResource(details.getImageID());
        holder.txtName.setText(details.getName());
    }

    @Override
    public int getItemCount() {
        return profileDetails.size();
    }

    public class DetailsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imgProfile;
        TextView txtName;
        Context context;
        List<Details> list;

        public DetailsViewHolder(@NonNull View itemView, Context context, List<Details> nlist) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgProfile);
            txtName = itemView.findViewById(R.id.txtName);
            itemView.setOnClickListener(this);
            this.context = context;
            this.list = nlist;

        }

        @Override
        public void onClick(View v) {
            Intent intent =new Intent(context, DetailProfile.class);
            Details details;
            details = list.get(getAdapterPosition());
            intent.putExtra("img", details.getImageID());
            intent.putExtra("name", details.getName());
            intent.putExtra("details", details.getdetails());
            context.startActivity(intent);


        }
    }
}
