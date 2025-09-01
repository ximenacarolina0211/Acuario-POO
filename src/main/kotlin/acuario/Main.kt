package acuario

fun construirAcuario() {
    //crear instancia y llamar imprimirTamano(), modificar alto y volver a imprimir
    val miAcuario = Acuario()
    miAcuario.imprimirTamano()
    miAcuario.alto = 60
    miAcuario.imprimirTamano()

    // Distintas formas de construir
    val acuario1 = Acuario()
    acuario1.imprimirTamano()
    // altura y largo por defecto
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()
    // ancho por defecto
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()
    // todo personalizado
    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()

    // Constructor secundario por número de peces
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()
    println("Volumen: ${acuario6.ancho * acuario6.largo * acuario6.alto / 100} l")

    // Getter/Setter de volumen
    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70
    acuario7.imprimirTamano()

    // Herencia y override
    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}

fun crearPeces() {
    val tiburon = Tiburon()
    val payaso = PezPayaso()
    println("Tiburón: ${tiburon.color}")
    tiburon.comer()
    println("Pez payaso: ${payaso.color}")
    payaso.comer()
}

fun main() {
    construirAcuario()
    crearPeces()
}