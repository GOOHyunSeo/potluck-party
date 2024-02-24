package com.example.potluck.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue //자동 숫자 생성 기능
    private Long id;
    @Column
    private String food;
    @Column
    private String music;

    //Article 생성자 추가
    public Article(Long id, String food, String music) {
        this.id = id;
        this.food = food;
        this.music = music;
    }
    //toString() 메서드 추가
    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", food='" + food + '\'' +
                ", music='" + music + '\'' +
                '}';
    }
}
