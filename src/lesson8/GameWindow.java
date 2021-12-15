package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    static final int WINDOW_POS_X = 500;
    static final int WINDOW_POS_Y = 300;
    static final int WINDOW_POS_WIDTH = 500;
    static final int WINDOW_POS_HEIGHT = 666;
    private SettingWindow settingWindow;
    private BattleMap battleMap;


    public GameWindow() {
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_POS_WIDTH, WINDOW_POS_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Первая игра");

        settingWindow = new SettingWindow(this);
        battleMap = new BattleMap(this);
        add(battleMap);


        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton btnNewGame = new JButton("Start new game");
        JButton btnExit = new JButton("Exit");
        panel.add(btnNewGame);
        panel.add(btnExit);
        add(panel, BorderLayout.SOUTH);
        btnNewGame.setBackground(Color.GREEN);
        btnExit.setBackground(Color.ORANGE);

        btnExit.addActionListener(e -> System.exit(0));

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingWindow.setVisible(true);
            }
        });

        setVisible(true);
    }

    void startNewGame(int size, int winline) {
        battleMap.startNewGame(size, winline);
    }

}



