package micronaut.jib

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller('/hello')
class HelloController {

    @Get('/{name}')
    String greet(String name) {
        "Hello $name"
    }
}