package io.phanchoi.domain.blockchain.service

import io.phanchoi.domain.blockchain.model.vo.Transaction
import io.phanchoi.global.external.SolanaRpcClient
import org.springframework.stereotype.Service
import java.math.BigDecimal

/**
 * @author: Heejeong Choi
 * @description:
 */
@Service
class BlockChainService(
    private val solanaRpcClient: SolanaRpcClient
) {

    fun getBalance(address: String): Double {
        val response = solanaRpcClient.sendRpcRequest("getBalance", listOf(address))
        val balanceLamports = response?.get("result") as? Int?: 0

        // Trans Lamports to Solana
        return balanceLamports / 1_000_000_000.0
    }

    fun createTransaction(fromAddress: String, toAddress: String, amount: Double): Transaction {
        val transaction = Transaction(fromAddress, toAddress, amount)
        // should be created by private key
        // Need to create signature by using solana SDK or external library
        return transaction.copy(signature = "")
    }

    fun sendTransaction(transaction: Transaction): String {
        val response = solanaRpcClient.sendRpcRequest(
            "sendTransaction",
            listOf(transaction.signature?: throw IllegalArgumentException("Transaction must be signed")))

        return response?.get("result") as? String ?: throw IllegalArgumentException("Transaction failed!")
    }

}