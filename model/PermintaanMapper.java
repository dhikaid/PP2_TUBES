package model;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PermintaanMapper {
    @Select("SELECT * FROM permintaan")
    List<Permintaan> getAllpermintaan();

    @Select("SELECT p.* FROM permintaan p LEFT JOIN penjemputan pe ON p.id = pe.id_permintaan WHERE pe.id_permintaan IS NULL")
    List<Permintaan> getPermintaanPickup();

    @Insert("INSERT INTO permintaan (nama_pelanggan, alamat, jenis_sampah, berat_sampah, tanggal_permintaan) " +
    "VALUES (#{namaPelanggan}, #{alamat}, #{jenisSampah}, #{beratSampah}, NOW())")
        @Options(useGeneratedKeys = true)
                int tambahPermintaan(@Param("namaPelanggan") String namaPelanggan,
                                @Param("alamat") String alamat,
                                @Param("jenisSampah") String jenisSampah,
                                @Param("beratSampah") int beratSampah);

    @Select("SELECT * FROM permintaan WHERE id = #{id}")
    List<Permintaan> getPermintaan(@Param("id") int id);

    @Insert("UPDATE permintaan " +
    "SET nama_pelanggan = #{namaPelanggan}, alamat = #{alamat}, jenis_sampah = #{jenisSampah}, berat_sampah = #{beratSampah} WHERE id = #{id}")
    int editPermintaan(@Param("id") int id, @Param("namaPelanggan") String namaPelanggan,
                                @Param("alamat") String alamat,
                                @Param("jenisSampah") String jenisSampah,
                                @Param("beratSampah") int beratSampah);

    @Insert("DELETE FROM permintaan WHERE id = #{id}")
    int delelePermintaan(@Param("id") int id);

    @Select("SELECT COUNT(id) FROM permintaan")           
    int total();
}