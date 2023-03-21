package com.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.api.model.entity.InterfaceInfo;

/**
* @author HYTZ
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-03-20 21:53:47
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * description 
     * 
     * @param  interfaceInfo,add 
     * @return void
     * @title validInterfaceInfo       
     * @author tianzhou
     * @date 2023/3/21 10:34
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
