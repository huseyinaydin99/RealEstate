package tr.com.huseyinaydin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("within(tr.com.huseyinaydin.controller..*) || within(tr.com.huseyinaydin.service..*)")
    public void applicationPackagePointcut() {
    }

    @Before("applicationPackagePointcut()")
    public void logBefore(JoinPoint joinPoint) {
        log.info("Giriş yapılıyor: {}.{}() parametrelerle = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), joinPoint.getArgs());
    }

    @AfterReturning(pointcut = "applicationPackagePointcut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        log.info("Çıkış yapılıyor: {}.{}() sonuçla = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), result);
    }
}
