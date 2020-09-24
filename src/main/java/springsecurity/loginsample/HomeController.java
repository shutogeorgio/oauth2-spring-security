package springsecurity.loginsample;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> getHome(){
        String res = "Hello, You're at Home";
        return ok().contentType(MediaType.TEXT_PLAIN).body(res);
    }
}
