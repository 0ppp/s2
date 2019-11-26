object slip2_2
{
    def main(args: Array[String])
    {
        var cnt=0;
        var sum=0.00;
        var j=2;
        println("enter N1 and N2 ")
        var n1: Int= Console.readInt
        var n2: Int= Console.readInt
        for(i<-n1 until n2)
        {
                if(i%j==0)
                {
                  sum+=i
                    cnt+=1
                }
        }
        println("average of prime Number between $n1 & $n2: "+(sum/cnt) )
    }
}