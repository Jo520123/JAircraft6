package JoAirspaceRoutes;

import JoAirspaceRoutes.geography.LatLon;
import JoAirspaceRoutes.geography.Route;
import JoAirspaceRoutes.geography.Shape;
import JoAirspaceRoutes.geography.Waypoint;

import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        //Create an airspace
        List<Shape> asp = List.of(
                new Waypoint("CREOL", new LatLon(41,30.3)),
                new Waypoint("ZIDCO", new LatLon(25, 80)),
                new Waypoint("RYTHM", new LatLon(26, 45)),
                new Route("R1",
                        new LatLon(5.5, 50.3),
                        new LatLon(5.7, 50.7),
                        new LatLon(5.9, 50.9))
                );



        //Print Wkt for drawing on screen

        asp.forEach(x -> {System.out.println(x.toWkt());});


    }


}
