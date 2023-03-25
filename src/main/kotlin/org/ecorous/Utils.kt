package org.ecorous

import java.security.SecureRandom
import java.util.*

data class Account(val id: UUID, val username: String, val password: String?, val apiKey: String)
object Utils {
    fun generateApiKey(): String {
        val chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray()
        val random = SecureRandom()
        val sb = StringBuilder(32)
        for (i in 0 until 32) {
            sb.append(chars[random.nextInt(chars.size)])
        }
        return sb.toString()
    }
}