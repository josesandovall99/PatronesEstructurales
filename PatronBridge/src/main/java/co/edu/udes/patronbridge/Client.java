    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.patronbridge;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Client {

    public static void main(String[] args) {
       
        Tv tv = new Tv();
        Remote remote = new BasicRemote(tv);
        remote.channelDown();
        

        Radio radio = new Radio();
        remote = new AdvancedRemote(radio);
        
    }

    
}
