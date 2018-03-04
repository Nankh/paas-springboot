package fr.nankh.paas.springboot.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeResource {

    @Autowired
    private Environment env;

    @RequestMapping(value = "/hello", produces = MimeTypeUtils.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String hello(String name){
      log.info("Retour Hello Controller - concatenation of hello + {}", name);
        return env.getProperty("app.name")+" -> "+"hello "+name;
    }
}
