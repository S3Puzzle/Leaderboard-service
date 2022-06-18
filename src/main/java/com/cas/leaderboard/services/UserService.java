package com.cas.leaderboard.services;

import com.cas.leaderboard.entities.User;
import com.cas.leaderboard.forms.Form;
import com.cas.leaderboard.entities.Total;
import com.cas.leaderboard.repositories.TotalRepository;
import com.cas.leaderboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TotalRepository totalRepository;

    public User addNewUser(Form form) {
        User n = new User();
        n.setName(form.getName());
        n.setScore(form.getScore());
        userRepository.save(n);
        return n;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findByOrderByScoreDesc();
    }

    public Iterable<Total> getTotalPerUsers() {
        return totalRepository.getTotalPerUser();
    }

}
