plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_1:module_1_125"))
    implementation(project(":layer_1:module_1_131"))
    implementation(project(":layer_1:module_1_113"))
    implementation(project(":layer_1:module_1_120"))
    implementation(project(":layer_1:module_1_104"))
    implementation(project(":layer_1:module_1_119"))
    implementation(project(":layer_1:module_1_105"))
    implementation(project(":layer_1:module_1_124"))
    implementation(project(":layer_1:module_1_132"))
    implementation(project(":layer_1:module_1_94"))
}
        