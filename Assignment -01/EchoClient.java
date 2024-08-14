import java.net.ServerSocket;
import java.net.ServerSocket;
public class EchoClient
{
    public static void main(String[] args)
{
    try
    {
        System.out.println("Client Started");
        Socket soc=new socket("localhost",7896);

    }
    catch (Exception e)
    {
        e.printstackTrace();
        
    }
}
}