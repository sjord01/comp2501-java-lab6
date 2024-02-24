/**
 * The StarWarsName class generates a Star Wars-like name based on the provided input data.
 *
 * @Emma Lee, Samson Ordonez
 */
public class StarWarsName {
    private static final int FIRST_NAME_LENGTH = 3;
    private static final int LAST_NAME_LENGTH = 2;
    private static final int MAIDEN_NAME_LENGTH = 2;
    private static final int CITY_NAME_LENGTH = 3;

    private static final int ARGUMENT_LENGTH = 4;
    private static final int FIRST_NAME = 0;
    private static final int LAST_NAME = 1;
    private static final int MAIDEN_NAME = 2;
    private static final int CITY_NAME = 3;
    private static final int PROGRAM_INPUT = 0;


    /**
     * Generates a Star Wars-like name based on the provided input data.
     *
     * @param input                         The input string containing name parts separated by a pipe character (|)
     * @return                              The generated Star Wars-like name
     * @throws IllegalArgumentException     if the input data is invalid
     */
    public static String generateStarWarsName(final String input)
    {
        if(input == null || input.isEmpty())
        {
            throw new IllegalArgumentException("missing data input");
        }

        final String[] data;

        data = input.split("\\|");

        if(data.length != ARGUMENT_LENGTH)
        {
            throw new IllegalArgumentException("incorrect number of words provided");
        }

        final String firstName;
        final String lastName;
        final String maidenName;
        final String cityName;

        firstName = data[FIRST_NAME].substring(FIRST_NAME, FIRST_NAME_LENGTH).toLowerCase();
        lastName = data[LAST_NAME].substring(FIRST_NAME, LAST_NAME_LENGTH).toLowerCase();
        maidenName = data[MAIDEN_NAME].substring(FIRST_NAME, MAIDEN_NAME_LENGTH).toLowerCase();
        cityName = data[CITY_NAME].substring(CITY_NAME, CITY_NAME_LENGTH).toLowerCase();

        final String starWarsFirstName;
        final String starWarsLastName;

        starWarsFirstName = firstName + lastName;
        starWarsLastName = maidenName + cityName;

        final StringBuilder sb;

        sb = new StringBuilder();
        sb.append("Your Star Wars name is: ")
                .append(starWarsFirstName)
                .append(" ")
                .append(starWarsLastName);

        final String result;
        
        result = sb.toString();

        return result;
    }

    public static void main(String[] args) {
        if (args.length == PROGRAM_INPUT)
        {
            throw new IllegalArgumentException("missing data input");
        }

        String result = generateStarWarsName(args[PROGRAM_INPUT]);
        System.out.println(result);
    }
}