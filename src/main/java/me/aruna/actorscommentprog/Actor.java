package me.aruna.actorscommentprog;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String realname;
    private String headshot;

    @ManyToMany(mappedBy="cast")
    private Set<Movie> movies;

    public Actor(String name, String realname, String headshot) {
        this.name = name;
        this.realname = realname;
        this.headshot = headshot;
    }

    public Actor()
    {//using to store unique movie names in Hashset
        movies = new HashSet<Movie>();
    }
    public void addMovie(Movie m){
        //adds the specified element to this set if it is not already present
        movies.add(m);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }


}
