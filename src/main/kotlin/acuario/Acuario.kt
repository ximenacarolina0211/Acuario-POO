package acuario

import kotlin.math.PI

open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40
) {
    init {
        println("inicializando acuario")
    }
    init {
        // 1 litro = 1000 cm^3
        println("Volumen: ${ancho * largo * alto / 1000} l")
    }

    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    open val forma: String = "rectángulo"

    open var agua: Double = 0.0
        get() = volumen * 0.9

    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm Largo: $largo cm Alto: $alto cm")
        println("Volumen: $volumen l Agua: $agua l (${agua / volumen * 100.0}% lleno)")
    }

    constructor(numeroDePeces: Int) : this() {
        // 2,000 cm^3 por pez + espacio extra para que no se derrame
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }
}

class TanqueTorre(override var alto: Int, var diametro: Int) :
    Acuario(alto = alto, ancho = diametro, largo = diametro) {

    override var volumen: Int
        // área elíptica = π * r1 * r2
        get() = (ancho / 2.0 * largo / 2.0 * alto / 1000.0 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000.0 / PI) / (ancho / 2.0 * largo / 2.0)).toInt()
        }

    override var agua: Double = volumen * 0.8
    override val forma: String = "cilindro"
}
