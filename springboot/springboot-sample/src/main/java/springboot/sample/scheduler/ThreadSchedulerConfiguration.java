package springboot.sample.scheduler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class ThreadSchedulerConfiguration {

    @Bean
    public TaskScheduler poolScheduler() {
        final ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setThreadNamePrefix("testScheduler-");
        scheduler.setPoolSize(10);
        return scheduler;
    }
}
