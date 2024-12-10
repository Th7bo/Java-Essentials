package oefeningen.oefening3;

public class Character {

    private static int count;
    private final static int MAX_TITLES = 3;
    private String firstName;
    private String lastName;
    private String nickName;
    private String house;
    private int firstSeason;
    private int lastSeason;
    private int episodes;
    private String portrayedBy;
    private int numberOfTitles;
    private String[] titles = new String[MAX_TITLES];

    public Character(String firstName, String lastName, String house, String portrayedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
        this.portrayedBy = portrayedBy;
        count++;
    }

    public Character(String firstName, String lastName, String nickName, String house, String portrayedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.house = house;
        this.portrayedBy = portrayedBy;
        count++;
    }

    public Character(String firstName, String lastName, String nickName, String house, int firstSeason, int lastSeason, int episodes, String portrayedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.house = house;
        this.firstSeason = firstSeason;
        this.lastSeason = lastSeason;
        this.episodes = episodes;
        this.portrayedBy = portrayedBy;
        count++;
    }

    public void setData(int[] data) {
        firstSeason = data[0];
        lastSeason = data[1];
        episodes = data[2];
    }

    public static int getCount() {
        return count;
    }

    public void setData(int firstSeason, int lastSeason, int episodes) {
        this.firstSeason = firstSeason;
        this.lastSeason = lastSeason;
        this.episodes = episodes;
    }

    public void addTitle(String title) {
        if (numberOfTitles == MAX_TITLES) System.out.println("This character already has the max amount of titles");
        else {
            titles[numberOfTitles] = title;
            numberOfTitles++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null && !firstName.isEmpty()) sb.append(firstName).append(" ");
        if (nickName != null && !nickName.isEmpty()) sb.append("\"").append(nickName).append("\"").append(" ");
        if (lastName != null && !lastName.isEmpty()) sb.append(lastName).append(" ");
        if (house != null && !house.isEmpty()) sb.append("of house ").append(house).append("\n");
        for (int i = 0; i < numberOfTitles; i++) {
            sb.append("*** ").append("\"").append(titles[i]).append("\"").append("\n");
        }
        if (portrayedBy != null && !portrayedBy.isEmpty()) sb.append("Played by: ").append(portrayedBy).append(" ");
        if (firstSeason != 0) sb.append("in season ").append(firstSeason);
        if (lastSeason != 0) sb.append("-").append(lastSeason).append(" ");
        if (episodes != 0) sb.append("(").append(episodes).append(" episodes)");
        return sb.toString();
    }
}
