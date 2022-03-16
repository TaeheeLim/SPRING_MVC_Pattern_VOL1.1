package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private static final Logger logger = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "spring";

        System.out.println("name = " + name);

        log.trace("trace log={}", name);

        //이렇게 하면 안된다.
        //현재 logging level 은 debug 라서 trace 는 출력이 되지도 않는데 불필요한 연산이 일이나서 자원을 사용한다.
        log.trace("trace my log=" + name);

        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);

        return "ok";
    }
}
