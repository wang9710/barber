package com.barber.web.crm.dao;

import com.barber.web.entity.PeUsers;
import com.barber.web.crm.bo.UserBo;
import com.barber.web.crm.vo.GaCodeVo;
import com.barber.web.crm.vo.UsersVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PeUsersDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PeUsers record);

    int insertSelective(PeUsers record);

    List<PeUsers> selectByCondition(PeUsers record);

    List<UsersVo> selectUsersAndRoles(UserBo record);

    PeUsers selectByPrimaryKey(Integer id);

    /**
     * @return a
     * @Description 根据客户公司id查询工程师信息
    * @Param
     **/
    PeUsers selectEngineerByCust(Integer companiesId);
    /**
     * @return a
     * @Description 根据用户姓名查询用户登录信息
    * @Param
     **/
    GaCodeVo selectGacodeByName(String username);

    int updateByPrimaryKeySelective(PeUsers record);

    int updateByPrimaryKey(PeUsers record);
}