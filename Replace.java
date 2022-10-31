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



public class Replace implements ActionListener
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
public void search(String s,String replaceWith)   //s2 area text, s input text
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
	s=s.trim();
	Highlighter highlighter = Notepad.area.getHighlighter();
	highlighter.removeAllHighlights();
	HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
	while(cur!=null)
	{
		
		

		 word=cur.data;
		String wd = word;
		 wd = wd.replace(".","");
		  wd = wd.replace(",","");

		if(wd.equals(s))
		{
            
		/*	int indx = replaceWith.length()+k;
			System.out.println("indx is "+indx);
            int j=0;  */
//code here
			String from = field.getText();

			String f= field1.getText();
		f=f.trim();
        int start = Notepad.area.getText().indexOf(from);   //field1.getText()
        if (start >= 0 && from.length() > 0)
          Notepad.area.replaceRange(f, start, start
              + from.length());
      	
        }
        cur=cur.next;
    }

}

//code her
		/*	for(;k<indx;k++)
			{
				//Notepad.area.charAt();
				System.out.print("k is "+k);
				int ind = word.length()-1;
				try {
				//	highlighter.addHighlight(k, indx, painter);
                char c=replaceWith.charAt(j);
                
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
				System.out.println("k:"+k);
			
			}
		k++;  */
     
		
	
    
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
	







			//	 Upper is Linked List  Class 


	JTextArea area;
	JTextField field;
    JTextField field1;
	JButton b;
	//Notepad ob = new Notepad();
	//String s=area.Notepad.getText();
	//
	String s2;
	Replace(String s1)   // String of area
	{
		s2=s1;
		JFrame frame = new JFrame("Replace");
		frame.setSize(350,200);
		field = new JTextField();
        field.setText("word to replace");
		field.setBounds(30,50,100,30);
        field1 = new JTextField();
        field1.setText("to replace with");
        field1.setBounds(180,50,100,30);
		//area= new JTextArea();
		//area.setSize(300,300);
		String s= field.getText();
		 b = new JButton("Replace");
		b.setBounds(100,100,100,30);
		b.addActionListener(this);
       // area.setFont(new Font ("SAN SERIF",Font.PLAIN,20));
      //  area.setLineWrap(true);
		//frame.add(area);
		frame.add(field);
        frame.add(field1);
		frame.add(b);
		frame.setLayout(null);
		//frame.setDefaultOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // area.setWrapStyleWord(true);
	  
	   frame.setResizable(false);
	   frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	public void actionPerformed (ActionEvent ae )
	{
		 if (ae.getActionCommand().equals("Replace")) {
         //   String s=seNotepad.area.getText();    //area.setText(Notepad.area.getText())
			//Notepad.area.setText(find());
			//System.out.print(s2);
			res=s2.split(" ");
			for (int i=0; i<res.length;i++ ) {
				add(res[i]);	
			}
			String fieldString=field.getText();
			String replaceWith=field1.getText();
			search(fieldString,replaceWith);
			
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