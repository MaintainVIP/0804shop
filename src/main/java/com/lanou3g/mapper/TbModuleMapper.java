package com.lanou3g.mapper;

import com.lanou3g.bean.TbModule;

public interface TbModuleMapper {
    int insert(TbModule record);

    int insertSelective(TbModule record);
}