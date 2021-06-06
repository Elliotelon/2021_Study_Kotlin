package android.study.kotlin

// 나이와 이름을 생성자의 인자로 전달받는 Person 클래스 정의하기
data class Person1 (val age: Int, val name: String)

fun main(){
    val p1=Person1(10, "김구라")
    val p2=Person1(22, "해골")
    val p3=Person1(8, "원숭이")
    val p4=Person1(44, "주뎅이")
    val p5=Person1(32, "덩어리")

    // Person List
    val persons=listOf(p1, p2, p3, p4, p5)

    //나이가 20 이상인 Person 객체를 찾아서 이름에 "님"을 붙인 List 얻어내기
    var result=persons.filter { it.age >= 20 }.map{it.name+"님"}
    println(result)

    //나이가 20살 이상인 사람의 숫자
    var result2=persons.count{ it.age >=20}
    //나이가 44살인 Person 객체
    var result3=persons.find{it.age == 44}

    println(result2)
    println(result3)
}