/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u2;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

/**
 *
 * @author ICS4U-Calvin
 */
public class Calvin2048 extends javax.swing.JFrame {

    /**
     * Creates new form Calvin2048
     */
    private JLabel[][] jLabels;
    private int[][] data;

    private int score;
    private int highScore;
    private boolean gameOver;

    public Calvin2048() {
        initComponents();

        // START - INSERT INTO YOUR CONSTRUCTOR
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());

        // END - INSERT INTO YOUR CONSTRUCTOR
       

        //Create Array of JLabels
        jLabels = new JLabel[4][4];

        jLabels[0][0] = jLabel100;
        jLabels[0][1] = jLabel101;
        jLabels[0][2] = jLabel102;
        jLabels[0][3] = jLabel103;

        jLabels[1][0] = jLabel110;
        jLabels[1][1] = jLabel111;
        jLabels[1][2] = jLabel112;
        jLabels[1][3] = jLabel113;

        jLabels[2][0] = jLabel120;
        jLabels[2][1] = jLabel121;
        jLabels[2][2] = jLabel122;
        jLabels[2][3] = jLabel123;

        jLabels[3][0] = jLabel130;
        jLabels[3][1] = jLabel131;
        jLabels[3][2] = jLabel132;
        jLabels[3][3] = jLabel133;

        //Set Scores
        highScore = 0;
        
        //Create New Gameboard
        newGame();

    }

    //Colours
    
    //code
    private void newGame(){
        //Create Game Board
        data = new int[4][4];
        score = 0;
        gameOver = false; 
        
        //Place random two
        placeRandomTwo();
        placeRandomTwo();
        
        //Removes "GAME OVER"
        jLabelGameState.setText("");
        
        //Display Board
        updateGameboard();
    }
    
    private void updateGameboard() {
        int value;

        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                value = data[r][c];
                if (data[r][c] == 0) {
                    jLabels[r][c].setText("");
                } else {
                    jLabels[r][c].setText("" + data[r][c]);
                }

                //jLabels[r][c].setBackground( COLOUR_BG[3]);
                //jLabels[r][c].setBackground( COLOUR_BG[3]);
            }
        }

        // UPDATE SCORES
        jLabelBestScore.setText("" + highScore);
        jLabelScore.setText("" + score);
    }

    private boolean shiftLeft() {
        boolean moved = false;

        //SHift left, each row
        for (int row = 0; row < data.length; row++) {

            //Pass 3 times
            for (int pass = 0; pass < 3; pass++) {

                //Shift Left
                for (int col = 1; col < data[row].length; col++) {

                    //Shift?
                    if (data[row][col] > 0 && data[row][col - 1] == 0) {

                        data[row][col - 1] = data[row][col];
                        data[row][col] = 0;
                        moved = true;

                    }
                }
            }

        }

        return moved;
    }

    private boolean mergeLeft() {
        boolean moved = false;

        for (int row = 0; row < data.length; row++) {
            for (int col = 1; col < data[row].length; col++) {

                if (data[row][col - 1] == data[row][col]) {
                    data[row][col - 1] = data[row][col - 1] * 2;
                    score = score + data[row][col - 1];
                    data[row][col] = 0;
                    moved = true;
                }
            }
        }

        return moved;
    }

    private boolean shiftUp() {
        boolean moved = false;

        //Shift left, each row
        for (int col = 0; col < data.length; col++) {

            //Pass 3 times
            for (int pass = 0; pass < 3; pass++) {

                //Shift Left
                for (int row = 1; row < data[col].length; row++) {

                    //Shift?
                    if (data[row][col] > 0 && data[row - 1][col] == 0) {

                        data[row - 1][col] = data[row][col];
                        data[row][col] = 0;
                        moved = true;

                    }
                }
            }

        }

        return moved;
    }

    private boolean mergeUp() {
        boolean moved = false;

        for (int col = 0; col < data.length; col++) {
            for (int row = 1; row < data[col].length; row++) {

                if (data[row - 1][col] == data[row][col]) {
                    data[row - 1][col] = data[row - 1][col] * 2;
                    score = score + data[row - 1][col];
                    data[row][col] = 0;
                    moved = true;
                }
            }
        }

        return moved;
    }

    private boolean shiftRight() {
        boolean moved = false;

        //SHift left, each row
        for (int row = 0; row < data.length; row++) {

            //Pass 3 times
            for (int pass = 0; pass < 3; pass++) {

                //Shift Right
                for (int col = data[row].length - 2; col >= 0; col--) {

                    //Shift?
                    if (data[row][col] > 0 && data[row][col + 1] == 0) {

                        data[row][col + 1] = data[row][col];
                        data[row][col] = 0;
                        moved = true;

                    }
                }
            }

        }

        return moved;

    }//Method

    private boolean mergeRight() {
        boolean moved = false;

        for (int row = 0; row < data.length; row++) {
            for (int col = data[row].length - 2; col >= 0; col--) {

                if (data[row][col + 1] == data[row][col]) {
                    data[row][col + 1] = data[row][col + 1] * 2;
                    score = score + data[row][col+1];
                    data[row][col] = 0;
                    moved = true;
                }
            }
        }

        return moved;
    }
    
        private boolean shiftDown() {
        boolean moved = false;

        //Shift left, each row
        for (int col = 0; col < data.length; col++) {

            //Pass 3 times
            for (int pass = 0; pass < 3; pass++) {

                //Shift Down
                for (int row = data.length - 2; row >= 0; row--) {

                    //Shift?
                    if (data[row][col] > 0 && data[row + 1][col] == 0) {

                        data[row + 1][col] = data[row][col];
                        data[row][col] = 0;
                        moved = true;

                    }
                }
            }

        }

        return moved;
    }

    private boolean mergeDown() {
        boolean moved = false;

        for (int col = 0; col < data.length; col++) {
            for (int row = data.length - 2; row >= 0; row--) {

                if (data[row + 1][col] == data[row][col]) {
                    data[row + 1][col] = data[row + 1][col] * 2;
                    score = score + data[row+1][col];
                    data[row][col] = 0;
                    moved = true;
                }
            }
        }

        return moved;
    }

    private void placeRandomTwo() {
        int r, c;
        boolean found = false;

        do {
            r = (int) (Math.random() * 4);
            c = (int) (Math.random() * 4);

            if (data[r][c] == 0) {
                data[r][c] = 2;
                found = true;
            }

        } while (!found);

    }

    private boolean gameOverCheck() {

        //Empty Space?
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                if (data[r][c] == 0) {
                    return false;
                }
            }
        }

        // Horizontal
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length - 1; c++) {
                if (data[r][c] == data[r][c + 1]) {
                    return false;
                }
            }
        }

        //Vertical
        for (int c = 0; c < data.length; c++) {
            for (int r = 0; r < data[c].length - 1; r++) {
                if (data[r][c] == data[r + 1][c]) {
                    return false;
                }
            }
        }

        return true;

    }

    private class MyDispatcher implements KeyEventDispatcher {

        @Override
        public boolean dispatchKeyEvent(KeyEvent evt) {
            if (!gameOver && evt.getID() == KeyEvent.KEY_PRESSED) {

                boolean moved = false;

                System.out.print("KEY PRESSED: ");

                switch (evt.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        System.out.println("UP");
                        moved = shiftUp();
                        moved = mergeUp() || moved;
                        moved = shiftUp() || moved;
                        System.out.println("MOVED UP " + moved);
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("DOWN");
                        moved = shiftDown();
                        moved = mergeDown() || moved;
                        moved = shiftDown() || moved;
                        System.out.println("MOVED DOWN " + moved);
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("LEFT");
                        moved = shiftLeft();
                        moved = mergeLeft() || moved;
                        moved = shiftLeft() || moved;
                        System.out.println("MOVED LEFT " + moved);
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("RIGHT");
                        moved = shiftRight();
                        moved = mergeRight() || moved;
                        moved = shiftRight() || moved;
                        System.out.println("MOVED RIGHT " + moved);
                        break;
                }

                if (moved) {
                    placeRandomTwo();
                    updateGameboard();
                    if(gameOverCheck()){
                        jLabelGameState.setText("GAME OVER");
                        highScore = score;
                    }
                    
                }

            }
            return false;
        }
    }

// END OF CUT'N'PASTE
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelGameState = new javax.swing.JLabel();
        jPanelScoreBoard = new javax.swing.JPanel();
        jLabelBestScoreTitle = new javax.swing.JLabel();
        jLabelBestScore = new javax.swing.JLabel();
        jLabelScoreTitle = new javax.swing.JLabel();
        jLabelScore = new javax.swing.JLabel();
        jButtonNewGame = new javax.swing.JButton();
        jPanelGameBoard = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTitle.setBackground(new java.awt.Color(204, 204, 204));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("2048");

        jLabelGameState.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelGameState.setText("GAME OVER");

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelGameState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabelGameState)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanelScoreBoard.setBackground(new java.awt.Color(204, 204, 204));

        jLabelBestScoreTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBestScoreTitle.setText("HighScore:");

        jLabelBestScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBestScore.setText("0000");

        jLabelScoreTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelScoreTitle.setText("Score:");

        jLabelScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelScore.setText("0000");

        jButtonNewGame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonNewGame.setText("New Game");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelScoreBoardLayout = new javax.swing.GroupLayout(jPanelScoreBoard);
        jPanelScoreBoard.setLayout(jPanelScoreBoardLayout);
        jPanelScoreBoardLayout.setHorizontalGroup(
            jPanelScoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelScoreBoardLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelScoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelScoreBoardLayout.createSequentialGroup()
                        .addGroup(jPanelScoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelScoreTitle)
                            .addComponent(jLabelScore))
                        .addGap(40, 40, 40)
                        .addGroup(jPanelScoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelBestScoreTitle)
                            .addComponent(jLabelBestScore))))
                .addGap(22, 22, 22))
        );
        jPanelScoreBoardLayout.setVerticalGroup(
            jPanelScoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScoreBoardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelScoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBestScoreTitle)
                    .addComponent(jLabelScoreTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelScoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBestScore)
                    .addComponent(jLabelScore))
                .addGap(60, 60, 60)
                .addComponent(jButtonNewGame)
                .addGap(30, 30, 30))
        );

        jPanelGameBoard.setBackground(new java.awt.Color(204, 204, 204));

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("0000");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("0000");

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("0000");

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("0000");

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("0000");

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("0000");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("0000");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("0000");

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setText("0000");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("0000");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("0000");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("0000");

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("0000");

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("0000");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("0000");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("0000");

        javax.swing.GroupLayout jPanelGameBoardLayout = new javax.swing.GroupLayout(jPanelGameBoard);
        jPanelGameBoard.setLayout(jPanelGameBoardLayout);
        jPanelGameBoardLayout.setHorizontalGroup(
            jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanelGameBoardLayout.setVerticalGroup(
            jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGameBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanelScoreBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelScoreBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelGameBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        
        newGame();
        
    }//GEN-LAST:event_jButtonNewGameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calvin2048.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calvin2048.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calvin2048.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calvin2048.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calvin2048().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNewGame;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabelBestScore;
    private javax.swing.JLabel jLabelBestScoreTitle;
    private javax.swing.JLabel jLabelGameState;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelScoreTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelGameBoard;
    private javax.swing.JPanel jPanelScoreBoard;
    private javax.swing.JPanel jPanelTitle;
    // End of variables declaration//GEN-END:variables
}
