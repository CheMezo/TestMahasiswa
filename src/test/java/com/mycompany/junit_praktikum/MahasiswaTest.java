package com.mycompany.junit_praktikum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MahasiswaTest {

    @Test
    void testNilaiLulus() {
        Mahasiswa mhs = new Mahasiswa("Budi", 75);
        assertTrue(mhs.isLulus(), "Mahasiswa dengan nilai 75 harusnya LULUS");
    }

    @Test
    void testNilaiTidakLulus() {
        Mahasiswa mhs = new Mahasiswa("Andi", 50);
        assertFalse(mhs.isLulus(), "Mahasiswa dengan nilai 50 harusnya TIDAK LULUS");
    }
    
    @Test
    void testNilaiTepatAmbangBatas() {
        Mahasiswa mhs = new Mahasiswa("Caca", 60);
        assertTrue(mhs.isLulus(), "Mahasiswa dengan nilai tepat 60 harusnya LULUS");
    }
}