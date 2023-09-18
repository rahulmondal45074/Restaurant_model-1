package com.example.Restarentproject1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    List<Res> resList;

    @PostMapping("Res")
    public String addRes(@RequestBody Res myres){
        resList.add(myres);
        return "Restaurant ___added";

    }

    @GetMapping("Getting all user")
    public List<Res> getAllRes(){
        return resList;
    }

    @PutMapping("Add/{Id}")
    public String setRes(@PathVariable Integer Id, @RequestParam Integer ratting){

       for(Res rest : resList){
           if(rest.getResId().equals(Id)){
               rest.setResRatting(ratting);
               return "Restaurant"+ Id + " ratting updated to" + ratting;
           }
       }
       return "Invalid user id";

    }
@DeleteMapping("Delete/{Id}")
    public  String removeRes(@PathVariable Integer Id){

        for(Res rest : resList){
            if(rest.getResId().equals(Id)){
                resList.remove(rest);
                return "Restaurant _Delete";
            }
        }
        return "Invalid user id";
    }


}
