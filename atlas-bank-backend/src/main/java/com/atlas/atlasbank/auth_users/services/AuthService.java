package com.atlas.atlasbank.auth_users.services;

import com.atlas.atlasbank.auth_users.dtos.LoginRequest;
import com.atlas.atlasbank.auth_users.dtos.LoginResponse;
import com.atlas.atlasbank.auth_users.dtos.RegistrationRequest;
import com.atlas.atlasbank.auth_users.dtos.ResetPasswordRequest;
import com.atlas.atlasbank.res.Response;

public interface AuthService {
    Response<String > register(RegistrationRequest request);
    Response<LoginResponse> login(LoginRequest loginRequest);
    Response<? > forgetPassword(String email);
    Response<? > updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest);
}
