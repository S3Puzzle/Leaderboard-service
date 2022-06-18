package com.cas.leaderboard.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Total {
    @Id
    private String name;
    private Integer scoretotal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScoreTotal() {
        return scoretotal;
    }

    public void setScoreTotal(Integer scoreTotal) {
        this.scoretotal = scoreTotal;
    }
}
