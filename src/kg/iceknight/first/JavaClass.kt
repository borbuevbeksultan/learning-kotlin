package kg.iceknight.first

import java.io.Serializable

class JavaClass : Serializable {
    private var id: String? = null
    private var descriptor: String = ""

    constructor(id: String) {
        this.id = id
    }

    constructor(id: String, descriptor: String) {
        this.id = id
        this.descriptor = descriptor
    }

    fun printDescriptor() {
        println(descriptor)
    }

    companion object {

        val isClassJava: Boolean
            get() = true
    }

}
