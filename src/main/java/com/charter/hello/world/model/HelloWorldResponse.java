package com.charter.hello.world.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloWorldResponse {
    String message;

    public HelloWorldResponse(String message){
        this.message = message;
    }

    public HelloWorldResponse(){
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
