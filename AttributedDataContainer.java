
public class AttributedDataContainer<T> {

    private double lat;
    private double lon;

    private T t; 
   

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

 
     public T getData() {return t;}
    
     public void setData(T t) {this.t=t;}
     
}
