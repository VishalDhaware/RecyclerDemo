package com.example.recyclerdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter <Adapter.ViewwholderClass>{

    private List<ModenClass>modenClassList;

    public Adapter(List<ModenClass>modenClassList) {
        this.modenClassList=modenClassList;

    }

    @NonNull
    @Override
    public ViewwholderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new ViewwholderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewwholderClass holder, int position) {
        int resource=modenClassList.get(position).getImgessrc();
        String title=modenClassList.get(position).getTitle();
        String bady=modenClassList.get(position).getBody();
        holder.setData(resource,title,bady);

    }

    @Override
    public int getItemCount() {
        return modenClassList.size();
    }

    public class ViewwholderClass extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView title;
        private TextView body;


        public ViewwholderClass(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imgview);
            title=itemView.findViewById(R.id.txt_cat);
            body=itemView.findViewById(R.id.txt_des);
        }
        private  void setData(int resource, String titletxt, String bodytxt){
            imageView.setImageResource(resource);
            title.setText(titletxt);
            body.setText(bodytxt);

        }
    }
}
