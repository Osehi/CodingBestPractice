class BankingService {

    fun performTransaction(accountNumber: String, amount: Double) {
        try {
            validateAccountNumber(accountNumber)
            validateTransactionLimit(amount)

            // Perform the transaction logic
            // (For simplicity, we assume the transaction is successful in this example)
            println("Transaction successful for account $accountNumber. Amount: $amount")
        } catch (e: InsufficientFundsException) {
            // Handle insufficient funds scenario
            println("Transaction failed: ${e.message}")
        } catch (e: InvalidAccountNumberException) {
            // Handle invalid account number scenario
            println("Transaction failed: ${e.message}")
        } catch (e: TransactionLimitExceededException) {
            // Handle transaction limit exceeded scenario
            println("Transaction failed: ${e.message}")
        }
    }

    private fun validateAccountNumber(accountNumber: String) {
        if (accountNumber.length != 10) {
            throw InvalidAccountNumberException(accountNumber)
        }
        // Additional validation logic
    }

    private fun validateTransactionLimit(amount: Double) {
        val transactionLimit = 1000.0
        if (amount > transactionLimit) {
            throw TransactionLimitExceededException(transactionLimit)
        }
        // Additional validation logic
    }
}

fun main() {
    // Example usage of the banking service
    val bankingService = BankingService()
    bankingService.performTransaction("1234567890", 500.0)  // Valid transaction
    bankingService.performTransaction("9876543210", 1500.0) // Exceeds transaction limit
}