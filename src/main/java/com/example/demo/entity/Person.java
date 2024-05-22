package com.example.demo.entity;

public class Person {
    private Long id;
    private String name;
    private String prefecture;
    private String capital; // 県庁所在地を追加

    // デフォルトコンストラクタ
    public Person() {}

    // パラメータ付きコンストラクタ
    public Person(Long id, String name, String prefecture, String capital) {
        this.id = id;
        this.name = name;
        this.prefecture = prefecture;
        this.capital = capital;
    }

    // id のゲッター
    public Long getId() {
        return id;
    }

    // id のセッター
    public void setId(Long id) {
        this.id = id;
    }

    // name のゲッター
    public String getName() {
        return name;
    }

    // name のセッター
    public void setName(String name) {
        this.name = name;
    }

    // prefecture のゲッター
    public String getPrefecture() {
        return prefecture;
    }

    // prefecture のセッター
    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    // capital のゲッター
    public String getCapital() {
        return capital;
    }

    // capital のセッター
    public void setCapital(String capital) {
        this.capital = capital;
    }
}
