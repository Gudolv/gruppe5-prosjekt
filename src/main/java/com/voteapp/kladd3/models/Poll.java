package com.voteapp.kladd3.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private Time sTime;
    private Time eTime;
    private int joinCode;
    private Boolean privatePoll;


    public Poll(Time sTime, Time eTime, int joinCode,Boolean privatePoll){
        this.sTime = sTime;
        this.eTime = eTime;
        this.joinCode = joinCode;
        this.privatePoll = privatePoll;
    }

    @ManyToOne
    private PollTemplate pollTemplate;

    @OneToMany
    @ToString.Exclude
    private List<VoteCount> voteCounts;

    @ManyToMany
    @ToString.Exclude
    private List<IoTDevice> IoTDevices;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poll poll = (Poll) o;
        return Objects.equals(id, poll.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }



}
