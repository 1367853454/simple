package com.major.simple.dto;

import com.major.simple.model.User;
import com.major.simple.vo.UserVO;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class UserDtoFactory {

    public static UserVO userVO(User user) {

        if (null == user) {
            return null;
        }
        UserVO vo = new UserVO();
        if (StringUtils.isNotBlank(user.getName())) {
            vo.setUserName(user.getName());
        }
        return vo;
    }

}
