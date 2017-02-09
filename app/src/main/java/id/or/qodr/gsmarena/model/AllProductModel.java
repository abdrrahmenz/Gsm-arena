package id.or.qodr.gsmarena.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by adul on 14/01/17.
 */
public class AllProductModel implements Parcelable {

    public String title, img, slug;

    protected AllProductModel(Parcel in) {
        title = in.readString();
        img = in.readString();
        slug = in.readString();
    }

    public static final Creator<AllProductModel> CREATOR = new Creator<AllProductModel>() {
        @Override
        public AllProductModel createFromParcel(Parcel in) {
            return new AllProductModel(in);
        }

        @Override
        public AllProductModel[] newArray(int size) {
            return new AllProductModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(img);
        dest.writeString(slug);
    }
}
