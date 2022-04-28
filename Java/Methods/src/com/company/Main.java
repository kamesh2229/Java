package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(false,800,5,100);
        calculateScore(true,5000,5,100);


       int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Kamesh",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Vaishnavi",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Dhanya",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Venky",highScorePosition);

        if (score < 5000 && score < 1000) {
            System.out.println("Your score was less than 5000");
        } else if(score < 1000) {
            System.out.println("Your score was less than 1000 ");
        }
        else {
            System.out.println("Got here");
        }

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {


        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;

        }
        return -1;
    }


    public static void displayHighScorePosition(String playerName,int position) {
        System.out.println("managed " + playerName + " to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 100 && playerScore < 500) {
            System.out.println("Code Reached Here");
            return 3;
        } else if (playerScore >= 500 && playerScore < 1000)  {
            return 2;
        } else if (playerScore >= 1000)  {
            return 1;
        } else {
            return 4;
        }
    }

    }



