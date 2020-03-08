package cn.hs.checkitemgroup.mapper;

import cn.hs.checkitemgroup.pojo.CheckItemGroup;
import cn.hs.checkitemgroup.pojo.CheckItemGroupExample;
import cn.hs.checkitemgroup.pojo.CheckItemGroupKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckItemGroupMapper {
    long countByExample(CheckItemGroupExample example);

    int deleteByExample(CheckItemGroupExample example);

    int deleteByPrimaryKey(CheckItemGroupKey key);

    int insert(CheckItemGroup record);

    int insertSelective(CheckItemGroup record);

    List<CheckItemGroup> selectByExample(CheckItemGroupExample example);

    CheckItemGroup selectByPrimaryKey(CheckItemGroupKey key);

    int updateByExampleSelective(@Param("record") CheckItemGroup record, @Param("example") CheckItemGroupExample example);

    int updateByExample(@Param("record") CheckItemGroup record, @Param("example") CheckItemGroupExample example);

    int updateByPrimaryKeySelective(CheckItemGroup record);

    int updateByPrimaryKey(CheckItemGroup record);


    /**
     * 自定义方法
     */
    //根据医院号和工作组id查找所有的检验项目组合id和名称
    List<CheckItemGroup> selectAllCheckItemGroup(@Param("hosNum") String hosNum, @Param("workGroupId") String workGroupId);
}