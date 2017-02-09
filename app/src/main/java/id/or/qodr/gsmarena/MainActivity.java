package id.or.qodr.gsmarena;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.or.qodr.gsmarena.model.AllBrandsModel;
import id.or.qodr.gsmarena.parser.BrandsData;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBrands;
    private BrandsData brandsData;
    private List<AllBrandsModel> brands;
    private String URL_LIST_BRANDS = "http://ibacor.com/api/gsm-arena?view=brands";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brands = new ArrayList<AllBrandsModel>();
        brandsData = new BrandsData(this);

        rvBrands = (RecyclerView) findViewById(R.id.rcvBrands);

        brandsData.getAllBrands(rvBrands,URL_LIST_BRANDS);
        int hasil = 50000000*80/100;
        Toast.makeText(this, ""+hasil, Toast.LENGTH_SHORT).show();

    }
}
