package oefeningen.oefening2;

public class Pokedex {

    private final Pokemon[] pokemons;

    public Pokedex(int aantal) {
        pokemons = new Pokemon[aantal];
    }

    public boolean bevat(Pokemon p) {
        for (Pokemon pokemon : pokemons) {
            if (pokemon != null) {
                if (pokemon.getNaam().equals(p.getNaam())) return true;
            }
        }
        return false;
    }

    public void voegToe(Pokemon p) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] == null) {
                pokemons[i] = p;
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pokemon pokemon : pokemons) {
            if (pokemon == null) continue;
            sb.append("- ").append(pokemon).append("\n");
        }
        return sb.toString();
    }

    public Pokemon[] getPokemon() {
        return pokemons;
    }
}
