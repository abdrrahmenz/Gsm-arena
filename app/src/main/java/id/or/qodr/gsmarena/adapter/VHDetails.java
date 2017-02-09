package id.or.qodr.gsmarena.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.or.qodr.gsmarena.R;

/**
 * Created by adul on 17/01/17.
 */
public class VHDetails extends RecyclerView.ViewHolder {

    public TextView titleDetail, network, tecnology, bands2g, bands3g, bands4g, speed, gprs, edge;
    public TextView body, dimension, weight, sim;
    public TextView display, type, size, resolution,multitouch,protection;
    public TextView platform, os, chipset, cpu,gpu;
    public TextView memory, cardslot, internal;
    public TextView camera, primary, featurescamera,video, secondary;
    public TextView sound, alerttype, loudspeker, jack35mm;
    public TextView comms, wlan, blutoth, gps, nfc, radio, usb;
    public TextView features, sensor, messaging, browser,featurjava;
    public TextView battery, empty, stanby, talktime, musicplay;
    public TextView misc, colors, sar_us, sar_eu, pricegroup;
    public TextView tests, performance, displaytest, cameratest, loudspekertest, audioquality, batterylife;

    public ImageView imgDetails;

    public VHDetails(View itemView) {
        super(itemView);
        imgDetails = (ImageView) itemView.findViewById(R.id.imgDetails);
        titleDetail = (TextView) itemView.findViewById(R.id.titleDetails);
        network = (TextView) itemView.findViewById(R.id.network);
        tecnology = (TextView) itemView.findViewById(R.id.technology);
        bands2g = (TextView) itemView.findViewById(R.id.bands2g);
        bands3g = (TextView) itemView.findViewById(R.id.bands3g);
        bands4g = (TextView) itemView.findViewById(R.id.bands4g);
        speed = (TextView) itemView.findViewById(R.id.speed);
        gprs = (TextView) itemView.findViewById(R.id.gprs);
        edge = (TextView) itemView.findViewById(R.id.edge);

        body = (TextView) itemView.findViewById(R.id.body);
        dimension = (TextView) itemView.findViewById(R.id.dimension);
        weight = (TextView) itemView.findViewById(R.id.weight);
        sim = (TextView) itemView.findViewById(R.id.sim);

        display = (TextView) itemView.findViewById(R.id.display);
        type = (TextView) itemView.findViewById(R.id.type);
        size = (TextView) itemView.findViewById(R.id.size);
        resolution = (TextView) itemView.findViewById(R.id.resolution);
        multitouch = (TextView) itemView.findViewById(R.id.multitouch);
        protection = (TextView) itemView.findViewById(R.id.protection);

        platform = (TextView) itemView.findViewById(R.id.platform);
        os = (TextView) itemView.findViewById(R.id.os);
        chipset = (TextView) itemView.findViewById(R.id.chipset);
        cpu = (TextView) itemView.findViewById(R.id.cpu);
        gpu = (TextView) itemView.findViewById(R.id.gpu);

        memory = (TextView) itemView.findViewById(R.id.memory);
        cardslot = (TextView) itemView.findViewById(R.id.cardslot);
        internal = (TextView) itemView.findViewById(R.id.internal);

        camera = (TextView) itemView.findViewById(R.id.camera);
        primary = (TextView) itemView.findViewById(R.id.primary);
        featurescamera = (TextView) itemView.findViewById(R.id.featurescamera);
        video = (TextView) itemView.findViewById(R.id.video);
        secondary = (TextView) itemView.findViewById(R.id.secondary);

        sound = (TextView) itemView.findViewById(R.id.sound);
        alerttype = (TextView) itemView.findViewById(R.id.alerttype);
        loudspeker = (TextView) itemView.findViewById(R.id.loudspeaker);
        jack35mm = (TextView) itemView.findViewById(R.id.mm3jack);

        comms = (TextView) itemView.findViewById(R.id.comms);
        wlan = (TextView) itemView.findViewById(R.id.wlan);
        blutoth = (TextView) itemView.findViewById(R.id.bluetooth);
        gps = (TextView) itemView.findViewById(R.id.gps);
        nfc = (TextView) itemView.findViewById(R.id.nfc);
        radio = (TextView) itemView.findViewById(R.id.radio);
        usb = (TextView) itemView.findViewById(R.id.usb);

        features = (TextView) itemView.findViewById(R.id.features);
        sensor = (TextView) itemView.findViewById(R.id.sensor);
        messaging = (TextView) itemView.findViewById(R.id.messaging);
        browser = (TextView) itemView.findViewById(R.id.browser);
        featurjava = (TextView) itemView.findViewById(R.id.java);

        battery = (TextView) itemView.findViewById(R.id.batery);
        empty = (TextView) itemView.findViewById(R.id.empty);
        stanby = (TextView) itemView.findViewById(R.id.stanby);
        talktime = (TextView) itemView.findViewById(R.id.talktime);
        musicplay = (TextView) itemView.findViewById(R.id.musicplay);

        misc = (TextView) itemView.findViewById(R.id.misc);
        colors = (TextView) itemView.findViewById(R.id.colors);
        sar_us = (TextView) itemView.findViewById(R.id.sar_us);
        sar_eu = (TextView) itemView.findViewById(R.id.sar_eu);
        pricegroup = (TextView) itemView.findViewById(R.id.pricegroup);

        tests = (TextView) itemView.findViewById(R.id.test);
        performance = (TextView) itemView.findViewById(R.id.performance);
        displaytest = (TextView) itemView.findViewById(R.id.displaytest);
        cameratest = (TextView) itemView.findViewById(R.id.cameratest);
        loudspekertest = (TextView) itemView.findViewById(R.id.loudpekertest);
        audioquality = (TextView) itemView.findViewById(R.id.audioquality);
        batterylife = (TextView) itemView.findViewById(R.id.baterylife);
    }
}
