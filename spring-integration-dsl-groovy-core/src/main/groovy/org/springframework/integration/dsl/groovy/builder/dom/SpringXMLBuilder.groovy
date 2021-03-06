/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.springframework.integration.dsl.groovy.builder.dom

import groovy.lang.Closure

import java.util.Map
import org.springframework.context.ApplicationContext
import org.springframework.integration.dsl.groovy.IntegrationComponent

/**
 * Merge raw XML markup into the output stream
 * 
 * @author David Turanski
 *
 */
class SpringXMLBuilder extends IntegrationComponentDomBuilder {

	@Override
	protected void doBuild(Object builder, ApplicationContext applicationContext, IntegrationComponent component,
	Closure closure) {
		Closure c = component.beanDefinitions
		c.delegate = builder
		c.call()
	}
}
