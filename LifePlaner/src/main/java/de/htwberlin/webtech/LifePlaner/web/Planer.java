package de.htwberlin.webtech.LifePlaner.web;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Planer {

        private String title;
        private String description;
        private double startTime;
        private double endTime;
        private String location;
    }


