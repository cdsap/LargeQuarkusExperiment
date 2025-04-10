plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
}

dependencies {
    
    implementation(project(":layer_3:module_3_169"))
    implementation(project(":layer_3:module_3_178"))
    implementation(project(":layer_3:module_3_182"))
    implementation(project(":layer_3:module_3_183"))
    implementation(project(":layer_3:module_3_166"))
    implementation(project(":layer_3:module_3_170"))
    implementation(project(":layer_3:module_3_167"))
}
        