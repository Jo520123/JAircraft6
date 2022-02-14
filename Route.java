package JoAirspaceRoutes.geography;


import java.util.List;
//import static java.util.List.of;

public final class Route extends Shape{

    private final String name;
    private final List<LatLon> location;

    public Route(String name, LatLon... location)
    {

        this.name = name;
        this.location = List.of(location);

    }


    @Override
    protected String convertToWkt()
    {

        StringBuilder b = new StringBuilder();

        b.append("LINESTRING (");
        for (int i = 0; i < location.size(); i++ )
        {
            LatLon xy = location.get(i);

            b.append(xy.getLon() + " " + xy.getLat());

            if (i < location.size() -1)
            {

                b.append(" , ");

            }


        }

        b.append(")");

        return b.toString();


    }



}
