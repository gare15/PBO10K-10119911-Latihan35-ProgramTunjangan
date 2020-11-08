/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k;

import java.util.Scanner;

/**
 *
 * @author tegar
 */
class User {
    private String status;
    private Double gajipokok, totalgaji, tunjangan;
    Scanner scanner = new Scanner(System.in);

    public String getStatus() {
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        status = scanner.next();
        return status;
    }
    public Double getGajipokok() {
        System.out.print("Berapa gaji pokok anda perbulan?\t: ");
        gajipokok = scanner.nextDouble();
        return gajipokok;
    }

    public Double hitungTunjangan(String status){
        if (status.equals("menikah") || status.equals("Menikah")) {
            tunjangan = gajipokok * 0.35;
        }
        else {
            tunjangan = 0.0;
        }
        return tunjangan;
    }
    public Double setTotal() {
        totalgaji = tunjangan + gajipokok;
        return totalgaji;
    }
}
