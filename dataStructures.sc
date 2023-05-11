//Data Structures

//Tuples
// Immutable lists
val captainStuff = ("picard", "Enterprise-D", "NCC-1701-D")
println(captainStuff)

// println(captainStuff[0]) // not allowed 

// println(captainStuff._0) // not allowed 
println(captainStuff._1)
println(captainStuff._2)


//key value pairs
val picardShip = "picard" -> "Enterprise-D"
println(picardShip._2) 

// mix different types in tuple
val aBunchOfStuff = ("kirk", 1944, true)


// lists
// only one data type
// like a tuple more functionality

val shipList = List("Enterprise", "wewewe", "dfsdfsdfhdsf", "sd13984324fdf")

println(shipList(0))
println(shipList(1))
println(shipList(2))

println(shipList.head)
println(shipList.tail)

for 
