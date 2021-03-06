package mcconverter;

import mcconverter.coordinates.Coordinate;
import mcconverter.exporter.Exporter;
import mcconverter.exporter.PointsCoordinatesExport;

import java.util.List;

import static mcconverter.Const.EXPORT_PATH;
import static mcconverter.Const.SILO_COORDS_IMPORT_PATH;

/**
 * Created by darryl on 20-6-15.
 */
public class RunPointsExport {
    public static void main(String[] args) {
        Exporter reader = new PointsCoordinatesExport(EXPORT_PATH, SILO_COORDS_IMPORT_PATH);
        List<Coordinate> coordinates = reader.readData();
        reader.exportData(coordinates);
    }
}