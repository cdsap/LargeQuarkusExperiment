plugins {
    id ("java-library")
    id ("maven-publish")
    id ("jacoco")
    id("awesome.kotlin.plugin")
    id("io.quarkus")
}

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:3.15.1"))
  //  implementation(enforcedPlatform("io.quarkus.platform:quarkus-cxf-bom::3.15.1"))
    implementation(project(":layer_4:module_4_184"))
    implementation(project(":layer_4:module_4_185"))
    implementation(project(":layer_4:module_4_186"))
    implementation(project(":layer_4:module_4_187"))
    implementation(project(":layer_4:module_4_188"))
    implementation(project(":layer_4:module_4_189"))
    implementation(project(":layer_4:module_4_190"))
    implementation(project(":layer_4:module_4_191"))
    implementation(project(":layer_4:module_4_192"))
    implementation(project(":layer_4:module_4_193"))
    implementation(project(":layer_4:module_4_194"))
    implementation(project(":layer_4:module_4_195"))
    implementation(project(":layer_4:module_4_196"))
    implementation(project(":layer_4:module_4_197"))
    implementation(project(":layer_4:module_4_198"))
    implementation(project(":layer_4:module_4_199"))
    implementation(project(":layer_4:module_4_200"))
}
