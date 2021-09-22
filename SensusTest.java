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
