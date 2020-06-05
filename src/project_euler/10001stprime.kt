import java.util.*

class Prime {

    fun main(args: Array<String>) {
        var num = 1
        var count = 0
        var i: Int
        val sc = Scanner(System.`in`)
        println("Enter a number to find the nth prime number: ")
        val n = sc.nextInt()
        while (count < n) {
            num += 1
            println("nums $num")
            i = 2
            while (i <= num) {
                if (num % i == 0) {
                    println("i $i")
                    break
                }
                i++
            }
            if (i == num) {
                count += 1
                println("count $count")
            }
        }
        println("Value of nth prime is: $num")
    }
}