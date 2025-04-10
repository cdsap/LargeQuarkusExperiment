plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_0:module_0_3"))
    implementation(project(":layer_0:module_0_68"))
    implementation(project(":layer_0:module_0_39"))
    implementation(project(":layer_0:module_0_67"))
}
        