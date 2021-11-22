package com.canete.casacondb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CasaAdapter<view> extends RecyclerView.Adapter<CasaAdapter.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    Context context;

    private View.OnClickListener listener;



    public CasaAdapter(Context context){
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public CasaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.casa_item, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CasaAdapter.ViewHolder holder, int position) {

        String  calle= Store.lstCasas.get(position).getCalle();
        Integer NCasa= Store.lstCasas.get(position).getNCasa();
        String superficie= Store.lstCasas.get(position).getSuperficie() + " M2";

        holder.lblCalle.setText(calle);
        holder.lblNCasa.setText(NCasa);
        holder.lblSuperficie.setText(superficie);




    }

    @Override
    public int getItemCount() {
        return Store.lstCasas.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener= listener;
    }

    @Override
    public void onClick(View view) {
        if(listener != null){
            listener.onClick(view);
        }
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView lblCalle;
        TextView lblNCasa;
        TextView lblSuperficie;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lblCalle = itemView.findViewById(R.id.lblCalle);
            lblNCasa = itemView.findViewById(R.id.lblNCasa);
            lblSuperficie = itemView.findViewById(R.id.lblSuperficie);
        }
    }
}
