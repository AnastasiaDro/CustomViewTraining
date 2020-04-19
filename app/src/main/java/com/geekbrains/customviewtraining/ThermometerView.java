package com.geekbrains.customviewtraining;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class ThermometerView extends View {
    //цвет термометра
    private int thermColor = Color.GRAY;
    //цвет уровня температуры
    private int tempColor = Color.GREEN;

    //Начинаем рисовать градусник
    //Трубочка
    private RectF thermomRect = new RectF();
    //хвостик
    private Rect tailRect = new Rect();
    //изображение уровня градусов
    private Rect tempLevel = new Rect();



    //Краска термометра
    private Paint thermomPaint;
    //Краска температуры
    private Paint tempPaint;

    // Ширина элемента
    private int width = 0;
    // Высота элемента
    private int height = 0;

    //Уровень температуры
    private int level = 50;

    // Константы
    // Отступ элементов
    private final static int padding = 10;
    // Скругление углов палки градусника
    private final static int round = 10;
    // Ширина хвоста градусника
    private final static int headWidth = 10;


    public ThermometerView(Context context) {
        super(context);
        init();
    }

    //TODO



    // Начальная инициализация полей класса
    private void init() {
        thermomPaint = new Paint();
        thermomPaint.setColor(thermColor);
        thermomPaint.setStyle(Paint.Style.FILL);
        tempPaint = new Paint();
        tempPaint.setColor(tempColor);
        tempPaint.setStyle(Paint.Style.FILL);
    }
}
