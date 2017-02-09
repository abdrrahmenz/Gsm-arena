package id.or.qodr.gsmarena.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by adul on 11/01/17.
 */

public class AllBrandsModel implements Parcelable {

    public String title, count, slug;

    protected AllBrandsModel(Parcel in) {
        title = in.readString();
        count = in.readString();
        slug = in.readString();
    }

    public static final Creator<AllBrandsModel> CREATOR = new Creator<AllBrandsModel>() {
        @Override
        public AllBrandsModel createFromParcel(Parcel in) {
            return new AllBrandsModel(in);
        }

        @Override
        public AllBrandsModel[] newArray(int size) {
            return new AllBrandsModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(count);
        dest.writeString(slug);
    }
}
