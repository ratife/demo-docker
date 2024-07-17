package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.net.NetworkInterface;

@RestController
public class Controller {

    @GetMapping("/")
    public String hello() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            String host = "Adresse IP de la machine locale : " + localHost.getHostAddress();
            /*
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    host += "<br> Interface: " + networkInterface.getName() + " - Adresse IP : " + inetAddress.getHostAddress();
                }
            }*/
            return "Hello, World java! " +  host;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Hello, World java !";
    }
}
