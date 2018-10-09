import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener{

	TextField result; 
	int clicked = 0; 
	int num1;
	int num2;
	int c = 0;
	String symbol;
	
	
	
	public Operations(TextField f1)
	{
		result = f1; 
	}
	
	public void actionPerformed(ActionEvent event)
	{
		clicked++; 
		
		if(clicked == 1)
		{
			Button btn = (Button)event.getSource();
			String titleBtn = btn.getLabel();
			num1 = Integer.parseInt(titleBtn);
		}
		
		if(clicked == 2)
		{
			Button btn = (Button)event.getSource();
			symbol = btn.getLabel();
		}
		
		if(clicked == 3)
		{
			Button btn = (Button)event.getSource();
			String titleBtn = btn.getLabel();
			num2 = Integer.parseInt(titleBtn);
		}
		
		Button btn = (Button)event.getSource();
		String titleBtn = btn.getLabel();
		
		if(titleBtn.equals("="))
		{
			
			if(symbol.equals("+"))
				
			{
				c = num1 + num2;
			}
			if(symbol.equals("-"))
			{
				c = num1 - num2;
				
			}
			
			if(symbol.equals("*"))
			{
				c = num1 * num2;
				
			}
			
			if(symbol.equals("/"))
			{
				c = num1 / num2;
			}
			
			String resultC = String.valueOf(c);
			result.setText(resultC);
		}
		
		if(titleBtn.equals("Clear"))
		{
			num1 = 0;
			num2 = 0;
			symbol = null; 
			clicked = 0;
			result.setText(null);
		}
	}
	
//	Button B0;
//	Button B1;
//	Button B2;
//	Button B3;
//	Button B4;
//	Button B5;
//	Button B6;
//	Button B7;
//	Button B8;
//	Button B9;
//	Button equal;
//	Button add;
//	Button multiply;
//	Button divide;
//	Button subtract;
//	Button clear;
//	TextField result;
//	
}
