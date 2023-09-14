package school.hei.haapi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import school.hei.haapi.model.Exam;
import school.hei.haapi.model.Grade;
import school.hei.haapi.model.AwardedCourse;

@Repository
public interface GradeRepository extends JpaRepository<Grade, String> {
  List<Grade> getGradesByExam_Id(String examId);


  @Query("select g from Grade g where g.exam.awardedCourse.group.id = :group_id " +
          "and g.exam.awardedCourse.id = :awarded_course_id and g.exam.id = :exam_id and g.student.id = :student_id")
  Grade getGradeByExamIdAndStudentIdAndAwardedCourseIdAndGroupId(
          @Param("exam_id") String examId,
          @Param("awarded_course_id") String awardedCourseId,
          @Param("group_id") String groupId,
          @Param("student_id") String studentId
  );
  List<Grade> getGradesByStudentId(String studentId);

  List<Grade> getGradesByExamId(String examId);
}
