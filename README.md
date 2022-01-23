Precompiled script plugins and share and customize Gradle sample

https://docs.gradle.org/current/userguide/custom_plugins.html#sec:precompiled_plugins

When you create new library module, all you have to do is write this.

```kotlin
plugins {
    id("my.custom.library")
}

myCustomExtension {
    useCompose.set(true)
}
```