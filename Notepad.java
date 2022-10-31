//package sajid;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import java.awt.Color;


import javax.swing.text.DefaultEditorKit;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.filechooser.*;
public class Notepad extends JFrame implements ActionListener{
	
	/*  static OperationPanel panel = new OperationPanel();
    static TextPanel textPanel = new TextPanel();   */
    public static JTextArea area; 
    JScrollPane pane;
    String s;
	 public  JMenu jMenu;
	  JPopupMenu popupMenu = new JPopupMenu();
	 public static  JMenu edit;
	  static JMenuBar menubar;
	  static JMenu file;
	  static JMenu Data;
    Notepad(){
		
		new CutCopyPastActionSupport();
        setBounds(0,0,1950,1050);

         menubar =new JMenuBar();

	
        file = new JMenu("File");

        JMenuItem newDoc = new JMenuItem("New");
        newDoc.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newDoc.addActionListener(this);

        JMenuItem save = new JMenuItem("Save");
        save.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        save.addActionListener(this);

        JMenuItem open = new JMenuItem("Open");
        open.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        open.addActionListener(this);

        JMenuItem exit = new JMenuItem("Exit");
        exit.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0));
        exit.addActionListener(this);

        file.add(newDoc);
        file.add(save);
        file.add(open);
       

	//here

	
	/*	 JTextArea ta = new JTextArea(5, 5);
      JTextField tf = new JTextField();
	  JTextArea area = new JTextArea();
	  area.setSize(70,80);
      ta.setText("The coding noses celebrated hours");
      tf.setText("random text");

      CutCopyPastActionSupport support = new CutCopyPastActionSupport();
      support.setPopup(area);

      JMenuBar menuBar = new JMenuBar();
      menuBar.add(support.getMenu());
      JFrame frame = createFrame("Cut Copy Paste Menu Example");
      frame.setJMenuBar(menuBar);

      frame.add(area, BorderLayout.NORTH);
      frame.add(new JScrollPane(area));
      frame.setVisible(true);

    //  frame.add(area, BorderLayout.NORTH);
    //  frame.add(new JScrollPane(area));
    //  frame.setVisible(true);
	  
	  // new Notepad().add();

	  //here

         

     /*   JMenuItem copy1 = new JMenuItem("Copy ");
        copy1.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        copy1.addActionListener(this);
		copy1.addActionListener(this);
        
        JMenuItem paste = new JMenuItem("Paste");
        paste.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
       // paste.addActionListener(this);
        
        JMenuItem cut = new JMenuItem("Cut");
        cut.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
      //  cut.addActionListener(this);
		
		*/
		edit = new JMenu("Edit");
		JMenuItem find = new JMenuItem("Find");
        find.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        find.addActionListener(this);
		
		JMenuItem replace = new JMenuItem("Replace");
        replace.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));    //cnt G for replace
        replace.addActionListener(this);
		
		JMenuItem undo = new JMenuItem("Undo");
        undo.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));    //cnt U for undo
        undo.addActionListener(this);
		
		JMenuItem redo = new JMenuItem("Redo");
        redo.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));    //cnt M for undo
        redo.addActionListener(this);
        
        JMenuItem selectAll = new JMenuItem("Select All");
        selectAll.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        selectAll.addActionListener(this);

     /*   edit.add(copy1);
        edit.add(paste);
        edit.add(cut);
		
		*/
		edit.add(find);
		edit.add(replace);
		edit.add(undo);
		edit.add(redo);
        edit.add(selectAll);

         Data = new JMenu("About");
		JMenuItem developer = new JMenuItem("Developer");
		JMenuItem product = new JMenuItem("product");
		Data.add(developer);
		Data.add(product);
        menubar.add(file);
        menubar.add(edit);
       
		 CutCopyPastActionSupport support = new CutCopyPastActionSupport();
		menubar.add(support.getMenu());
		 menubar.add(Data);
        setJMenuBar(menubar);

        area = new JTextArea();
        area.setFont(new Font ("SAN SERIF",Font.PLAIN,20));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        pane = new JScrollPane(area);
        add(pane,BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	 
   
	/* public JMenu getMenu() {
        return jMenu;
    }  */
    public static void main(String[] args) {
		new Notepad().setVisible(true);
	try
	{
		 //JTextArea ta = new JTextArea(5, 5);
     // JTextField tf = new JTextField();
	  //JTextArea area = new JTextArea();
	 // area.setSize(70,80);
     // ta.setText("The coding noses celebrated hours");
     // tf.setText("random text");

      CutCopyPastActionSupport support = new CutCopyPastActionSupport();
      support.setPopup(area);

    //  JMenuBar menuBar = new JMenuBar();
	// menubar.add(edit);
	

	// Data.add(edit);
	 //edit=file;
    //  menubar.add(support.getMenu());
	  System.out.print("add huwa");
   //   JFrame frame = createFrame("Cut Copy Paste Menu Example");
    //  new Notepad().setJMenuBar(menuBar);

    //  frame.add(area, BorderLayout.NORTH);
     // frame.add(new JScrollPane(area));
     // frame.setVisible(true);

    //  frame.add(area, BorderLayout.NORTH);
    //  frame.add(new JScrollPane(area));
    //  frame.setVisible(true);
	  
	  // new Notepad().add(menuBar);
	}
	catch(Exception e)
	{
		
	}
	 
	
       
    }
/*	public static void copy(){
        TextPanel.area.firePropertyChange("#"+TextPanel.area.getText(), TextPanel.area.getCaretPosition(), 0);
        TextPanel.area.copy();
    }  */

    public void actionPerformed (ActionEvent ae ){
        if (ae.getActionCommand().equals("New")) {
            area.setText("");
        }
        else  if (ae.getActionCommand().equals("Save")) {
            JFileChooser saveas = new JFileChooser();
            saveas.setApproveButtonText("Save");
            int action =saveas.showOpenDialog(this);
            if (action!=JFileChooser.APPROVE_OPTION) {
                return;
            }   
            File file = new File(saveas.getSelectedFile()+".txt"); 
            BufferedWriter outFile =null;
            try{
                outFile=new BufferedWriter(new FileWriter(file));
                area.write(outFile);
            }
            catch(Exception e){ }
        }

        else  if (ae.getActionCommand().equals("Open")) {
            JFileChooser chooser = new JFileChooser();
            chooser.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter restrict=  new FileNameExtensionFilter("Only.txt files ","txt");
            chooser.addChoosableFileFilter (restrict);    
            int action =chooser.showOpenDialog(this);
            if (action!=JFileChooser.APPROVE_OPTION) {
                return;
            }   
            File file =chooser.getSelectedFile(); 
            try{
                BufferedReader reader = new BufferedReader(new FileReader(file));
                area.read(reader,null);    
            }
            catch(Exception e){ }
        }    

        else  if (ae.getActionCommand().equals("Exit")){
            System.exit(0);
        }
		else  if (ae.getActionCommand().equals("Find")){
             //s= area.getText();
			  int a=1;
			   
			 
             new Find(area.getText());
			
				 Highlighter highlighter = Notepad.area.getHighlighter();
				
			
				highlighter.removeAllHighlights();
				  
			   
			  
        }
        else if(ae.getActionCommand().equals("Replace"))
        {
			// Highlighter highlighter = Notepad.area.getHighlighter();
			// System.out.print("after print");
			
			// highlighter.removeAllHighlights();
            new Replace(area.getText());

        }
		 else if(ae.getActionCommand().equals("Undo"))
        {
            
			Stack ob = new Stack();
			System.out.print("Undo");
			ob.undo1();

        }
		else if(ae.getActionCommand().equals("Redo"))
        {
			Stack ob=new Stack();
			
			ob.redo1();
           
        }
		else if(ae.getActionCommand().equals("Select All"))
        {
			 area.selectAll();

            // Transfer focus to JTextArea to show the selected
            // text.
            //selectAll.transferFocusBackward();
			//selectAll
           
        }
		
		
    }
	public static JFrame createFrame(String title) {
      JFrame frame = new JFrame(title);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(800, 700));
      return frame;
  }
	
	
}

