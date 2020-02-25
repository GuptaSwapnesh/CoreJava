package string.immutable;

public final class ImmutableWithMutableField {

    private final String fName;
    private final String lName;
    private final String address;

    private ImmutableWithMutableField(String fName, String lName, String address) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    public static ImmutableWithMutableField getInstance(String fName, String lName, String address) {
        return new ImmutableWithMutableField(fName, lName, address);
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ImmutableWithMutableField{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
