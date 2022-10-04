package com.hcl.ecommercebillingsystem.common;

import org.springframework.util.StringUtils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Utils {

    /**
     * This function used to get full name of user
     *
     * @param firstName
     * @param middleName
     * @param lastName
     * @return fullName
     */
    public static String getFullName(String firstName, String middleName, String lastName) {
        String fullName = null;
        if (StringUtils.isEmpty(firstName) && StringUtils.isEmpty(middleName) && StringUtils.isEmpty(lastName)) {
            return fullName;
        }
        if (StringUtils.isEmpty(middleName)) {
            fullName = new StringBuffer().append(firstName).append(" ").append(lastName).toString();
        } else {
            fullName = new StringBuffer().append(firstName).append(" ").append(middleName).append(" ").append(lastName).toString();
        }
        return fullName;
    }

    public static LocalDateTime currentDateTime() {
        return LocalDateTime.now();
    }

    /**
     * This function used to convert to local date time by  millis
     *
     * @param millis
     * @return dateTime
     */
    public static LocalDateTime convertToLocalDateTime(long millis) {
        Instant instant = Instant.ofEpochMilli(millis);
        LocalDateTime dateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        return dateTime;
    }
}
