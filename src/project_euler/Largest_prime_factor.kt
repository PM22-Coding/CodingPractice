package project_euler

//class Largest_prime_factor {
//
//    fun primeFactors(n: Long) {
//        var n = n
//        while (n % 2 == 0) {
//            print(2.toString() + " ")
//            n /= 2
//        }
//        var i: Long = 3
//        while (i <= Math.sqrt(n.toDouble())) {
//            while (n % i == 0) {
//                print("$i ")
//                n /= i
//            }
//            i += 2
//        }
//        if (n > 2) print(n)
//    }
//
//    fun main(args: Array<String>) {
//        val n = 600851475143
//        primeFactors(n)
//    }
//}