# TUGAS-PBO-PR-3
# AZIMATUL HANAFIYAH 202410101077

1.Petugas Sensus
public class PetugasSensus {
    public String nama;
    public String alamat;
    public String jenisKelamin;
    public int nomorTelpon;
    
    public void mencatatDataPenduduk(){
         System.out.println("--DATA PENDUDUK--");
         System.out.println("NIK : 3511159601010001");
         System.out.println("Nama : Azimatul Hanafiyah");
         System.out.println("TTL : Bondowoso, 6 Januari 2001");
         System.out.println("Alamat : jl. Kenangan gebetan");
         System.out.println("Agama : Islam");
         System.out.println("Jenis Kelamin : Perempuan");
         System.out.println("Status : Belum Kawin");
         }
    
}

<img width="959" alt="petugas sesnsu" src="https://user-images.githubusercontent.com/89617795/134362710-f41eb1b7-f6d7-4567-9d1c-f0af1bd59651.png">

2. Data Penduduk
public class DataPenduduk{
    public String nik;
    public String nama;
    public String ttl;
    public String alamat;
    public String agama;
    public String jenisKelamin;
    public String status;
    
     public void setNIK(String nik) {
         this.nik = nik;
     }
     
     public void setNama(String nama) {
         this.nama = nama;
     }
     
     public void setTTL(String ttl) {
         this.ttl = ttl;
     }
     
     public void setAlamat(String alamat) {
         this.alamat = alamat;
     }
     
     public void setAgama(String agama) {
         this.agama = agama;
     }
     
     public void setJenisKelamin(String jenisKelamin) {
         this.jenisKelamin = jenisKelamin;
     }
     
     public void setStatus(String status) {
         this.status = status;
     }
     
     public void mempermudahPencatatan(){
     
 }
 
 
 }
<img width="959" alt="Data penduduk" src="https://user-images.githubusercontent.com/89617795/134363112-530d7b28-11ac-4f38-b247-c907a4cae1c0.png">

3. SensusTest
public class SensusTest {
    public static void main(String[] args) {
        PetugasSensus petugas = new PetugasSensus();
        DataPenduduk data = new DataPenduduk();
        
        petugas.mencatatDataPenduduk();
        
        data.setNIK("3511159601010001");
        data.setNama("Azimatul Hanafiyah");
        data.setTTL("Bondowoso, 6 Januari 2001");
        data.setAlamat("jl. Kenangan gebetan");
        data.setAgama("Islam");
        data.setJenisKelamin("Perempuan");
        data.setStatus("Belum Kawin");
        data.mempermudahPencatatan();
        
    }
    
    
}
<img width="960" alt="ahayyy" src="https://user-images.githubusercontent.com/89617795/134363091-d57bf970-e1e1-4bc2-8670-d603c8225034.png">
