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

        String sNombre= Ciudad.lstArticulo.get(position).getNombre();
        String sPrecio= Ciudad.lstArticulo.get(position).getPrecio() + "€";
        String sStock= Ciudad.lstArticulo.get(position).getStock() + " Ud.";

        holder.lblNombre.setText(sNombre);
        holder.lblPrecio.setText(sPrecio);
        holder.lblStock.setText(sStock);




    }

    @Override
    public int getItemCount() {
        return Ciudad.lstArticulo.size();
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

        TextView lblNombre;
        TextView lblPrecio;
        TextView lblStock;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lblNombre = itemView.findViewById(R.id.lblCalle);
            lblPrecio = itemView.findViewById(R.id.lblNCasa);
            lblStock = itemView.findViewById(R.id.lblSuperficie);
        }
    }
}
