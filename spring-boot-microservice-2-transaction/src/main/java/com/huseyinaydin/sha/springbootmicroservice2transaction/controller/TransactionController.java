package com.huseyinaydin.sha.springbootmicroservice2transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.huseyinaydin.sha.springbootmicroservice2transaction.model.Transaction;
import com.huseyinaydin.sha.springbootmicroservice2transaction.service.ITransactionService;

/**
 * @author Hüseyin Aydın
 * @date 17.04.2021
 * @time 12:40
 */
@RestController
@RequestMapping("api/transaction")//pre-path
public class TransactionController
{
    @Autowired
    private ITransactionService transactionService;

    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction)
    {
        return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
    }

    @DeleteMapping("{transactionId}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionId)
    {
        transactionService.deleteTransaction(transactionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllTransactionsOfUser(@PathVariable Long userId)
    {
        return ResponseEntity.ok(transactionService.findAllTransactionsOfUser(userId));
    }
}
