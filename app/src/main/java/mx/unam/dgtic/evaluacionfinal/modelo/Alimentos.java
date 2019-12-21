package mx.unam.dgtic.evaluacionfinal.modelo;

public class Alimentos {

    private int id;
    private String grupo;
    private String energia;
    private String carbohidratos;
    private String grasa;
    private String proteinas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEnergia() {
        return energia;
    }

    public void setEnergia(String energia) {
        this.energia = energia;
    }

    public String getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(String carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public String getGrasa() {
        return grasa;
    }

    public void setGrasa(String grasa) {
        this.grasa = grasa;
    }

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }

    public Alimentos(int id, String grupo, String energia, String carbohidratos, String grasa, String proteinas) {
        this.id = id;
        this.grupo = grupo;
        this.energia = energia;
        this.carbohidratos = carbohidratos;
        this.grasa = grasa;
        this.proteinas = proteinas;

    }
}
