package com.fs.beans;

public class MessageWriter {
	private IMessageConverter messageConverter;

	public MessageWriter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}

	public void writeMessage(String message) {
		String convertMessage = null;

		convertMessage = messageConverter.convert(message);
		System.out.println(convertMessage);
	}
}