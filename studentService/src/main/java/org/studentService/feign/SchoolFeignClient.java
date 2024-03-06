package org.studentService.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.studentService.dto.School;

@FeignClient("SCHOOL-SERVICE")
public interface SchoolFeignClient {
    @GetMapping("school/getSchool/{id}")
    public School fetchSchoolById(@PathVariable int id);
}
