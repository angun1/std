package std.inf.test.chap2.study.study;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import std.inf.test.chap1.Study;

@Repository
public interface StudyRepository extends JpaRepository<Study, Long>{

}
