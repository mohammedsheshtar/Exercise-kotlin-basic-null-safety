fun main() {

    // part 1
    val age: Int = 24;
    // Uncommenting the line below will cause a compilation error because `age` is non-nullable
    // age = null;

    // part 2
    var cityName: String? = "Kuwait City";
    cityName = null;

    // part 3
    println("Part 3:")
    println("[*] ${cityName?.length}");

    // part 4
    println("\nPart 4:")
    println("[*] ${cityName?.length ?: 7}");

    // part 5
    println("\nPart 5:")
    println("[*] output when given a valid value: ${nullScore(7.0)}");
    println("[*] output when given a null value: ${nullScore(null)}");

}

fun nullScore(score: Double?): Double? {

    val checkScore: Double?  = score ?: 0.0;
    return checkScore;
}