package Data.Customers;

/**
 * @Author Aidan Stewart
 * @Year 2018
 * Copyright (c)
 * All rights reserved.
 */
public enum EmployeeType {
    ADMIN, EMPLOYEE, VENDOR, UNCONFIRMED;

    public static EmployeeType intToEmployeeType(int accountTypePermsInt){
        switch (accountTypePermsInt){
            case 0:
                return ADMIN;
            case 1:
                return EMPLOYEE;
            case 2:
                return VENDOR;
            case 3:
                return UNCONFIRMED;
        }
        return null;
    }

    public static int EmployeeTypeToInt(EmployeeType accountTypePerms){
        switch (accountTypePerms) {
            case ADMIN:
                return 0;
            case EMPLOYEE:
                return 1;
            case VENDOR:
                return 2;
            case UNCONFIRMED:
                return 3;
        }
        return 0;
    }
}
