package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {

       int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };


        List<Word> words = detectAllWords(crossword, "home", "same", "pre", "nar","fsg",   "sgr", "darr" );
        /*int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'o', 's', 'o', 's'},
                {'l', 'o', 'o', 'o', 'o', 'o'},
                {'m', 's', 'o', 's', 'o', 's'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> words = (detectAllWords(crossword,  "sos") );*/
        System.out.println(words.size());
        for (Word word:words) {
            System.out.println(word);
        }

        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }



    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> word = new ArrayList<>();
        for (String w:words) {
            byte[] c = w.getBytes();

            for(int i = 0; i < crossword.length; i++)
                for(int j = 0; j < crossword[i].length; j++) {
                    if (crossword[i][j] == c[0]) {
                        int startI = (((i-1)==-1) ? i : i-1);
                        int startJ = (((j-1)==-1) ? j : j-1);
                        int endI = (((i+1) ==crossword.length) ? i : i+1);
                        int endJ = (((j+1) ==crossword[i].length) ? j : j+1);
                        for (int k = startI; k <= endI; k++)
                            for (int m = startJ; m <= endJ; m++) {
                                if ((i == k) && (j == m)) continue;
                                if (crossword[k][m] == c[1]) {
                                    Word s = LineSimbol(crossword, w, i, j, k, m);
                                    if (w.equals(s.text)) {
                                        word.add(s);
                                    }
                                }
                            }
                    }
                }
        }
        return word;
    }


    public static Word LineSimbol (int[][] crossword, String word, int xFirst, int yFirst, int secondSimX, int secondSimY) {

        String s = "";
        int countSim = word.length();
        int x = xFirst;
        int y = yFirst;
        int xLast = xFirst;
        int yLast = yFirst;

        if (secondSimX < x) {
            if (secondSimY < y) {
                while (x > -1 && y > -1 && (countSim--) > 0) {
                    s += (char) crossword[x][y];
                    xLast = x--;
                    yLast = y--;
                }
            }
            else if (secondSimY == y) {
                while (x > -1 && (countSim--) > 0) {
                    s += (char) crossword[x][y];
                    xLast = x--;
                }
                yLast = y;
            }
            else {
                while (x > -1 && y < crossword[x].length && (countSim --) > 0) {
                    s += (char) crossword[x][y];
                    xLast = x--;
                    yLast = y++;
                }
                System.out.println("Нашел " + s);
                String  text = "X = " + 2+ 2;
                System.out.println(text );
            }

        } else if (secondSimX > x) {
            if (secondSimY < y) {
                while (x < crossword.length && y > -1 && (countSim --) > 0) {
                    s += (char) crossword[x][y];
                    xLast = x++;
                    yLast = y--;
                }
            }
            else if (secondSimY == y) {
                while (x < crossword.length && (countSim --) > 0) {
                    s += (char) crossword[x][y];
                    xLast = x++;
                }
                yLast = y;
            }
            else {
                while (x < crossword.length && y < crossword[x].length && (countSim--) > 0) {
                    s += (char) crossword[x][y];
                    xLast = x++;
                    yLast = y++;
                }
                System.out.println("Нашел вниз " + s);

            }
        } else if (secondSimY < y) {
            while (y > -1 && (countSim--) > 0) {
                s += (char) crossword[x][y];
                yLast = y--;
            }
            xLast = x;
        }
        else {
            while  (y < crossword[x].length && (countSim--) > 0) {
                s += (char) crossword[x][y];
                yLast = y++;
            }
            xLast = x;
        }
        Word w = new Word(s);
        w.setStartPoint(yFirst, xFirst);
        w.setEndPoint(yLast, xLast);
        return w;
    }


    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
