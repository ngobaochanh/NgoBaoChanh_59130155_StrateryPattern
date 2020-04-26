/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Admin
 */
public class main {
        public static LocalDate getDateFromString(String string, DateTimeFormatter format) 
    {  
        // Convert the String to Date in the specified format 
        LocalDate date = LocalDate.parse(string, format); 
  
        // return the converted date 
        return date; 
    } 
    
    public static void main (String[] args) throws ParseException {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        
        // danh sach sinh vien
        SinhVien sv1 = new SinhVien("Ngo Bao Chanh", getDateFromString("07/02/1999", format), 8.0f);
        SinhVien sv2 = new SinhVien("Nguyen Duc Thang", getDateFromString("05/11/1999", format), 8.8f);
        SinhVien sv3 = new SinhVien("Le Quoc Sang", getDateFromString("08/03/1999", format), 7.1f);
        SinhVien sv4 = new SinhVien("Le Anh Khoa", getDateFromString("02/08/1999", format), 6.0f);
        
        SoSanhTheoTen theoTen = new SoSanhTheoTen();
        SoSanhTheoDiem theoDiem = new SoSanhTheoDiem();
        
        QLSV ql = new QLSV();
        ql.themSinhVien(sv1);
        ql.themSinhVien(sv2);
        ql.themSinhVien(sv3);
        ql.themSinhVien(sv4);
        
        System.out.println(" Danh sach ban dau ");
        ql.inDS();
        
       
        System.out.println(" Sap xep Danh sach sinh vien theo TEN ");
        ql.setSoSanh(theoTen);
        ql.sapXep();
        ql.inDS();
        
       
        System.out.println(" Sap xep Danh sach sinh vien theo DIEM TRUNG BINH ");
        ql.setSoSanh(theoDiem);
        ql.sapXep();
        ql.inDS();
    }
    
}
