package com.example.leetcode_practice_kotlin.esay

import kotlin.math.min

/**
 * 从字符串数组中找出公共前缀
 *  Example 1:
 *  Input: ["flower","flow","flight"]
 *  Output: "fl"
 *  Example 2:
 *  Input: ["dog","racecar","car"]
 *  Output: ""
 */
object LongestCommonPrefix {
    fun  getLongestCommon( list : MutableList<String>) {
        var minLen = 0x7fffffff  //最大长度
        list.forEach {
            minLen = min(minLen, it.length)
        }
        for (i in 0 until list.size) {
            for (j in 0 until minLen) {
                if (list[0][j] != list[i][j]) {
                    println("common is :" + list[0].substring(0, j))
                    return
                }
            }
        }
        println("common is :" + list[0].substring(0, minLen))
    }
}