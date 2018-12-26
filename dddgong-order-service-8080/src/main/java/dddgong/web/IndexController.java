package dddgong.web;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaoguokang on 2018/12/20
 */
@Controller
public class IndexController {
    @GetMapping
    @ResponseBody
    public String index() {
        return "我来自dddgong-order-service-8080";
    }
}
