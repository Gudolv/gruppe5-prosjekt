package com.voteapp.kladd3.services;

import com.voteapp.kladd3.models.PollTemplate;
import com.voteapp.kladd3.repository.PollTemplateRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class PollTemplateService {

    @Autowired
    PollTemplateRepository pollTemplateRepository;

    public void savePollTemplate(PollTemplate pollTemplate){
        pollTemplateRepository.save(pollTemplate);
    }

    public Iterable<PollTemplate> findAll(){

        return pollTemplateRepository.findAll();
    }

    public Optional<PollTemplate> getPollTemplateById(Long id){
        return pollTemplateRepository.findById(id);
    }
}
