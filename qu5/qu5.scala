object qu5 extends App{

    def evenSum(n : Int): Int = {
        if(n-1 == 0) 0;

        if((n-1)%2 == 0) n-1 + evenSum(n-1);
        else 0 + evenSum(n-1);

    }

    println(evenSum(5));
}