package oefeningen.oefening3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Result {

    public static final DateTimeFormatter PARSER = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss");
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private String name;
    private LocalDateTime timestamp;
    private double result;

    public Result(String name, LocalDateTime timestamp, double result) {
        this.name = name;
        this.timestamp = timestamp;
        this.result = result;
    }

    public Result(String[] data) {
        this(data[1], LocalDateTime.parse(data[0], PARSER), Double.parseDouble(data[2]));
    }

    public String toString() {
        StringBuilder builder = new StringBuilder(timestamp.format(FORMATTER));
        builder.append(" ").append(name).append(" (");
        Duration duration = Duration.between(timestamp, LocalDateTime.now());
        if (duration.toHours() < 2) {
            builder.append(duration.toMinutes()).append(" minuten geleden");
        } else {
            builder.append(duration.toHours()).append(" uren geleden");
        }
        builder.append(")\n");
        builder.append("\t\t>>> ").append(result).append(" seconden");


        return builder.toString();
    }

    public String toFile() {
        String result = String.format("%.3f", this.result).replace('.', ',');
        return String.format("%s#%s#%s", timestamp.format(PARSER), name, result);
    }

    public double getResult() {
        return result;
    }
}
