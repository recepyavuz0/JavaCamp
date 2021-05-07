package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Member;

public interface GameSalesService {
	public void sale(Member member,Game game); 
	public void sale(Member member,Game game,Campaign campaign);
}
