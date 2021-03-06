package com.voteapp.kladd3.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class VoteCount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int redVotes;
    private int greenVotes;

    @ManyToOne
    private Poll poll;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoteCount voteCount = (VoteCount) o;
        return Objects.equals(id, voteCount.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}