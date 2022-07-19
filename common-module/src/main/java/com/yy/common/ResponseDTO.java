package com.yy.common;

/**
 * @author ycr
 * @date 2022/7/19 21:58
 */

public class ResponseDTO <T>{

    private static final Integer SUCCESS_CODE = 200;

    private static final Integer FAIL_CODE = 500;

    private static final String SUCCESS_MSG = "success";

    private static final String FAIL_MSG = "fail";

    private Integer code;

    private String message;

    private T data;

    public static <T> ResponseDTO<T> success(T data) {
        ResponseDTO<T> responseDTO = new ResponseDTO<>();
        responseDTO.setCode(SUCCESS_CODE);
        responseDTO.setMessage(SUCCESS_MSG);
        responseDTO.setData(data);
        return responseDTO;
    }

    public static <T> ResponseDTO<T> success() {
        ResponseDTO<T> responseDTO = new ResponseDTO<>();
        responseDTO.setCode(SUCCESS_CODE);
        responseDTO.setMessage(SUCCESS_MSG);
        return responseDTO;
    }

    public static <T> ResponseDTO<T> fail(){
        ResponseDTO<T> responseDTO = new ResponseDTO<>();
        responseDTO.setCode(FAIL_CODE);
        responseDTO.setMessage(FAIL_MSG);
        return responseDTO;
    }

    public ResponseDTO() {
    }

    public ResponseDTO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
