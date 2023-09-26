package com.primaryKeys.model;

import com.primaryKeys.util.AnkaraCallBack;
import com.primaryKeys.util.AnkaraConverter;
import jakarta.persistence.*;

@Entity
@EntityListeners(AnkaraCallBack.class)
public class Ankara {


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)

    private int id;
    private String title;

    @Convert(converter = AnkaraConverter.class)
    private String someText;


    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
