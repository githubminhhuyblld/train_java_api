package app.enums;

import java.util.Arrays;


public enum DeleteFlag {
	NOT_DELETED(0), DELETED(1);

	private final int value;

	DeleteFlag(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static DeleteFlag fromValue(int value) {
		for (DeleteFlag flag : DeleteFlag.values()) {
			if (flag.getValue() == value) {
				return flag;
			}
		}
		throw new IllegalArgumentException(
				"Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
	}
}
