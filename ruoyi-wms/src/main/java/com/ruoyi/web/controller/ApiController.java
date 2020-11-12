package com.ruoyi.web.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.IpUtils;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.web.exception.ErrorInfoException;
import com.ruoyi.utils.CommonUtils;
import com.ruoyi.web.request.CreateShipSVRequest;
import com.ruoyi.web.vo.LoginValidVO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping("/api")
public class ApiController extends BaseController {
//ddddff

    @GetMapping("/in")
    @ResponseBody
    public AjaxResult api(HttpServletRequest request) {
        String ipAddr = IpUtils.getIpAddr(ServletUtils.getRequest());
        System.out.println(ipAddr);
        if (StringUtils.isBlank(ipAddr)) {
            throw new ErrorInfoException("地址错误");
        }
        return AjaxResult.success(new ArrayList<>());
    }

    @ApiOperation(value = "desc of method", notes = "")
    @GetMapping("/hello2")
    @ResponseBody
    public Object hello2( /* 参数注解 */ @ApiParam(value = "desc of param", required = true) @RequestParam String name) {
        return "Hello " + name + "!";
    }

    @ApiOperation(value = "desc of method", notes = "")
    @GetMapping("/hello")
    @ResponseBody
    public Object hello() {
        CommonUtils.WriteLog("u9api", "hello", "request", "start");
        CreateShipSVRequest request=new CreateShipSVRequest();

//        request.doService();

        CommonUtils.WriteLog("u9api", "hello", "response", "end");
        return AjaxResult.success("Hello ");
    }

    @PostMapping("/valid")
    @ResponseBody
    public AjaxResult register(@Valid LoginValidVO validVO) {
//        U9ApiBusiness u9ApiBusiness = new U9ApiBusiness();
//        u9ApiBusiness.a();
        return AjaxResult.success();
    }


}
