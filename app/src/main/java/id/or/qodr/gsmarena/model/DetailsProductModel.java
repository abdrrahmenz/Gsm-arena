package id.or.qodr.gsmarena.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by adul on 16/01/17.
 */

public class DetailsProductModel {

    /**
     * status : sukses
     * title : Apple iPhone 7 Plus
     * img : http://cdn2.gsmarena.com/vv/bigpic/apple-iphone-7-plus-r2.jpg
     * data : {"network":{"technology":"GSM / CDMA / HSPA / EVDO / LTE","2g_bands":"GSM 850 / 900 / 1800 / 1900<br>- A1661, A1784<br>CDMA 800 / 1900 / 2100<br>- A1661","3g_bands":"HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100<br>- A1661, A1784<br>CDMA2000 1xEV-DO & TD-SCDMA<br>- A1661","4g_bands":"LTE band 1(2100), 2(1900), 3(1800), 4(1700/2100), 5(850), 7(2600), 8(900), 12(700), 13(700), 17(700), 18(800), 19(800), 20(800), 25(1900), 26(850), 27(800), 28(700), 29(700), 30(2300), 38(2600), 39(1900), 40(2300), 41(2500)<br>- A1661, A1784","speed":"HSPA 42.2/5.76 Mbps, LTE-A (3CA) Cat9 450/50 Mbps, EV-DO Rev.A 3.1 Mbps","gprs":"Yes","edge":"Yes"},"launch":{"announced":"2016, September","status":"Available. Released 2016, September"},"body":{"dimensions":"158.2 x 77.9 x 7.3 mm (6.23 x 3.07 x 0.29 in)","weight":"188 g (6.63 oz)","sim":"Nano-SIM<br>- IP67 certified<br>- dust and water resistant <br>- Water resistant up to 1 meter and 30 minutes <br>- Apple Pay (Visa, MasterCard, AMEX certified)"},"display":{"type":"LED-backlit IPS LCD, capacitive touchscreen, 16M colors","size":"5.5 inches (~67.7% screen-to-body ratio)","resolution":"1080 x 1920 pixels (~401 ppi pixel density)","multitouch":"Yes","protection":"Ion-strengthened glass, oleophobic coating<br>- Wide color gamut display <br>- 3D Touch display & home button <br>- Display Zoom"},"platform":{"os":"iOS 10.0.1, upgradable to iOS 10.2","chipset":"Apple A10 Fusion","cpu":"Quad-core 2.34 GHz (2x Hurricane + 2x Zephyr)","gpu":"PowerVR Series7XT Plus (six-core graphics)"},"memory":{"card_slot":"No","internal":"32/128/256 GB, GB, 3 GB RAM"},"camera":{"primary":"Dual 12 MP, (28mm, f/1.8, OIS & 56mm, f/2.8), phase detection autofocus, 2x optical zoom, quad-LED (dual tone) flash, check quality","features":"1/3\" sensor size @ 28mm, 1/3.6\" sensor size @ 56mm, geo-tagging, simultaneous 4K video and 8MP image recording, touch focus, face/smile detection, HDR (photo/panorama)","video":"2160p@30fps, 1080p@30/60/120fps, 720p@240fps, check quality","secondary":"7 MP, f/2.2, 32mm, 1080p@30fps, 720p@240fps, face detection, HDR, panorama"},"sound":{"alert_types":"Vibration, proprietary ringtones","loudspeaker_":"Yes, with stereo speakers","35mm_jack_":"No<br>- Active noise cancellation with dedicated mic <br>- Lightning to 3.5 mm headphone jack adapter incl."},"comms":{"wlan":"Wi-Fi 802.11 a/b/g/n/ac, dual-band, hotspot","bluetooth":"v4.2, A2DP, LE","gps":"Yes, with A-GPS, GLONASS","nfc":"Yes (Apple Pay only)","radio":"No","usb":"v2.0, reversible connector"},"features":{"sensors":"Fingerprint (front-mounted), accelerometer, gyro, proximity, compass, barometer","messaging":"iMessage, SMS (threaded view), MMS, Email, Push Email","browser":"HTML5 (Safari)","java":"No<br>- Siri natural language commands and dictation <br>- iCloud cloud service <br>- MP3/WAV/AAX+/AIFF/Apple Lossless player <br>- MP4/H.264 player <br>- Audio/video/photo editor <br>- Document editor"},"battery":{"_empty_":"Non-removable Li-Ion 2900 mAh battery (11.1 Wh)","stand_by":"Up to 384 h (3G)","talk_time":"Up to 21 h (3G)","music_play":"Up to 60 h"},"misc":{"colors":"Jet Black, Black, Silver, Gold, Rose Gold","sar_us":"  1.19 W/kg (head) & & 1.19 W/kg (body) & & ","sar_eu":"  1.24 W/kg (head) & & 1.00 W/kg (body) & & ","price_group":"9/10 (About 900 EUR)"},"tests":{"performance":"  Basemark OS II 2.0: 3796","display":"  Contrast ratio: 1398:1 (nominal), 3.588 (sunlight)","camera":"  Photo / Video","loudspeaker":"  Voice 68dB / Noise 72dB / Ring 72dB    ","audio_quality":"  Noise -93.1dB / Crosstalk -80.5dB","battery_life":"    Endurance rating 75h    ","_empty_":""}}
     */

    private String status;
    private String title;
    private String img;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * network : {"technology":"GSM / CDMA / HSPA / EVDO / LTE","2g_bands":"GSM 850 / 900 / 1800 / 1900<br>- A1661, A1784<br>CDMA 800 / 1900 / 2100<br>- A1661","3g_bands":"HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100<br>- A1661, A1784<br>CDMA2000 1xEV-DO & TD-SCDMA<br>- A1661","4g_bands":"LTE band 1(2100), 2(1900), 3(1800), 4(1700/2100), 5(850), 7(2600), 8(900), 12(700), 13(700), 17(700), 18(800), 19(800), 20(800), 25(1900), 26(850), 27(800), 28(700), 29(700), 30(2300), 38(2600), 39(1900), 40(2300), 41(2500)<br>- A1661, A1784","speed":"HSPA 42.2/5.76 Mbps, LTE-A (3CA) Cat9 450/50 Mbps, EV-DO Rev.A 3.1 Mbps","gprs":"Yes","edge":"Yes"}
         * launch : {"announced":"2016, September","status":"Available. Released 2016, September"}
         * body : {"dimensions":"158.2 x 77.9 x 7.3 mm (6.23 x 3.07 x 0.29 in)","weight":"188 g (6.63 oz)","sim":"Nano-SIM<br>- IP67 certified<br>- dust and water resistant <br>- Water resistant up to 1 meter and 30 minutes <br>- Apple Pay (Visa, MasterCard, AMEX certified)"}
         * display : {"type":"LED-backlit IPS LCD, capacitive touchscreen, 16M colors","size":"5.5 inches (~67.7% screen-to-body ratio)","resolution":"1080 x 1920 pixels (~401 ppi pixel density)","multitouch":"Yes","protection":"Ion-strengthened glass, oleophobic coating<br>- Wide color gamut display <br>- 3D Touch display & home button <br>- Display Zoom"}
         * platform : {"os":"iOS 10.0.1, upgradable to iOS 10.2","chipset":"Apple A10 Fusion","cpu":"Quad-core 2.34 GHz (2x Hurricane + 2x Zephyr)","gpu":"PowerVR Series7XT Plus (six-core graphics)"}
         * memory : {"card_slot":"No","internal":"32/128/256 GB, GB, 3 GB RAM"}
         * camera : {"primary":"Dual 12 MP, (28mm, f/1.8, OIS & 56mm, f/2.8), phase detection autofocus, 2x optical zoom, quad-LED (dual tone) flash, check quality","features":"1/3\" sensor size @ 28mm, 1/3.6\" sensor size @ 56mm, geo-tagging, simultaneous 4K video and 8MP image recording, touch focus, face/smile detection, HDR (photo/panorama)","video":"2160p@30fps, 1080p@30/60/120fps, 720p@240fps, check quality","secondary":"7 MP, f/2.2, 32mm, 1080p@30fps, 720p@240fps, face detection, HDR, panorama"}
         * sound : {"alert_types":"Vibration, proprietary ringtones","loudspeaker_":"Yes, with stereo speakers","35mm_jack_":"No<br>- Active noise cancellation with dedicated mic <br>- Lightning to 3.5 mm headphone jack adapter incl."}
         * comms : {"wlan":"Wi-Fi 802.11 a/b/g/n/ac, dual-band, hotspot","bluetooth":"v4.2, A2DP, LE","gps":"Yes, with A-GPS, GLONASS","nfc":"Yes (Apple Pay only)","radio":"No","usb":"v2.0, reversible connector"}
         * features : {"sensors":"Fingerprint (front-mounted), accelerometer, gyro, proximity, compass, barometer","messaging":"iMessage, SMS (threaded view), MMS, Email, Push Email","browser":"HTML5 (Safari)","java":"No<br>- Siri natural language commands and dictation <br>- iCloud cloud service <br>- MP3/WAV/AAX+/AIFF/Apple Lossless player <br>- MP4/H.264 player <br>- Audio/video/photo editor <br>- Document editor"}
         * battery : {"_empty_":"Non-removable Li-Ion 2900 mAh battery (11.1 Wh)","stand_by":"Up to 384 h (3G)","talk_time":"Up to 21 h (3G)","music_play":"Up to 60 h"}
         * misc : {"colors":"Jet Black, Black, Silver, Gold, Rose Gold","sar_us":"  1.19 W/kg (head) & & 1.19 W/kg (body) & & ","sar_eu":"  1.24 W/kg (head) & & 1.00 W/kg (body) & & ","price_group":"9/10 (About 900 EUR)"}
         * tests : {"performance":"  Basemark OS II 2.0: 3796","display":"  Contrast ratio: 1398:1 (nominal), 3.588 (sunlight)","camera":"  Photo / Video","loudspeaker":"  Voice 68dB / Noise 72dB / Ring 72dB    ","audio_quality":"  Noise -93.1dB / Crosstalk -80.5dB","battery_life":"    Endurance rating 75h    ","_empty_":""}
         */

        private NetworkBean network;
        private LaunchBean launch;
        private BodyBean body;
        private DisplayBean display;
        private PlatformBean platform;
        private MemoryBean memory;
        private CameraBean camera;
        private SoundBean sound;
        private CommsBean comms;
        private FeaturesBean features;
        private BatteryBean battery;
        private MiscBean misc;
        private TestsBean tests;

        public NetworkBean getNetwork() {
            return network;
        }

        public void setNetwork(NetworkBean network) {
            this.network = network;
        }

        public LaunchBean getLaunch() {
            return launch;
        }

        public void setLaunch(LaunchBean launch) {
            this.launch = launch;
        }

        public BodyBean getBody() {
            return body;
        }

        public void setBody(BodyBean body) {
            this.body = body;
        }

        public DisplayBean getDisplay() {
            return display;
        }

        public void setDisplay(DisplayBean display) {
            this.display = display;
        }

        public PlatformBean getPlatform() {
            return platform;
        }

        public void setPlatform(PlatformBean platform) {
            this.platform = platform;
        }

        public MemoryBean getMemory() {
            return memory;
        }

        public void setMemory(MemoryBean memory) {
            this.memory = memory;
        }

        public CameraBean getCamera() {
            return camera;
        }

        public void setCamera(CameraBean camera) {
            this.camera = camera;
        }

        public SoundBean getSound() {
            return sound;
        }

        public void setSound(SoundBean sound) {
            this.sound = sound;
        }

        public CommsBean getComms() {
            return comms;
        }

        public void setComms(CommsBean comms) {
            this.comms = comms;
        }

        public FeaturesBean getFeatures() {
            return features;
        }

        public void setFeatures(FeaturesBean features) {
            this.features = features;
        }

        public BatteryBean getBattery() {
            return battery;
        }

        public void setBattery(BatteryBean battery) {
            this.battery = battery;
        }

        public MiscBean getMisc() {
            return misc;
        }

        public void setMisc(MiscBean misc) {
            this.misc = misc;
        }

        public TestsBean getTests() {
            return tests;
        }

        public void setTests(TestsBean tests) {
            this.tests = tests;
        }

        public static class NetworkBean {
            /**
             * technology : GSM / CDMA / HSPA / EVDO / LTE
             * 2g_bands : GSM 850 / 900 / 1800 / 1900<br>- A1661, A1784<br>CDMA 800 / 1900 / 2100<br>- A1661
             * 3g_bands : HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100<br>- A1661, A1784<br>CDMA2000 1xEV-DO & TD-SCDMA<br>- A1661
             * 4g_bands : LTE band 1(2100), 2(1900), 3(1800), 4(1700/2100), 5(850), 7(2600), 8(900), 12(700), 13(700), 17(700), 18(800), 19(800), 20(800), 25(1900), 26(850), 27(800), 28(700), 29(700), 30(2300), 38(2600), 39(1900), 40(2300), 41(2500)<br>- A1661, A1784
             * speed : HSPA 42.2/5.76 Mbps, LTE-A (3CA) Cat9 450/50 Mbps, EV-DO Rev.A 3.1 Mbps
             * gprs : Yes
             * edge : Yes
             */

            private String technology;
            @SerializedName("2g_bands")
            private String value2g_bands;
            @SerializedName("3g_bands")
            private String value3g_bands;
            @SerializedName("4g_bands")
            private String value4g_bands;
            private String speed;
            private String gprs;
            private String edge;

            public String getTechnology() {
                return technology;
            }

            public void setTechnology(String technology) {
                this.technology = technology;
            }

            public String getValue2g_bands() {
                return value2g_bands;
            }

            public void setValue2g_bands(String value2g_bands) {
                this.value2g_bands = value2g_bands;
            }

            public String getValue3g_bands() {
                return value3g_bands;
            }

            public void setValue3g_bands(String value3g_bands) {
                this.value3g_bands = value3g_bands;
            }

            public String getValue4g_bands() {
                return value4g_bands;
            }

            public void setValue4g_bands(String value4g_bands) {
                this.value4g_bands = value4g_bands;
            }

            public String getSpeed() {
                return speed;
            }

            public void setSpeed(String speed) {
                this.speed = speed;
            }

            public String getGprs() {
                return gprs;
            }

            public void setGprs(String gprs) {
                this.gprs = gprs;
            }

            public String getEdge() {
                return edge;
            }

            public void setEdge(String edge) {
                this.edge = edge;
            }
        }

        public static class LaunchBean {
            /**
             * announced : 2016, September
             * status : Available. Released 2016, September
             */

            private String announced;
            private String status;

            public String getAnnounced() {
                return announced;
            }

            public void setAnnounced(String announced) {
                this.announced = announced;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }

        public static class BodyBean {
            /**
             * dimensions : 158.2 x 77.9 x 7.3 mm (6.23 x 3.07 x 0.29 in)
             * weight : 188 g (6.63 oz)
             * sim : Nano-SIM<br>- IP67 certified<br>- dust and water resistant <br>- Water resistant up to 1 meter and 30 minutes <br>- Apple Pay (Visa, MasterCard, AMEX certified)
             */

            private String dimensions;
            private String weight;
            private String sim;

            public String getDimensions() {
                return dimensions;
            }

            public void setDimensions(String dimensions) {
                this.dimensions = dimensions;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getSim() {
                return sim;
            }

            public void setSim(String sim) {
                this.sim = sim;
            }
        }

        public static class DisplayBean {
            /**
             * type : LED-backlit IPS LCD, capacitive touchscreen, 16M colors
             * size : 5.5 inches (~67.7% screen-to-body ratio)
             * resolution : 1080 x 1920 pixels (~401 ppi pixel density)
             * multitouch : Yes
             * protection : Ion-strengthened glass, oleophobic coating<br>- Wide color gamut display <br>- 3D Touch display & home button <br>- Display Zoom
             */

            private String type;
            private String size;
            private String resolution;
            private String multitouch;
            private String protection;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public String getResolution() {
                return resolution;
            }

            public void setResolution(String resolution) {
                this.resolution = resolution;
            }

            public String getMultitouch() {
                return multitouch;
            }

            public void setMultitouch(String multitouch) {
                this.multitouch = multitouch;
            }

            public String getProtection() {
                return protection;
            }

            public void setProtection(String protection) {
                this.protection = protection;
            }
        }

        public static class PlatformBean {
            /**
             * os : iOS 10.0.1, upgradable to iOS 10.2
             * chipset : Apple A10 Fusion
             * cpu : Quad-core 2.34 GHz (2x Hurricane + 2x Zephyr)
             * gpu : PowerVR Series7XT Plus (six-core graphics)
             */

            private String os;
            private String chipset;
            private String cpu;
            private String gpu;

            public String getOs() {
                return os;
            }

            public void setOs(String os) {
                this.os = os;
            }

            public String getChipset() {
                return chipset;
            }

            public void setChipset(String chipset) {
                this.chipset = chipset;
            }

            public String getCpu() {
                return cpu;
            }

            public void setCpu(String cpu) {
                this.cpu = cpu;
            }

            public String getGpu() {
                return gpu;
            }

            public void setGpu(String gpu) {
                this.gpu = gpu;
            }
        }

        public static class MemoryBean {
            /**
             * card_slot : No
             * internal : 32/128/256 GB, GB, 3 GB RAM
             */

            private String card_slot;
            private String internal;

            public String getCard_slot() {
                return card_slot;
            }

            public void setCard_slot(String card_slot) {
                this.card_slot = card_slot;
            }

            public String getInternal() {
                return internal;
            }

            public void setInternal(String internal) {
                this.internal = internal;
            }
        }

        public static class CameraBean {
            /**
             * primary : Dual 12 MP, (28mm, f/1.8, OIS & 56mm, f/2.8), phase detection autofocus, 2x optical zoom, quad-LED (dual tone) flash, check quality
             * features : 1/3" sensor size @ 28mm, 1/3.6" sensor size @ 56mm, geo-tagging, simultaneous 4K video and 8MP image recording, touch focus, face/smile detection, HDR (photo/panorama)
             * video : 2160p@30fps, 1080p@30/60/120fps, 720p@240fps, check quality
             * secondary : 7 MP, f/2.2, 32mm, 1080p@30fps, 720p@240fps, face detection, HDR, panorama
             */

            private String primary;
            private String features;
            private String video;
            private String secondary;

            public String getPrimary() {
                return primary;
            }

            public void setPrimary(String primary) {
                this.primary = primary;
            }

            public String getFeatures() {
                return features;
            }

            public void setFeatures(String features) {
                this.features = features;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getSecondary() {
                return secondary;
            }

            public void setSecondary(String secondary) {
                this.secondary = secondary;
            }
        }

        public static class SoundBean {
            /**
             * alert_types : Vibration, proprietary ringtones
             * loudspeaker_ : Yes, with stereo speakers
             * 35mm_jack_ : No<br>- Active noise cancellation with dedicated mic <br>- Lightning to 3.5 mm headphone jack adapter incl.
             */

            private String alert_types;
            private String loudspeaker_;
            @SerializedName("35mm_jack_")
            private String value35mm_jack_;

            public String getAlert_types() {
                return alert_types;
            }

            public void setAlert_types(String alert_types) {
                this.alert_types = alert_types;
            }

            public String getLoudspeaker_() {
                return loudspeaker_;
            }

            public void setLoudspeaker_(String loudspeaker_) {
                this.loudspeaker_ = loudspeaker_;
            }

            public String getValue35mm_jack_() {
                return value35mm_jack_;
            }

            public void setValue35mm_jack_(String value35mm_jack_) {
                this.value35mm_jack_ = value35mm_jack_;
            }
        }

        public static class CommsBean {
            /**
             * wlan : Wi-Fi 802.11 a/b/g/n/ac, dual-band, hotspot
             * bluetooth : v4.2, A2DP, LE
             * gps : Yes, with A-GPS, GLONASS
             * nfc : Yes (Apple Pay only)
             * radio : No
             * usb : v2.0, reversible connector
             */

            private String wlan;
            private String bluetooth;
            private String gps;
            private String nfc;
            private String radio;
            private String usb;

            public String getWlan() {
                return wlan;
            }

            public void setWlan(String wlan) {
                this.wlan = wlan;
            }

            public String getBluetooth() {
                return bluetooth;
            }

            public void setBluetooth(String bluetooth) {
                this.bluetooth = bluetooth;
            }

            public String getGps() {
                return gps;
            }

            public void setGps(String gps) {
                this.gps = gps;
            }

            public String getNfc() {
                return nfc;
            }

            public void setNfc(String nfc) {
                this.nfc = nfc;
            }

            public String getRadio() {
                return radio;
            }

            public void setRadio(String radio) {
                this.radio = radio;
            }

            public String getUsb() {
                return usb;
            }

            public void setUsb(String usb) {
                this.usb = usb;
            }
        }

        public static class FeaturesBean {
            /**
             * sensors : Fingerprint (front-mounted), accelerometer, gyro, proximity, compass, barometer
             * messaging : iMessage, SMS (threaded view), MMS, Email, Push Email
             * browser : HTML5 (Safari)
             * java : No<br>- Siri natural language commands and dictation <br>- iCloud cloud service <br>- MP3/WAV/AAX+/AIFF/Apple Lossless player <br>- MP4/H.264 player <br>- Audio/video/photo editor <br>- Document editor
             */

            private String sensors;
            private String messaging;
            private String browser;
            private String java;

            public String getSensors() {
                return sensors;
            }

            public void setSensors(String sensors) {
                this.sensors = sensors;
            }

            public String getMessaging() {
                return messaging;
            }

            public void setMessaging(String messaging) {
                this.messaging = messaging;
            }

            public String getBrowser() {
                return browser;
            }

            public void setBrowser(String browser) {
                this.browser = browser;
            }

            public String getJava() {
                return java;
            }

            public void setJava(String java) {
                this.java = java;
            }
        }

        public static class BatteryBean {
            /**
             * _empty_ : Non-removable Li-Ion 2900 mAh battery (11.1 Wh)
             * stand_by : Up to 384 h (3G)
             * talk_time : Up to 21 h (3G)
             * music_play : Up to 60 h
             */

            private String _empty_;
            private String stand_by;
            private String talk_time;
            private String music_play;

            public String get_empty_() {
                return _empty_;
            }

            public void set_empty_(String _empty_) {
                this._empty_ = _empty_;
            }

            public String getStand_by() {
                return stand_by;
            }

            public void setStand_by(String stand_by) {
                this.stand_by = stand_by;
            }

            public String getTalk_time() {
                return talk_time;
            }

            public void setTalk_time(String talk_time) {
                this.talk_time = talk_time;
            }

            public String getMusic_play() {
                return music_play;
            }

            public void setMusic_play(String music_play) {
                this.music_play = music_play;
            }
        }

        public static class MiscBean {
            /**
             * colors : Jet Black, Black, Silver, Gold, Rose Gold
             * sar_us :   1.19 W/kg (head) & & 1.19 W/kg (body) & &
             * sar_eu :   1.24 W/kg (head) & & 1.00 W/kg (body) & &
             * price_group : 9/10 (About 900 EUR)
             */

            private String colors;
            private String sar_us;
            private String sar_eu;
            private String price_group;

            public String getColors() {
                return colors;
            }

            public void setColors(String colors) {
                this.colors = colors;
            }

            public String getSar_us() {
                return sar_us;
            }

            public void setSar_us(String sar_us) {
                this.sar_us = sar_us;
            }

            public String getSar_eu() {
                return sar_eu;
            }

            public void setSar_eu(String sar_eu) {
                this.sar_eu = sar_eu;
            }

            public String getPrice_group() {
                return price_group;
            }

            public void setPrice_group(String price_group) {
                this.price_group = price_group;
            }
        }

        public static class TestsBean {
            /**
             * performance :   Basemark OS II 2.0: 3796
             * display :   Contrast ratio: 1398:1 (nominal), 3.588 (sunlight)
             * camera :   Photo / Video
             * loudspeaker :   Voice 68dB / Noise 72dB / Ring 72dB
             * audio_quality :   Noise -93.1dB / Crosstalk -80.5dB
             * battery_life :     Endurance rating 75h
             * _empty_ :
             */

            private String performance;
            private String display;
            private String camera;
            private String loudspeaker;
            private String audio_quality;
            private String battery_life;
            private String _empty_;

            public String getPerformance() {
                return performance;
            }

            public void setPerformance(String performance) {
                this.performance = performance;
            }

            public String getDisplay() {
                return display;
            }

            public void setDisplay(String display) {
                this.display = display;
            }

            public String getCamera() {
                return camera;
            }

            public void setCamera(String camera) {
                this.camera = camera;
            }

            public String getLoudspeaker() {
                return loudspeaker;
            }

            public void setLoudspeaker(String loudspeaker) {
                this.loudspeaker = loudspeaker;
            }

            public String getAudio_quality() {
                return audio_quality;
            }

            public void setAudio_quality(String audio_quality) {
                this.audio_quality = audio_quality;
            }

            public String getBattery_life() {
                return battery_life;
            }

            public void setBattery_life(String battery_life) {
                this.battery_life = battery_life;
            }

            public String get_empty_() {
                return _empty_;
            }

            public void set_empty_(String _empty_) {
                this._empty_ = _empty_;
            }
        }
    }
}
