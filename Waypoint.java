package JoAirspaceRoutes.geography;

public final class Waypoint extends Shape {

    private final String name;
    private final LatLon location;


    public Waypoint(String name, LatLon location)
    {

        this.name = name;
        this.location = location;

    }


    @Override

    protected String convertToWkt()
    {

        StringBuilder b = new StringBuilder();
        b.append("Coordinate (")
                .append(this.location.getLon())
                .append(" ")
                .append(this.location.getLat())
                .append(")");

        return b.toString();

    }









}
