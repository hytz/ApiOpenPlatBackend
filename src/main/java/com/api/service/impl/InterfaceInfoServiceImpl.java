package com.api.service.impl;

import com.api.mapper.InterfaceInfoMapper;
import com.api.model.entity.InterfaceInfo;
import com.api.service.InterfaceInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
* @author HYTZ
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-03-20 21:53:47
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo> implements InterfaceInfoService {
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {



    }
}




