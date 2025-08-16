/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author fayruz
 * @co-author zainudin
 */
public class Kalkulator {
    
    
    public static void main(String[] args) {
        Tampilan tampilan = new Tampilan();
        Data data = new Data();
        boolean lagi = true;
        boolean bilanganTetap;
        String pilihanOperator;
        String stop;
        while (lagi) {
          tampilan.masukkanData(data);
          bilanganTetap = true;
          while (bilanganTetap){
            tampilan.tampilkanData(data);
            pilihanOperator = tampilan.pilihanOperator();
            switch (pilihanOperator) {
                case "+":
                    data.Penjumlahan();
                    tampilan.displayHasil(data);
                    break;
                case "-":
                    data.Pengurangan();
                    tampilan.displayHasil(data);
                    break;
                case "x":
                    data.Perkalian();
                    tampilan.displayHasil(data);
                    break;
                case ":":
                    data.Pembagian();
                    tampilan.displayHasil(data);
                    break;
                case "C":
                    bilanganTetap=false;
                    break;
                default:
                    tampilan.displaySalahMenu();
                    break;
              }
            }
          stop = tampilan.tanyaLagi();
          if (stop.equals("yes")){
              lagi = false;
          }
        }
    }
}
