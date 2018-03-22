# MultipleLet

let operation in Kotlin takes an object and returns the result in a lambda expression where the `it` is the 
value. `.let?.` also can be used to check nullablity, so if the object is null the block will not run.

like so:
```
fun main(args: Array<String>) {
    var str = "Hello Kotlin"
    str?.let { println("$it!!") }
    println(str)

}
```
but what if we want to run `.let` block on multipule variables? or a collection of items?

`multipleLet` will let you check up to 5 variables
```
multipleLet(token, name) { token, name ->
            print("do something with token: $token  name: $name")
}
```
