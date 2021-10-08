package com.voteapp.kladd3.repository;

import com.voteapp.kladd3.models.VoterProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoterProfileRepository extends CrudRepository<VoterProfile,Long> {


    Optional<VoterProfile> findByUserName(String username);
}
