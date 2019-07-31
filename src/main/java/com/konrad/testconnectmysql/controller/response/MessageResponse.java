package com.konrad.testconnectmysql.controller.response;

import com.konrad.testconnectmysql.entitie.Message;

public class MessageResponse {
    private String message;
    private Integer id;
    /**
     * Constructor.
     */
    public MessageResponse(Message message) {
        this.message = message.getBody();
        this.id = message.getId();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
