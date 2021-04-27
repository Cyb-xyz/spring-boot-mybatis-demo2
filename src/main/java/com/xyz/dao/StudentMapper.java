package com.xyz.dao;

import com.xyz.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 小宇宙
 * @Date: 2021-04-26 15:46
 */
@Mapper
public interface StudentMapper {
    /**
     *  根据id查询数据
     * @param id
     * @return
     */
    Student selectById(Integer id);

    /**
     *  查询全部数据
     * @return
     */
    List<Student> selectAll();

    /**
     *  新增数据
     * @param student
     * @return
     */
    int save(Student student);

    /**
     *  更新数据
     * @param student
     * @return
     */
    int update(Student student);

    /**
     *  根据id删除数据
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     *  批量删除数据
     * @param ids
     * @return
     */
    int batchDelete(int[] ids);

    /**
     * 批量更新---逻辑删除
     * @param ids
     * @return
     */
    int batchUpdate(List<Integer> ids);

    /**
     *  批量新增
     * @param studentList
     * @return
     */
    int batchSave(List<Student> studentList);

    /**
     *  分页查询
     * @return
     */
    List<Student> getPageData();
}
