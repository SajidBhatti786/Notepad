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
public class CutCopyPasteExampleMain {
  public static void main(String[] args) {
      JTextArea ta = new JTextArea(5, 5);
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
  }

  public static JFrame createFrame(String title) {
      JFrame frame = new JFrame(title);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(800, 700));
      return frame;
  }
}