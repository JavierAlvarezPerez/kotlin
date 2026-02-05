//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("hello world")
    saludar()
    concatenacion()
    interpolar()
    condicionar()
    saludarAlumnos()
    println(saludarAlumnos())
    val resultado = sumar(5.9, 6.0)
    println(resultado)
    condicionar()
    println(validarDatos(20, true))
}
//validar que una persona tenga el permiso de conducir y tambien la mayoria de edad
fun validarDatos(edad:Int, permiso: Boolean):Boolean{
    if(edad >= 18 && permiso) {
        return true
    }else{
        return false
    }
}
fun condiciones(color: String): Int{
    var numero = 0
    if (color == "black") {
        numero = 1
    }else if(color == "red") {
        numero = 2
    }else{
        numero = 0
    }
    return numero
}
fun sumar(valor1: Double, valor2: Double): Double {
    val suma = valor1 + valor2
    return suma + suma
}
fun saludarAlumnos() : String{
    val saludo = "hola a todos"
    return saludo
}
fun condicionar(){
    val edad = 20
    if (edad >= 18) {
        println("Eres mayor de $edad")
    }else{
        println("Eres menor de $edad")
    }
}
fun interpolar(){
    val nombre = "roldan"
    println("el nombre es $nombre")
}
fun concatenacion(){
    val nombre = "Patricia"
    val edad = 20
    val datos = "El nombre es" + nombre + "la edad" + edad
    println(datos)
}
fun saludar(){
    println("Saludando")
}