package com.jda.objectorientedprograms;

import java.util.Random;

import com.jda.utility.Utility2;

public class DeckOfCards1 {

	static int[][] cards = new int[4][13];	
	public static void main(String[] args) {
		DeckOfCards1 deckOfCards = new DeckOfCards1();	
		
		
		for (int i = 1; i <= 4; i++) {
			deckOfCards.allotCards(i);
			System.out.println("Player "  + i + " cards:");
			deckOfCards.print(i);
		}
		
		
	}
	

	void allotCards(int playerNumber) {
		for (int i = 0; i < 9; i++) {
			allotOneCard(playerNumber);
		}
	}
	


	void allotOneCard(int playerNumber) {
		Random random = new Random();

		int suit = random.nextInt(4);
		int rank = random.nextInt(13);
		
	
		if (cards[suit][rank] != 0) {
			allotOneCard(playerNumber);
		} else {
			cards[suit][rank] = playerNumber;
			System.out.println("At index  "+ suit + " " + rank + " " + "Player - " + playerNumber);
		
		}
	}

	void print(int playerNumber) {
		Utility2 utility = new Utility2();
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				if(cards[i][j] == playerNumber) {
					System.out.print(utility.getSuit(i) + "-" +utility. getRank(j) + " ");
				}
			}
		}
		System.out.println("\n");
	}
	


}