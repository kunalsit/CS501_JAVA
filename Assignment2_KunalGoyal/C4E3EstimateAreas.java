public class C4E3EstimateAreas {

    private static final double EARTHRADIUS = 6371.01;

    public static void main(String[] args) {

        //Description of the program
        System.out.println("This program will find if the distance between four GPS Locations: Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina");        System.out.println();
        System.out.println();
        
        //Coordinates for Atlanta, Georgia
        double atlantaGeoY = -84.3879824;
        double atlantaGeoX = 33.7489954;

        //Coordinates for Orlando, Florida
        double orlandoFLY = -81.3792364999;
        double orlandoFLX = 28.5383355;

        //Coordinates for Savannah, Georgia
        double SavannahGeoY = -81.09983419999998;
        double SavannahGeoX = 32.0835407;

        //Coordinates for Charlotte, North Carolina
        double charlotteNCY = -80.84312669999997;
        double charlotteNCX = 35.2270869;

        // Getting sides for 2 triangles
        double t1Side1 = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(atlantaGeoX)) * Math.sin(Math.toRadians(SavannahGeoX)) +
                        Math.cos(Math.toRadians(atlantaGeoX)) * Math.cos(Math.toRadians(SavannahGeoX)) * Math.cos(Math.toRadians(atlantaGeoY - SavannahGeoY)));
        double t1Side2 = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(SavannahGeoX)) * Math.sin(Math.toRadians(charlotteNCX)) +
                        Math.cos(Math.toRadians(SavannahGeoX)) * Math.cos(Math.toRadians(charlotteNCX)) * Math.cos(Math.toRadians(SavannahGeoY - charlotteNCY)));
        double t1Side3 = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(atlantaGeoX)) * Math.sin(Math.toRadians(SavannahGeoX)) +
                        Math.cos(Math.toRadians(atlantaGeoX)) * Math.cos(Math.toRadians(SavannahGeoX)) * Math.cos(Math.toRadians(atlantaGeoY - SavannahGeoY)));

        double t2Side1 = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(atlantaGeoX)) * Math.sin(Math.toRadians(orlandoFLX)) +
                        Math.cos(Math.toRadians(atlantaGeoX)) * Math.cos(Math.toRadians(orlandoFLX)) * Math.cos(Math.toRadians(atlantaGeoY - orlandoFLY)));
        double t2Side2 = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(orlandoFLX)) * Math.sin(Math.toRadians(SavannahGeoX)) +
                        Math.cos(Math.toRadians(orlandoFLX)) * Math.cos(Math.toRadians(SavannahGeoX)) * Math.cos(Math.toRadians(orlandoFLY - SavannahGeoY)));
        double t2Side3 = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(SavannahGeoX)) * Math.sin(Math.toRadians(atlantaGeoX)) +
                        Math.cos(Math.toRadians(SavannahGeoX)) * Math.cos(Math.toRadians(atlantaGeoX)) * Math.cos(Math.toRadians(SavannahGeoY - atlantaGeoY)));

        // Testing to see if both triangles are real triangles
        boolean isTriangle1 = ((t1Side1 + t1Side2 > t1Side3) && (t1Side1 + t1Side3 > t1Side2) && (t1Side3 + t1Side2 > t1Side1));
        boolean isTriangle2 = ((t2Side1 + t2Side2 > t2Side3) && (t2Side1 + t2Side3 > t2Side2) && (t2Side3 + t2Side2 > t2Side1));


        // If they are a triangle, add both areas to ge total area
        if (isTriangle1 && isTriangle2) {
            double s1 = (t1Side1 + t1Side2 + t1Side3) / 2.0;
            double area1 = Math.pow(s1 * (s1 - t1Side1) * (s1 - t1Side2) * (s1 - t1Side3), 0.5);
            double s2 = (t2Side1 + t2Side2 + t2Side3) / 2.0;
            double area2 = Math.pow(s2 * (s2 - t2Side1) * (s2 - t2Side2) * (s2 - t2Side3), 0.5);
            
            System.out.printf("Triangle 1: %f -- %f -- %f   : area = %f\n", t1Side1, t1Side2, t1Side3, area1);
            System.out.printf("Triangle 2: %f -- %f -- %f   : area = %f\n", t2Side1, t2Side2, t2Side3, area2);
            double totalArea = area1 + area2;
            System.out.println("The area enclosed by 4 cities is " + totalArea + " km^2");
        } else {
            System.out.println("The coordinates are incorrect");
        }

    }

 

}
