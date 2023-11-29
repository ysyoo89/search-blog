package com.search.blog.exception.exception;

import com.search.blog.exception.code.ErrorCode;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;

public class FeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        HttpStatus status = HttpStatus.valueOf(response.status());
        if (status.is5xxServerError()) {
            return new CustomException(ErrorCode.INTERNAL_SERVER_ERROR);
        } else if (status.is4xxClientError()) {
            return new CustomException(ErrorCode.BAD_REQUEST);
        } else {
            return new CustomException(ErrorCode.INTERNAL_SERVER_ERROR);
        }
    }
}
