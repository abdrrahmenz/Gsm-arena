package id.or.qodr.gsmarena.adapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adul on 11/01/17.
 */
public class ArrayAdapter<T> extends TypeAdapter<List<T>> {
    private Class<T> adapterclass;

    public ArrayAdapter(Class<T> adapterclass) {
        this.adapterclass = adapterclass;
    }

    @Override
    public void write(JsonWriter out, List<T> value) throws IOException {

    }

    @Override
    public List<T> read(JsonReader in) throws IOException {
        List<T> list = new ArrayList<T>();
        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new ArrayAdapterFactory())
                .create();

        if (in.peek() == JsonToken.BEGIN_OBJECT) {
            T inning = gson.fromJson(in, adapterclass);
            list.add(inning);
        }else if (in.peek() == JsonToken.BEGIN_ARRAY) {
            in.beginArray();
            while (in.hasNext()) {
                T inning = gson.fromJson(in, adapterclass);
                list.add(inning);
            }
            in.endArray();
        }
        return list;
    }
}
