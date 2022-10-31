import java.io.*;
import java.util.Scanner;
public class Stack
{
	Stack()
	{
		String s2=Notepad.area.getText();
		String res[]=s2.split(" ");
			for (int i=0; i<res.length;i++ ) {
				push(res[i]);	
			//	System.out.print(res[i]+"  ");
			}
			
			
			
			
       
	}
	static int a=3;
	public void undo1()
	{
		a++;
		try
		{
		 undo();
		}
		catch(Exception e)
		{
			
		}
		String s="";;
		if(top>0)
		{
			for(int i=0;i<top;i++)
			{
				s=s+text[i]+" ";
				
			}
		}
		
		
		Notepad.area.setText(s);
		
	}
	public void redo1()
	{
		
		redo();
		String s="";;
		if(top>0)
		{
			for(int i=0;i<top;i++)
			{
				s=s+text[i]+" ";
			
			}
		}
		
		
		Notepad.area.setText(s);
		
		
		
	}
	  String text[]= new String [500];
	  int max=500;
	  int top=0;
	
	
	//creating stack for temp
	 static  String temp[]=new String [10];
	 static int tempTop= 0;
	 static int tempMax=10;
	public void push(String data)
	{
		if(top>=0 && top<max)
		{
			text[top]=data;
			top++;
			
			
		}
		
		
	}
	public String pop()
	{
		if(top>=0 && top<max)
		{
			//temp[tempTop]=text[top-1];
			//tempTop++;
			
			return text[--top];
			
			
			
		}
		else
		{
			
			return "Error! Unable to retrieve data.";
			
		}
		
		
	}
	public String peek()
	{
		if(top>=0 && top<max)
		{
			return text[top-1];
			
		}
		else
		{
			return "Error! Unable to retrieve data" ;
		}
		
		
	}
	public void display()
	{
		if(top>0)
		{
			for(int i=top-1;i>=0;i--)
			{
				System.out.print(text[i]+" , ");
			
			}
		}
		else
		{
			System.out.println("Sorry! nothing to show here");
		}
		System.out.println();
		
	}
	public void undo()
	{
		
		if(top>=0)
		{
			 //pop();
			if(top>=0 && top<max)
			{
				temp[tempTop]=text[top-1];
				tempTop++;
				pop();
			
				
			
			}
			else
			{
				System.out.println("Sorry! nothing to undo");
			}
			
		}
				 
				  
			  
			 
			 
		}
		
		
		
	
	public void redo()
	{
		if(top<max)
		{
			if(tempTop>0)
			{
			   push(temp[tempTop-1]);
				  tempTop=tempTop-1;
			 
			 
			}
			else
			{
			System.out.println("Sorry nothing to redo.");
			}
		
		}
		
		
	}
	public static void main(String []args)
	{
		Stack ob= new Stack();
		
		
		
		
		
		
		
	}
	
	
	
}