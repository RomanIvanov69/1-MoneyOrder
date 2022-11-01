package ru.netology

fun main() {
    val amount: Int = 1000
    val minCommission: Int = 35
    val commission = if (amount * 0.075 > minCommission) {
        amount * 0.075
    } else minCommission
    println("При переводе: $amount рублей, комиссия составит: $commission рублей")
}