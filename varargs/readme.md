# Varargs

## [ExpandVarargs](src/test/scala/org/varargs/example/ExpandVarargs.scala)
This small test case shows how to use an Array variable with a method, where the parameter is a vararg

method:

    method(input String*)
    
input:

    val input = Array("one", "two", "three")

usage:

    method(input: _*)