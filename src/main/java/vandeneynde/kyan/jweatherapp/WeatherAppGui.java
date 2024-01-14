package vandeneynde.kyan.jweatherapp;

import javax.swing.*;

public class WeatherAppGui extends JFrame {
    public WeatherAppGui() {
        // Set the window title
        super("Weather App");

        // Once the gui is closed, end the programs process
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set the size of the window in pixels
        setSize(450, 650);

        // Set the position of the GUI to the center of the screen
        setLocationRelativeTo(null);

        // Make it so the components of the GUI can be manually positioned
        setLayout(null);

        // Prevent the GUI from being resized
        setResizable(false);
    }
}
