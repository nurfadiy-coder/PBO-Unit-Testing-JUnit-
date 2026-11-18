public class Produk<T, U, V> { 
    private T nama; 
    private U harga; 
    private V Stok; 

    public Produk(T nama, U harga, V Stok) { 
        this.nama = nama; 
        this.harga = harga; 
        this.Stok = Stok;   
    } 

    public String toString() { 
        return nama + "," + harga + "," + Stok; 
    } 
} 
