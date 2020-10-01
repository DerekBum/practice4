fun prime(n: Int): String {
    if (n == 1)
        return "No"
    for (num in 2 until n - 1) {
        if (n % num == 0)
            return "No"
    }
    return "Yes"
}

val Int.isPrime: String
    get() = prime(this)

fun main() {
    for (n in 1 until 1000)
        println(n.isPrime)
}