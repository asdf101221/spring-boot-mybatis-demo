package mybatis.dao;

import mybatis.entity.user_info;

public interface user_infoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(user_info record);

    int insertSelective(user_info record);

    user_info selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(user_info record);

    int updateByPrimaryKey(user_info record);
}