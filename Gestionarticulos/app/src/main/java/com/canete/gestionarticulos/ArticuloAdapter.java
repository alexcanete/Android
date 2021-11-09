package com.canete.gestionarticulos;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticuloAdapter<view> extends RecyclerView.Adapter<ArticuloAdapter.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    Context context;

    private View.OnClickListener listener;



    public ArticuloAdapter(Context context){
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ArticuloAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.articulos_item, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticuloAdapter.ViewHolder holder, int position) {

        String sNombre= Store.lstArticulo.get(position).getNombre();
        String sPrecio= Store.lstArticulo.get(position).getPrecio() + "€";
        String sStock= Store.lstArticulo.get(position).getStock() + " Ud.";

        holder.lblNombre.setText(sNombre);
        holder.lblPrecio.setText(sPrecio);
        holder.lblStock.setText(sStock);




    }

    @Override
    public int getItemCount() {
        return Store.lstArticulo.size();
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
            lblNombre = itemView.findViewById(R.id.lblNombre);
            lblPrecio = itemView.findViewById(R.id.lblPrecio);
            lblStock = itemView.findViewById(R.id.lblStock);
        }
    }
}
