package com.example.examen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactoAdapter<view> extends RecyclerView.Adapter<ContactoAdapter.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    Context context;

    private View.OnClickListener listener;



    public ContactoAdapter(Context context){
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ContactoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.contacto_activity, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoAdapter.ViewHolder holder, int position) {

        String sNombre= Store.lstContacto.get(position).getsNombre();
        String sApellido= Store.lstContacto.get(position).getsApellido();
        int iNumero= Store.lstContacto.get(position).getiNumero();

        holder.lblNombre.setText(sNombre);
        holder.lblApellido.setText(sApellido);
        holder.lblNumero.setText(iNumero);




    }

    @Override
    public int getItemCount() {
        return Store.lstContacto.size();
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
        TextView lblApellido;
        TextView lblNumero;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lblNombre = itemView.findViewById(R.id.lblNombre);
            lblApellido = itemView.findViewById(R.id.lblApellido);
            lblNumero = itemView.findViewById(R.id.lblNumero);
        }
    }
}