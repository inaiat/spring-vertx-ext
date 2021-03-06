
/*
 * Copyright (C) 2014
 *
 * [SpringContextConfiguration.java]
 * vertx-spring-mod (https://github.com/amoAHCP/spring-vertx-mod)
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.jacpfx.vertx.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * This Spring configuration adds a verticle lifecycle aspect to ensure that all spring verticle closes the spring context when un deployed.
 * @author Andy Moncsek
 */
@Configuration
@EnableAspectJAutoProxy
public class SpringContextConfiguration {

    @Bean
    /**
     * Returns the lifecycle aspect
     */
    public VertxLifecycleAspect vertxLifecycleAspect() {
        return new VertxLifecycleAspect();
    }
}
