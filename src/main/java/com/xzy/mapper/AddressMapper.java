package com.xzy.mapper;


import com.xzy.beans.Address;

import java.util.List;

public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer addressId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated
     */
    int insertSelective(Address record);

    /**
     * 根据id查询地址
     *
     * @mbggenerated
     */
    Address selectByPrimaryKey(Integer addressId);

    /**
     * 查询用户userId所有
     * @return
     */
    List<Address> selectUserAllAddress(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Address record);
}