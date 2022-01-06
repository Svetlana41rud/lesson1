package lesson8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingWindow extends JFrame {
    static final int WINDOW_POS_X = GameWindow.WINDOW_POS_X + 50;
    static final int WINDOW_POS_Y = GameWindow.WINDOW_POS_Y + 50;
    static final int WINDOW_POS_WIDTH = 400;
    static final int WINDOW_POS_HEIGHT = 300;

    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    private GameWindow gameWindow;


    private JSlider sliderFieldsize;
    private JSlider sliderWinline;

    private JButton btnNewGame;

    public SettingWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_POS_WIDTH, WINDOW_POS_HEIGHT);
        setTitle("Первая игра натсройки");
        setLayout(new GridLayout(5, 1));


        add(new Label("Field size: "));
        sliderFieldsize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        add(sliderFieldsize);
        sliderFieldsize.setMajorTickSpacing(1);
        sliderFieldsize.setPaintLabels(true);
        sliderFieldsize.setPaintTicks(true);

        add(new Label("Winline: "));
        sliderWinline = new JSlider(MIN_FIELD_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderWinline.setMajorTickSpacing(1);
        sliderWinline.setPaintLabels(true);
        sliderWinline.setPaintTicks(true);
        add(sliderWinline);

        sliderFieldsize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                sliderWinline.setMaximum(sliderFieldsize.getValue());
            }
        });

        btnNewGame = new JButton("Start ");
        add(btnNewGame);

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int size = sliderFieldsize.getValue();
                int winline = sliderWinline.getValue();


                Logika.SIZE = size;
                Logika.DOTS_TO_WIN = winline;
                Logika.initMap();
                Logika.gameFinal = false;

                gameWindow.startNewGame(size, winline);

                setVisible(false);
            }
        });

        setVisible(false);
    }


}
