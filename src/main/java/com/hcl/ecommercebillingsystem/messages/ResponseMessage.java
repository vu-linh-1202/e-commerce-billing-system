package com.hcl.ecommercebillingsystem.messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Came up with a Generic Response Type for all the endpoints available in the system
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage<T> {

    // EmployeeDTO, customerDTO,VendorDTO , StockDTO or OrderDTO
    private T responseClassType;

    private String message;

    private String messageType;

    /**
     *
     * @param classType
     * @param message
     * @param messageType
     * @return ResponseMessage
     * @param <T>
     */
    public static <T> ResponseMessage<T> withResponseData(T classType, String message, String messageType) {
        return new ResponseMessage<T>(classType, message, messageType);
    }

    /**
     *
     * @return ResponseMessage
     */
    public static ResponseMessage<Void> empty() {
        return new ResponseMessage<>();
    }

}
