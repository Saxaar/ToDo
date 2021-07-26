package todo.model;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum Priority {
    VERYIMPORTANT("Очень важно"), IMPORTANT("Важно"), NOTVERYIMPORTANT("Не очень важно");
    private final String value;
}
