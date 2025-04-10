plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_1:module_1_117"))
    implementation(project(":layer_1:module_1_99"))
    implementation(project(":layer_1:module_1_122"))
    implementation(project(":layer_1:module_1_132"))
    implementation(project(":layer_1:module_1_105"))
}
        