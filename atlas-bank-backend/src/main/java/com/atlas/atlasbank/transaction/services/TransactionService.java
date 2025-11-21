package com.atlas.atlasbank.transaction.services;

import com.atlas.atlasbank.res.Response;
import com.atlas.atlasbank.transaction.dtos.TransactionDTO;
import com.atlas.atlasbank.transaction.dtos.TransactionRequest;

import java.util.List;

public interface TransactionService {
    Response<?>createTransaction(TransactionRequest transactionRequest);
    Response<List<TransactionDTO>> getTransactionsForMyAccount(String accountNumber, int page, int size);
}
