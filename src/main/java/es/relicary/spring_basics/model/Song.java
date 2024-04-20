package es.relicary.spring_basics.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Song {

    private String title;
    private String singerName;

}