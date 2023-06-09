package com.springBoot.miniProject.models;



        import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
        import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
        import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;
        import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@DynamoDBTable(tableName = "movies")
public class Movie {

    @DynamoDBHashKey
    private String imdb_title_id;
    @DynamoDBAttribute
    private String title;
    @DynamoDBAttribute
    private String original_title;
    @DynamoDBAttribute
    private String year;
    @DynamoDBAttribute
    private String date_published;
    @DynamoDBAttribute
    private String genre;
    @DynamoDBAttribute
    private String duration;
    @DynamoDBAttribute
    private String country;
    @DynamoDBAttribute
    private String language;
    @DynamoDBAttribute
    private String director;
    @DynamoDBAttribute
    private String writer;
    @DynamoDBAttribute
    private String production_company;
    @DynamoDBAttribute
    private String actors;
    @DynamoDBAttribute
    private String description;
    @DynamoDBAttribute
    private String avg_vote;
    @DynamoDBAttribute
    private String votes;
    @DynamoDBAttribute
    private String budget;
    @DynamoDBAttribute
    private String usa_gross_income;
    @DynamoDBAttribute
    private String worlwide_gross_income;
    @DynamoDBAttribute
    private String metasocre;
    @DynamoDBAttribute
    private String reviews_from_users;
    @DynamoDBAttribute
    private String reviews_from_critics;


}