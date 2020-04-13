package jp.techacademy.takanari.kotlinlog

abstract class Animal{
    //プロパティ
    var name: String
    var age: Int
//    var hobby: String

    //引数付きコンストラクタ
    constructor(name:String, age: Int){
        this.name = name
        this.age = age
//        this.hobby = hobby

    }

    abstract fun say()
//    abstract fun think()
}