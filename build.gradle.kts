plugins {
    alias(libs.plugins.jvm)

    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api(libs.commons.math3)
}
