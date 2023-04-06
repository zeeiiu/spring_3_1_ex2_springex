package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * MyCalculator myCalculator = new MyCalculator();
		 * myCalculator.setCalculator(new Calculator());
		 * 
		 * myCalculator.setFirstNum(10); myCalculator.setSecondNum(2);
		 * 
		 * myCalculator.add(); myCalculator.sub(); myCalculator.mul();
		 * myCalculator.div();
		 */

		/*
		 * String configLocation = "classpath:applicationCTX.xml";
		 * AbstractApplicationContext ctx = new
		 * GenericXmlApplicationContext(configLocation); MyCalculator myCalculator =
		 * ctx.getBean("myCalculator", MyCalculator.class); myCalculator를 가지고 오는데 이것에 대한
		 * 원본은 MyCalculator.class이다. myCalculator.add(); myCalculator.sub();
		 * myCalculator.mul(); myCalculator.div();
		 */
		
		String configLocation = "classpath:applicationCTX2.xml"; 
		 AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		 
		 Pencil pencil = ctx.getBean("pencil", Pencil.class);
		 pencil.use();
		

	}

}
