package com.voteapp.kladd3.repository;



import com.voteapp.kladd3.models.PollTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollTemplateRepository extends CrudRepository<PollTemplate,Long> {

}
