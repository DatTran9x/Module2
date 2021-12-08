import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class Demo extends JFrame {

    public Demo() {

        initUI();
    }

    private void initUI() {

        JMenuBar menuBar = new JMenuBar();

        ImageIcon newIcon = new ImageIcon("F:/new.png");
        ImageIcon openIcon = new ImageIcon("F:/open.png");
        ImageIcon saveIcon = new ImageIcon("F:/save.png");
        ImageIcon exitIcon = new ImageIcon("F:/exit.png");

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem newItem = new JMenuItem("New", newIcon);
        JMenuItem openItem = new JMenuItem("Open", openIcon);
        JMenuItem saveItem = new JMenuItem("Save", saveIcon);
        JMenuItem exitItem = new JMenuItem("Exit", exitIcon);

        exitItem.setMnemonic(KeyEvent.VK_E);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,
                ActionEvent.CTRL_MASK));
        exitItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setTitle("Menu Example");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                Demo ex = new Demo();
                ex.setVisible(true);
            }
        });
    }
}