package GameObjects;

import java.util.ArrayList;
import java.util.List;


public class Player {

	public List<SpielKarte> Hand = new ArrayList<SpielKarte>();
	public int WERT;
	public int handWert;
	
	public Player() {
		
	}
	
	public void showPlayerHand(){
		System.out.printf("\nPLAYER:");
		for (int Index = 0; Index < this.Hand.size(); Index++) {
			this.handWert += this.Hand.get(Index).WERT;
			System.out.printf("\n%s - %s\n",this.Hand.get(Index).FARBE,this.Hand.get(Index).NAME);
		}
	}
	
	
}
