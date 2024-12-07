package com.example.app

fun main(){
    /* Assignment 1: Arrays
    ● Write a program that creates an array of integers with values from 1 to 10.
    Write a function that prints each element of the array using a for loop.
    ● Write a function that takes an array of integers as a parameter and returns the sum of its elements.
    ● Write a function that finds and returns the maximum value in an array of integers. */

    println("** Assignment 1")
    val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    fun printArrElements(){
        for (element in arr){
            println(element)
        }
    }
    printArrElements()

    fun sumArrElements(arr:IntArray) :Int{
        var sum = 0
        for (element in arr){
            sum += element
        }
        return sum
    }
    println("Sum of elements of array = ${sumArrElements(arr)}")

    fun maxArrElements(arr:IntArray) :Int{
        return arr.max()
    }
    println("Maximum value in an array = ${maxArrElements(arr)} \n")

    /* Assignment 2: Lists
    ● Write a function that takes a list of integers and returns a new list containing only the even numbers.
    ● Write a function that takes a list of integers and returns a list where each element is doubled. */

    println("** Assignment 2")
    val list = listOf(2,1,4,3,5,6,8,7)
    println("All elements in list : $list")
    fun evenListNum(list: List<Int>) :List<Int>{
        return list.filter { (it % 2) ==0 }
    }
    println("Even elements in list : ${evenListNum(list)}")

    fun doubleListNum(list: List<Int>) :List<Int> {
        return list.map { it * 2 }
    }
    println("Each element is doubled : ${doubleListNum(list)} \n")

    /* Assignment 3: Sets
    ● Write a function that takes two sets of integers and returns their union and intersection.
    ● Write a function that takes a list of integers and returns a set containing the unique elements of the list. */

    println("** Assignment 3")
    println("Union of two sets : " + unionIntersection(setOf(1,5,6,7,2),setOf(5,3,7,4)){
        set1,set2 -> set1.union(set2)
    })
    println("Intersection of two sets : " + unionIntersection(setOf(1,5,6,7,2),setOf(5,3,7,4)){
            set1,set2 -> set1.intersect(set2)
    })

    /* Assignment 4: Maps
    ● Create a map where the keys are the names of your friends and the values are their ages.
    Write a function that prints each key-value pair using a for loop.
    ● Write a function that takes a map of string keys and integer values, increases each value by 1, and    returns the updated map.
    ● Write a function that takes a map and a value, and returns the key associated with that value (if it exists). */

    println("\n** Assignment 4")
    val map = mapOf("Rabab" to 18,"Asmaa" to 20,"Esraa" to 23)
    fun printMap(map: Map<String,Int>){
        for ((key,value) in map){
            println("$key is $value years old")
        }
    }
    printMap(map)

    fun increaseValue(map: Map<String,Int>) :Map<String,Int>{
        return  map.mapValues { (_,value) -> value + 1}
    }
    println("Increase each value (1) : ${increaseValue(map)}")

    fun  keyValue(map: Map<String,Int>,value: Int) :String?{
        return map.filterValues { it == value }.keys.firstOrNull()
    }
    println("Key associated with value 18 : ${keyValue(map,18)}")

    /* Assignment 5: Loops
    ● Write a program that calculates and prints the sum of the first N natural numbers using a for loop.
    The value of N should be input by the user.
    ● Write a function that takes a positive integer and returns its factorial */

    println("\n** Assignment 5")
    println("Enter natural number")
    val n = readLine()?.toIntOrNull() ?: return println("Invalid input")
    var sum = 0
    if (n < 0){
        println("Invalid number")
    } else {
        for (number in 0..n){
            sum += number
        }
    }
    println("Sum of first $n natural numbers = $sum")

    fun factorial(n: Int) :Int{
        var result = 1
        if (n < 0){
            println("Invalid number")
        } else {
            for (number in 1..n){
                result *= number
            }
        }
        return result
    }
    println("Factorial of number $n is ${factorial(n)}")

}

fun unionIntersection(set1: Set<Int>,set2: Set<Int>,unionIntersection:(Set<Int>,Set<Int>) -> Set<Int>) :Set<Int>{
    return unionIntersection(set1,set2)
}