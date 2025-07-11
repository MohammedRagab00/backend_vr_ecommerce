package com.gotrid.trid.api.shop.dto;

import com.gotrid.trid.api.threedModel.dto.ModelUpdateRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@Schema(description = "DTO for partial update of a shop. Files (logo, glbModel, photos) are optional, as well as standard fields.")
public class ShopUpdateRequest extends ModelUpdateRequest {

    @Schema(description = "Updated shop name")
    private String name;

    @Schema(description = "Updated category")
    private String category;

    @Schema(description = "Updated location")
    private String location;

    @Schema(description = "Updated description")
    private String description;

    @Schema(description = "Updated email")
    private String email;

    @Schema(description = "Updated phone")
    private String phone;

    @Schema(description = "Updated shop logo file")
    private MultipartFile logo;
}