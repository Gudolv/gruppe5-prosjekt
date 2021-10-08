package com.voteapp.kladd3.repository;

import com.voteapp.kladd3.models.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends CrudRepository<Poll, Long> {

}
