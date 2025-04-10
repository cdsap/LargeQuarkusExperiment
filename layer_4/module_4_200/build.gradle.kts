plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_3:module_3_164"))
    implementation(project(":layer_3:module_3_173"))
    implementation(project(":layer_3:module_3_169"))
}
        