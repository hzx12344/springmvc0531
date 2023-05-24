package cn.edu.guet.service;

import cn.edu.guet.bean.Student;
import cn.edu.guet.common.ResponseData;

/**
 * @Author liwei
 * @Date 2023/5/24 20:36
 * @Version 1.0
 */
public interface StudentService {
    ResponseData saveStudent(Student stu);
    ResponseData getStudentList();
}
