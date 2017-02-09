package id.or.qodr.gsmarena;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import id.or.qodr.gsmarena.model.AllProductModel;
import id.or.qodr.gsmarena.model.DetailsProductModel;
import id.or.qodr.gsmarena.parser.BrandsData;

public class DetailsProduct extends AppCompatActivity {

    private RecyclerView rvDetails;
    private ProgressDialog pDialog;
    private DetailsProductModel.DataBean dataDetails;
    private String URL_LIST_DETAILS = "http://ibacor.com/api/gsm-arena?view=product&slug=";
    private String slugDetails = null;

    private TextView titleDetail, status, tecnology, bands2g, bands3g, bands4g, speed, gprs, edge;
    private TextView announched, dimension, weight, sim;
    private TextView display, type, size, resolution,multitouch,protection;
    private TextView platform, os, chipset, cpu,gpu;
    private TextView memory, cardslot, internal;
    private TextView camera, primary, featurescamera,video, secondary;
    private TextView sound, alerttype, loudspeker, jack35mm;
    private TextView comms, wlan, blutoth, gps, nfc, radio, usb;
    private TextView features, sensor, messaging, browser,featurjava;
    private TextView battery, empty, stanby, talktime, musicplay;
    private TextView misc, colors, sar_us, sar_eu, pricegroup;
    private TextView tests, performance, displaytest, cameratest, loudspekertest, audioquality, batterylife;
    private ImageView imgDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_product);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgDetails = (ImageView) findViewById(R.id.imgDetails);
        titleDetail = (TextView) findViewById(R.id.titleDetails);
        tecnology = (TextView) findViewById(R.id.technology);
        bands2g = (TextView) findViewById(R.id.bands2g);
        bands3g = (TextView) findViewById(R.id.bands3g);
        bands4g = (TextView) findViewById(R.id.bands4g);
        speed = (TextView) findViewById(R.id.speed);
        gprs = (TextView) findViewById(R.id.gprs);
        edge = (TextView) findViewById(R.id.edge);

        status = (TextView) findViewById(R.id.status);
        announched = (TextView) findViewById(R.id.anounched);


        dimension = (TextView) findViewById(R.id.dimension);
        weight = (TextView) findViewById(R.id.weight);
        sim = (TextView) findViewById(R.id.sim);

        display = (TextView) findViewById(R.id.display);
        type = (TextView) findViewById(R.id.type);
        size = (TextView) findViewById(R.id.size);
        resolution = (TextView) findViewById(R.id.resolution);
        multitouch = (TextView) findViewById(R.id.multitouch);
        protection = (TextView) findViewById(R.id.protection);

        platform = (TextView) findViewById(R.id.platform);
        os = (TextView) findViewById(R.id.os);
        chipset = (TextView) findViewById(R.id.chipset);
        cpu = (TextView) findViewById(R.id.cpu);
        gpu = (TextView) findViewById(R.id.gpu);

        memory = (TextView) findViewById(R.id.memory);
        cardslot = (TextView) findViewById(R.id.cardslot);
        internal = (TextView) findViewById(R.id.internal);

        camera = (TextView) findViewById(R.id.camera);
        primary = (TextView) findViewById(R.id.primary);
        featurescamera = (TextView) findViewById(R.id.featurescamera);
        video = (TextView) findViewById(R.id.video);
        secondary = (TextView) findViewById(R.id.secondary);

        sound = (TextView) findViewById(R.id.sound);
        alerttype = (TextView) findViewById(R.id.alerttype);
        loudspeker = (TextView) findViewById(R.id.loudspeaker);
        jack35mm = (TextView) findViewById(R.id.mm3jack);

        comms = (TextView) findViewById(R.id.comms);
        wlan = (TextView) findViewById(R.id.wlan);
        blutoth = (TextView) findViewById(R.id.bluetooth);
        gps = (TextView) findViewById(R.id.gps);
        nfc = (TextView) findViewById(R.id.nfc);
        radio = (TextView) findViewById(R.id.radio);
        usb = (TextView) findViewById(R.id.usb);

        features = (TextView) findViewById(R.id.features);
        sensor = (TextView) findViewById(R.id.sensor);
        messaging = (TextView) findViewById(R.id.messaging);
        browser = (TextView) findViewById(R.id.browser);
        featurjava = (TextView) findViewById(R.id.java);

        battery = (TextView) findViewById(R.id.batery);
        empty = (TextView) findViewById(R.id.empty);
        stanby = (TextView) findViewById(R.id.stanby);
        talktime = (TextView) findViewById(R.id.talktime);
        musicplay = (TextView) findViewById(R.id.musicplay);

        misc = (TextView) findViewById(R.id.misc);
        colors = (TextView) findViewById(R.id.colors);
        sar_us = (TextView) findViewById(R.id.sar_us);
        sar_eu = (TextView) findViewById(R.id.sar_eu);
        pricegroup = (TextView) findViewById(R.id.pricegroup);

        tests = (TextView) findViewById(R.id.test);
        performance = (TextView) findViewById(R.id.performance);
        displaytest = (TextView) findViewById(R.id.displaytest);
        cameratest = (TextView) findViewById(R.id.cameratest);
        loudspekertest = (TextView) findViewById(R.id.loudpekertest);
        audioquality = (TextView) findViewById(R.id.audioquality);
        batterylife = (TextView) findViewById(R.id.baterylife);

        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            slugDetails = extras.getString("idSlugDetails");
        }

        dataDetails = new DetailsProductModel.DataBean();

        rvDetails = (RecyclerView) findViewById(R.id.rcvProduct);

        getDetailsProduct(URL_LIST_DETAILS + slugDetails );
        Log.d("TAG", "onCreate: "+URL_LIST_DETAILS + slugDetails);
        Toast.makeText(this, ""+URL_LIST_DETAILS + slugDetails, Toast.LENGTH_SHORT).show();
    }

    public void getDetailsProduct(String URL) {
        JsonObjectRequest request = new JsonObjectRequest(URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                Gson gson = new GsonBuilder().create();
                    DetailsProductModel result = gson.fromJson(response.toString(), DetailsProductModel.class);

                    titleDetail.setText(result.getTitle().toString());
                    Glide.with(getApplicationContext()).load(result.getImg()).into(imgDetails);
                    tecnology.setText(result.getData().getNetwork().getTechnology().toString());
                    bands2g.setText(result.getData().getNetwork().getValue2g_bands().toString());
                    String bands = result.getData().getNetwork().getValue3g_bands().toString();
                    bands3g.setText(bands==null?"":bands);
//                    bands4g.setText(result.getData().getNetwork().getValue4g_bands().toString());
//                    speed.setText(result.getData().getNetwork().getSpeed().toString());
//                    gprs.setText(result.getData().getNetwork().getGprs().toString());
//                    edge.setText(result.getData().getNetwork().getEdge().toString());
//
//                    announched.setText(result.getData().getLaunch().getAnnounced().toString());
//                    status.setText(result.getData().getLaunch().getStatus().toString());
//
//                    dimension.setText(result.getData().getBody().getDimensions().toString());
//                    weight.setText(result.getData().getBody().getWeight().toString());
//                    sim.setText(result.getData().getBody().getSim().toString());
//
//                    type.setText(result.getData().getDisplay().getType().toString());
//                    size.setText(result.getData().getDisplay().getSize().toString());
//                    resolution.setText(result.getData().getDisplay().getResolution().toString());
//                    multitouch.setText(result.getData().getDisplay().getMultitouch().toString());
//                    protection.setText(result.getData().getDisplay().getProtection().toString());
//
//                    os.setText(result.getData().getPlatform().getOs().toString());
//                    chipset.setText(result.getData().getPlatform().getChipset().toString());
//                    cpu.setText(result.getData().getPlatform().getCpu().toString());
//                    gpu.setText(result.getData().getPlatform().getGpu().toString());
//
//                    cardslot.setText(result.getData().getMemory().getCard_slot().toString());
//                    internal.setText(result.getData().getMemory().getInternal().toString());
//
//                    primary.setText(result.getData().getCamera().getPrimary().toString());
//                    featurescamera.setText(result.getData().getCamera().getFeatures().toString());
//                    video.setText(result.getData().getCamera().getVideo().toString());
//                    secondary.setText(result.getData().getCamera().getSecondary().toString());
//
//                    alerttype.setText(result.getData().getSound().getAlert_types().toString());
//                    loudspeker.setText(result.getData().getSound().getLoudspeaker_().toString());
//                    jack35mm.setText(result.getData().getSound().getValue35mm_jack_().toString());
//
//                    wlan.setText(result.getData().getComms().getWlan().toString());
//                    blutoth.setText(result.getData().getComms().getBluetooth().toString());
//                    gps.setText(result.getData().getComms().getGps().toString());
//                    nfc.setText(result.getData().getComms().getNfc().toString());
//                    radio.setText(result.getData().getComms().getRadio().toString());
//                    usb.setText(result.getData().getComms().getUsb().toString());
//
//                    sensor.setText(result.getData().getFeatures().getSensors().toString());
//                    messaging.setText(result.getData().getFeatures().getMessaging().toString());
//                    browser.setText(result.getData().getFeatures().getBrowser().toString());
//                    featurjava.setText(result.getData().getFeatures().getJava().toString());
//
//                    empty.setText(result.getData().getBattery().get_empty_().toString());
//                    stanby.setText(result.getData().getBattery().getStand_by().toString());
//                    talktime.setText(result.getData().getBattery().getTalk_time().toString());
//                    musicplay.setText(result.getData().getBattery().getMusic_play().toString());
//
//                    colors.setText(result.getData().getMisc().getColors().toString());
//                    sar_us.setText(result.getData().getMisc().getSar_us().toString());
//                    sar_eu.setText(result.getData().getMisc().getSar_eu().toString());
//                    pricegroup.setText(result.getData().getMisc().getPrice_group().toString());
//
//                    performance.setText(result.getData().getTests().getPerformance().toString());
//                    displaytest.setText(result.getData().getTests().getDisplay().toString());
//                    cameratest.setText(result.getData().getTests().getCamera().toString());
//                    loudspekertest.setText(result.getData().getTests().getLoudspeaker().toString());
//                    audioquality.setText(result.getData().getTests().getAudio_quality().toString());
//                    batterylife.setText(result.getData().getTests().getBattery_life().toString());




            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
        RequestQueue queue = Volley.newRequestQueue(this);

        request.setRetryPolicy(new DefaultRetryPolicy(
                3000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(request);
    }
}
