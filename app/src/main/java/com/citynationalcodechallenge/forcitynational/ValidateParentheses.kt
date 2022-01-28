package com.citynationalcodechallenge


import java.util.*

fun main() {
    println("is Valid: ${validParentheses("()")}") // true
    println("is Valid: ${validParentheses("()[]{}")}") // true
    println("is Valid: ${validParentheses("(}")}") // false
    println("is Valid: ${validParentheses("([)]")}") // false
    println("is Valid: ${validParentheses("{[]}")}") // true
}


fun validParentheses(inputString: String): Boolean {
    val newStack = Stack<Char>()

    for (ch in inputString) {

        // push starting brackets
        if (ch == '(' || ch == '[' || ch == '{') {
            newStack.push(ch)
        }

        // return empty if no empty
        if (newStack.isEmpty()) return false

        // check for ending bracket
        // pop top of stack for comparison
        val symbolCheck: Char
        when (ch) {
            ')' -> {
                symbolCheck = newStack.pop()
                if (symbolCheck == '{' || symbolCheck == '[')
                    return false
            }

            '}' -> {
                symbolCheck = newStack.pop()
                if (symbolCheck == '(' || symbolCheck == '[')
                    return false
            }

            ']' -> {
                symbolCheck = newStack.pop()
                if (symbolCheck == '(' || symbolCheck == '{')
                    return false
            }
        }
    }

    return newStack.isEmpty()
}