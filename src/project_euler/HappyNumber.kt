package project_euler

class HappyNumber {
    fun isHappyNumber(n: Int): Boolean {

        if (n == 1 || n == 7) {
            return true
        }
        var sum = n
        var x = n
        while (sum > 9) {
            sum = 0
            while (x > 0) {
                val d = x % 10
                sum += d * d
                x /= 10
            }
            if (sum == 1) return true
            x = sum
        }
        return sum == 7
    }
}

fun main(args: Array<String>) {
    val n = 7
    val happyNumber = HappyNumber()
    if (happyNumber.isHappyNumber(n)) println("true") else println("false")
}