class Child extends Parent {
    private int value;
    public Child(String n, int v) {
        super(n);
        System.out.println("Child constructor");
        value = v;
    }
    public int getValue() { return value; }
    public void setValue(int v) { value = v; }
}

