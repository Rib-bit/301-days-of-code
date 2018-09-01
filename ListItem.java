package masterclass;

public abstract class ListItem {
    protected ListItem rightLink = null; //protected is a step above from package-private : it can be accessed by subclasses from this package
    //and subclasses in other packages
    protected ListItem leftLink = null;
    //creating instances of this very class within itself

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
