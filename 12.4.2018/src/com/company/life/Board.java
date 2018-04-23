/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.life;

import javafx.geometry.Point2D;

import java.util.ArrayList;

/**
 *
 * @author p0073862
 */
public class Board {

    private int width, height;
    private ArrayList<Point2D> cells;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        cells = new ArrayList<>();

    }

    public void clear() {
        cells.clear();
    }

    public boolean getCell(int x, int y) {
        return cells.contains(new Point2D(x, y));

    }

    public void makeCellLive(int x, int y) {
        cells.add(new Point2D(x ,y));
    }

    public Point2D[] getLiveCells(){
        return cells.toArray(new Point2D[cells.size()]);
    }


}