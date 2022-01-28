package com.citynationalcodechallenge.forcitynational

//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]

fun main(){

    val stack = MinStack()
    stack.push(-2)
    stack.push(0)
    stack.push(-3)
    println("getMin: ${stack.getMin()}")
    stack.pop()
    println("top: ${stack.top()}")
    println("getMin: ${stack.getMin()}")

}

class MinStack(){
    // create our "stack"
    private val stack = mutableListOf<Int>()
    // create variable for the "top" of our top
    private val lastIndex: Int
        get() = stack.size - 1

    // push element into stack
    fun push(element: Int) = stack.add(element)

    // pop last index
    fun pop() {
        stack.removeAt(lastIndex)
    }

    // get top element
    fun top() = stack[lastIndex]

    // get min element
    fun getMin(): Int = stack.minOrNull()!!
}