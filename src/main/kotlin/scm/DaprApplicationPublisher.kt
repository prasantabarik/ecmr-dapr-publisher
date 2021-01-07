package scm

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Dapr's HTTP callback implementation via SpringBoot.
 */
@SpringBootApplication(scanBasePackages = ["scm.controller.publisher"])

class DaprApplicationPublisher {
    /**
     * Starts Dapr's callback in a given port.
     * @param port Port to listen to.
     */
}
fun main() {
    val app = SpringApplication(DaprApplicationPublisher::class.java)
    app.run()
}