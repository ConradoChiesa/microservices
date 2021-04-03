package com.konrad.testconnectmysql.response;

import com.konrad.testconnectmysql.entitie.Message;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MessageResponse {

    private String message;
    private Integer id;
    private String title;

    public MessageResponse(Message message) {
        this.message = message.getBody();
        this.title = message.getTitle();
        this.id = message.getId();
    }

}
