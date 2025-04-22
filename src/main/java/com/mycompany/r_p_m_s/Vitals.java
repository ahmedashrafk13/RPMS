/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */
class Vitals {
    private int heartRate; // in BPM
    private int systolicBP; // in mmHg
    private int diastolicBP; // in mmHg

    public Vitals(int heartRate, int systolicBP, int diastolicBP) {
        this.heartRate = heartRate;
        this.systolicBP = systolicBP;
        this.diastolicBP = diastolicBP;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getSystolicBP() {
        return systolicBP;
    }

    public int getDiastolicBP() {
        return diastolicBP;
    }
}
