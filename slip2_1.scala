object slip2_1
{
    def main(args: Array[String])
    {
        println("enter five random numer")
        for(i<-0 until 5)
        {
            var a =Console.readInt
            println("BINARY OF :"+a)
            binary(a)
            println("octal OF :"+a)
            octal(a)
        }
        def binary(n:Int)
        {
            var binary = Integer.toBinaryString(n);
            println(binary)
        }
        def octal(n:Int)
        {
            var oct = Integer.toOctalString(n);
            println(oct)
        }
    }
}