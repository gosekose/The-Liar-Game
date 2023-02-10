package liar.gamemvcservice.common.authentication.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApplyAspect {

    @Aspect
    public static class AllAuthentication {

        @Before("liar.gamemvcservice.common.authentication.aop.Pointcuts.allAuthentication()")
        public void beforeAuthentication(JoinPoint joinPoint) throws Throwable {
            log.info("[]");
        }

        @AfterReturning(value = "liar.gamemvcservice.common.authentication.aop.Pointcuts.allAuthentication()", returning = "result")
        public void allReturn(JoinPoint joinPoint, Object result) {
            log.info("[AfterReturning AllReturn Result] result = {}", result.toString());
        }

        @After(value = "liar.gamemvcservice.common.authentication.aop.Pointcuts.allAuthentication()")
        public void afterAuthentication(JoinPoint joinPoint) {
            log.info("[After all]");
        }

    }


}
