package com.example.CrudeProject.controller;

import com.example.CrudeProject.entity.Interface;
import com.example.CrudeProject.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InterfaceController {
    @Autowired
    private InterfaceService interfaceService;
    @PostMapping("/addInterface")
    public Interface createInterface(@RequestBody Interface inter)
    {
        return interfaceService.createInterface(inter);
    }
    @PostMapping("/addInterfaces")
    public List<Interface> addUser( @RequestBody List<Interface> inters)
    {
        return interfaceService.createInterfaces(inters);
    }
    @GetMapping("/interface/{id}")
    public Interface getInterfaceById(@PathVariable int id)
    {
        return interfaceService.getInterfaceById(id);
    }
    @GetMapping("/interface")
    public List<Interface> getAllInterfaces()
    {
        return interfaceService.getInterface();
    }
    @PutMapping("/updateInterface/{}")
    public Interface updateUser(@RequestBody  Interface inter,@PathVariable int id)
    {
        inter.setId(id);
        Interface updateInter= interfaceService.updateInterface(inter);
        return updateInter;
    }
    @DeleteMapping("/interface/{id}")
    public String deleteInterface(@PathVariable int id)
    {
        return interfaceService.deleteInterfaceId(id);
    }

}
