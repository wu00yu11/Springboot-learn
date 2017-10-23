import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class Ch01 {
    @RequestMapping("/")
    String index(){
        return "hell world"
    }

    static void main(String[] args) {
        SpringApplication app = new SpringApplication(Ch01.class)
        app.run(args)
    }
}
