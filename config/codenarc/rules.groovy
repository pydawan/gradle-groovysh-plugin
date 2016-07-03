/*
* Copyright 2013 the original author or authors
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
ruleset {
    description 'Rules For Gradle Groovysh Plugin Project'
    ruleset('rulesets/basic.xml')
    ruleset('rulesets/braces.xml')
    ruleset('rulesets/concurrency.xml')
    ruleset('rulesets/convention.xml') {
		TrailingComma(enabled: false)
	}
    ruleset('rulesets/design.xml') {
        NestedForLoop(enabled: false)
    }
    ruleset('rulesets/dry.xml') {
        DuplicateListLiteral
        DuplicateMapLiteral
        DuplicateNumberLiteral
        DuplicateStringLiteral(enabled: false) // too much hassle
    }
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/formatting.xml')
    // generic rules need to be configured to be active and useful
    //ruleset('rulesets/generic.xml')
    IllegalRegex {
        name = 'TODO'
        priority = 2
        regex = /TODO/
        description = 'TODOs should not be commited'
    }

    // ruleset('rulesets/grails.xml')
    ruleset('rulesets/groovyism.xml') {
        GetterMethodCouldBeProperty(enabled: false)
    }
    ruleset('rulesets/imports.xml')
    //ruleset('rulesets/jdbc.xml')
    ruleset('rulesets/junit.xml')
    ruleset('rulesets/logging.xml') {
        Println(enabled: false) // logging a hassle for a plugin that needs QUIET logLevel
    }
    ruleset('rulesets/naming.xml') {
        FactoryMethodName(enabled: false)
    }
    ruleset('rulesets/security.xml') {
        JavaIoPackageAccess(enabled: false) // gradle uses Java.io.File
    }
    ruleset('rulesets/serialization.xml')
    ruleset('rulesets/size.xml') {
        CrapMetric(enabled: false)
		ParameterCount(enabled: false)
    }
    ruleset('rulesets/unnecessary.xml') {
        UnnecessaryGetter(enabled: false)
        UnnecessaryReturnKeyword(enabled: false)
    }
    ruleset('rulesets/unused.xml')
}
