// functions

// format def <function name> (parameter name: type ...): return type = {
    
//}


def squareIt(x: Int): Int = {
    x * x
}

println(squareIt(3))

def cubeIt(x: Int): Int = {
    x * x * x
}

println(cubeIt(3))


def transformInt(x: Int, f:Int => Int): Int = {
    f(x)
}

val result = transformInt(2, cubeIt)
println (result)


println(transformInt(3, x => x * x * x))

println(transformInt(10, x => x / 2))

var res2 = transformInt(2, x => {val y = x * 2; y * y})
println(res2)


// function to convert a string to uppper case
// function literal to do the same 

def convertString(str: String): String = {
    str.toUpperCase
}

println(convertString("foo"))


def convertStringFunction(str: String, f: String => String): String = {
    return f(str);
}

println(convertStringFunction("foo", convertString))

println(3 + convertStringFunction("foo", x => x.toUpperCase))


