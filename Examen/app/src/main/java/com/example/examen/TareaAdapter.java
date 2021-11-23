package com.example.examen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TareaAdapter<view> extends RecyclerView.Adapter<TareaAdapter.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    Context context;

    private View.OnClickListener listener;



    public TareaAdapter(Context context){
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public TareaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.tarea_activity, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TareaAdapter.ViewHolder holder, int position) {

        String sNombre= Store.lstTarea.get(position).getsNombre();
        String sFecha= Store.lstTarea.get(position).getsFecha();
        String sHora= Store.lstTarea.get(position).getsHora();


        holder.lblNombre.setText(sNombre + "");
        holder.lblFecha.setText(sFecha + "");
        holder.lblHora.setText(sHora + "");




    }

    @Override
    public int getItemCount() {
        return Store.lstTarea.size();
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
        TextView lblFecha;
        TextView lblHora;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lblNombre = itemView.findViewById(R.id.lblNombre);
            lblFecha = itemView.findViewById(R.id.lblFecha);
            lblHora = itemView.findViewById(R.id.lblHora);
        }
    }
}