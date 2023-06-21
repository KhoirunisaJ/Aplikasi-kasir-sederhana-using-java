package FinalProject;
import java.util.Scanner;
public class appWarungMakan {
    //Variabel Global
    static Scanner sc = new Scanner(System.in);
    static String Menu [] = new String [15];
    static int Harga[]    = new int[15];
    
    //Method Sorting
    static String[] sort (String[]Menu){
        //Looping for
        for (int i = 0; i < Menu.length; i++){
            for (int j = 0; j < Menu.length-1; j++) {
                //Percabagan-if else
                if (Menu[j].compareToIgnoreCase(Menu[j+1])>0){
                    String t= Menu[j];
                    Menu [j]= Menu [j+1];
                    Menu [j+1]=t;
                    
                    int ma    = Harga [j];
                    Harga [j]= Harga [j+1];
                    Harga [j+1]= ma;
                }  
            }   
        }
        return Menu;
    }
    //Method Searching
    static String[][] search(String[] Menu,int Harga[], String cari){
        String [][] hasil=new String[10][2];
        int idx=0;
        //Looping For
        for (int i = 0; i < Menu.length; i++) {
            //Percabangan if-else
            if(Menu[i].indexOf(cari)>=0){
                hasil[idx][0]=Menu[i];
                hasil [idx][1]=String.valueOf(Harga[i]);
                idx++;
            }   
        }
        return hasil;
    }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Menu[]= new String [10];
        int harga[] = new int [10];
        int porsi[] = new int [10];
        int total[] = new int [10];
        int idx=0;
        int jumlah = 5;
        //Inisilaisasi Daftar Menu
        Menu[0] = "Soto     "; Harga [0] = 15000;
        Menu[1] = "Sate     "; Harga [1] = 10000;
        Menu[2] = "Bakso    "; Harga [2] = 12000;
        Menu[3] = "Rawon    "; Harga [3] = 13000;
        Menu[4] = "Gudeg    "; Harga [4] = 18000;
        Menu[5] = "Rendang  "; Harga [5] = 20000;
        Menu[6] = "Bubur    "; Harga [6] = 14000;
        Menu[7] = "Pempek   "; Harga [7] = 11000;
        Menu[8] = "Pecel    "; Harga [8] = 10000;
        Menu[9] = "Seblak   "; Harga [9] = 17000;
        
        int pilih= 0,pilih2, pilih3, pilih4, pilih5, pilih6;
        int totalbeli=0, totalharga1=0, totalharga2=0, uangpembeli, kembalian;
        String belimakan[]=new String[5];
        int beliharga[]=new int [5];
        int jumlahbeli=0;
        
        System.out.println("===================================================");
        System.out.println("       SELAMAT DATANG DI WARUNG MAKAN BU IDA       ");
        System.out.println("===================================================");
        //Looping do-while
        do{ 
            System.out.println("\nUSER      ");
            System.out.println("1. Kasir    ");
            System.out.println("2. Admin    ");
            System.out.println("3. Owner    ");
            System.out.println("4. Selesai  ");
            System.out.print("Pilih     = ");
            pilih =sc.nextInt();
            //Percabangan Switch-case
            switch(pilih){
                case 1:
                    //Looping do-while
                    do{
                        System.out.println("");
                        System.out.println("                >>>USER KASIR<<<                 ");
                        System.out.println("1. Menu ");
                        System.out.println("2. Daftar Pembelian");
                        System.out.println("3. Selesai ");
                        System.out.print("Pilih     = ");
                        pilih2 = sc.nextInt();
                        //Percabangan Switch-case
                        switch(pilih2){
                            case 1:
                                //Looping do-while
                                do{
                                    System.out.println("1. Daftar Menu");
                                    System.out.println("2. Cari");
                                    System.out.println("3. Selesai");
                                    System.out.print("Pilih     = ");
                                    pilih3 = sc.nextInt();
                                    //Percabangan Switch-case
                                    switch(pilih3){
                                        case 1:
                                            String[] urut= sort(Menu);
                                            System.out.println("");
                                            System.out.println("===================Daftar menu====================");
                                             for (int i = 0; i < urut.length; i++) {
                                                System.out.print((i+1)+"."+urut[i]); 
                                                System.out.println("\t\t"+"["+Harga[i]+"]");
                                            }
                                            System.out.println("");
                                            break;
                                        case 2:
                                            do{
                                                System.out.println("Cari Berdasarkan>>>");
                                                System.out.println("1. Berdasarkan Nama");
                                                System.out.println("2. Berdasarkan Harga");
                                                System.out.println("3. Kembali>>>");
                                                System.out.print("Pilih     = ");
                                                pilih5 = sc.nextInt();
                                                switch(pilih5){
                                                    case 1:
                                                        System.out.print("Cari      = ");
                                                        String cari1 = sc.next();
                                                        System.out.println("");
                                                        System.out.println("=================Hasil Pencarian==================");
                                                        String carimakan1 []= new String[10];
                                                        int cariharga1[]= new int [10];
                                                        int idx1 = 0;
                                                        for (int i = 0; i < Menu.length; i++) {
                                                            if(Menu[i].indexOf(cari1)>=0){
                                                                carimakan1[idx1]=Menu[i];
                                                                cariharga1[idx1]=Harga[i];

                                                                idx1++; 
                                                            System.out.println(idx1+"."+Menu[i]+"\t"+Harga[i]);
                                                            }
                                                        }
                                                        System.out.print("Pilih menu    = ");
                                                        pilih = sc.nextInt();
                                                        belimakan[jumlahbeli]=carimakan1[pilih2-1];
                                                        beliharga[jumlahbeli]=cariharga1[pilih2-1];
                                                        System.out.print("Porsi         = ");
                                                        porsi[jumlahbeli] = sc.nextInt();
                                                        total[jumlahbeli] = beliharga[jumlahbeli] * porsi[jumlahbeli];
                                                        totalharga1 = totalharga1 + total[jumlahbeli];
                                                        jumlahbeli++;
                                                        break;
                                                    case 2:
                                                        System.out.print("Harga Bawah = ");
                                                        int bawah = sc.nextInt();
                                                        System.out.print("Harga Atas  = ");
                                                        int atas = sc.nextInt();
                                                        System.out.println("");
                                                        System.out.println("=================Hasil Pencarian==================");
                                                        int cariharga2[] = new int[10];
                                                        String carimakan2[] = new String[10];
                                                        int idx2 = 0;

                                                        for (int i = 0; i < Menu.length; i++) {
                                                            if (Harga[i]>=bawah && Harga[i]<=atas){
                                                                carimakan2[idx2] = Menu[i];
                                                                cariharga2[idx2] = Harga[i];
                                                                idx2++;
                                                            System.out.println(idx2+". "+Menu[i]+"\t\t"+Harga[i]);
                                                            }
                                                        }
                                                        System.out.print("Pilih Menu  = ");
                                                        pilih = sc.nextInt();
                                                        belimakan[jumlahbeli]=carimakan2[pilih-1];
                                                        beliharga[jumlahbeli]=cariharga2[pilih-1];
                                                        System.out.print("Porsi       = ");
                                                        porsi[jumlahbeli] = sc.nextInt();
                                                        total[jumlahbeli] = beliharga[jumlahbeli] * porsi[jumlahbeli];
                                                        totalharga2 = totalharga2 + total[jumlahbeli];
                                                        jumlahbeli++;
                                                        break;
                                                    case 3:
                                                        System.out.println("Kembali>>>");
                                                        break;
                                                }
                                            }while (pilih5!=3);
                                        case 3:
                                            System.out.println("Kembali>>>>");
                                            break;
                                    }  
                                }while(pilih3!=3);
                                break;
                            case 2:
                                
                                System.out.println("================DAFTAR PEMBELIAN===================");
                                System.out.println("No. Menu \tHarga\tPorsi\tTotal");
                                System.out.println("---------------------------------------------------");
                                //perulangan for
                                for (int i = 0; i < jumlahbeli; i++) {
                                    System.out.println((i+1)+".  "+belimakan[i]+"\t"+beliharga[i]+"\t"+porsi[i]+"\t"+total[i]);
                                    totalbeli = totalharga1 + totalharga2;
                                }
                                System.out.println("___________________________________________________+");
                                System.out.println("Total Biaya\t\t\t= "+totalbeli);
                                System.out.print("Masukkan uang\t\t\t= ");
                                uangpembeli = sc.nextInt();
                                kembalian = uangpembeli-totalbeli;
                                //percabangan if-else
                                if(uangpembeli == totalbeli){
                                    System.out.println("uang anda pas");
                                }
                                else{
                                    System.out.println("Kemblian"+"\t\t\t= "+ kembalian);
                                }
                                break;
                            case 3:
                                System.out.println("------------=Terima Kasih Sudah Membeli--------------");
                                System.out.println("Kembali>>>");
                                break;
                        }
                        
                    }while(pilih2!=3);
                    break;
                case 2:
                    do{ 
                        System.out.println("                 >>>USER ADMIN<<<                    ");
                        System.out.println("1. Tampilkan Daftar Menu");
                        System.out.println("2. Tambah Daftar Menu");
                        System.out.println("3. Hapus Menu");
                        System.out.println("4. Kembali");
                        System.out.print("Pilih = ");
                        pilih4 = sc.nextInt();
                        String[] urut= sort(Menu);
                        //percabangan switch case
                        switch(pilih4){
                            case 1:
                                System.out.println("");
                                System.out.println("===================Daftar menu====================");
                                for (int i = 0; i < urut.length; i++) {
                                System.out.print((i+1)+"."+urut[i]); 
                                System.out.println("\t\t"+"["+Harga[i]+"]");
                                }
                                System.out.println("");
                                break;  
                            case 2 :
                                System.out.println("");
                                System.out.println("=============Tambahkan Daftar Menu================");
                                System.out.print("Nama menu  = ");
                                Menu[jumlah] = sc.next();
                                System.out.print("Harga menu = ");
                                Harga[jumlah] = sc.nextInt();

                                jumlah++;
                                System.out.println("Penambahan Menu Sukses!"); 
                                //perulangan for
                                for (int i = 0; i < Menu.length; i++) {
                                    System.out.print((i+1)+"."+urut[i]); 
                                    System.out.println("\t\t"+"["+Harga[i]+"]");    
                                }
                                System.out.println("");

                                break;
                            case 3:
                                System.out.println("");
                                System.out.println("==================HAPUS MENU=====================");
                                System.out.print("Nama = ");
                                String nama = sc.next();
                                boolean ketemu = false;
                                int idk = -1;
                                //perulangan for
                                for (int i = 0; i < jumlah; i++) {
                                    //percabangan if else
                                    if (Menu[i].compareToIgnoreCase(nama)==0){
                                        ketemu = true;
                                        idk = i;
                                        break;
                                    }

                                }
                                if (ketemu==false){
                                    System.out.println(">>>Menu Tidak Ditemukan!");
                                }else{

                                    for (int i = idk; i < jumlah-1; i++) {
                                        urut[i]= urut[i+1];
                                        Harga[i]= Harga[i+1];
                                        jumlah--;
                                    }
                                    System.out.println(">>>Penghapusan Sukses!");
                                    for (int i = 0; i < Menu.length; i++) {
                                    System.out.print((i+1)+"."+urut[i]); 
                                    System.out.println("\t\t"+"["+Harga[i]+"]");    
                                }
                                System.out.println("");    
                                }
                                break;
                            case 4:
                                System.out.println("Kembali>>>");
                                break;
                        }
                        }while(pilih4!=4);
                        break;
                case 3:
                    do{
                        System.out.println("");
                        System.out.println("                  >>>USER OWNER<<<                ");
                        System.out.println("1. Jumlah Pemasukan");
                        System.out.println("2. Menu Terlaris");
                        System.out.println("3. Kembali");
                        System.out.print("Pilih  = ");
                        pilih6 = sc.nextInt();
                        //percabangan switch case
                        switch(pilih6){
                            case 1:
                                System.out.println("");
                                System.out.println("=================JUMLAH PEMASUKAN==================");
                                System.out.println("No. Menu \tHarga\tPorsi\tTotal");
                                System.out.println("---------------------------------------------------");
                                //perulangan for
                                for (int i = 0; i < jumlahbeli; i++) {
                                    //percabangan if else
                                    if(Menu[i]!=null){
                                       System.out.println((i+1)+".  "+belimakan[i]+"\t"+beliharga[i]+"\t"+porsi[i]+"\t"+total[i]);
                                    } 
                                }
                                System.out.println("___________________________________________________+");
                                System.out.println("TOTAL PEMASUKAN\t\t\t= "+totalbeli);
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("==================MENU TERLARIS=====================");
                                System.out.println("No. Menu\t\t Total Porsi Terjual");
                                System.out.println("----------------------------------------------------");
                                String MenuUrut []=new String [jumlah];
                                int PorsiUrut []= new int [jumlah];
                                //perulangan for
                                for (int i = 0; i < jumlahbeli; i++) {
                                    MenuUrut[i]= belimakan[i];
                                    PorsiUrut [i]= porsi[i];
                                 }
                                for (int i = 0; i < jumlah-1; i++) {
                                    for (int j = i+1; j < jumlah; j++) {
                                        //percabangan if else
                                        if(PorsiUrut[i]<PorsiUrut[j]){
                                            //sort porsi
                                            int tempPorsi = PorsiUrut[j];
                                            PorsiUrut[j]= PorsiUrut[i];
                                            PorsiUrut[i]=tempPorsi;
                                            //sort nama menu
                                            String tempMenu=MenuUrut[j];
                                            MenuUrut[j]=MenuUrut[i];
                                            MenuUrut[i]=tempMenu;
                                        }
                                    }  
                                }
                                for (int i = 0; i < jumlahbeli; i++) {
                                    if(MenuUrut[0]!=null){
                                        System.out.println((i+1)+".  "+MenuUrut[i]+"\t\t"+PorsiUrut[i]);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Kembali>>>");
                                break;
                        }
                    }while(pilih6!=3);
                    break;
                case 4:
                    System.out.println("===============TERIMA KASIH================== :)");
                    break;
            }
            
        }while (pilih!=4);
       
        
        }
}