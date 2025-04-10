plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_2:module_2_134"))
    implementation(project(":layer_2:module_2_145"))
    implementation(project(":layer_2:module_2_161"))
}
        