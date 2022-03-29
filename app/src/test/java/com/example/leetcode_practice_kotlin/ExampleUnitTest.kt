package com.example.leetcode_practice_kotlin

import com.example.leetcode_practice_kotlin.esay.LongestCommonPrefix
import com.example.leetcode_practice_kotlin.esay.ValidParentheses
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testLongestCommonPrefix() {
        val list = mutableListOf(
            "business", "bus", "busy", "button"
        )
        LongestCommonPrefix.getLongestCommon(list)
    }

    @Test
    fun testValidParentheses(){
        val inputList = mutableListOf(
            "()","()[]{}","(]","([)]","{[()]}","{[(]]}"
        )
        ValidParentheses.validParentheses(inputList)
    }
}