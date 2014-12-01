package improgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joseph Ahrens
 */
public class ServerCommunicator {
    int response;
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    static String currentUser = "no one";
    static ArrayList buddies = new ArrayList();
    
    public ServerCommunicator(){
        
    }
    
    public int logIn(String username, String password) {
        try {
            String host = "localhost";
            socket = new Socket(host, 2001);
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.println("LOGIN");
            if(in.readLine().startsWith("Ok")){
                out.println(username);
                if(in.readLine().startsWith("Ok")){
                    out.println(password);
                    response = Integer.parseInt(in.readLine());
                }
                else{
                    System.out.println("Bad response from server.");
                }
            }
            else{
                System.out.println("Bad response from server.");
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return response;
    }
    
    public int logOut(String username){
        try {
            String host = "localhost";
            socket = new Socket(host, 2001);
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            out.println("LOGOUT");
            if(in.readLine().startsWith("Ok")){
                out.println(username);
                response = Integer.parseInt(in.readLine());
            }
            else{
                System.out.println("Bad response from server.");
            }
        }
        catch(IOException ex){
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
    
    public int register(String username, String password){
        try {
            String host = "localhost";
            socket = new Socket(host, 2001);
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            out.println("REGISTER");
            if(in.readLine().startsWith("Ok")){
                out.println(username);
                if(in.readLine().startsWith("Ok")){
                    out.println(password);
                    response = Integer.parseInt(in.readLine());
                }
                else{
                    System.out.println("Bad response from server");
                }
            }
            else{
                System.out.println("Bad response from server.");
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
    
    public int addBuddy(String username, String buddyname){
        try {
            String host = "localhost";
            socket = new Socket(host, 2001);
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            out.println("ADDBUDDY");
            if(in.readLine().startsWith("Ok")){
                out.println(username);
                if(in.readLine().startsWith("Ok")){
                    out.println(buddyname);
                    response = Integer.parseInt(in.readLine());
                }
                else{
                    System.out.println("Bad response from server.");
                }
            }
            else{
                System.out.println("Bad response from server.");
            }
        }
        catch(IOException ex){
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
    
    public int removeBuddy(String username, String buddyname){
        try {
            String host = "localhost";
            socket = new Socket(host, 2001);
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            out.println("REMOVEBUDDY");
            if(in.readLine().startsWith("Ok")){
                out.println(username);
                if(in.readLine().startsWith("Ok")){
                    out.println(buddyname);
                    response = Integer.parseInt(in.readLine());
                }
                else{
                    System.out.println("Bad response from server.");
                }
            }
            else{
                System.out.println("Bad response from server.");
            }
        }
        catch(IOException ex){
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
    
    public int sendIP(String username){
        try {
            String host = "localhost";
            socket = new Socket(host, 2001);
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.println("SENDIP");
            if(in.readLine().startsWith("Ok")){
                String ip = InetAddress.getLocalHost().toString();
                System.out.println("Sending " + ip);
                out.println(ip);
                if(in.readLine().startsWith("Ok")){
                    System.out.println("Sending " + username);
                    out.println(username);
                    response = Integer.parseInt(in.readLine());
                }
                else{
                    System.out.println("Bad response from server.");
                }
            }
            else{
                System.out.println("Bad response from server.");
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return response;
    }
    
    public String getCurrentUser(){
        return currentUser;
    }
    
    public void setCurrentUser(String username){
        currentUser = username;
    }
    
    public void getBuddyList(String username){
        try {
            String host = "localhost";
            socket = new Socket(host, 2001);
            
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            out.println("GETBUDDYLIST");
            if(in.readLine().startsWith("Ok")){
                out.println(username);
                if(in.readLine().startsWith("Ok")){
                    ArrayList buddyList = new ArrayList();
                    int numOfBuddies = Integer.parseInt(in.readLine());
                    for(int i = 0; i < numOfBuddies; i++){
                        buddyList.add(in.readLine());
                    }
                    buddies = buddyList;
                }
                else{
                    System.out.println("Bad response from server.");
                }
            }
            else{
                System.out.println("Bad response from server.");
            }
        }
        catch(IOException ex){
            Logger.getLogger(ServerCommunicator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}