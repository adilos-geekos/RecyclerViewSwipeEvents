package com.elmansouriadil.swipe.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EtudiantAdapter  extends RecyclerView.Adapter<EtudiantAdapter.EtudiantHolder> implements getAdapterData{
    List<Etudiant> E = new ArrayList<>();
    LayoutInflater layoutInflater;
    static  Context co;
    public EtudiantAdapter(Context c){
        layoutInflater = LayoutInflater.from(c);
        co = c;
        Etudiant e = new Etudiant("Adil",99);
        E.add(e);
        e = new Etudiant("ahmed",13);
        E.add(e);
        e = new Etudiant("james",25);
        E.add(e);
        e = new Etudiant("smith",30);
        E.add(e);
        e = new Etudiant("maroc",100);
        E.add(e);
    }
    @Override
    public EtudiantHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.list,parent,false);
        EtudiantHolder EH = new EtudiantHolder(v);
        return EH;
    }

    @Override
    public void onBindViewHolder(EtudiantHolder holder, int position) {
          holder.T1.setText(E.get(position).getNom().toString());
         holder.T2.setText(E.get(position).getAge()+"");
    }

    @Override
    public int getItemCount() {
        return E.size();
    }
    public  void onSwipe(int position){

    }

    @Override
    public void getDataOnSwipe(int index) {
        E.remove(index);
        notifyItemRemoved(index);
    }

    public static class EtudiantHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView T1,T2;
        public EtudiantHolder(View itemView) {
            super(itemView);
            T1 = (TextView) itemView.findViewById(R.id.name);
            T2 = (TextView) itemView.findViewById(R.id.age);
            itemView.setOnClickListener(this);
            T1.setOnClickListener(this);
            T2.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.name){
                Toast.makeText(EtudiantAdapter.co,((TextView) v).getText().toString(),Toast.LENGTH_LONG).show();
            }
            else if(v.getId() == R.id.age){
                Toast.makeText(EtudiantAdapter.co,((TextView) v).getText().toString(),Toast.LENGTH_LONG).show();
            }
            //Toast.makeText(EtudiantAdapter.co,"item number "+getAdapterPosition(),Toast.LENGTH_LONG).show();
        }
    }
}
