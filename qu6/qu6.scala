object qu6 extends App{

    def fib(n: Int): Int ={
        if(n <= 1 ) 1;
        else fib(n-1) + fib(n-2);
    }

    def fibSeq(i : Int): Unit = {

        if(i >= 0) fibSeq(i-1);
        println(fib(i));

    }


    fibSeq(10);
}