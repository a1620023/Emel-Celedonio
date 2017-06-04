package frm;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import model.Dibujar;

public class Ventana extends JFrame {

	public Ventana() {
            setLocationRelativeTo(null);
            setResizable(false);
                
                //((JPanel)getContentPane().se);
		ImageIcon uno = new ImageIcon(this.getClass().getResource("/img/casafinal.jpg"));
                JPanel fondo = new JPanel();
                //fondo.set(uno);
                getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
                fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
                
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Dibujar());
		setTitle("Mover imagen con java");
		setSize(800, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public static void main(String[] args) {
        new Ventana();
    }
}