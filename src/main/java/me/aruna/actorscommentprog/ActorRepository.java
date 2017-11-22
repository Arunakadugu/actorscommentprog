package me.aruna.actorscommentprog;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository  extends CrudRepository<Actor, Long>{
    Iterable <Actor> findAllByRealnameContaining(String s);
    Iterable <Actor> findAllByMoviesNotContaining(Movie thismovie);
}
