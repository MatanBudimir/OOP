package trece.prvi;

import trece.prvi.Point;

public class PointOperations {
    public static Point getPointMostDistantFromOrigin(Point ...points) {
        Point point = new Point(0.0, 0.0);

        double max = point.distanceToPoint(points[0]);
        Point p = points[0];

        for (int i = 1; i < points.length; i++) {
            double distance = point.distanceToPoint(points[i]);

            if (max < distance) {
                p = points[i];
                max = distance;
            }
        }

        return p;
    }
}
