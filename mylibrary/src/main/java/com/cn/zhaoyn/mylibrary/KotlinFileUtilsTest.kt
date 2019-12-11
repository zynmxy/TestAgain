package com.cn.zhaoyn.datastatisticsdemo

/**
 * @Author zhaoyn
 * @Date 2019-12-11
 */
inline fun Int.testInline(): String {
    return this.toString()
}

fun Int.test(): String {
    return this.toString()
}