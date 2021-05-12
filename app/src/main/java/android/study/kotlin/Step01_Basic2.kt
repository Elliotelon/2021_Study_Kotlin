package android.study.kotlin

fun main(){
    var myName="원숭이"
    var yourName="사자"

    var result="내이름:"+myName
    var result2="너의 이름:"+yourName

    var result3="내 이름:${myName}"
    var result4="너의 이름:${yourName}"
    //String 배열
    val names= listOf<String>("원숭이","사자","고양이")
    //배열의 방번호를 가지고 있는 객체
    val result5=names.indices;
    //반복문
    for(i in names.indices){
        println("${i} 번째 item:${names[i]}")
    }
    //반복문
    for(x in 1..10){
        println(x)
    }
    //반복문
    names.forEach{
        println(it)
    }
}