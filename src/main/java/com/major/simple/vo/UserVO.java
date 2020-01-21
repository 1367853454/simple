package com.major.simple.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserVO {

    @ApiModelProperty("用户名")
    @JsonProperty("user_name")
    private String userName;

}
