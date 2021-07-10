object qu1 extends App{


   def isPrime(n : Int, m : Int = 2 , count : Int = 0): Boolean = {
        if(n == m && count == 0) true;
        if(count > 0) false;
        if(n%m == 0) isPrime(n,m+1,count+1);
        else isPrime(n,m+1,count);

   }

    println(isPrime(8));
    println(isPrime(5));

}