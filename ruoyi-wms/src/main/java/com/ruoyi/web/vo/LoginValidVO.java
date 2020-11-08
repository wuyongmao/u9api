package com.ruoyi.web.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class LoginValidVO {
    @NotBlank(message = "手机号不能为空")
    @Size(min = 10,max = 20,message = "手机号码需要10-20位")
    private String mobile;
}
