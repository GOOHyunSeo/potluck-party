package com.example.potluck.dto;

public class ArticleForm {
    private String food;
    private String music;

    //전송받은 음식과 음악을 필드에 저장하는 생성자 추가
    public ArticleForm(String food, String music) {
        this.food = food;
        this.music = music;
    }
    //데이터를 잘 받았는지 확인할 toString() 메서드 추가
    @Override
    public String toString() {
        return "ArticleForm{" +
                "food='" + food + '\'' +
                ", music='" + music + '\'' +
                '}';
    }
}
