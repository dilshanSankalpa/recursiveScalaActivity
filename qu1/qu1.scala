object qu1 extends App{



   def gcd(x: Int, y: Int): Int =  y match{
       case 0 => x;
       case y if (y>x) => gcd(y,x);
       case _ => gcd(y,x%y);
   } 

   def isPrime(i: Int , m: Int = 2 ): Boolean = m match{
       case x if(i == x) => true;
       case x if (gcd(i,x)>1) => false;
       case x => isPrime(i,x+1);

   }
    

    println(isPrime(8));
    println(isPrime(5));


}