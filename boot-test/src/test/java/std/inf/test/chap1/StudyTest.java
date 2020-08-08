package std.inf.test.chap1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import std.inf.test.chap2.study.study.StudyStatus;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class) // _ 언더스코어로 생성될걸 치환
class StudyTest {

	@Test
	@DisplayName("시간 이 늦은 경우 기대한 시간보다 넘어가면 바로 종료  ")
	void create_new_assertTimeoutPreemptively() {
		assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
			new Study(10);
			Thread.sleep(300);
		});

	}
	
	
	@Test
	@DisplayName("시간 이 늦은 경우 에러 발생 ")
	void create_new_assertTimeout() {
		assertTimeout(Duration.ofMillis(100), () -> {
			new Study(10);
			Thread.sleep(300);
		});

	}

	@Test
	@Disabled
	void create_new_study() {
		// 익셉션 발생 확인
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Study(-30));
		String message = exception.getMessage();
		assertEquals("인원은 0 보다 커야 한다.", message);
//
//		// Study study = new Study(-10);
//		// 1. 이렇게 작성할 경우 어느 하나가 앞에서 실패하면 뒤에 까지 진행하지 않음 전체를 작성하는 방법은 2번에
//		assertNotNull(study);
//		assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "시작시 상태는 DRAFT 여야 한다.");
//		assertTrue(study.getLimit() > 0, () -> " 인원수가 0 보다 커야 함 ");
//
//		// 2. assertAll 를 이용해서 전체로
//		assertAll(() -> assertNotNull(study),
//				() -> assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "시작시 상태는 DRAFT 여야 한다."),
//				() -> assertTrue(study.getLimit() > 0, () -> " 인원수가 0 보다 커야 함 "));
//
////		assertEquals(StudyStatus.DRAFT, study.getStatus(), new Supplier<String>() {
////			@Override
////			public String get() {
////				// TODO Auto-generated method stub
////				return "시작시 상태는 DRAFT 여야 한다.";
////			}
////		});
//		System.out.println("creater1 ");
	}

	@Test
	@Disabled
	@DisplayName("테스트 메서드 명 ")
	void test2() {

		Study study = new Study(-10);
		// 1. 이렇게 작성할 경우 어느 하나가 앞에서 실패하면 뒤에 까지 진행하지 않음 전체를 작성하는 방법은 2번에
		assertNotNull(study);
		assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "시작시 상태는 DRAFT 여야 한다.");
		assertTrue(study.getLimitCount() > 0, () -> " 인원수가 0 보다 커야 함 ");

		// 2. assertAll 를 이용해서 전체로
		assertAll(() -> assertNotNull(study),
				() -> assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "시작시 상태는 DRAFT 여야 한다."),
				() -> assertTrue(study.getLimitCount() > 0, () -> " 인원수가 0 보다 커야 함 "));

//				assertEquals(StudyStatus.DRAFT, study.getStatus(), new Supplier<String>() {
//					@Override
//					public String get() {
//						// TODO Auto-generated method stub
//						return "시작시 상태는 DRAFT 여야 한다.";
//					}
//				});
		System.out.println("creater1 ");

	}

	@BeforeAll
	static void beforAll() {
		System.out.println("beforAll");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("beforeEach");
	}

	@AfterEach
	void aftoerEach() {
		System.out.println("aftoerEach");
	}
}
