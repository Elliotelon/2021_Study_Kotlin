package android.study.kotlin

import kotlin.random.Random


fun main() {

    Random.nextInt(100).also {
        print("$it")
    }
}





