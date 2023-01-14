import DataContainer;
import Attributed;
import AttributedDataContainer;

import java.util.List;

/**
 * @param <T>
 * @param <T>
 */

public class NestedDataContainer<T,V extends Attributed<T>> {

    private DataContainer<AttributedDataContainer<V>> data = new DataContainer();

    public void setNestedData(V nestedData){
        AttributedDataContainer<V> c = new AttributedDataContainer<>();
        c.setData(nestedData);
        data.setData(c);
    }

    public AttributedDataContainer<V> getData() {
       
        return data.getData();
    }

}
