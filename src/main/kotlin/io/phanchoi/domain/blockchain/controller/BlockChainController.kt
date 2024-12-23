package io.phanchoi.domain.blockchain.controller

import io.phanchoi.domain.blockchain.service.BlockChainService
import org.springframework.web.bind.annotation.*

/**
 * @author: Heejeong Choi
 * @description:
 */
@RestController
@RequestMapping("/v1/blockchain")
class BlockChainController(
    private val blockChainService: BlockChainService
) {

    @GetMapping("/balance")
    fun getBalance(@RequestParam address: String): Double {
        return blockChainService.getBalance(address)
    }

    @PostMapping("/transaction")
    fun sendTransaction(
        @RequestParam fromAddress: String,
        @RequestParam toAddress: String,
        @RequestParam amount: Double
    ): String {
        val transaction = blockChainService.createTransaction(fromAddress, toAddress, amount)
        return blockChainService.sendTransaction(transaction)
    }

}