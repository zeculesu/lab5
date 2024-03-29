package io.github.zeculesu.itmo.prog5.data;

/**
 * Координаты где находится SpaceMarine
 */
public class Coordinates {
    private Long x; //Поле не может быть null
    private float y; //Значение поля должно быть больше -67

    public Coordinates(Long x, float y){
        this.x = x;
        this.y = y;
    }

    public Long getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}