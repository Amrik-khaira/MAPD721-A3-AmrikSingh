package com.zv.geochat.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zv.geochat.R;
import com.zv.geochat.model.ChatMessage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import co.dift.ui.SwipeToAction;


public class ChatMessagesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ChatMessage> items;


    /**
     * References to the views for each data item
     **/
    public class ChatMessageViewHolder extends SwipeToAction.ViewHolder<ChatMessage> {
        public TextView userName;
        public TextView chatMessageBody;
        public TextView chatMessageDate;
        public ImageView imageView;

        public ChatMessageViewHolder(View v) {
            super(v);

            userName = (TextView) v.findViewById(R.id.userName);
            chatMessageBody = (TextView) v.findViewById(R.id.body);
            chatMessageDate = (TextView) v.findViewById(R.id.date);
            imageView = (ImageView) v.findViewById(R.id.image);
        }
    }

    /**
     * Constructor
     **/
    public ChatMessagesAdapter(List<ChatMessage> items) {
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);

        return new ChatMessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ChatMessage item = items.get(position);
        ChatMessageViewHolder vh = (ChatMessageViewHolder) holder;
        vh.userName.setText(item.getUserName());
        vh.chatMessageBody.setText(item.getBody());

        String messageDateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm").format(Calendar.getInstance().getTime());
        vh.chatMessageDate.setText(messageDateTime);

        vh.data = item;
    }
}