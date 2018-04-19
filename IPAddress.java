
import java.net.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satya Prakash
 */

public class IPAddress {
    public static void main(String args[])
    {
        try
        {
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println("The IP address of local host is " +ia);
       /*     ia = InetAddress.getByName(args[0]);
              System.out.println("the IP Address of "+args[0]+"is"+ia);    */
        }
        catch(UnknownHostException ue)
        {
            System.out.println("There is an error " + ue);
        }
    }
}
