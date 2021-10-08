package com.voteapp.kladd3.controller;


import com.voteapp.kladd3.models.VoterProfile;
import com.voteapp.kladd3.services.VoterProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/profile/")

public class VoterController {

    @Autowired
    private VoterProfileService voterProfileService;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestBody VoterProfile voterProfile){
        voterProfileService.saveVoterProfile(voterProfile);
        return "Profile saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<VoterProfile> getAllVoterProfiles(){
        return voterProfileService.findAll();
    }


    @GetMapping(path="/{id}")
    public @ResponseBody
    Optional<VoterProfile> findProfileById(@PathVariable Long id) {
        return voterProfileService.findProfileById(id);
    }

    @GetMapping(path = "/{userName}")
    public @ResponseBody Optional<VoterProfile> findByUserName(@PathVariable String userName){
        return voterProfileService.findByUserName(userName);
    }


}
