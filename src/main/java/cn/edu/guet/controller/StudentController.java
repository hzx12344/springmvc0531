package cn.edu.guet.controller;

import cn.edu.guet.bean.Student;
import cn.edu.guet.common.ResponseData;
import cn.edu.guet.mvc.annotation.Controller;
import cn.edu.guet.mvc.annotation.RequestMapping;
import cn.edu.guet.service.StudentService;

/**
 * 这是一个控制器
 *
 * @Author liwei
 * @Date 2023/5/24 20:34
 * @Version 1.0
 */

@Controller
public class StudentController {

    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/saveStudent")
    public ResponseData saveStudent(Student stu) {
        return studentService.saveStudent(stu);
    }

    @RequestMapping("/getStudentList")
    public ResponseData getStudentList() {
        return studentService.getStudentList();
    }
}
