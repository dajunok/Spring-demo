package liu.conditionalbean;

import java.util.Map;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.StandardMethodMetadata;

/*通过ConditionContext， 我们可以做到如下几点：
	借助getRegistry()返回的BeanDefinitionRegistry检查bean定义；
	借助getBeanFactory()返回的ConfigurableListableBeanFactory检查bean是否存在， 甚至探查bean的属性；
	借助getEnvironment()返回的Environment检查环境变量是否存在以及它的值是什么；
	读取并探查getResourceLoader()返回的ResourceLoader所加载的资源；
	借助getClassLoader()返回的ClassLoader加载并检查类是否存在。
*AnnotatedTypeMetadata则能够让我们检查带有@Bean注解的方法上还有什么其他的注解。 
*	借助isAnnotated()方法， 我们能够判断带有@Bean注解的方法是不是还有其他特定的注解。
 * 
 */
public class PetCondition implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//输出 org.springframework.core.type.StandardMethodMetadata
        System.out.println(metadata.getClass().getName()); 
        //强转
        StandardMethodMetadata standardMethodMetadata = (StandardMethodMetadata)metadata; 
        //AppConfig下的dog方法调用，输出dog
        System.out.println(standardMethodMetadata.getMethodName());
        
        Environment evn=context.getEnvironment();
        @SuppressWarnings("unused")
		String[] propertys=evn.getActiveProfiles();
        BeanDefinitionRegistry bdreg=context.getRegistry();
        ConfigurableListableBeanFactory cbf=context.getBeanFactory();
        ResourceLoader rl=context.getResourceLoader();
        //如果person
        return context.getEnvironment().getProperty("os.name").contains("Windows") && context.getRegistry().containsBeanDefinition("person") && !context.getRegistry().containsBeanDefinition("cat");


	}

}
