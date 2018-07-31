package com.jda.objectorientedprograms;


import java.util.Queue;
import java.util.LinkedList;


public class DeckOfCardsQueue {
	public static void main(String args[]) {
		DeckOfCards deckofcards = new DeckOfCards();
		Card card;
		int count;
	
       Player player;
       Queue<Player>playerq= new LinkedList<>();
		for (int i = 1; i < 5; i++) {
			player=new Player();
			playerq.add(player);
			if (deckofcards.getTotalnoofcards() != 0) {
				System.out.println(deckofcards.getTotalnoofcards() + 1);
				System.out.println("cards of "+ i +"'s" + " person");
				count = 9;
				while (count != 0) {

					card = deckofcards.draw();
					player.getqueue().enqueue(card.toString());
					System.out.println(card);
					count--;
				}
			}
			System.out.println("---------------------------------------");

		}
		System.out.println("after shuffling");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(int i=1;i<5;i++)
		{  
			System.out.println("cards of person   "+i);
			player=playerq.remove();
			player.sortCards();
			player.printQueue();
			
			
			
		}
	}
}
