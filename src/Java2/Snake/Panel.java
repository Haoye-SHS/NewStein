package Java2.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Panel extends JPanel implements KeyListener {
    //final variable
    private final int BLOCK = 20;
    private final int PANEL_HEIGHT = 29 * BLOCK;
    private final int HORT_NUM_OF_BLOCK = Main.WIDTH / BLOCK;
    private final int VERT_NUM_OF_BLOCK = PANEL_HEIGHT / BLOCK;

    //instance variable
    private int score = 0;
    private ArrayList<Position> snake;
    private Position apple;
    private boolean running = false;

    //direction variable
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;

    /*
    constructor init position and add key listener
     */
    public Panel() {
        running = true;
        snake = new ArrayList<>();
        //start position for snake
        Position first = new Position(9 * BLOCK, 10 * BLOCK);
        snake.add(first);
        //start position for apple
        apple = new Position(
                (int) (Math.random() * HORT_NUM_OF_BLOCK) * BLOCK,
                (int) (Math.random() * VERT_NUM_OF_BLOCK) * BLOCK);

        //addKeyListener
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    /*
    run the methods when game start
     */
    public void start() {
        //in game rendering
        while (running) {
            //delay
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //display
            //recall of paint methods
            repaint();
        }
    }

    /*
    update the position of object
     */
    public void update(Graphics g) {
        if (running) {
            //old head
            

            //snake direction update
            
           

            //if food is ate
            if (snakeX == apple.getX() && snakeY == apple.getY()) {
                score++;
                // new apple create

            } else {
                //remove tail
                
            }

            //new Head Position
            Position newHead = new Position(snakeX, snakeY);

            //check if out of frame or have collision
            
            //add new head
            snake.add(0, newHead);
        }
    }

    /*
    take in head position and snake arraylist checking for collision
     */
    public boolean checkCollision(Position head, ArrayList<Position> list) {
        //check if the head hit on one of element in the list
        
    }

    /*
    paint method to display object on to the Panel
     */
    @Override
    public void paint(Graphics g) {
        //update
        update(g);

        //background
        g.setColor(Color.black);
        g.fillRect(0, 0, Main.WIDTH, PANEL_HEIGHT + BLOCK);


        //snake
        for (int i = 0; i < snake.size(); i++) {
            //body
            if (i == 0) g.setColor(Color.yellow); //head is yellow
            else g.setColor(Color.green); //body is green
            g.fillRect(snake.get(i).getX(), snake.get(i).getY(), BLOCK, BLOCK);

            //outline
            g.setColor(Color.black);
            g.drawRect(snake.get(i).getX(), snake.get(i).getY(), BLOCK, BLOCK);
        }

        //draw apple
        

        //score
        String score = "Score: " + this.score;
        Font f = new Font("Helvetica", Font.BOLD, 25);
        FontMetrics fm = getFontMetrics(f);

        //display of score
        g.setColor(Color.black);
        g.setFont(f);
        g.drawString(score, (Main.WIDTH - fm.stringWidth(score)) / 2, PANEL_HEIGHT + 3*BLOCK);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    /*
    action performed when key was pressed
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        //direction change to left so direction can't be right
        if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
            leftDirection = true;
            upDirection = false;
            downDirection = false;
        }

        //direction change to right so direction can't be left
        if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
            rightDirection = true;
            upDirection = false;
            downDirection = false;
        }

        //direction change to up so direction can't be down
        if ((key == KeyEvent.VK_UP) && (!downDirection)) {
            upDirection = true;
            rightDirection = false;
            leftDirection = false;
        }

        //direction change to down so direction can't be up
        if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
            downDirection = true;
            rightDirection = false;
            leftDirection = false;
        }
    }


}
