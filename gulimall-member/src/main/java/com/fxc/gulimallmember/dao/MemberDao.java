package com.fxc.gulimallmember.dao;

import com.fxc.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 16:27:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
