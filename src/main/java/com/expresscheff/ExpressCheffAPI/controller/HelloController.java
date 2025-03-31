package com.expresscheff.ExpressCheffAPI.controller;

import com.expresscheff.ExpressCheffAPI.error.ErrorResponse;
import com.expresscheff.ExpressCheffAPI.response.HelloResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;


@Tag(name = "Hello Project API's", description = "All about Project related operations like create/update/delete")
@RequestMapping("/v1/api")
public interface HelloController {
    @Operation
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Create a new project",
                    content = {@Content(
                            schema = @Schema(implementation = HelloResponse.class)
                    )}),
            @ApiResponse(responseCode = "400", description = "Issue with Request",
                    content = {@Content(
                            schema = @Schema(implementation = ErrorResponse.class)
                    )}),
            @ApiResponse(responseCode = "500", description = "Internal Server Error",
                    content = {@Content(
                            schema = @Schema(implementation = ErrorResponse.class)
                    )})
    })
    @Parameter(name = "no arguments required ", description = "")
    @GetMapping("/hello")
    public HelloResponse sayHello();

}