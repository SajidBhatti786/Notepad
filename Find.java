//package sajid;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;



public class Find implements ActionListener
{
	String [] res;
	ListNode root;
	
	public static class ListNode{
		String data;
		ListNode next;

		public ListNode(String data){
			this.data=data;
			next=null;
		}
	}


	public void add(String data){
		ListNode newNode = new ListNode(data);
		ListNode curr = root;
		if (root==null){
			root=newNode;
			return;
		}
		while (curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newNode;
	}
public void search(String s)   //s2 area text, s input text
{
//	System.out.print("search chal gya");

	ListNode cur=root;
	//int[] list=new int[4];

/*	Highlighter highlighter = Notepad.area.getHighlighter();
	highlighter.removeAllHighlights();
	HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);  */
	s2=Notepad.area.getText();
	
	
	int index=0;
	int i=0;
	String word;
	int k=0;
	//s=s.trim();
	
	Highlighter highlighter = Notepad.area.getHighlighter();
	highlighter.removeAllHighlights();
	HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
	while(cur!=null)
	{
		
		

		 word=cur.data;
		//word=word.trim();
		//word = word.replace(".", "");
		String wd = word;
		 wd = wd.replace(".","");
		  wd = wd.replace(",","");
		
		if(wd.equals(s))
		{

			int indx = word.length()+k;
			

			
			for(;k<indx;k++)
			{
				
				
				int ind = word.length()-1;
				try {
					highlighter.addHighlight(k, indx, painter);
				}
				catch(Exception e)
				{
					System.out.print("exception "+e);
				}
				

			}
		}
		else
			{
				k+=word.length();
				
			
			}
		k++;
		cur=cur.next;
	}
			//if(cur.data== s)
			//{
				//System.out.print("chal gya inside cur");
			/*	try {
					Notepad.area.getHighlighter().removeAllHighlights();
					if (cur == null) {
					  return;
					}
					int startOffset = Notepad.area.getLineStartOffset(cur.getBeginLine() - 1)
						+ cur.getBeginColumn() - 1;
					int end = Notepad.area.getLineStartOffset(cur.getEndLine() - 1) + cur.getEndColumn();
					Notepad.area.getHighlighter().addHighlight(startOffset, end,
						new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW));
					Notepad.area.moveCaretPosition(startOffset);
				  } catch (Exception exc) {
					
				  }			*/



		//	}
			
			


	//}

/*	int end_index=s.length();

	for(int k=0;k<list.size();k++)
	{
		try {
			highlighter.addHighlight(list.get(k), list.get(k)+end_index, painter);
		}
		catch(Exception e)
		{

		}
		System.out.print("highlighter chal gya");
	}
	System.out.print("sb chal gya");

	
	int end_index= getted_data_length;  // in this case s
	for(int i=0;i<list.size();i++)
	{
		highlighter.addHighlight(list.get(i),list.get(i)+end_index,painter);
	

	}
	
	
	*/
	


}


			//	 Upper is Linked List  Class 


	JTextArea area;
	JTextField field;
	JButton b;
	//Notepad ob = new Notepad();
	//String s=area.Notepad.getText();
	//
	String s2;
	Find(String s1)
	{
		s2=s1;
		JFrame frame = new JFrame("Find");
		frame.setSize(350,200);
		field = new JTextField();
		field.setBounds(70,50,210,30);
		//area= new JTextArea();
		//area.setSize(300,300);
		String s= field.getText();
		 b = new JButton("Find");
		b.setBounds(100,100,100,30);
		b.addActionListener(this);
       // area.setFont(new Font ("SAN SERIF",Font.PLAIN,20));
      //  area.setLineWrap(true);
		//frame.add(area);
		frame.add(field);
		frame.add(b);
		frame.setLayout(null);
		//frame.setDefaultOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // area.setWrapStyleWord(true);
	   System.out.println(s);
	   frame.setResizable(false);
	   
frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	public void actionPerformed (ActionEvent ae )
	{
		 if (ae.getActionCommand().equals("Find")) {
         //   String s=seNotepad.area.getText();    //area.setText(Notepad.area.getText())
			//Notepad.area.setText(find());
			//System.out.print(s2);
			res=s2.split(" ");
			for (int i=0; i<res.length;i++ ) {
				add(res[i]);	
			}
			String fieldString=field.getText();
			
			search(fieldString);
			
        }
		
	}

	

	public static void main(String[] args)
	{
		
	}

	public void Print(){
		ListNode curr=root;
		while(curr!=null){
			System.out.print(curr.data+" ,");
			curr=curr.next;
		}
		

	}





}