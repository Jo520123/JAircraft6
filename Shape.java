package JoAirspaceRoutes.geography;

public abstract class Shape {


    public String toWkt()
    {

        String wkt = this.convertToWkt();

        if (this.theWktValid(wkt))
        {

            return wkt;

        }

        throw new RuntimeException("Can't draw shape");


    }


    protected abstract String convertToWkt();



    private boolean theWktValid(String wkt)
    {
        if (wkt == null || wkt.length() == 0)
        {

            return false;

        }



        return wkt.startsWith("Coordinate") || wkt.startsWith("LINESTRING") || wkt.startsWith("POLYGON");



    }











}
