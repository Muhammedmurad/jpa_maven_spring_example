package com.muratyilmaz.CustomException;

import org.springframework.stereotype.Component;

@Component
public class MyException extends Exception {

	private static final long serialVersionUID = 7915639976462854837L;

    private final String title;
    private final int errorCode;
    private final int httpStatusCode;


    public MyException(String title, String message, int errorCode, int httpStatusCode) {
        super(message);
        this.title = title;
        this.errorCode = errorCode;
        this.httpStatusCode = httpStatusCode;
    }

    public MyException(String title, String message, int errorCode, int httpStatusCode, Exception exception) {
        super(message, exception);
        this.title = title;
        this.errorCode = errorCode;
        this.httpStatusCode = httpStatusCode;
    }

    public String getTitle() {
        return title;
    }

    
    public int getErrorCode() {
        return errorCode;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }
}
