import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class CutCopyPastActionSupport {
  private JMenu jMenu;
  JPopupMenu popupMenu = new JPopupMenu();

  public CutCopyPastActionSupport() {
      init();
  }

  private void init() {
      jMenu = new JMenu("Editing");
      addAction(new DefaultEditorKit.CutAction(), KeyEvent.VK_X, "Cut" );
      addAction(new DefaultEditorKit.CopyAction(), KeyEvent.VK_C, "Copy" );
      addAction(new DefaultEditorKit.PasteAction(), KeyEvent.VK_V, "Paste" );
  }

  private void addAction(TextAction action, int key, String text) {
      action.putValue(AbstractAction.ACCELERATOR_KEY,
              KeyStroke.getKeyStroke(key, InputEvent.CTRL_DOWN_MASK));
      action.putValue(AbstractAction.NAME, text);
      jMenu.add(new JMenuItem(action));
      popupMenu.add(new JMenuItem(action));
  }

  public void setPopup(JTextComponent... components){
      if(components == null){
          return;
      }
      for (JTextComponent tc : components) {
          tc.setComponentPopupMenu(popupMenu);
      }
  }

  public JMenu getMenu() {
      return jMenu;
  }
}