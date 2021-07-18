object qu5 extends App{


    def isEven(m:Int) : Boolean = {
        m match{
            case x if x% 2 == 0 => true;
            case _ => false;
        }
    }

    def evenSum(n : Int): Int = {
        n match{
            case 0 => 0;
            case x if isEven(x) => n + evenSum(n-1);
            case _ => 0 + evenSum(n-1);
        } 

    }

    println(evenSum(5));
}