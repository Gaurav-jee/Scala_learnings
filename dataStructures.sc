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

for (ship <- shipList) {println(ship)} 

// Map()
val backwardShips = shipList.map((ship: String) => {ship.reverse})
println(backwardShips)

// Reduce()

val numberList = List(1, 2, 3, 4, 5)
val sum = numberList.reduce( (x : Int, y: Int) => x + y )

println(sum)

//filter()
val iHateFives = numberList.filter( (x: Int) => x!= 5)
println(iHateFives)
val iHateThrees = numberList.filter( _ != 3)
println(iHateThrees)


//Concatenate lists
val moreNumbers = List(6, 7, 8)
val lotsOfNumbers = numberList ++ moreNumbers
println(lotsOfNumbers)

val reversed = numberList.reverse
println(reversed)

val sorted = reversed.sorted
println(sorted)

val lotsOfDuplicates = numberList ++ numberList

//Distinct values in list
val distinctValues = lotsOfDuplicates.distinct
println(distinctValues)

val maxValue = numberList.max 
println(maxValue)

val total = numberList.sum
println(total)

val hasThree = iHateThrees.contains(3)
println(hasThree)


// MAPs
val shipMap = Map("Kirk" -> "Enterprise", "picard" -> "Enterprise-D", "Sisko" -> "Deep Space nine", "Janeway" -> "Voyager")
println(shipMap("Janeway"))

println(shipMap.contains("Archer"))

val archerShip = util.Try(shipMap("Archer")) getOrElse "Unknown"
println(archerShip)

