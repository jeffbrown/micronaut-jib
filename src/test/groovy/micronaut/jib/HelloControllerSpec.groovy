package micronaut.jib

import io.micronaut.context.ApplicationContext
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class HelloControllerSpec extends Specification {

    @Shared
    @AutoCleanup
    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    @Shared
    HttpClient client = HttpClient.create(embeddedServer.URL)


    void "test index"() {
        expect:
        client.toBlocking().retrieve('/hello/Jeff') == 'Hello Jeff'
    }
}
