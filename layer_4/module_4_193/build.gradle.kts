plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_3:module_3_181"))
    implementation(project(":layer_3:module_3_176"))
    implementation(project(":layer_3:module_3_177"))
    implementation(project(":layer_3:module_3_173"))
}
        