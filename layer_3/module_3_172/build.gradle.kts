plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_2:module_2_141"))
    implementation(project(":layer_2:module_2_154"))
    implementation(project(":layer_2:module_2_150"))
}
        