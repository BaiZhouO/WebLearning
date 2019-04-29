package com.BuyingSystem.service.impl;

import com.BuyingSystem.dao.StaffDao;
import com.BuyingSystem.model.Staff;
import com.BuyingSystem.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("StaffService")
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffDao staffDao;

    public Staff selectStaffById(int staff_id)
    {
        return staffDao.selectStaffById(staff_id);
    }
    public Staff selectStaffByName(String loginName)
    {
        return staffDao.selectStaffByName(loginName);
    }


}
