package com.example.feed.domain.user.exception;

import com.example.feed.global.error.CustomException;
import com.example.feed.global.error.ErrorCode;
import com.example.feed.global.exception.MailSendException;

public class BadAuthCodeException extends CustomException {

    public static final CustomException EXCEPTION =
            new BadAuthCodeException();

    private BadAuthCodeException() {
        super(ErrorCode.BAD_AUTH_CODE);
    }
}
