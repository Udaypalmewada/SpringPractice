package com.sp.test;

import com.sp.beans.MessageWriter;

 public class StrategyPatternTest {

	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		messageWriter.writerMessage("Welcome to Strategy Design Pattern");
	}
}
