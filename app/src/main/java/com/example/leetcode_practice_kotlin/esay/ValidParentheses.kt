package com.example.leetcode_practice_kotlin.esay

import java.util.*
import kotlin.math.min

/**
 * 判断括号匹配是否正确
 *  Example 1:
 *  Input: "()"
 *  Output: true
 *  Example 2:
 *  Input: "()[]{}"
 *  Output: true
 *  Example 3:
 *  Input: "(]"
 *  Output: false
 *  Example 4:
 *  Input: "([)]"
 *  Output: false
 *  Example 5:
 *  Input:"{[]}"
 *  Output: true
 *  思路: 循环遍历字符串将左括号入栈，遇到右括号就判断栈顶的元素是否和该右括号匹配，
 *  如果匹配就将栈顶弹出，不匹配就直接返回false，循环结束后如果整个栈是空的那么就说明全部是匹配的
 */
object ValidParentheses {
    fun validParentheses(inputList: MutableList<String>) {
        val stack: Stack<Char> = Stack<Char>()
        inputList.forEach outLoop@{ input ->
            stack.clear()
            input.forEach {
                when (it) {
                    '(', '[', '{' -> stack.push(it)  //左括号系列 入栈
                    ')' -> if (stack.size > 0 && stack[stack.size - 1] == '(') {
                        stack.pop()
                    } else {
                        println("false")
                        return@outLoop
                    }
                    ']' -> if (stack.size > 0 && stack[stack.size - 1] == '[') {
                        stack.pop()
                    } else {
                        println("false")
                        return@outLoop
                    }
                    '}' -> if (stack.size > 0 && stack[stack.size - 1] == '{') {
                        stack.pop()
                    } else {
                        println("false")
                        return@outLoop
                    }
                }
            }
            println(stack.isEmpty())
        }
    }
}