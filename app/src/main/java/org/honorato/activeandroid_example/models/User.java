package org.honorato.activeandroid_example.models;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by jlh on 4/13/16.
 */
@Table(name = "Users")
public class User extends Base {

    @Column(name = "name")
    public String name;

    public User() {
        super();
    }

    public User(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
