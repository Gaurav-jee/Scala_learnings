if (1 > 3) println("Impossible") else println("The World makes Sense")

if(1 > 3){
    println("Impossible")
    println("Really?")
}else {
    println("The world makes Sense")
    println("Still !")
}


val number = 3

number match {
    case 1 => println("One")
    case 2 => println("Two")
    case _ => println("Nothing")
}


for (x <- 1 to 4) {
    val squared = x * x
    println(squared)
}

var x = 10
while (x >= 0){
    println(x)
    x -= 1 
}

x = 0
do {
    println(x)
    x += 1
}
while(x <= 10)


{val x = 10; x + 30}
println({val x = 10; x + 30})



