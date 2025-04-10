plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_1:module_1_102"))
    implementation(project(":layer_1:module_1_130"))
    implementation(project(":layer_1:module_1_99"))
    implementation(project(":layer_1:module_1_123"))
    implementation(project(":layer_1:module_1_120"))
    implementation(project(":layer_1:module_1_108"))
}
        