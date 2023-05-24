package cn.edu.guet.service.impl;

import cn.edu.guet.bean.Student;
import cn.edu.guet.common.ResponseData;
import cn.edu.guet.dao.StudentDao;
import cn.edu.guet.service.StudentService;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/**
 * @Author liwei
 * @Date 2023/5/24 20:43
 * @Version 1.0
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public ResponseData saveStudent(Student stu) {
        try {
            int saveResult = studentDao.save(stu);
            if (saveResult == 1) {
                return new ResponseData("保存成功", 200);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return ResponseData.fail("保存失败");
    }

    @Override
    public ResponseData getStudentList() {
        return ResponseData.ok(studentDao.getObjects());
    }
}
