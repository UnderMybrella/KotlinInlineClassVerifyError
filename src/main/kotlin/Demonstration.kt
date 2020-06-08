inline class FirstTest(val ignored: String) {
    fun a() = ignored
    suspend fun b() = a().length
}

inline class SecondTest(val ignored: String) {
    fun a() = ignored
    fun b() = a().length
}

inline class ThirdTest(val ignored: String) {
    suspend fun a() = ignored
    suspend fun b() = a()
}

inline class FourthTest(val ignored: String) {
    fun a() = ignored
    fun b() = a()
}

inline class FifthTest(val ignored: String) {
    fun a() = ignored
    suspend fun b() {
        val a = a()
    }
}

inline class VerifyErrorOne(val ignored: String) {
    suspend fun a() = ignored
    suspend fun b() {
        val a = a()
    }
}

inline class VerifyErrorTwo(val ignored: String) {
    suspend fun a() = ignored
    suspend fun b() = a().length
}

inline class VerifyTestThree(val ignored: String) {
    suspend fun b() {
        val c = c()
    }
}

suspend fun c() {}

fun main() {
    val firstTest = FirstTest("")
    println(firstTest)
    val secondTest = SecondTest("")
    println(secondTest)
    val thirdTest = ThirdTest("")
    println(thirdTest)
    val fourthTest = FourthTest("")
    println(fourthTest)
    val fifthTest = FifthTest("")
    println(fifthTest)

    /** These break! */

    val verifyErrorOne = VerifyErrorOne("")
    println(verifyErrorOne)
    val verifyErrorTwo = VerifyErrorTwo("")
    println(verifyErrorTwo)
    val verifyTestThree = VerifyTestThree("")
    println(verifyTestThree)

}