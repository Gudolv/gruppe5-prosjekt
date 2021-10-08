package com.voteapp.kladd3.services;


import com.voteapp.kladd3.models.VoterProfile;
import com.voteapp.kladd3.repository.VoterProfileRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class VoterProfileService {

    @Autowired
    private VoterProfileRepository voterProfileRepository;


    public void saveVoterProfile(VoterProfile voterProfile){
        voterProfileRepository.save(voterProfile);
    }

    public Iterable<VoterProfile> findAll() {return  voterProfileRepository.findAll();}

    public Optional<VoterProfile> findProfileById(Long id){
        return voterProfileRepository.findById(id);
    }

    public Optional<VoterProfile> findByUserName(String username){
        return voterProfileRepository.findByUserName(username);
    }

}
