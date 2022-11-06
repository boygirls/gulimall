package com.fxc.gulimallproduct.exception;

import com.fxc.common.exception.BizCodeEnume;
import com.fxc.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FXC
 * @version 1.0
 * @date 2022/9/4 16:05
 */
@Slf4j
// @ControllerAdvice(basePackages = "com.fxc.gulimallproduct.controller")
@RestControllerAdvice(basePackages = "com.fxc.gulimallproduct.controller")
public class ExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e) {
        log.error("数据校验出现问题{},异常问题{}", e.getMessage(), e.getClass());

        BindingResult bindingResult = e.getBindingResult();

        Map<String, String> map = new HashMap<>();

        bindingResult.getFieldErrors().forEach((item) -> {
            map.put(item.getField(),item.getDefaultMessage());
        });

        return R.error(BizCodeEnume.VALID_EXCEPTION.getCode(),BizCodeEnume.VALID_EXCEPTION.getMsg()).put("data",map);
    }


    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){


        return R.error(BizCodeEnume.VALID_EXCEPTION.getCode(),BizCodeEnume.VALID_EXCEPTION.getMsg());
    }


}
