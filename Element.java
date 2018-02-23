public class Element {
    int key;
    Element next;

    public Element(int key){
	this.key = key;
    }
    
    public Element(int key, Element next){
	this.key = key;
	this.next = next;
    }
    
    public String toString(){
	return "\"(" + key + ")\"";
    }

    public static void main(String[] args) {
	Element element = new Element(42);
	System.out.println(element.toString());
    }
}
