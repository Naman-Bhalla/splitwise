package dto;


public class ResponseDto<T> {
    String status;
    String error;
    T data;
}

/**
 * {
 *     status = ""
 *     error = ""
 *     data {
 *
 *     }
 * }
 */
