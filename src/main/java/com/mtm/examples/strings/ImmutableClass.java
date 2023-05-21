package com.mtm.examples.strings;

// 1. class should be final
// 2. member variables should be final
// 3. parameterized constructor
// 4. no setter methods only getter methods

public final class ImmutableClass {

    final String pancardNumber;

    public ImmutableClass(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }

}
