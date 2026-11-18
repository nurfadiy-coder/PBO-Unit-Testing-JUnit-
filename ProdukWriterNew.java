import java.io.IOException; 
import java.nio.file.*; 
import java.util.*; 

class Produk<T, U, V> { 
    private T nama; 
    private U harga; 
    private V Stok; 

    public Produk(T nama, U harga, V Stok) { 
        this.nama = nama; 
        this.harga = harga; 
        this.Stok = Stok;   
    } 

    public int Stok() { 
        return 0; // Placeholder for stock, can be modified as needed
    }
    public String toString() { 
        return nama + "," + harga + "," + Stok; 
    } 
} 

public class ProdukWriterNew { 
    public static void main(String[] args) { 
        List<Produk<String, Double, Integer>> produkList = new ArrayList<>(); 
        produkList.add(new Produk<>("Laptop", 15000000.0, 10)); 
        produkList.add(new Produk<>("Mouse", 150000.0, 25)); 
        produkList.add(new Produk<>("Keyboard", 350000.0, 15)); 

        Path filePath = Paths.get("produk_output.txt"); 
        
        List<Pelanggan> pelangganList = new ArrayList<>();
        pelangganList.add(new Pelanggan("John Doe", "john.doe@example.com", "081234567890"));

        Path pelangganFilePath = Paths.get("pelanggan_output.txt");

        try { 
            List<String> lines = new ArrayList<>();
            for (Produk<String, Double, Integer> p : produkList) { 
                lines.add(p.toString()); 
            } 

            List<String> pelangganLines = new ArrayList<>();
            for (Pelanggan pelanggan : pelangganList) {
                pelangganLines.add(pelanggan.toString());
            }

            Files.write(filePath, lines); 
            Files.write(pelangganFilePath, pelangganLines);
            System.out.println("Data produk dan pelanggan berhasil disimpan menggunakan NIO.2"); 

            List<String> savedLines = Files.readAllLines(filePath);
            System.out.println("Isi file produk_output.txt:");
            for (String line : savedLines) {
                System.out.println(line);
            }

            List<String> savedPelangganLines = Files.readAllLines(pelangganFilePath);
            System.out.println("Isi file pelanggan_output.txt:");
            for (String line : savedPelangganLines) {
                System.out.println(line);
            }
        } catch (IOException e) { 
            System.out.println("Gagal menyimpan file: " + e.getMessage()); 
        } 
    } 
}