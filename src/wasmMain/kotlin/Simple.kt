import kotlinx.browser.document
import kotlinx.dom.appendText

fun main() {
    document.body?.let {
        val p1 = document.createElement("p")
        p1.appendText("Hello, ${greet()}!")
        it.appendChild(p1)

        val p2 = document.createElement("p")
        p2.appendText("Hello, ${greet("Hazel")}!")
        it.appendChild(p2)
    }
}

fun greet(name: String = "Renzo") = name