package com.neueda.leap;


public class Main {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        String default_greeting = "egg";
        String env = "greeting";

        String env_greeting = System.getenv(env);

        if (env_greeting == null) {
            Greeter greeter = new Greeter();
            System.out.println(greeter.greet(env_greeting));
        }
        else {
            Greeter greeter = new Greeter();
            System.out.println(greeter.greet(default_greeting));

        }
 
        System.out.println("Container is up. Sleeping so you can docker ps / docker logs / docker exec into it.");
        Thread.sleep(600_000);
    }
}
