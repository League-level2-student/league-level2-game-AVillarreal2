package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoomGamePanel extends JPanel
        implements ActionListener, KeyListener {
    int currentState = 0;
    int s_MENU = 0;
    int s_GAME = 1;
    int s_END = 2;
    Timer timer;
    Font titleFont;
    Font otherFont;
    public DoomGamePanel() {
        timer = new Timer(8000/60, this);
        timer.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){

        }
        if(e.getKeyCode() == KeyEvent.VK_A){

        }
        if(e.getKeyCode() == KeyEvent.VK_S){

        }
        if(e.getKeyCode() == KeyEvent.VK_D){

        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(currentState==s_END) {
                currentState = s_MENU;
            }else{
                currentState++;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void paintComponent(Graphics g) {
        titleFont = new Font("Arial", Font.PLAIN, 40);
        otherFont = new Font("Arial", Font.PLAIN, 28);
        if (currentState == s_MENU) {
            drawMenuState(g);
        } else if (currentState == s_GAME) {
            drawGameState(g);
        } else if (currentState == s_END) {
            drawEndState(g);
        }
    }

    void drawMenuState(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Doom.doomFrameWIDTH, Doom.doomFrameHEIGHT);
        g.setFont(titleFont);
        g.setColor(Color.WHITE);
        g.drawString("LEAGUE INVADERS", 50, 150);
        g.setFont(otherFont);
        g.drawString("Press ENTER to Start", 100, 450);
        g.drawString("Press SPACE for Instructions", 60, 600);
    }
    void drawGameState(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, Doom.doomFrameWIDTH, Doom.doomFrameHEIGHT);
    }
    void drawEndState(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(0, 0, Doom.doomFrameWIDTH, Doom.doomFrameHEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (currentState == s_MENU) {
            updateMenuState();
        }
        if (currentState == s_GAME) {
            updateGameState();
        }
        if (currentState == s_END) {
            updateEndState();
        }
        System.out.println("you are in action performed");
        System.out.println("currentState: " + currentState);
        repaint();
    }

    private void updateEndState() {
    }

    private void updateGameState() {
    }

    private void updateMenuState() {
    }
}
