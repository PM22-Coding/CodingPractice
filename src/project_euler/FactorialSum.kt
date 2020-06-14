package project_euler

import java.math.BigInteger

class FactorialSum {

    fun factorialSum(n: Long): BigInteger {
        var fact = BigInteger.ONE
        var sum = BigInteger.ZERO
        for (i in 1..n) {
            fact = fact.multiply(BigInteger.valueOf(i.toLong()))
        }
        while (fact != 0.toBigInteger())
        {
            sum += fact % 10.toBigInteger()
            fact /= 10.toBigInteger()
        }
        return sum
    }
}

fun main(args: Array<String>) {
    val n : Long = 100
    val factorialSum = FactorialSum()
    val result = factorialSum.factorialSum(n)
    print(result)
}