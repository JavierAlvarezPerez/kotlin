fun main() {
    println(mayorDeTres(5, 10, 3))
    println(mayorDeTres(7, 7, 2))
    println(mayorDeTres(-5, -5, -5))
    println(mayorDeTres(0, -10, 5))

    println(calcularDescuento(600.0, true))
    println(calcularDescuento(300.0, false))
    println(calcularDescuento(45.0, true))
    println(calcularDescuento(150.0, false))

    println(convertirNota(95.5, "matematicas"))
    println(convertirNota(82.0, "historia"))
    println(convertirNota(65.3, "física"))
    println(convertirNota(45.0, "quimica"))
    println(convertirNota(105.0, "biologia"))
}

//EJER 1
fun mayorDeTres(a: Int, b: Int, c: Int): String {
    return if (a == b && b == c) {
        "los tres son iguales: $a"
    } else if (a == b && a > c) {
        "empate $a y $b"
    } else if (a == c && a > b) {
        "empate $a y $c"
    } else if (b == c && b > a) {
        "empate $b y $c"
    } else if (a > b && a > c) {
        "el mayor es $a"
    } else if (b > a && b > c) {
        "el mayor es $b"
    } else {
        "el mayor es $c"
    }
}
//EJER 2
fun calcularDescuento(montoTotal: Double, esClienteFrecuente: Boolean): String {
    var descuento = 0

    if (esClienteFrecuente) {
        if (montoTotal >= 500) descuento = 25
        else if (montoTotal >= 200) descuento = 15
        else if (montoTotal >= 50) descuento = 10
        else descuento = 5
    } else {
        if (montoTotal >= 500) descuento = 15
        else if (montoTotal >= 200) descuento = 10
        else descuento = 0
    }

    val totalPagar = montoTotal - (montoTotal * descuento / 100)

    return "monto original: $${"%.2f".format(montoTotal)} | " +
            "descuento: $descuento% | " +
            "total a pagar: $${"%.2f".format(totalPagar)}"
}

//EJER 3
fun convertirNota(nota: Double, curso: String): String {
    if (nota < 0 || nota > 100) {
        return "ERROR: inválida ($nota). Debe estar entre 0 y 100."
    }

    val letra: String
    val descripcion: String

    if (nota >= 90) {
        letra = "A"
        descripcion = "excelente"
    } else if (nota >= 80) {
        letra = "B"
        descripcion = "notable"
    } else if (nota >= 70) {
        letra = "C"
        descripcion = "aprobado"
    } else if (nota >= 60) {
        letra = "D"
        descripcion = "aprobado minimo"
    } else {
        letra = "F"
        descripcion = "reprobado"
    }

    return "curso: $curso | Nota: $nota → $letra ($descripcion)"
}

