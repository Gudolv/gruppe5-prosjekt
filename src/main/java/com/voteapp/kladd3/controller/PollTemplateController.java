package com.voteapp.kladd3.controller;

import com.voteapp.kladd3.models.PollTemplate;
import com.voteapp.kladd3.services.PollTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/poll-templates/")
public class PollTemplateController {

    @Autowired
    private PollTemplateService pollTemplateService;

    @PostMapping("/add")
    public @ResponseBody
    String addNewPollTemplate(@RequestBody PollTemplate pollTemplate) {
        pollTemplateService.savePollTemplate(pollTemplate);
        return HttpStatus.OK.getReasonPhrase();
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<PollTemplate> getAllPollTemplates() {
        return pollTemplateService.findAll();
    }

    @GetMapping(path="/{id}")
    public @ResponseBody
    Optional<PollTemplate> findPollTemplateById(@PathVariable Long id){
        return pollTemplateService.getPollTemplateById(id);
    }
}
