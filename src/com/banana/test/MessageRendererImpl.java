package com.banana.test;

public class MessageRendererImpl implements MessageRenderer {

    @Override
    public void render(MessageProvider messageProvider) {
        System.out.println(messageProvider.getMessage());
    }

}
