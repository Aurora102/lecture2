package main;

import config.AppConfig;
import filehandle.HandleInput;
import objects.CountryInformation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunApp {
    public RunApp(){

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


        //HandleInput handleInput=new HandleInput();
        HandleInput handleInput=context.getBean("inputHandle",HandleInput.class);
        while (true) {

            String userInput=handleInput.getUserInput();
            System.out.println(userInput);

            CountryInformation thisInfo;

            if (userInput.equals("Finland")){
                thisInfo=new CountryInformation("Finland","saulu",5.2);
                thisInfo.showInfo();
            }

            if (userInput.equals("Germany")){
                thisInfo=new CountryInformation("Germany","Seehofer",50.2);
                thisInfo.showInfo();
            }

            if(userInput.equals("exit")){
                return;
            }
        }



    }
}
