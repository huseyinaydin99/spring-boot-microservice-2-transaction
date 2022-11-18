package com.huseyinaydin.sha.springbootmicroservice2transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huseyinaydin.sha.springbootmicroservice2transaction.model.Transaction;
import com.huseyinaydin.sha.springbootmicroservice2transaction.repository.ITransactionRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Hüseyin Aydın
 * @date 17.04.2021
 * @time 12:24
 */
@Service
public class TransactionService implements ITransactionService
{
    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction)
    {
        transaction.setTransactionTime(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId)
    {
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public List<Transaction> findAllTransactionsOfUser(Long userId)
    {
        return transactionRepository.findAllByUserId(userId);
    }
}
