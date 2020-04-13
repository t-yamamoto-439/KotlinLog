package jp.techacademy.takanari.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human = Human("山本",22)

        //dog.say()
        //Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        //Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        //val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        //bigdog.say()
        //Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        //Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        //dog.move()

        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。年は" + human.age + "歳です。（〜〜はメンバ変数から取得）")

//        human.think()



    }
}