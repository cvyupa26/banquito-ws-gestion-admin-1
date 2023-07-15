package ec.edu.espe.arquitectura.banquitowsgestionadmin.controller.dto;

import ec.edu.espe.arquitectura.banquitowsgestionadmin.model.GeoLocation;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GeoStructureRS {
    private Integer levelCode;
    private String name;
    private List<GeoLocation> locations;
}
