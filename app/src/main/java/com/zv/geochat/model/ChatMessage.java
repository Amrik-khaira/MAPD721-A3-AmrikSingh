package com.zv.geochat.model;

public class ChatMessage {
    private String id;
    private String userName;
    private String body;
    private long chatMessageDate;

    public ChatMessage() {
    }

    public ChatMessage(String userName, String body, long chatMessageDate) {
        this.userName = userName;
        this.body = body;
        this.chatMessageDate = chatMessageDate;
    }

    public ChatMessage(String id, String userName, String body, long chatMessageDate) {
        this.id = id;
        this.userName = userName;
        this.body = body;
        this.chatMessageDate = chatMessageDate;
    }


    public String getUserName() {
        return userName;
    }

    public String getBody() {
        return body;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getChatMessageDate() {
        return chatMessageDate;
    }

    public void setChatMessageDate(long chatMessageDate) {
        this.chatMessageDate = chatMessageDate;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", body='" + body + '\'' +
                ", chatMessageDate='" + chatMessageDate + '\'' +
                '}';
    }
}
