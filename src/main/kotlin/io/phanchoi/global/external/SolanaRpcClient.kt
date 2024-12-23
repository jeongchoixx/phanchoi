package io.phanchoi.global.external

import mu.KotlinLogging
import org.springframework.stereotype.Component
import org.springframework.web.client.HttpServerErrorException
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.postForObject
import com.portto.solana.web3.KeyPair
import com.portto.solana.web3.PublicKey
import com.portto.solana.web3.Transaction
import com.portto.solana.web3.wallet.SolanaCoin

/**
 * @author: Heejeong Choi
 * @description:
 */
@Component
class SolanaRpcClient {
/*
    private val log = KotlinLogging.logger {}
    private val restTemplate = RestTemplate()
    // TODO yml파일 처리
    private val rpcEndpoint = "https://api.mainnet-beta.solana.com"
    private val solana = SolanaCur("https://api.mainnet-beta.solana.com") // Solana RPC Endpoint


    fun sendRpcRequest(method: String, params: List<Any>): Map<String, Any>? {
        val requestBody = mapOf(
            "jsonrpc" to "2.0",
            "id" to 1,
            "method" to method,
            "params" to params
        )

        return try {
            restTemplate.postForObject(rpcEndpoint, method, requestBody, Map::class.java)
        } catch (e: HttpServerErrorException) {
            log.error { "occurred error while sending request: ${e.message}" }
            null
        }
    }

    fun sendSolTransaction(fromPrivateKey: String, toAddress: String, amount: Double): String {
        // 1 SOL = 1_000_000_000 Lamports
        val amountLamports = (amount * 1_000_000_000).toLong()

        // KeyPair 생성 (Private Key 기반)
        val senderKeyPair = KeyPair.fromSecretKey(fromPrivateKey.toByteArray())

        // Recipient Public Key 생성
        val recipientPublicKey = PublicKey(toAddress)

        // 트랜잭션 생성
        val transaction = Transaction().apply {
            addInstruction(
                Transaction.Companion.createTransferInstruction(
                    senderKeyPair.publicKey,
                    recipientPublicKey,
                    senderKeyPair.publicKey, // Fee payer
                    amountLamports
                )
            )
        }

        // 트랜잭션 서명
        transaction.sign(senderKeyPair)

        // 트랜잭션 전송
        val signature = solana.sendTransaction(transaction)
        println("Transaction sent. Signature: $signature")
        return signature
    }

    fun sendSplTokenTransaction(
        fromPrivateKey: String,
        toAddress: String,
        tokenMintAddress: String,
        amount: Double
    ): String {
        // SPL Token 전송은 토큰 계좌를 확인해야 함
        val amountLamports = (amount * 1_000_000).toLong() // Token 단위 변환

        // KeyPair 생성
        val senderKeyPair = KeyPair.fromSecretKey(fromPrivateKey.toByteArray())

        // Public Key 생성
        val recipientPublicKey = PublicKey(toAddress)
        val mintPublicKey = PublicKey(tokenMintAddress)

        // 트랜잭션 생성
        val transaction = Transaction().apply {
            addInstruction(
                Transaction.Companion.createTokenTransferInstruction(
                    senderKeyPair.publicKey,
                    recipientPublicKey,
                    mintPublicKey,
                    senderKeyPair.publicKey, // Fee payer
                    amountLamports
                )
            )
        }

        // 트랜잭션 서명
        transaction.sign(senderKeyPair)

        // 트랜잭션 전송
        val signature = solana.sendTransaction(transaction)
        println("SPL Token Transaction sent. Signature: $signature")
        return signature
    }*/
}