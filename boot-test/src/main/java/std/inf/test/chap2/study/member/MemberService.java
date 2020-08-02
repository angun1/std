package std.inf.test.chap2.study.member;

import java.util.Optional;

import std.inf.test.chap2.study.domain.Member;

public interface MemberService {
//	void validate(Long memberid) throws InvalidMemberException;

	Optional<Member> findById(Long memberId) throws MemberNotFoundException;
	
	
	
	
}
