/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author TinhNV
 */
public class Chia implements tinh{
    public float tinh(float a, float b)
    {
        if(b==0)
        {
            System.out.println("nhập lại b");
            return 0;
        }
        else
        {
            return a / b;
        }
    }
    
}
