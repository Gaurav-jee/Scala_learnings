import scala.collection.mutable.ListBuffer

var divByThree = new ListBuffer[Int]() 

for(x: Int <- 1 to 20){
    if(x % 3 == 0) {
        println(x)
        divByThree += x
    }
}

println(divByThree.toList)

var numList = new ListBuffer[Int]() 
for(x: Int <- 1 to 20){
     println(x)
     numList += x
}

val divByThreess = numList.filter((x: Int) => {x % 3 == 0})
println(divByThreess.toList)
