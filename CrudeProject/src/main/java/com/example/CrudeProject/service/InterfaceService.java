package com.example.CrudeProject.service;

import com.example.CrudeProject.dao.InterfaceRepository;
import com.example.CrudeProject.entity.Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class InterfaceService {
    @Autowired
    private InterfaceRepository interfaceRepository;
    public Interface createInterface(Interface inter)
    {
        return interfaceRepository.save(inter);
    }
    public List<Interface> createInterfaces(List<Interface> interfaceList)
    {
        return interfaceRepository.saveAll(interfaceList);
    }

    public Interface getInterfaceById(int id)
    {
        return interfaceRepository.findById(id).orElse(null);
    }
    public List<Interface> getInterface()
    {
        return interfaceRepository.findAll();
    }
    public Interface updateInterface(Interface inter)
    {
        return interfaceRepository.save(inter);
    }
    public String deleteInterfaceId(int id)
    {
        interfaceRepository.deleteById(id);
        return "Interface got deleted";
    }
}
