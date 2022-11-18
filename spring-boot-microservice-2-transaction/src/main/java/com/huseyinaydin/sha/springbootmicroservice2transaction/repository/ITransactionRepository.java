package com.huseyinaydin.sha.springbootmicroservice2transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huseyinaydin.sha.springbootmicroservice2transaction.model.Transaction;

import java.util.List;

/**
 * @author Hüseyin Aydın
 * @date 17.04.2021
 * @time 11:23
 */
public interface ITransactionRepository extends JpaRepository<Transaction, Long>
{
    List<Transaction> findAllByUserId(Long userId);
}
