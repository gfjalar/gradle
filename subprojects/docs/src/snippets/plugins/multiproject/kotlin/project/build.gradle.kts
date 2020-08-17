// tag::plugins-on-subprojects[]
plugins {
    id("com.example.hello") version "1.0.0" apply false
    id("com.example.goodbye") version "1.0.0" apply false
}

subprojects {
    if (name.startsWith("hello")) {
        apply(plugin = "com.example.hello")
    }
}
// end::plugins-on-subprojects[]
