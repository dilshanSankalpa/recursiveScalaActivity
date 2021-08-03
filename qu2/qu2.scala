object qu2 extends App{

    def isPrime(n : Int): Boolean = {
        var count : Int = 0;
        for(i<-2 to n){
            if(n%i == 0){
                count += 1;
            }
        }
        if (count > 1) false;
        else true;
    }

    def primeSeq(n : Int):Unit = {
        if(isPrime(n)) println(n);
        if(n > 2) primeSeq(n-1);
    }

    primeSeq(100);
}