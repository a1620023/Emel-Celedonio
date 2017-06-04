package model;

import frm.Ventana;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Dibujar extends JPanel implements ActionListener {

    private Personaje nave;
    private Timer timer;

    JLabel pre1 = new JLabel();

    JButton opcion1 = new JButton();
    JButton opcion2 = new JButton();
    JButton opcion3 = new JButton();

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_Q:
                pre1.setText("Te encuentras en Costa Verde ¿Que harias en caso de sunami?");
                pre1.setBounds(300, 100, 400, 100);
                this.add(pre1);
                pre1.setVisible(true);

                opcion1.setText("correr como loco");
                opcion1.setBounds(300, 200, 200, 40);
                this.add(opcion1);
                opcion1.setVisible(true);
                
                opcion2.setText("lararear");
                opcion2.setBounds(300, 300, 200, 40);
                this.add(opcion2);
                opcion2.setVisible(true);
                
                opcion3.setText("lararear");
                opcion3.setBounds(300, 400, 200, 40);
                this.add(opcion3);
                opcion3.setVisible(true);
                break;

            case KeyEvent.VK_C:

                break;
        }
    }

    public Dibujar() {

        //setBackground(Color.RED);
        setFocusable(true);
        addKeyListener(new teclado());

        nave = new Personaje();
        timer = new Timer(5, this);
        timer.start();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
    }

    public void paint(Graphics grafica) {
        super.paint(grafica);

        Graphics2D g2 = (Graphics2D) grafica;
        g2.drawImage(nave.tenerImagen(), nave.tenerX(), nave.tenerY(), null);
    }

    public void actionPerformed(ActionEvent e) {

        nave.mover();
        repaint();
    }

    private class teclado extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            nave.keyReleased(e);

        }

        public void keyPressed(KeyEvent e) {
            nave.keyPressed(e);

        }
    }

}
