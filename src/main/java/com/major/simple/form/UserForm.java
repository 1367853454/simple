package com.major.simple.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserForm {

    @JsonProperty("user_name")
    private String userName;
}
