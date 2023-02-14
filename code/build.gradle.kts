repositories {
    mavenCentral()
}

plugins {
    java
    groovy
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
    }
}

dependencies{
    testImplementation("org.apache.groovy:groovy:4.0.9")
    testImplementation("org.spockframework:spock-core:2.3-groovy-4.0")
}

tasks.compileJava { 
    options.compilerArgs.addAll(arrayOf("--enable-preview"))
}

tasks.test {
    useJUnitPlatform()
    jvmArgs("--enable-preview")
}
