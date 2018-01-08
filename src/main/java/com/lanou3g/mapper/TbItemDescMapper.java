package com.lanou3g.mapper;

import com.lanou3g.bean.TbItemDesc;

public interface TbItemDescMapper {
    int insert(TbItemDesc record);

    int insertSelective(TbItemDesc record);
}