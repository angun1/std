package std.inf.test.chap2.study.study;

import java.util.Optional;

import std.inf.test.chap1.Study;
import std.inf.test.chap2.study.domain.Member;
import std.inf.test.chap2.study.member.MemberService;

public class StudyService {

	private final MemberService memberService;
	
	private final StudyRepository repository;

	public StudyService(MemberService memberService, StudyRepository repository) {
		assert memberService != null;
		assert repository != null;
		this.memberService = memberService;
		this.repository = repository;
	}
	
	public Study createNewStudy(Long memberId, Study study) {
		Optional<Member> member = memberService.findById(memberId);
//		if(member.isEmpty()) {
//			throw new IllegalArgumentException("member dosen't exist for id " + memberId);
//		}
		
		study.setOwner(member.orElseThrow(() -> new IllegalArgumentException("member dosen't exist for id " + memberId)));
		return repository.save(study);
	}
}
