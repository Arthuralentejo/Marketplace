import io.javalin.Javalin

fun main() {
    val app = Javalin.create().start(3000)
    app.get("/") { ctx -> ctx.result("Hello World") }
}