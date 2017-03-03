package com.ironyard.controller.rest;

import com.ironyard.api.ApiHelper;
import com.ironyard.dto.TIYResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rohanayub on 2/24/17.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping (path="/rest/call/{number}", method = RequestMethod.GET)
    public TIYResponse countDown(@PathVariable(required = false) Integer number)throws Exception{
        if(number == null){
            number = 25;
        }
        number = sayNumber(number);
        if(number >= 0){
            Thread.sleep(2000);
            (new ApiHelper(number)).passNumber();
        }
        return  new TIYResponse(true,number);
    }



    private Integer sayNumber(Integer number) throws Exception{
        ProcessBuilder pb;
        String spokenWords = "Finished";
        if(number > 0){
            spokenWords = Integer.toString(number);
        }
        pb = new ProcessBuilder("say", spokenWords);
        Process p = pb.start();
        return number - 1;
    }



}
