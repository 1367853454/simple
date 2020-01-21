package com.major.simple.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserVO {

    @JsonProperty("user_name")
    private String userName;

}
