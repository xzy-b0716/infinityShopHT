package com.xzy.mapper;

import com.xzy.beans.Orderitem;

public interface OrderitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer orderitemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int insert(Orderitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int insertSelective(Orderitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    Orderitem selectByPrimaryKey(Integer orderitemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Orderitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Orderitem record);
}