package com.mouredev.kotlinparaprincipiantes

/**
 * Created by MoureDev by Brais Moure on 2020-03-18.
 * www.mouredev.com
 */
class Programmer(val name: String,
                 var age: Int,
                 val languages: Array<Language>,
                 val friends: Array<Programmer>? = null) {

    enum class Language {
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code() {
        for (language in languages) {
            println("Estoy programando en $language")
        }
    }

}