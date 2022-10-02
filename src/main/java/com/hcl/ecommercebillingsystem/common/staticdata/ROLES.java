package com.hcl.ecommercebillingsystem.common.staticdata;

public enum ROLES {
    ROLE_DEFAULT {
        public String toString() {
            return "DEFAULT_ROLE";
        }
    },
    SUPER_ADMIN_ROLE {
        public String toString() {
            return "SUPER_ADMIN_ROLE";
        }
    },
    CUSTOMER_ROLE {
        public String toString() {
            return "CUSTOMER_ROLE";
        }
    },
    EMPLOYEE_ROLE {
        public String toString() {
            return "EMPLOYEE_ROLE";
        }
    },
    VENDOR_ROLE {
        public String toString() {
            return "VENDOR_ROLE";
        }
    }
}
