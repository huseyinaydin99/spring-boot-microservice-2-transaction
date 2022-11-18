package com.huseyinaydin.sha.springbootmicroservice2transaction.service;

import java.util.List;

import com.huseyinaydin.sha.springbootmicroservice2transaction.model.Transaction;

/**
 * @author Hüseyin Aydın
 * @date 17.04.2021
 * @time 12:23
 */
public interface ITransactionService
{
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionsOfUser(Long userId);
}
