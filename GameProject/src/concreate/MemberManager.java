package concreate;

import abstracts.*;
import entities.Member;

public class MemberManager implements MemberService{

	MemberCheckService checkService;
	
	public MemberManager(MemberCheckService checkService){
		this.checkService=checkService;
	}
	
	@Override
	public void add(Member member) {
		if(checkService.checkIfRealPerson(member)) {
			System.out.println(member.getUserName()+" isimli kullanýcý kayýt oldu.");	
		}
		else {
			System.out.println("Kullanýcý bilgileri doðrulanamadý.");
		}
		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getUserName()+" isimli kullanýcý hesabýný sildi.");
	}

	@Override
	public void update(Member member) {
		System.out.println(member.getUserName()+" isimli kullanýcý bilgilerini güncelledi.");
	}

}
