package com.xzy.mapper;


import com.xzy.beans.ProductClass;

public interface ProductClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_class
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer productClassId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_class
     *
     * @mbggenerated
     */
    int insert(ProductClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_class
     *
     * @mbggenerated
     */
    int insertSelective(ProductClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_class
     *
     * @mbggenerated
     */
    ProductClass selectByPrimaryKey(Integer productClassId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_class
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_class
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductClass record);
}