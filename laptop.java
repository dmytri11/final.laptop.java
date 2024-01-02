
public class laptop{
    int RAM;
    int DC;
    String system;
    String color;
    
    @Override
    public String toString() {
        return "RAM size: " + RAM + ", Hard drive capacity: " + DC + ", System type: " + system + ", Laptop color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof laptop){
            laptop llaptop = (laptop) obj;
            return RAM == llaptop.RAM && DC == llaptop.DC && system.equals(llaptop.system) && color.equals(llaptop.color); 
        }
    return false;
    }
    @Override
    public int hashCode() {
        return RAM + 8*DC + 9*system.hashCode() + 10*color.hashCode();
    }
}
