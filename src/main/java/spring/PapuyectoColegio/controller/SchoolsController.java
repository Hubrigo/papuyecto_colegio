package spring.PapuyectoColegio.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.PapuyectoColegio.Service.SchoolsService;
import spring.PapuyectoColegio.dto.SchoolsRequestDTO;
import spring.PapuyectoColegio.entity.SchoolsEntity;
import spring.PapuyectoColegio.utils.ApiResponseDTO;
import spring.PapuyectoColegio.utils.Constants;

import javax.validation.Valid;

@Controller
@RestController
@AllArgsConstructor
@Log4j2
@RequestMapping(value = Constants.Paths.SCHOOLS_PATHS)
public class SchoolsController {

    @Qualifier("SchoolsService")
    private SchoolsService schoolsService;

    @PostMapping(value = "/create-school", consumes = { "application/json" }, produces = { "application/json" })
    public ResponseEntity<ApiResponseDTO<SchoolsEntity>> createShools (@Valid @RequestBody SchoolsRequestDTO request){

        return null;
    }


}
