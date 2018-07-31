package com.jda.objectorientedprograms;

import java.util.Random;

public class DeckOfCards {
	
	private Card[] cards;
	int noOfCards;

	DeckOfCards() {
		noOfCards = 51;
		cards = new Card[52];
		int x = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[x] = new Card(i, j);
				x++;
			}
		}

	}

	public Card draw() {
		Random random = new Random();
		int index = 0;
		
		while (cards[index] == null)
		{
			index = random.nextInt(52);
		}
		noOfCards--;
		Card temp = cards[index];
		cards[index] = null;
		return temp;

	}
	public int getTotalnoofcards()
	{
		return noOfCards;
	}

}
