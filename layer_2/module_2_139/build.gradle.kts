plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_1:module_1_98"))
    implementation(project(":layer_1:module_1_91"))
    implementation(project(":layer_1:module_1_119"))
    implementation(project(":layer_1:module_1_128"))
    implementation(project(":layer_1:module_1_90"))
    implementation(project(":layer_1:module_1_116"))
    implementation(project(":layer_1:module_1_93"))
}
        