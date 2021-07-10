object qu3 extends App{
    def sumSeq(n : Int):Int = {
        if (n == 1) 1;
        else n + sumSeq(n-1);
    }

    println(sumSeq(5));
}