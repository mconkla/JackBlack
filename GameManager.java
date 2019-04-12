package GameObjects;

public class GameManager {
	Dealer Geber = new Dealer();
	
	public GameManager() {
		
	}
	
	public void gameOver() {
		//TODO ist das Game zu Ende?
	}
	
	public void blackJack() {
		//TODO hat jemand blackJack?
	}
	
	
	public static void main(String[] args) {
		GameManager newGame = new GameManager();
		newGame.Geber.showDealerHand();
		System.out.println(newGame.Geber.handWert);
		
		
		newGame.Geber.Spieler.showPlayerHand();
		System.out.println(newGame.Geber.Spieler.handWert);
		
	}
	
}

