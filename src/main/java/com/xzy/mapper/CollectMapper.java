package com.xzy.mapper;

import com.xzy.beans.Collect;

import java.util.List;

public interface CollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer collectId);
    void deletebyproductid(Collect collect);
    void insertproduct(Collect collect);
    List<Integer> selectallbyuserid(Integer userid);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    int insert(Collect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    int insertSelective(Collect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    Collect selectByPrimaryKey(Integer collectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    Integer selectbyuserid(Integer userId);

    int updateByPrimaryKeySelective(Collect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Collect record);
}