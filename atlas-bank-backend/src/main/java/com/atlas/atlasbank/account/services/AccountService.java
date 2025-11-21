package com.atlas.atlasbank.account.services;

import com.atlas.atlasbank.account.dtos.AccountDTO;
import com.atlas.atlasbank.account.entity.Account;
import com.atlas.atlasbank.auth_users.entity.User;
import com.atlas.atlasbank.enums.AccountType;
import com.atlas.atlasbank.res.Response;

import java.util.List;

public interface AccountService {
    Account createAccount(AccountType accountType, User user);

    Response<List<AccountDTO>> getMyAccounts();

    Response<?> closeAccount(String accountNumber);
}
