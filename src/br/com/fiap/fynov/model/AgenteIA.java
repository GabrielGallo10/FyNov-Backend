package br.com.fiap.fynov.model;

public class AgenteIA {
    private static AgenteIA instancia;

    private Long idAgente;
    private String name;
    private String description;

    public AgenteIA() {}

    public AgenteIA(Long idAgente, String name, String description) {
        this.idAgente = idAgente;
        this.name = name;
        this.description = description;
    }

    public static AgenteIA getInstancia() {
        System.out.println("Aplicar a lógica de instância única do AgenteIA, pois só existe um no sistema!");
        if (instancia == null) {
            instancia = new AgenteIA();
        }
        return instancia;
    }

    public Long getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(Long idAgente) {
        this.idAgente = idAgente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
