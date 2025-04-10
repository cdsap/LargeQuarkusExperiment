plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_1:module_1_101"))
    implementation(project(":layer_1:module_1_95"))
}
        