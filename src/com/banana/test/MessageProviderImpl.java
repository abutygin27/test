package com.banana.test;

public class MessageProviderImpl implements MessageProvider {
    
    public static final String MESSAGE = "Hello";

    @Override
    public String getMessage() {
        return MESSAGE;
    }

}
