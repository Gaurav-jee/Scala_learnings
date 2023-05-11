// Printing first n number in fibonacci sequence
var a = 0
var b = 1

println(a)
println(b)
for(x <- 1 to 10){
    var temp = b
    b = {a + b}
    a = temp
    println(b)
}


// function to find nth number in fibonacci sequence

def fibonacci(a: Int): Int = {
    if(a == 0){return 0}
    if(a == 1){return 1}
    else {
        return fibonacci(a-1) + fibonacci(a-2)
    }
}

println(fibonacci(10))
