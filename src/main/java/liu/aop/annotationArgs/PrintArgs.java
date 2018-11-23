package liu.aop.annotationArgs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER})
public @interface PrintArgs {     //自定义注解@PrintArgs
	String value() default "";
	
	String name() default "";
}
