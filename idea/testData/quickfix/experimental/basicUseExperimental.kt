// "Add '@UseExperimental' annotation to 'bar'" "true"
// COMPILER_ARGUMENTS: -Xuse-experimental=kotlin.Experimental
// WITH_RUNTIME

package a.b

@Experimental
@Target(AnnotationTarget.CLASS)
annotation class MyExperimentalAPI

@MyExperimentalAPI
class Some {
    fun foo() {}
}

class Bar {
    fun bar() {
        Some().foo<caret>()
    }
}