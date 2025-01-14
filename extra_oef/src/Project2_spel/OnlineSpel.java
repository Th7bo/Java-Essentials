package Project2_spel;

public class OnlineSpel extends Spel {

    private String url;
    private String genre;

    public OnlineSpel(String naam, Uitgever uitgever) {
        super(naam, uitgever);
    }

    @Override
    public String toString() {
        //OnlineSpel{naam='League of Legends', minimumLeeftijd=0, uitgever=Uitgever{naam='Riot Games', jaarOprichting=2006, hoofdkantoor='LA', website='www.riotgames.com'}, genre=Multiplayer online battle arena, url=prod.eu.lol.riotgames.com}
        String extraString = (genre == null) ? "" : String.format(", genre=%s", getGenre());
        extraString += (url == null) ? "": String.format(", url=%s", getUrl());
        return String.format("OnlineSpel{naam='%s', minimumLeeftijd=%d, uitgever=%s%s}", getNaam(), getMinimumLeeftijd(),getUitgever(), extraString);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
