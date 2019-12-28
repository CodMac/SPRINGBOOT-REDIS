package zqit.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:zqit/redis/pulgins/redis/redis-config.properties", encoding = "utf-8")

@SpringBootApplication
public class RedisApp  extends SpringBootServletInitializer //需要打包为war时， 继承SpringBootServletInitializer，同时重写configure方法
{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RedisApp.class);
    }
	
	public static void main(String[] args) {
        SpringApplication.run(RedisApp.class, args);
    }
}