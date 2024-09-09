package com.dw.design.pattern.behavioral.strategy.test.configuration;

import com.dw.design.pattern.behavioral.strategy.test.strategy.InteractionStrategy;
import com.dw.design.pattern.behavioral.strategy.test.strategy.InteractionStrategyDispatcher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/23 16:55
 */
@Configuration
public class StrategyConfig {

    @Value("${interaction.strategy}")
    private Strategy strategy;

    @Bean
    public InteractionStrategyDispatcher deviceApiStrategyDispatcher(List<InteractionStrategy> interactionStrategyList) {
        return new InteractionStrategyDispatcher(interactionStrategyList, strategy);
    }

}
