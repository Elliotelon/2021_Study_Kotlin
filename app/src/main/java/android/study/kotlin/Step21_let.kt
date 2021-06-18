package android.study.kotlin

fun main() {

    val number = 11

    val sumNumberStr = number?.let {
        print("${sum(10, it)}")
    }
}

fun sum(a : Int?, b : Int?) {
    if (a != null && b != null) a + b
}




