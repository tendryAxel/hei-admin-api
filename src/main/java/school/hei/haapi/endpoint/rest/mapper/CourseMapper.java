package school.hei.haapi.endpoint.rest.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import school.hei.haapi.endpoint.rest.model.Course;
import school.hei.haapi.endpoint.rest.model.CrupdateCourse;
import school.hei.haapi.endpoint.rest.model.Teacher;
import school.hei.haapi.model.User;

@Component
@AllArgsConstructor
public class CourseMapper {
  private final UserMapper userMapper;

  public Course toRest(school.hei.haapi.model.Course domain) {
    Teacher mainTeacher = userMapper.toRestTeacher(domain.getMainTeacher());
    return new Course()
        .id(domain.getId())
        .code(domain.getCode())
        .name(domain.getName())
        .credits(domain.getCredits())
        .totalHours(domain.getTotalHours());
  }

  public school.hei.haapi.model.Course toDomain(CrupdateCourse rest, User teacher) {
    return school.hei.haapi.model.Course.builder()
        .id(rest.getId())
        .code(rest.getCode())
        .name(rest.getName())
        .credits(rest.getCredits())
        .totalHours(rest.getTotalHours())
        .mainTeacher(teacher)
        .build();
  }
}
