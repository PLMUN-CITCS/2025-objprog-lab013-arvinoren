public class ParametersAndArguments {
    public static void main(String[] args) {
        // Declare variables for room dimensions
        int roomWidth = 10;
        int roomHeight = 15;

        // Call the calculateArea method and store the result
        int area = calculateArea(roomWidth, roomHeight);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);
    }

    // Method to calculate the area of a room
    public static int calculateArea(int width, int height) {
        int area = width * height; // Multiply width and height to get the area
        return area; // Return the calculated area
    }
}
