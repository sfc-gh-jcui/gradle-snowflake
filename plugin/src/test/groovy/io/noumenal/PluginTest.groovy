/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package io.noumenal

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import spock.lang.Specification

/**
 * A simple unit test for the 'io.noumenal.gradle.snowflake' plugin.
 */
class PluginTest extends Specification {
   def "plugin registers task"() {
      given:
      def project = ProjectBuilder.builder().build()

      when:
      project.plugins.apply("io.noumenal.gradle.snowflake")

      then:
      project.tasks.findByName("shadowJar") != null
   }
}