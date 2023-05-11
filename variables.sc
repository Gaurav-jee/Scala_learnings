val a = 13

print(a + "\n")

val hello: String = "hello"
print(hello + "\n")

var Hellothere: String = "hello"
Hellothere = Hellothere + "there"
print(Hellothere + "\n")

val number: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.1415689
val numberOne: Int = 1


println(f"pi is about $pi%.3f")
println(f"Zero Padding on the left: $numberOne%05d")

println(s"The the s prfix ins't limited to variables: I can include any expression ${1+2}")

val  theUltimateAnswer: String = "To life, the universe and everything is 42"
val pattern = """.* ([\d]+).*""".r

val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)


val test = "String valriable"
println(test)


val isGreater = 1 > 2
val isLesser = 1 < 2
val impossible = isGreater & isLesser
val anotherWay = isGreater && isLesser

val picard: String = "Picard"
val bestCaption: String = "Picard"
val isBest: Boolean = picard == bestCaption

println(isBest)
