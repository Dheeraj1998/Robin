package com.example.robin;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {

    private List<Message> messagesList;

    public MessageAdapter(List<Message> messagesList) {
        this.messagesList = messagesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = null;

        if (viewType == 1) {
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_sent, parent, false);
        } else if (viewType == 2) {
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_received, parent, false);
        }

        return new MyViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        return messagesList.get(position).getMessage_type();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Message message = messagesList.get(position);
        holder.textview_message.setText(message.getMessage_content());
    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textview_message;

        public MyViewHolder(View view) {
            super(view);
            textview_message = (TextView) view.findViewById(R.id.text_message_body);
        }
    }
}