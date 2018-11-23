package liu.propertyplaceholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ImportResource("classpath:/liu/PropertyPlaceholder/spring-properties.xml")
public class PlaceholderConfig {
	@Bean("role")
	public Role getRole(@Value("${roleName}") String roleName, @Value("${roleCode}") String roleCode) {
		Role role = new Role();
		role.setRoleName(roleName);
		role.setRoleCode(roleCode);
		return role;
	}
	 
	 
	@Bean("user")
	public User getUser(Role role1, @Value("${userName}") String userName, @Value("${userAge}") int userAge) {
		User user = new User();
		user.setRole(role1);
		user.setUserName(userName);
		user.setUserAge(userAge);
		return user;
	}
	 
	 
	@Bean
	public PropertySourcesPlaceholderConfigurer getPropertyPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer propertyPlaceholder = new PropertySourcesPlaceholderConfigurer();
		ClassPathResource classPathResource = new ClassPathResource("/liu/PropertyPlaceholder/placeholder.properties");
		ClassPathResource classPathResource2= new ClassPathResource("/liu/PropertyPlaceholder/db.properties");
		propertyPlaceholder.setLocations(classPathResource,classPathResource2);
		propertyPlaceholder.setLocalOverride(true);
		return propertyPlaceholder;
	}
}
