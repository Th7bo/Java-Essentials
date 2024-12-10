package oefeningen.oefening2;

public class Trainer {

    private Pokedex pokedex;
    private String naam;

    public Trainer(String naam) {
        this.pokedex = new Pokedex(10);
        this.naam = naam;
    }

    public void vangPokemon(Pokemon pokemon) {
        if (!pokedex.bevat(pokemon)) pokedex.voegToe(pokemon);
    }

    public String toString() {
        return naam;
    }

    public String getNaam() {
        return naam;
    }

    public Pokedex getPokedex() {
        return pokedex;
    }
}
