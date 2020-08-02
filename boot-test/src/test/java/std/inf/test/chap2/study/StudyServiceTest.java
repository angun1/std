package std.inf.test.chap2.study;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import std.inf.test.chap2.study.member.MemberService;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {

	//2. @MOCK 어노테이션 사용해서 하는 방법 이건 그냥하면 어설쎤 에러가 남 그래서 확장 @ExtendWith(MockitoExtension.class) 사용해야 함 
	@Mock MemberService memberService;
	@Mock StudyRepository repository;

	@Test
	void test() {
//      1. mock static 메서드 사용해서 목객체 생성
//		MemberService memberService = mock(MemberService.class);
//		StudyRepository repository = mock(StudyRepository.class);

		StudyService studyService = new StudyService(memberService, repository);
	}

	@Test
	void test_parameter_usg(@Mock MemberService memberService, 	@Mock StudyRepository repository) {
//      1. mock static 메서드 사용해서 목객체 생성
//		MemberService memberService = mock(MemberService.class);
//		StudyRepository repository = mock(StudyRepository.class);

		StudyService studyService = new StudyService(memberService, repository);
		assertNotNull(studyService);
	}
}
