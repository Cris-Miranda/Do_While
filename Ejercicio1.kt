package Do_While

fun main(parametro: Array<String>) {
    var suma = 0
    do {
        print("Ingrese un valor (finalizar con 9999):")
        val valor = readln().toInt()
        if (valor != 9999)
            suma += valor
    } while (valor != 9999)
    println("El valor acumulado es $suma")
    if (suma==0)
        println("El valor acumulado es cero.")
    else
        if (suma>0)
            println("El valor acumulado es positivo.")
        else
            println("El valor acumulado es negativo")
}