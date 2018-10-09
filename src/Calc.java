import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*; 


public class Calc {

	String number = "";
	String num1 = ""; 
	String num2 = ""; 
	String symbol = ""; 
	String c = ""; 
	
	public void createCalc()
	{
		Frame F = new Frame(); 
		F.setVisible(true); 
		F.setSize(600,600);
		
		Panel top = new Panel();
		top.setBackground(Color.PINK);
		top.setSize(300,200);
		
		TextField result = new TextField(); 
		result.setColumns(30);
		top.add(result); 

		Panel center = new Panel();
		center.setBackground(Color.blue);
		
		FlowLayout flow = new FlowLayout(); 
//		F.setLayout(flow);
//		
		top.setLayout(flow);
		
		GridLayout grid = new GridLayout(4,4); 
		center.setLayout(grid);
		
		F.add(top, BorderLayout.NORTH);
		F.add(center, BorderLayout.CENTER);
		
		Button B0 = new Button("0");
		Button B1 = new Button("1");
		Button B2 = new Button("2");
		Button B3 = new Button("3");
		Button B4 = new Button("4");
		Button B5 = new Button("5");
		Button B6 = new Button("6");
		Button B7 = new Button("7");
		Button B8 = new Button("8");
		Button B9 = new Button("9");
		Button equal = new Button("=");
		Button add = new Button("+");
		Button multiply = new Button("*");
		Button divide = new Button("/");
		Button subtract = new Button("-");
		Button clear = new Button("Clear");
		
		center.add(B0);
		center.add(B1);
		center.add(B2);
		center.add(add);
		
		center.add(B3);
		center.add(B4);
		center.add(B5);
		center.add(multiply);
		
		center.add(B6);
		center.add(B7);
		center.add(B8);
		center.add(divide);
		
		center.add(B9);
		center.add(equal);	
		center.add(clear);
		center.add(subtract);
		
		//Operations O = new Operations(result);
		
		Button [] num = {B0, B1, B2, B3, B4, B5, B6, B7, B8, B9};
		Button [] sign = {equal, add, multiply, divide, subtract, clear}; 
		
		for(Button a:num)
		{
			a.setBackground(Color.LIGHT_GRAY);
		}
		
		for(Button b:num)
		{
			b.addActionListener
				(
						new ActionListener()
						{
							public void actionPerformed(ActionEvent event)
							{
								Button btn = (Button)event.getSource();
								String titleBtn = btn.getLabel();
								number += titleBtn; 
								result.setText(number);
							}
						}
					
				);
		}
		
		for(Button b:sign)
		{
			b.addActionListener(
					new ActionListener()
					{
						public void actionPerformed(ActionEvent event)
						{
							Button btn = (Button)event.getSource();
							String titleBtn = btn.getLabel();
							
						if (num1 == "")
							{
								num1 = number;
								result.setText(titleBtn);
								number = "";
								symbol = titleBtn;
								System.out.println("in the if ");
							}
						else if(num2 == "")
							{
								num2 = number;
								result.setText(titleBtn);
								number = "";
								System.out.println("in second else if");
							}
						
						if(titleBtn.equals("="))
						{
							System.out.println("in equals");
							System.out.println(symbol);
							if(symbol.equals("+"))
								{
									System.out.println(symbol);
									int c = Integer.parseInt(num1) + Integer.parseInt(num2);
									result.setText(String.valueOf(c));
								}
							if(symbol.equals("-"))
							{
								int c = Integer.parseInt(num1) - Integer.parseInt(num2);
								String resultC = String.valueOf(c);
								result.setText(resultC);
							}
							
							if(symbol.equals("*"))
							{
								int c = Integer.parseInt(num1) * Integer.parseInt(num2);
								String resultC = String.valueOf(c);
								result.setText(resultC);
							}
							
							if(symbol.equals("/"))
							{
								int c = Integer.parseInt(num1) / Integer.parseInt(num2);
								String resultC = String.valueOf(c);
								result.setText(resultC);
							}
						}
						
						if(titleBtn.equals("Clear"))
						{
							num1 = "";
							num2 = ""; 
							number = ""; 
							symbol = "";
							result.setText("");
							
						}
						
						}
					}
				);
		}
			
//		equal.addActionListener(new ActionListener()
//				public void actionPerformed(ActionEvent event)
//				{
//					Button btn = (Button)event.getSource();
//					String titleBtn = btn.getLabel();
//					if (num1 != null && num2 !=null && titleBtn.equals("="))
//						{
//							if(symbol.equals("+"))
//							{
//								c = num1 + num2;
//								String resultC = String.valueOf(c);
//								result.setText(resultC);
//							}
//						}
//				}}
//			);
					
		
//		if(titleBtn.equals("-"))
//		{
//			c = num1 - num2;
//			String resultC = String.valueOf(c);
//			T3.setText(resultC);
//		}
//		
//		if(titleBtn.equals("*"))
//		{
//			c = inputBox1 * inputBox2;
//			String resultC = String.valueOf(c);
//			T3.setText(resultC);
//		}
//		
//		if(titleBtn.equals("/"))
//		{
//			c = inputBox1 / inputBox2;
//			String resultC = String.valueOf(c);
//			T3.setText(resultC);
//		}
		}
		
		


}
