package com.BuyingSystem.service;

import com.BuyingSystem.model.Staff;

public interface StaffService {

    Staff selectStaffById(int staff_id);

    Staff selectStaffByName(String loginName);
}
