package com.cas3.Leaderboard;

import com.cas3.Leaderboard.accessingdatamysql.Form;
import com.cas3.Leaderboard.accessingdatamysql.MainController;
import com.cas3.Leaderboard.accessingdatamysql.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UnitTests {
    @Autowired
    private MainController mainController;

    @Test
    void shouldGetAllUsers(){
        //arrange
        Form form = new Form();
        form.setName("Cas");
        form.setScore(100);
        mainController.addNewUser(form);
        //act
        Iterable<User> users = mainController.getAllUsers();
        // assert
        assertThat(users.iterator().next().getName())
                .isEqualTo(form.getName());
        assertThat(users.iterator().next().getScore())
                .isEqualTo(form.getScore());

    }
    @Test
    void shouldAddUser() {
        //arrange
        Form form = new Form();
        form.setName("Cas");
        form.setScore(100);
        //act
        User user = mainController.addNewUser(form);
        //assert
        assertThat(user.getName())
                .isEqualTo(form.getName());
        assertThat(user.getScore())
                .isEqualTo(form.getScore());
    }
}
