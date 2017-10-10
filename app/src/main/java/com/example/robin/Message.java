package com.example.robin;

/**
 * Created by dheeraj on 08/10/17.
 */

public class Message {
    private String message_content;
    private int message_type;

    public Message(){

    }

    public Message(String message_content) {
        this.message_content = message_content;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public int getMessage_type() {
        return message_type;
    }

    public void setMessage_type(int message_type) {
        this.message_type = message_type;
    }
}
