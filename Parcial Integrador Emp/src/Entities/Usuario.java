package Entities;

public class Usuario extends Base{
    private String auth0Id;
    private String username;

    public Usuario(){}

    public Usuario(String auth0Id, String username) {
        this.auth0Id = auth0Id;
        this.username = username;
    }
}
