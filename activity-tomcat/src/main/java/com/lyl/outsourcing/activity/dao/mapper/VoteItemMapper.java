package com.lyl.outsourcing.activity.dao.mapper;

import com.lyl.outsourcing.activity.entity.VoteItem;
import com.lyl.outsourcing.activity.entity.VoteItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VoteItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    long countByExample(VoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    int deleteByExample(VoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    int insert(VoteItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    int insertSelective(VoteItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    List<VoteItem> selectByExample(VoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    VoteItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") VoteItem record, @Param("example") VoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") VoteItem record, @Param("example") VoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VoteItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_vote_item
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VoteItem record);
}