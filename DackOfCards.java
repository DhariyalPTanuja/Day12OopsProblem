package com.assignments12oops;

public class DackOfCards {
    public static void main(String[] args) {
        String[] suits = { "Clubs","Spades","Hearts","Diamonds"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10" ,
                "Jack" ,"Queen", "King", "Ace"};

        int numberOfCards = suits.length * ranks.length ;
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < ranks.length; i++){
            for(int j =0 ; j< suits.length; j++){
                deck[suits.length*i+j] = ranks[i] + " of " + suits[j];
            }
        }
// shuffle
        for (int i = 0; i < ranks.length; i++){
            int r = i + (int) (Math.random() * (numberOfCards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print shuffled deck
        for (int i = 0; i < numberOfCards; i++) {
            System.out.println(deck[i]);
        }
        }

    }

