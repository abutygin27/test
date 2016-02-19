package com.banana.test;

public class Test {

    public static void main(String[] args) {
        MessageProvider messageProvider = new MessageProviderImpl();
        MessageRenderer messageRenderer = new MessageRendererImpl();
        messageRenderer.render(messageProvider);
    }
	
}
