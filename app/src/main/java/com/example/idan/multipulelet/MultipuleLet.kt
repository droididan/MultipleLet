package com.example.idan.multipulelet

/**
 * Created by Idan Ayalon on 22/03/2018.
 * Multiple let implementation
 */
fun <T1: Any, T2: Any, R: Any> multipleLet(p1: T1?, p2: T2?, block: (T1, T2)->R?): R? {
    return if (p1 != null && p2 != null) block(p1, p2) else null
}
fun <T1: Any, T2: Any, T3: Any, R: Any> multipleLet(p1: T1?, p2: T2?, p3: T3?, block: (T1, T2, T3)->R?): R? {
    return if (p1 != null && p2 != null && p3 != null) block(p1, p2, p3) else null
}
fun <T1: Any, T2: Any, T3: Any, T4: Any, R: Any> multipleLet(p1: T1?, p2: T2?, p3: T3?, p4: T4?, block: (T1, T2, T3, T4)->R?): R? {
    return if (p1 != null && p2 != null && p3 != null && p4 != null) block(p1, p2, p3, p4) else null
}

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, R: Any> multipleLet(p1: T1?, p2: T2?, p3: T3?, p4: T4?, p5: T5?, block: (T1, T2, T3, T4, T5)->R?): R? {
    return if (p1 != null && p2 != null && p3 != null && p4 != null && p5 != null) block(p1, p2, p3, p4, p5) else null
}

fun <T: Any, R: Any> Collection<T?>.whenNotNull(block: (List<T>)->R) {
    if (this.all { it != null }) {
        block(this.filterNotNull())
    }
}

fun <T: Any, R: Any> Collection<T?>.whenAnyNotNull(block: (List<T>)->R) {
    if (this.any { it != null }) {
        block(this.filterNotNull())
    }
}