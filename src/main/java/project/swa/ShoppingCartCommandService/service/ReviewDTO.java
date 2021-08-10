package project.swa.ShoppingCartCommandService.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReviewDTO {
    private String title;
    private String description;
    private double score;

    public ReviewDTO(String title, String description, double score) {
        this.title = title;
        this.description = description;
        this.score = score;
    }
}
