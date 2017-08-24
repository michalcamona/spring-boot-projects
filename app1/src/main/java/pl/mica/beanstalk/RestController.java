package pl.mica.beanstalk;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/getName")
    public String getAppName() {

        return "APP1 for Beanstalk AWS!";

    }

    @RequestMapping("/")
    public String healthCheck() {

        return "OK";

    }

}
