package com.dailycodework.lakesidehotel.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Create a simple request model to hold authentication credentials.
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
