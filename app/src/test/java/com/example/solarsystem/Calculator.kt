package com.example.solarsystem

import org.junit.Test
//fun main(args: Array<String>) {}

class Calculator{

    @Test
    fun startCalculator(){

        try {
            print("Number 1: ")
            val string1: String? = readLine()
            val number1 = string1!!.toDouble()

            print("Number 2: ")
            val string2 = readLine()
            val number2 = string2!!.toDouble()

            print("Select an operation (+ - / *): ")
            val operation = readLine()

            val result: Double? =
                    when (operation) {
                        "+" -> addValues(number1, number2)
                        "-" -> subtractValues(number1, number2)
                        "*" -> multiplyValues(number1, number2)
                        "/" -> divideValues(number1, number2)
                        else -> throw Exception("Unknown operation")
                    }
            println("The answer is $result")
        } catch (e: NumberFormatException) {
            println("${e.message} is not a number")
        } catch (e: Exception) {
            println(e.message)
        }
    }

    private fun divideValues(number1: Double, number2: Double): Double? {
        return number1 / number2
    }

    private fun multiplyValues(number1: Double, number2: Double): Double? {
        return number1 * number2
    }

    private fun subtractValues(number1: Double, number2: Double): Double? {
        return number1 - number2
    }

    private fun addValues(number1: Double, number2: Double): Double? {
        return number1 + number2
    }

}