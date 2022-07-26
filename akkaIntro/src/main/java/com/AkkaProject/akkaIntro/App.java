package com.AkkaProject.akkaIntro;

import java.io.IOException;

import akka.actor.typed.ActorSystem; 

public class App 
{
    public static void main( String[] args )
    {
    
    		    //#actor-system
    		    final ActorSystem<GreeterMain.SayHello> greeterMain = ActorSystem.create(GreeterMain.create(), "helloakka");
    		    //#actor-system

    		    //#main-send-messages
    		    greeterMain.tell(new GreeterMain.SayHello("Bot"));
    		    
    		    //#main-send-messages

    		    try {
    		      System.out.println(">>> Press ENTER to exit <<<");
    		      System.in.read();
    		    } catch (IOException ignored) {
    		    } finally {
    		      greeterMain.terminate();
    		    }
    		    
    		    
    		    
    		    
    		    
    		  
    }
}
