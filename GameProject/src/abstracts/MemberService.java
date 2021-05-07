package abstracts;

import entities.Member;

public interface MemberService {
	public void add(Member member);
	public void delete(Member member);
	public void update(Member member);
}
