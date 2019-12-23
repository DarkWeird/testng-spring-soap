package me.darkweird.testing.model;

public class BLZ {
    private String name;
    private String blzCode;
    private String bic;
    private String ort;
    private String plz;

    public BLZ() {
    }

    public BLZ(String name, String blzCode, String bic, String ort, String plz) {
        this.name = name;
        this.blzCode = blzCode;
        this.bic = bic;
        this.ort = ort;
        this.plz = plz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String swiftCode) {
        this.bic = swiftCode;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getBlzCode() {
        return blzCode;
    }

    public void setBlzCode(String blzCode) {
        this.blzCode = blzCode;
    }
}
