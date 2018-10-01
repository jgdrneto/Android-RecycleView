package com.example.neto.exemploaularecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemHolder> {

    private List<Item> itens;

    private Context context;

    public ItemAdapter(Context nContext){
        this.context = nContext;

        this.itens = new ArrayList<Item>();

        for(int i =0;i<100;i++){
            Item item = new Item(i+1, "Item " + (i+1));
            this.itens.add(item);
        }

    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_2,viewGroup,false);
        ItemHolder holder = new ItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        Item item = itens.get(position);
        holder.txtId.setText(String.valueOf(item.getId()));
        holder.txtNome.setText(item.getNome());
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView txtId;
        public TextView txtNome;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            this.txtId = itemView.findViewById(android.R.id.text1);
            this.txtNome = itemView.findViewById(android.R.id.text2);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int pos = getAdapterPosition();
            Toast.makeText(context,"Item removido: "+ pos, Toast.LENGTH_SHORT).show();
            notifyItemRemoved(pos);
        }
    }
}
