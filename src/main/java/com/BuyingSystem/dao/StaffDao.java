package com.BuyingSystem.dao;

import com.BuyingSystem.model.Staff;

public interface StaffDao {

    Staff selectStaffById(int staff_id);

    Staff selectStaffByName(String loginName);
}
