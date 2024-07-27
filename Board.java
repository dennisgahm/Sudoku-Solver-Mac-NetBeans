/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sudoku_solver;

/**
 *
 * @author dennisgahm
 */
public class Board {
    Cell[][] cells;
    
    public boolean IsComplete() {
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                if (cells[i][i2].value == 0)
                    return false;
            }
        }
        return IsConsistent();
    }
    
    public boolean IsSectionConsistent(Cell c) {
        return false; //change this
    }
    
    public boolean IsConsistent() {
        for (int i = 0; i < 8; i++) {
            Cell[] c = this.getRegion(i);
        }
    }
    
    public Cell[] getRegion(int i) {
        int col = i % 3;
        int row = i / 3;
        
        int startCol = col * 3;
        int startRow = row * 3;
        
        int indexCol = startCol;
        int indexRow = startRow;
        
        for (int i2 = 0; i2 < 8; i2++) {
            if ((i2 % 3) == 0 )
        }
    }
}
