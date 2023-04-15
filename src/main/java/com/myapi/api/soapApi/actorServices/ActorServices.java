package com.myapi.api.soapApi.actorServices;

import com.myapi.dtos.ActorDto;
import com.myapi.services.ActorService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(name = "ActorWebServices")
public class ActorServices {
    ActorService service;

    public ActorServices() {
        service = new ActorService();
    }

    @WebMethod(operationName = "actor")
    public ActorDto getActor(int ID) {
        return service.getActorById(ID);
    }
}
