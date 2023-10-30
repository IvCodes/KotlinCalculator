package com.example.tutet.models

class Calculator(private val number01:Double, private val number02:Double) {


    fun add():Double{
        return number01 + number02
    }

    fun subtract() = number01 - number02

    fun multiply() = number01 * number02

    fun divide() = number01 / number02

}