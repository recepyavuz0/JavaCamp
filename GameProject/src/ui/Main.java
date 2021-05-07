package ui;

import adapter.MernisCheckManager;
import concreate.*;
import entities.*;

public class Main {

	public static void main(String[] args) {
		
		Member recep =new Member(1,"recepyavuz",
				"19033932684","Recep Cafer","Yavuz",1999,"recep@gmail.com","123456");
	
		Member ahmet =new Member(2,"ahmetcan",
				"19145786594","Ahmet","Can",1995,"ahmetcan@gmail.com","123456");
	
		Game pubg=new Game(1,"Pubg",70);
		Game csgo=new Game(1,"CsGo",50);
		
		Campaign campaign=new Campaign(1,"Pubg Yaz Ýndirimi",20);
		
		CampaignManager campaignManager=new CampaignManager();
		GameSalesManager gameSalesManager=new GameSalesManager();
		MemberManager memberManager=new MemberManager(new MernisCheckManager());
		
		memberManager.add(recep);
		System.out.println("-------------------------------");
		memberManager.add(ahmet);
		System.out.println("-------------------------------");
		campaignManager.add(campaign);
		System.out.println("-------------------------------");
		
		gameSalesManager.sale(recep, csgo);
		System.out.println("-------------------------------");
		gameSalesManager.sale(recep, pubg,campaign);
	
	}

}
