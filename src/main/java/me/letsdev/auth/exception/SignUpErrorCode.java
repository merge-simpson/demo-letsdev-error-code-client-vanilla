package me.letsdev.auth.exception;

import letsdev.common.exception.support.BaseCustomException;
import letsdev.common.exception.support.BaseErrorCode;

public enum SignUpErrorCode implements BaseErrorCode {
    USERNAME_ALREADY_EXISTS("This username is already taken.", 409),
    NICKNAME_ALREADY_EXISTS("This nickname is already taken.", 409),
    PASSWORD_WITH_REPEATING_CHARACTERS(
            "The password contains 3 or more repeating characters in a row.",
            400
    ),
    PASSWORD_WITH_CONSECUTIVE_CHARACTERS(
            """
            The password contains some consecutive characters like \"123\" or \"abc\".
            It is allowed up to 2 consecutive numbers or letters.""",
            400
    ),
    PREDICTABLE_PASSWORD(
            "The password contains predictable patterns like \"qwerty\", \"ababab\" or \"101010\".",
            400
    ),
    PASSWORD_ON_LEAKED_DATABASE(
            "The password is commonly used and has been leaked on other websites before.",
            400
    ),
    DEFAULT("Sign-up error", 500);

    private final String message;
    private final int statusCode;

    SignUpErrorCode(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    @Override
    public String defaultMessage() {
        return message;
    }

    @Override
    public int statusCode() {
        return statusCode;
    }

    @Override
    public BaseCustomException defaultException() {
        return new BaseCustomException(this);
    }

    @Override
    public BaseCustomException defaultException(Throwable cause) {
        return new BaseCustomException(this, cause);
    }
}
