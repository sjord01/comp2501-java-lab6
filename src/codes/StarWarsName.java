public class StarWarsName {
    private static final int FIRST_NAME_LENGTH = 3;
    private static final int LAST_NAME_LENGTH = 2;
    private static final int MAIDEN_NAME_LENGTH = 2;
    private static final int CITY_NAME_LENGTH = 3;

    public static void main(String[] args) {
        if (args.length == 0)
        {
            throw new IllegalArgumentException("missing data input");
        }

        String[] data = args[0].split("\\|");
        if (data.length != 4) {
            System.out.println("ERROR: incorrect number of words provided.");
            return;
        }

        String firstName = data[0].substring(0, FIRST_NAME_LENGTH).toLowerCase();
        String lastName = data[1].substring(0, LAST_NAME_LENGTH).toLowerCase();
        String maidenName = data[2].substring(0, MAIDEN_NAME_LENGTH).toLowerCase();
        String cityName = data[3].substring(0, CITY_NAME_LENGTH).toLowerCase();

        String starWarsFirstName = firstName + lastName;
        String starWarsLastName = maidenName + cityName;

        System.out.format("Your Star Wars name is: %s %s", starWarsFirstName, starWarsLastName);
    }
}