object qu1 extends App{


   def isPrime(i: Int): Boolean =
    if (i <= 1)
        false
    else if (i == 2)
        true
    else
        !(2 until i).exists(n => i % n == 0)

    println(isPrime(8));
    println(isPrime(5));


}