package com.memorygame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class GameBoard extends JFrame implements ActionListener {
    private ArrayList<Tile> tiles;
    private ArrayList<JButton> buttons;
    private Tile firstSelectedTile;
    private JButton firstButton;
    private int pairsFound;

    public GameBoard() {
        initGame();
    }

    private void initGame() {
        tiles = new ArrayList<>();
        buttons = new ArrayList<>();
        firstSelectedTile = null;
        pairsFound = 0;

        // Create pairs of tiles
        for (int i = 1; i <= 8; i++) {  // Assuming 8 pairs
            tiles.add(new Tile(i));
            tiles.add(new Tile(i));
        }

        // Shuffle tiles
        Collections.shuffle(tiles);

        setLayout(new GridLayout(4, 4));  // Assuming 4x4 grid

        for (int i = 0; i < 16; i++) {
            JButton button = new JButton();
            button.addActionListener(this);
            buttons.add(button);
            add(button);
        }

        setTitle("Memory Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        int index = buttons.indexOf(clickedButton);
        Tile clickedTile = tiles.get(index);

        if (clickedTile.isFlipped()) return;

        clickedTile.flip();
        clickedButton.setText(String.valueOf(clickedTile.getId()));

        if (firstSelectedTile == null) {
            firstSelectedTile = clickedTile;
            firstButton = clickedButton;
        } else {
            if (firstSelectedTile.getId() == clickedTile.getId()) {
                pairsFound++;
                if (pairsFound == 8) {
                    JOptionPane.showMessageDialog(this, "You win!");
                }
            } else {
                Timer timer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clickedTile.flip();
                        firstSelectedTile.flip();
                        clickedButton.setText("");
                        firstButton.setText("");
                        firstSelectedTile = null;
                        firstButton = null;
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }
}
