package Entities;


public abstract class Base {
    private Long id;

    public Base() {
    }
    public Base(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}


