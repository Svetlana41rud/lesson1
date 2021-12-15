package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;
    private int size;
    private int winline;
    private boolean isInt;

    private int cellWidth;
    private int cellHeight;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.CYAN);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;
                if (!Logika.gameFinal) {

                    Logika.humanTurn(cellX, cellY);
                }
            }
        });
    }

    void startNewGame(int size, int winline) {

        this.size = size;
        this.winline = winline;

        isInt = true;
        repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInt) {
            return;
        }

        cellWidth = getWidth() / size;
        cellHeight = getHeight() / size;
        ((Graphics2D) g).setStroke(new BasicStroke(3f));
        for (int i = 1; i < size; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, getWidth(), y);
        }
        for (int i = 0; i < size; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, getHeight());

        }
        for (int i = 0; i < Logika.SIZE; i++) {
            for (int j = 0; j < Logika.SIZE; j++) {
                if (Logika.map[j][i] == Logika.DOT_X) {
                    drawX(g, i, j);
                }
                if (Logika.map[j][i] == Logika.DOT_O) {
                  drawO(g, i, j);
                }

                repaint();
            }
        }
        }


    private void drawX(Graphics g, int cellX, int cellY) {
        g.setColor(Color.RED);
        ((Graphics2D) g).setStroke(new BasicStroke(2f));

        g.drawLine(cellX * cellWidth, cellY * cellHeight,cellX * cellWidth + cellWidth, cellY * cellHeight + cellHeight);
        g.drawLine(cellX * cellWidth + cellWidth, cellY * cellHeight,cellX * cellWidth, cellY * cellHeight + cellHeight);

    }
    private void drawO(Graphics g, int cellX, int cellY ) {
        g.setColor(Color.GREEN);
        g.drawOval(cellX * cellWidth, cellY * cellHeight, cellWidth, cellHeight );

    }


}

