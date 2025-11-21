package com.atlas.atlasbank.audit_dashboard.service;

import com.atlas.atlasbank.account.dtos.AccountDTO;
import com.atlas.atlasbank.auth_users.dtos.UserDTO;
import com.atlas.atlasbank.transaction.dtos.TransactionDTO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AuditorService {

    Map<String, Long> getSystemTotals();

    Optional<UserDTO> findUserByEmail(String email);

    Optional<AccountDTO> findAccountDetailsByAccountNumber(String accountNumber);

    List<TransactionDTO> findTransactionsByAccountNumber(String accountNumber);

    Optional<TransactionDTO> findTransactionById(Long transactionId);
}
