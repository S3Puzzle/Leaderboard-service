package com.cas.leaderboard.repositories;

import com.cas.leaderboard.entities.Total;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TotalRepository extends CrudRepository<Total, Integer> {
    @Query(value = "SELECT name, SUM(score) AS scoretotal FROM user GROUP BY name ORDER BY scoretotal DESC;", nativeQuery = true)
    public Iterable<Total> getTotalPerUser();
}
