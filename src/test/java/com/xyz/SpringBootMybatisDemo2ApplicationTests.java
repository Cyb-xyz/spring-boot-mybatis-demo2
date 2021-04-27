package com.xyz;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xyz.dao.StudentMapper;
import com.xyz.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringBootMybatisDemo2ApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void save() {
        Student student = new Student();
        student.setName("lisi");
        student.setSex("男");
        student.setAddress("");
        student.setData_date("");
        System.out.println(studentMapper.save(student));
    }

    @Test
    public void update() {
        Student student = new Student();
        student.setId(45);
        student.setName("李四");
        student.setSex("女");
        student.setData_date("2021-03-03");
        System.out.println(studentMapper.update(student));
    }

    @Test
    public void delete() {
        System.out.println(studentMapper.delete(40));
    }

    @Test
    public void batchDelete() {
        int[] ids = new int[]{47, 48};
        System.out.println(studentMapper.batchDelete(ids));
    }

    @Test
    public void batchUpdate() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(studentMapper.batchUpdate(list));
    }

    @Test
    public void batchSave() {
        Student student1 = new Student("张三", 23, "男", "西安", 45, 78, "2021-07-08");
        Student student2 = new Student("张四", 44, "男", "南京", 45, 78, "2020-07-04");
        Student student3 = new Student("张五", 56, "男", "上海", 66, 89, "2023-09-09");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println(studentMapper.batchSave(studentList));
    }

    /**
     * 分页实例测试222
     */
    @Test
    public void getPageData() {
        //设置分页参数，pageNum：当前页数，pageSize：每页显示条数
        Page<Student> page = PageHelper.startPage(3, 3);
        List<Student> pageData = studentMapper.getPageData();
        for (Student student : pageData) {
            System.out.println(student.getName());
        }
//        System.out.println("总页数:"+page.getPages());
//        System.out.println("结束行号:"+page.getEndRow());
//        System.out.println("当前第几页:"+page.getPageNum());

        PageInfo<Student> pageInfo = page.toPageInfo();
        System.out.println("是否有上一页:"+pageInfo.isHasPreviousPage());
        System.out.println("上一页:"+pageInfo.getPrePage());
        System.out.println("是否有下一页:"+pageInfo.isHasNextPage());
        System.out.println("下一页:"+pageInfo.getNextPage());
        System.out.println("总记录数:"+pageInfo.getTotal());
        System.out.println("总页数:"+pageInfo.getPages());
        System.out.println("首页为:"+pageInfo.getFirstPage());
        System.out.println("尾页为:"+pageInfo.getLastPage());
        System.out.println("是否是首页:"+pageInfo.isIsFirstPage());
        System.out.println("是否为尾页:"+pageInfo.isIsLastPage());
        int[] pages = pageInfo.getNavigatepageNums();//获取逻辑分页页数
        for (int i : pages) {
            System.out.print(i+"\t");
        }
    }


















}
