package dddgong.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xiaoguokang on 2018/12/21
 */
@Controller
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    @ResponseBody
    public String index() {
        ResponseEntity<String> templateForEntity = restTemplate.getForEntity("http://DDDGONG-ORDER-SERVICE/index", String.class);
        return templateForEntity.getBody();
    }
}
