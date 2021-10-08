package com.voteapp.kladd3.repository;


import com.voteapp.kladd3.models.VoteCount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VoteCountRepository extends CrudRepository<VoteCount,Long> {

}
