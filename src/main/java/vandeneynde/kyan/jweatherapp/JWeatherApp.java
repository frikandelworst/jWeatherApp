package vandeneynde.kyan.jweatherapp;

import javax.swing.*;

public class JWeatherApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create & display our GUI
                new WeatherAppGui().setVisible(true);
            }
        });
    }
}
