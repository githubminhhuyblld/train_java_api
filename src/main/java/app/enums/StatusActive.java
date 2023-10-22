package app.enums;

import java.util.Arrays;

public enum StatusActive {
    ACTIVE("ACTIVE"),
    UN_ACTIVE("UN_ACTIVE");

    private final String value;

    StatusActive(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static StatusActive fromValue(String value) {
        for (StatusActive status : StatusActive.values()) {
            if (status.getValue().equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
    }
}

