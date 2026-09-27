package io.radar.sdk;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.dmk;
import defpackage.hdi;
import defpackage.m51;
import defpackage.ug7;
import defpackage.woa;
import defpackage.ww4;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\ba\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u0087\u00012\u00020\u0001:\u000e\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001BÓ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\"¢\u0006\u0002\u0010#J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010h\u001a\u00020\u0010HÆ\u0003J\t\u0010i\u001a\u00020\u0012HÆ\u0003J\t\u0010j\u001a\u00020\u0014HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0014HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0019HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0014HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0014HÆ\u0003J\t\u0010s\u001a\u00020\u0014HÆ\u0003J\t\u0010t\u001a\u00020\u0014HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\"HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\tHÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0087\u0002\u0010\u007f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\"HÆ\u0001J\u0015\u0010\u0080\u0001\u001a\u00020\u00142\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001J\u000b\u0010\u0085\u0001\u001a\u00030\u0086\u0001HÖ\u0001R\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001a\u0010\u001c\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010'R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010%\"\u0004\b9\u0010'R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010%\"\u0004\b;\u0010'R\u001a\u0010\u001b\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010+\"\u0004\b=\u0010-R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010%\"\u0004\bI\u0010'R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010E\"\u0004\bM\u0010GR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010%\"\u0004\bO\u0010'R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010%\"\u0004\bY\u0010'R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010\u001d\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010+\"\u0004\b_\u0010-R\u001a\u0010\u0016\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010+\"\u0004\ba\u0010-R\u001a\u0010\u001e\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010+\"\u0004\bc\u0010-R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010+\"\u0004\be\u0010-¨\u0006\u008e\u0001"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions;", "", RadarTrackingOptions.KEY_DESIRED_STOPPED_UPDATE_INTERVAL, "", RadarTrackingOptions.KEY_FASTEST_STOPPED_UPDATE_INTERVAL, RadarTrackingOptions.KEY_DESIRED_MOVING_UPDATE_INTERVAL, RadarTrackingOptions.KEY_FASTEST_MOVING_UPDATE_INTERVAL, RadarTrackingOptions.KEY_DESIRED_SYNC_INTERVAL, RadarTrackingOptions.KEY_DESIRED_ACCURACY, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", RadarTrackingOptions.KEY_STOP_DURATION, RadarTrackingOptions.KEY_STOP_DISTANCE, RadarTrackingOptions.KEY_START_TRACKING_AFTER, "Ljava/util/Date;", RadarTrackingOptions.KEY_STOP_TRACKING_AFTER, RadarTrackingOptions.KEY_REPLAY, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", RadarTrackingOptions.KEY_SYNC, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", RadarTrackingOptions.KEY_USE_STOPPED_GEOFENCE, "", RadarTrackingOptions.KEY_STOPPED_GEOFENCE_RADIUS, RadarTrackingOptions.KEY_USE_MOVING_GEOFENCE, RadarTrackingOptions.KEY_MOVING_GEOFENCE_RADIUS, RadarTrackingOptions.KEY_SYNC_GEOFENCES, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", RadarTrackingOptions.KEY_SYNC_GEOFENCES_LIMIT, RadarTrackingOptions.KEY_FOREGROUND_SERVICE_ENABLED, RadarTrackingOptions.KEY_BEACONS, RadarTrackingOptions.KEY_USE_MOTION, RadarTrackingOptions.KEY_USE_PRESSURE, RadarTrackingOptions.KEY_BATCH_INTERVAL, RadarTrackingOptions.KEY_BATCH_SIZE, "type", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsType;", "(IIIIILio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;IILjava/util/Date;Ljava/util/Date;Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;ZIZILio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;IZZZZIILio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsType;)V", "getBatchInterval", "()I", "setBatchInterval", "(I)V", "getBatchSize", "setBatchSize", "getBeacons", "()Z", "setBeacons", "(Z)V", "getDesiredAccuracy", "()Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "setDesiredAccuracy", "(Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;)V", "getDesiredMovingUpdateInterval", "setDesiredMovingUpdateInterval", "getDesiredStoppedUpdateInterval", "setDesiredStoppedUpdateInterval", "getDesiredSyncInterval", "setDesiredSyncInterval", "getFastestMovingUpdateInterval", "setFastestMovingUpdateInterval", "getFastestStoppedUpdateInterval", "setFastestStoppedUpdateInterval", "getForegroundServiceEnabled", "setForegroundServiceEnabled", "getMovingGeofenceRadius", "setMovingGeofenceRadius", "getReplay", "()Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", "setReplay", "(Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;)V", "getStartTrackingAfter", "()Ljava/util/Date;", "setStartTrackingAfter", "(Ljava/util/Date;)V", "getStopDistance", "setStopDistance", "getStopDuration", "setStopDuration", "getStopTrackingAfter", "setStopTrackingAfter", "getStoppedGeofenceRadius", "setStoppedGeofenceRadius", "getSync", "()Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", "setSync", "(Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;)V", "getSyncGeofences", "()Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", "setSyncGeofences", "(Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;)V", "getSyncGeofencesLimit", "setSyncGeofencesLimit", "getType", "()Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsType;", "setType", "(Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsType;)V", "getUseMotion", "setUseMotion", "getUseMovingGeofence", "setUseMovingGeofence", "getUsePressure", "setUsePressure", "getUseStoppedGeofence", "setUseStoppedGeofence", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "", "Companion", "RadarTrackingOptionsDesiredAccuracy", "RadarTrackingOptionsForegroundService", "RadarTrackingOptionsReplay", "RadarTrackingOptionsSync", "RadarTrackingOptionsSyncGeofences", "RadarTrackingOptionsType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RadarTrackingOptions {
    public static final RadarTrackingOptions CONTINUOUS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final RadarTrackingOptions EFFICIENT;
    public static final String KEY_BATCH_INTERVAL = "batchInterval";
    public static final String KEY_BATCH_SIZE = "batchSize";
    public static final String KEY_BEACONS = "beacons";
    public static final String KEY_DESIRED_ACCURACY = "desiredAccuracy";
    public static final String KEY_DESIRED_MOVING_UPDATE_INTERVAL = "desiredMovingUpdateInterval";
    public static final String KEY_DESIRED_STOPPED_UPDATE_INTERVAL = "desiredStoppedUpdateInterval";
    public static final String KEY_DESIRED_SYNC_INTERVAL = "desiredSyncInterval";
    public static final String KEY_FASTEST_MOVING_UPDATE_INTERVAL = "fastestMovingUpdateInterval";
    public static final String KEY_FASTEST_STOPPED_UPDATE_INTERVAL = "fastestStoppedUpdateInterval";
    public static final String KEY_FOREGROUND_SERVICE_ENABLED = "foregroundServiceEnabled";
    public static final String KEY_MOVING_GEOFENCE_RADIUS = "movingGeofenceRadius";
    public static final String KEY_REPLAY = "replay";
    public static final String KEY_START_TRACKING_AFTER = "startTrackingAfter";
    public static final String KEY_STOPPED_GEOFENCE_RADIUS = "stoppedGeofenceRadius";
    public static final String KEY_STOP_DISTANCE = "stopDistance";
    public static final String KEY_STOP_DURATION = "stopDuration";
    public static final String KEY_STOP_TRACKING_AFTER = "stopTrackingAfter";
    public static final String KEY_SYNC = "sync";
    public static final String KEY_SYNC_GEOFENCES = "syncGeofences";
    public static final String KEY_SYNC_GEOFENCES_LIMIT = "syncGeofencesLimit";
    public static final String KEY_TYPE = "type";
    public static final String KEY_USE_MOTION = "useMotion";
    public static final String KEY_USE_MOVING_GEOFENCE = "useMovingGeofence";
    public static final String KEY_USE_PRESSURE = "usePressure";
    public static final String KEY_USE_STOPPED_GEOFENCE = "useStoppedGeofence";
    public static final RadarTrackingOptions RESPONSIVE;
    private int batchInterval;
    private int batchSize;
    private boolean beacons;
    private RadarTrackingOptionsDesiredAccuracy desiredAccuracy;
    private int desiredMovingUpdateInterval;
    private int desiredStoppedUpdateInterval;
    private int desiredSyncInterval;
    private int fastestMovingUpdateInterval;
    private int fastestStoppedUpdateInterval;
    private boolean foregroundServiceEnabled;
    private int movingGeofenceRadius;
    private RadarTrackingOptionsReplay replay;
    private Date startTrackingAfter;
    private int stopDistance;
    private int stopDuration;
    private Date stopTrackingAfter;
    private int stoppedGeofenceRadius;
    private RadarTrackingOptionsSync sync;
    private RadarTrackingOptionsSyncGeofences syncGeofences;
    private int syncGeofencesLimit;
    private RadarTrackingOptionsType type;
    private boolean useMotion;
    private boolean useMovingGeofence;
    private boolean usePressure;
    private boolean useStoppedGeofence;

    static {
        RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy = RadarTrackingOptionsDesiredAccuracy.HIGH;
        RadarTrackingOptionsReplay radarTrackingOptionsReplay = RadarTrackingOptionsReplay.NONE;
        RadarTrackingOptionsSync radarTrackingOptionsSync = RadarTrackingOptionsSync.ALL;
        RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences = RadarTrackingOptionsSyncGeofences.NEAREST;
        CONTINUOUS = new RadarTrackingOptions(30, 30, 30, 30, 20, radarTrackingOptionsDesiredAccuracy, 140, 70, null, null, radarTrackingOptionsReplay, radarTrackingOptionsSync, false, 0, false, 0, radarTrackingOptionsSyncGeofences, 0, true, false, false, false, 0, 0, null, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, null);
        RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy2 = RadarTrackingOptionsDesiredAccuracy.MEDIUM;
        RadarTrackingOptionsReplay radarTrackingOptionsReplay2 = RadarTrackingOptionsReplay.STOPS;
        RESPONSIVE = new RadarTrackingOptions(0, 0, 150, 30, 20, radarTrackingOptionsDesiredAccuracy2, 140, 70, null, null, radarTrackingOptionsReplay2, radarTrackingOptionsSync, true, 100, true, 100, radarTrackingOptionsSyncGeofences, 10, false, false, false, false, 0, 0, null, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, null);
        EFFICIENT = new RadarTrackingOptions(3600, 1200, 1200, 360, 140, radarTrackingOptionsDesiredAccuracy2, 140, 70, null, null, radarTrackingOptionsReplay2, radarTrackingOptionsSync, false, 0, false, 0, radarTrackingOptionsSyncGeofences, 10, false, false, false, false, 0, 0, null, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, null);
    }

    public RadarTrackingOptions(int i, int i2, int i3, int i4, int i5, RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy, int i6, int i7, Date date, Date date2, RadarTrackingOptionsReplay radarTrackingOptionsReplay, RadarTrackingOptionsSync radarTrackingOptionsSync, boolean z, int i8, boolean z2, int i9, RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences, int i10, boolean z3, boolean z4, boolean z5, boolean z6, int i11, int i12, RadarTrackingOptionsType radarTrackingOptionsType) {
        radarTrackingOptionsDesiredAccuracy.getClass();
        radarTrackingOptionsReplay.getClass();
        radarTrackingOptionsSync.getClass();
        radarTrackingOptionsSyncGeofences.getClass();
        radarTrackingOptionsType.getClass();
        this.desiredStoppedUpdateInterval = i;
        this.fastestStoppedUpdateInterval = i2;
        this.desiredMovingUpdateInterval = i3;
        this.fastestMovingUpdateInterval = i4;
        this.desiredSyncInterval = i5;
        this.desiredAccuracy = radarTrackingOptionsDesiredAccuracy;
        this.stopDuration = i6;
        this.stopDistance = i7;
        this.startTrackingAfter = date;
        this.stopTrackingAfter = date2;
        this.replay = radarTrackingOptionsReplay;
        this.sync = radarTrackingOptionsSync;
        this.useStoppedGeofence = z;
        this.stoppedGeofenceRadius = i8;
        this.useMovingGeofence = z2;
        this.movingGeofenceRadius = i9;
        this.syncGeofences = radarTrackingOptionsSyncGeofences;
        this.syncGeofencesLimit = i10;
        this.foregroundServiceEnabled = z3;
        this.beacons = z4;
        this.useMotion = z5;
        this.usePressure = z6;
        this.batchInterval = i11;
        this.batchSize = i12;
        this.type = radarTrackingOptionsType;
    }

    public static /* synthetic */ RadarTrackingOptions copy$default(RadarTrackingOptions radarTrackingOptions, int i, int i2, int i3, int i4, int i5, RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy, int i6, int i7, Date date, Date date2, RadarTrackingOptionsReplay radarTrackingOptionsReplay, RadarTrackingOptionsSync radarTrackingOptionsSync, boolean z, int i8, boolean z2, int i9, RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences, int i10, boolean z3, boolean z4, boolean z5, boolean z6, int i11, int i12, RadarTrackingOptionsType radarTrackingOptionsType, int i13, Object obj) {
        RadarTrackingOptionsType radarTrackingOptionsType2;
        int i14;
        int i15 = (i13 & 1) != 0 ? radarTrackingOptions.desiredStoppedUpdateInterval : i;
        int i16 = (i13 & 2) != 0 ? radarTrackingOptions.fastestStoppedUpdateInterval : i2;
        int i17 = (i13 & 4) != 0 ? radarTrackingOptions.desiredMovingUpdateInterval : i3;
        int i18 = (i13 & 8) != 0 ? radarTrackingOptions.fastestMovingUpdateInterval : i4;
        int i19 = (i13 & 16) != 0 ? radarTrackingOptions.desiredSyncInterval : i5;
        RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy2 = (i13 & 32) != 0 ? radarTrackingOptions.desiredAccuracy : radarTrackingOptionsDesiredAccuracy;
        int i20 = (i13 & 64) != 0 ? radarTrackingOptions.stopDuration : i6;
        int i21 = (i13 & 128) != 0 ? radarTrackingOptions.stopDistance : i7;
        Date date3 = (i13 & 256) != 0 ? radarTrackingOptions.startTrackingAfter : date;
        Date date4 = (i13 & Barcode.FORMAT_UPC_A) != 0 ? radarTrackingOptions.stopTrackingAfter : date2;
        RadarTrackingOptionsReplay radarTrackingOptionsReplay2 = (i13 & Barcode.FORMAT_UPC_E) != 0 ? radarTrackingOptions.replay : radarTrackingOptionsReplay;
        RadarTrackingOptionsSync radarTrackingOptionsSync2 = (i13 & 2048) != 0 ? radarTrackingOptions.sync : radarTrackingOptionsSync;
        boolean z7 = (i13 & 4096) != 0 ? radarTrackingOptions.useStoppedGeofence : z;
        int i22 = (i13 & 8192) != 0 ? radarTrackingOptions.stoppedGeofenceRadius : i8;
        int i23 = i15;
        boolean z8 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? radarTrackingOptions.useMovingGeofence : z2;
        int i24 = (i13 & 32768) != 0 ? radarTrackingOptions.movingGeofenceRadius : i9;
        RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences2 = (i13 & 65536) != 0 ? radarTrackingOptions.syncGeofences : radarTrackingOptionsSyncGeofences;
        int i25 = (i13 & 131072) != 0 ? radarTrackingOptions.syncGeofencesLimit : i10;
        boolean z9 = (i13 & 262144) != 0 ? radarTrackingOptions.foregroundServiceEnabled : z3;
        boolean z10 = (i13 & 524288) != 0 ? radarTrackingOptions.beacons : z4;
        boolean z11 = (i13 & 1048576) != 0 ? radarTrackingOptions.useMotion : z5;
        boolean z12 = (i13 & 2097152) != 0 ? radarTrackingOptions.usePressure : z6;
        int i26 = (i13 & 4194304) != 0 ? radarTrackingOptions.batchInterval : i11;
        int i27 = (i13 & 8388608) != 0 ? radarTrackingOptions.batchSize : i12;
        if ((i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            i14 = i27;
            radarTrackingOptionsType2 = radarTrackingOptions.type;
        } else {
            radarTrackingOptionsType2 = radarTrackingOptionsType;
            i14 = i27;
        }
        return radarTrackingOptions.copy(i23, i16, i17, i18, i19, radarTrackingOptionsDesiredAccuracy2, i20, i21, date3, date4, radarTrackingOptionsReplay2, radarTrackingOptionsSync2, z7, i22, z8, i24, radarTrackingOptionsSyncGeofences2, i25, z9, z10, z11, z12, i26, i14, radarTrackingOptionsType2);
    }

    public static final RadarTrackingOptions fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDesiredStoppedUpdateInterval() {
        return this.desiredStoppedUpdateInterval;
    }

    /* renamed from: component10, reason: from getter */
    public final Date getStopTrackingAfter() {
        return this.stopTrackingAfter;
    }

    /* renamed from: component11, reason: from getter */
    public final RadarTrackingOptionsReplay getReplay() {
        return this.replay;
    }

    /* renamed from: component12, reason: from getter */
    public final RadarTrackingOptionsSync getSync() {
        return this.sync;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getUseStoppedGeofence() {
        return this.useStoppedGeofence;
    }

    /* renamed from: component14, reason: from getter */
    public final int getStoppedGeofenceRadius() {
        return this.stoppedGeofenceRadius;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getUseMovingGeofence() {
        return this.useMovingGeofence;
    }

    /* renamed from: component16, reason: from getter */
    public final int getMovingGeofenceRadius() {
        return this.movingGeofenceRadius;
    }

    /* renamed from: component17, reason: from getter */
    public final RadarTrackingOptionsSyncGeofences getSyncGeofences() {
        return this.syncGeofences;
    }

    /* renamed from: component18, reason: from getter */
    public final int getSyncGeofencesLimit() {
        return this.syncGeofencesLimit;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getForegroundServiceEnabled() {
        return this.foregroundServiceEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFastestStoppedUpdateInterval() {
        return this.fastestStoppedUpdateInterval;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getBeacons() {
        return this.beacons;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getUseMotion() {
        return this.useMotion;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getUsePressure() {
        return this.usePressure;
    }

    /* renamed from: component23, reason: from getter */
    public final int getBatchInterval() {
        return this.batchInterval;
    }

    /* renamed from: component24, reason: from getter */
    public final int getBatchSize() {
        return this.batchSize;
    }

    /* renamed from: component25, reason: from getter */
    public final RadarTrackingOptionsType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDesiredMovingUpdateInterval() {
        return this.desiredMovingUpdateInterval;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFastestMovingUpdateInterval() {
        return this.fastestMovingUpdateInterval;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDesiredSyncInterval() {
        return this.desiredSyncInterval;
    }

    /* renamed from: component6, reason: from getter */
    public final RadarTrackingOptionsDesiredAccuracy getDesiredAccuracy() {
        return this.desiredAccuracy;
    }

    /* renamed from: component7, reason: from getter */
    public final int getStopDuration() {
        return this.stopDuration;
    }

    /* renamed from: component8, reason: from getter */
    public final int getStopDistance() {
        return this.stopDistance;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getStartTrackingAfter() {
        return this.startTrackingAfter;
    }

    public final RadarTrackingOptions copy(int desiredStoppedUpdateInterval, int fastestStoppedUpdateInterval, int desiredMovingUpdateInterval, int fastestMovingUpdateInterval, int desiredSyncInterval, RadarTrackingOptionsDesiredAccuracy desiredAccuracy, int stopDuration, int stopDistance, Date startTrackingAfter, Date stopTrackingAfter, RadarTrackingOptionsReplay replay, RadarTrackingOptionsSync sync, boolean useStoppedGeofence, int stoppedGeofenceRadius, boolean useMovingGeofence, int movingGeofenceRadius, RadarTrackingOptionsSyncGeofences syncGeofences, int syncGeofencesLimit, boolean foregroundServiceEnabled, boolean beacons, boolean useMotion, boolean usePressure, int batchInterval, int batchSize, RadarTrackingOptionsType type) {
        desiredAccuracy.getClass();
        replay.getClass();
        sync.getClass();
        syncGeofences.getClass();
        type.getClass();
        return new RadarTrackingOptions(desiredStoppedUpdateInterval, fastestStoppedUpdateInterval, desiredMovingUpdateInterval, fastestMovingUpdateInterval, desiredSyncInterval, desiredAccuracy, stopDuration, stopDistance, startTrackingAfter, stopTrackingAfter, replay, sync, useStoppedGeofence, stoppedGeofenceRadius, useMovingGeofence, movingGeofenceRadius, syncGeofences, syncGeofencesLimit, foregroundServiceEnabled, beacons, useMotion, usePressure, batchInterval, batchSize, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarTrackingOptions)) {
            return false;
        }
        RadarTrackingOptions radarTrackingOptions = (RadarTrackingOptions) other;
        if (this.desiredStoppedUpdateInterval == radarTrackingOptions.desiredStoppedUpdateInterval && this.fastestStoppedUpdateInterval == radarTrackingOptions.fastestStoppedUpdateInterval && this.desiredMovingUpdateInterval == radarTrackingOptions.desiredMovingUpdateInterval && this.fastestMovingUpdateInterval == radarTrackingOptions.fastestMovingUpdateInterval && this.desiredSyncInterval == radarTrackingOptions.desiredSyncInterval && this.desiredAccuracy == radarTrackingOptions.desiredAccuracy && this.stopDuration == radarTrackingOptions.stopDuration && this.stopDistance == radarTrackingOptions.stopDistance && Intrinsics.areEqual(this.startTrackingAfter, radarTrackingOptions.startTrackingAfter) && Intrinsics.areEqual(this.stopTrackingAfter, radarTrackingOptions.stopTrackingAfter) && this.replay == radarTrackingOptions.replay && this.sync == radarTrackingOptions.sync && this.useStoppedGeofence == radarTrackingOptions.useStoppedGeofence && this.stoppedGeofenceRadius == radarTrackingOptions.stoppedGeofenceRadius && this.useMovingGeofence == radarTrackingOptions.useMovingGeofence && this.movingGeofenceRadius == radarTrackingOptions.movingGeofenceRadius && this.syncGeofences == radarTrackingOptions.syncGeofences && this.syncGeofencesLimit == radarTrackingOptions.syncGeofencesLimit && this.foregroundServiceEnabled == radarTrackingOptions.foregroundServiceEnabled && this.beacons == radarTrackingOptions.beacons && this.useMotion == radarTrackingOptions.useMotion && this.usePressure == radarTrackingOptions.usePressure && this.batchInterval == radarTrackingOptions.batchInterval && this.batchSize == radarTrackingOptions.batchSize && this.type == radarTrackingOptions.type) {
            return true;
        }
        return false;
    }

    public final int getBatchInterval() {
        return this.batchInterval;
    }

    public final int getBatchSize() {
        return this.batchSize;
    }

    public final boolean getBeacons() {
        return this.beacons;
    }

    public final RadarTrackingOptionsDesiredAccuracy getDesiredAccuracy() {
        return this.desiredAccuracy;
    }

    public final int getDesiredMovingUpdateInterval() {
        return this.desiredMovingUpdateInterval;
    }

    public final int getDesiredStoppedUpdateInterval() {
        return this.desiredStoppedUpdateInterval;
    }

    public final int getDesiredSyncInterval() {
        return this.desiredSyncInterval;
    }

    public final int getFastestMovingUpdateInterval() {
        return this.fastestMovingUpdateInterval;
    }

    public final int getFastestStoppedUpdateInterval() {
        return this.fastestStoppedUpdateInterval;
    }

    public final boolean getForegroundServiceEnabled() {
        return this.foregroundServiceEnabled;
    }

    public final int getMovingGeofenceRadius() {
        return this.movingGeofenceRadius;
    }

    public final RadarTrackingOptionsReplay getReplay() {
        return this.replay;
    }

    public final Date getStartTrackingAfter() {
        return this.startTrackingAfter;
    }

    public final int getStopDistance() {
        return this.stopDistance;
    }

    public final int getStopDuration() {
        return this.stopDuration;
    }

    public final Date getStopTrackingAfter() {
        return this.stopTrackingAfter;
    }

    public final int getStoppedGeofenceRadius() {
        return this.stoppedGeofenceRadius;
    }

    public final RadarTrackingOptionsSync getSync() {
        return this.sync;
    }

    public final RadarTrackingOptionsSyncGeofences getSyncGeofences() {
        return this.syncGeofences;
    }

    public final int getSyncGeofencesLimit() {
        return this.syncGeofencesLimit;
    }

    public final RadarTrackingOptionsType getType() {
        return this.type;
    }

    public final boolean getUseMotion() {
        return this.useMotion;
    }

    public final boolean getUseMovingGeofence() {
        return this.useMovingGeofence;
    }

    public final boolean getUsePressure() {
        return this.usePressure;
    }

    public final boolean getUseStoppedGeofence() {
        return this.useStoppedGeofence;
    }

    public int hashCode() {
        int hashCode;
        int b = woa.b(this.stopDistance, woa.b(this.stopDuration, (this.desiredAccuracy.hashCode() + woa.b(this.desiredSyncInterval, woa.b(this.fastestMovingUpdateInterval, woa.b(this.desiredMovingUpdateInterval, woa.b(this.fastestStoppedUpdateInterval, Integer.hashCode(this.desiredStoppedUpdateInterval) * 31, 31), 31), 31), 31)) * 31, 31), 31);
        Date date = this.startTrackingAfter;
        int i = 0;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        Date date2 = this.stopTrackingAfter;
        if (date2 != null) {
            i = date2.hashCode();
        }
        return this.type.hashCode() + woa.b(this.batchSize, woa.b(this.batchInterval, hdi.g(hdi.g(hdi.g(hdi.g(woa.b(this.syncGeofencesLimit, (this.syncGeofences.hashCode() + woa.b(this.movingGeofenceRadius, hdi.g(woa.b(this.stoppedGeofenceRadius, hdi.g((this.sync.hashCode() + ((this.replay.hashCode() + ((i2 + i) * 31)) * 31)) * 31, 31, this.useStoppedGeofence), 31), 31, this.useMovingGeofence), 31)) * 31, 31), 31, this.foregroundServiceEnabled), 31, this.beacons), 31, this.useMotion), 31, this.usePressure), 31), 31);
    }

    public final void setBatchInterval(int i) {
        this.batchInterval = i;
    }

    public final void setBatchSize(int i) {
        this.batchSize = i;
    }

    public final void setBeacons(boolean z) {
        this.beacons = z;
    }

    public final void setDesiredAccuracy(RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy) {
        radarTrackingOptionsDesiredAccuracy.getClass();
        this.desiredAccuracy = radarTrackingOptionsDesiredAccuracy;
    }

    public final void setDesiredMovingUpdateInterval(int i) {
        this.desiredMovingUpdateInterval = i;
    }

    public final void setDesiredStoppedUpdateInterval(int i) {
        this.desiredStoppedUpdateInterval = i;
    }

    public final void setDesiredSyncInterval(int i) {
        this.desiredSyncInterval = i;
    }

    public final void setFastestMovingUpdateInterval(int i) {
        this.fastestMovingUpdateInterval = i;
    }

    public final void setFastestStoppedUpdateInterval(int i) {
        this.fastestStoppedUpdateInterval = i;
    }

    public final void setForegroundServiceEnabled(boolean z) {
        this.foregroundServiceEnabled = z;
    }

    public final void setMovingGeofenceRadius(int i) {
        this.movingGeofenceRadius = i;
    }

    public final void setReplay(RadarTrackingOptionsReplay radarTrackingOptionsReplay) {
        radarTrackingOptionsReplay.getClass();
        this.replay = radarTrackingOptionsReplay;
    }

    public final void setStartTrackingAfter(Date date) {
        this.startTrackingAfter = date;
    }

    public final void setStopDistance(int i) {
        this.stopDistance = i;
    }

    public final void setStopDuration(int i) {
        this.stopDuration = i;
    }

    public final void setStopTrackingAfter(Date date) {
        this.stopTrackingAfter = date;
    }

    public final void setStoppedGeofenceRadius(int i) {
        this.stoppedGeofenceRadius = i;
    }

    public final void setSync(RadarTrackingOptionsSync radarTrackingOptionsSync) {
        radarTrackingOptionsSync.getClass();
        this.sync = radarTrackingOptionsSync;
    }

    public final void setSyncGeofences(RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences) {
        radarTrackingOptionsSyncGeofences.getClass();
        this.syncGeofences = radarTrackingOptionsSyncGeofences;
    }

    public final void setSyncGeofencesLimit(int i) {
        this.syncGeofencesLimit = i;
    }

    public final void setType(RadarTrackingOptionsType radarTrackingOptionsType) {
        radarTrackingOptionsType.getClass();
        this.type = radarTrackingOptionsType;
    }

    public final void setUseMotion(boolean z) {
        this.useMotion = z;
    }

    public final void setUseMovingGeofence(boolean z) {
        this.useMovingGeofence = z;
    }

    public final void setUsePressure(boolean z) {
        this.usePressure = z;
    }

    public final void setUseStoppedGeofence(boolean z) {
        this.useStoppedGeofence = z;
    }

    public final JSONObject toJson() {
        Long l;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_DESIRED_STOPPED_UPDATE_INTERVAL, this.desiredStoppedUpdateInterval);
        jSONObject.put(KEY_FASTEST_STOPPED_UPDATE_INTERVAL, this.fastestStoppedUpdateInterval);
        jSONObject.put(KEY_DESIRED_MOVING_UPDATE_INTERVAL, this.desiredMovingUpdateInterval);
        jSONObject.put(KEY_FASTEST_MOVING_UPDATE_INTERVAL, this.fastestMovingUpdateInterval);
        jSONObject.put(KEY_DESIRED_SYNC_INTERVAL, this.desiredSyncInterval);
        jSONObject.put(KEY_DESIRED_ACCURACY, this.desiredAccuracy.toRadarString());
        jSONObject.put(KEY_STOP_DURATION, this.stopDuration);
        jSONObject.put(KEY_STOP_DISTANCE, this.stopDistance);
        Date date = this.startTrackingAfter;
        Long l2 = null;
        if (date != null) {
            l = Long.valueOf(date.getTime());
        } else {
            l = null;
        }
        jSONObject.put(KEY_START_TRACKING_AFTER, l);
        Date date2 = this.stopTrackingAfter;
        if (date2 != null) {
            l2 = Long.valueOf(date2.getTime());
        }
        jSONObject.put(KEY_STOP_TRACKING_AFTER, l2);
        jSONObject.put(KEY_REPLAY, this.replay.toRadarString());
        jSONObject.put(KEY_SYNC, this.sync.toRadarString());
        jSONObject.put(KEY_USE_STOPPED_GEOFENCE, this.useStoppedGeofence);
        jSONObject.put(KEY_STOPPED_GEOFENCE_RADIUS, this.stoppedGeofenceRadius);
        jSONObject.put(KEY_USE_MOVING_GEOFENCE, this.useMovingGeofence);
        jSONObject.put(KEY_MOVING_GEOFENCE_RADIUS, this.movingGeofenceRadius);
        jSONObject.put(KEY_SYNC_GEOFENCES, this.syncGeofences.toRadarString());
        jSONObject.put(KEY_SYNC_GEOFENCES_LIMIT, this.syncGeofencesLimit);
        jSONObject.put(KEY_FOREGROUND_SERVICE_ENABLED, this.foregroundServiceEnabled);
        jSONObject.put(KEY_BEACONS, this.beacons);
        jSONObject.put(KEY_USE_MOTION, this.useMotion);
        jSONObject.put(KEY_USE_PRESSURE, this.usePressure);
        jSONObject.put(KEY_BATCH_INTERVAL, this.batchInterval);
        jSONObject.put(KEY_BATCH_SIZE, this.batchSize);
        jSONObject.put("type", this.type.toRadarString());
        return jSONObject;
    }

    public String toString() {
        return "RadarTrackingOptions(desiredStoppedUpdateInterval=" + this.desiredStoppedUpdateInterval + ", fastestStoppedUpdateInterval=" + this.fastestStoppedUpdateInterval + ", desiredMovingUpdateInterval=" + this.desiredMovingUpdateInterval + ", fastestMovingUpdateInterval=" + this.fastestMovingUpdateInterval + ", desiredSyncInterval=" + this.desiredSyncInterval + ", desiredAccuracy=" + this.desiredAccuracy + ", stopDuration=" + this.stopDuration + ", stopDistance=" + this.stopDistance + ", startTrackingAfter=" + this.startTrackingAfter + ", stopTrackingAfter=" + this.stopTrackingAfter + ", replay=" + this.replay + ", sync=" + this.sync + ", useStoppedGeofence=" + this.useStoppedGeofence + ", stoppedGeofenceRadius=" + this.stoppedGeofenceRadius + ", useMovingGeofence=" + this.useMovingGeofence + ", movingGeofenceRadius=" + this.movingGeofenceRadius + ", syncGeofences=" + this.syncGeofences + ", syncGeofencesLimit=" + this.syncGeofencesLimit + ", foregroundServiceEnabled=" + this.foregroundServiceEnabled + ", beacons=" + this.beacons + ", useMotion=" + this.useMotion + ", usePressure=" + this.usePressure + ", batchInterval=" + this.batchInterval + ", batchSize=" + this.batchSize + ", type=" + this.type + ')';
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "", RadarTrackingOptions.KEY_DESIRED_ACCURACY, "", "(Ljava/lang/String;II)V", "getDesiredAccuracy$sdk_release", "()I", "toRadarString", "", "HIGH", "MEDIUM", "LOW", "NONE", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RadarTrackingOptionsDesiredAccuracy {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RadarTrackingOptionsDesiredAccuracy[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final String HIGH_STR = "high";
        public static final String LOW_STR = "low";
        public static final String MEDIUM_STR = "medium";
        public static final String NONE_STR = "none";
        private final int desiredAccuracy;
        public static final RadarTrackingOptionsDesiredAccuracy HIGH = new RadarTrackingOptionsDesiredAccuracy("HIGH", 0, 3);
        public static final RadarTrackingOptionsDesiredAccuracy MEDIUM = new RadarTrackingOptionsDesiredAccuracy("MEDIUM", 1, 2);
        public static final RadarTrackingOptionsDesiredAccuracy LOW = new RadarTrackingOptionsDesiredAccuracy("LOW", 2, 1);
        public static final RadarTrackingOptionsDesiredAccuracy NONE = new RadarTrackingOptionsDesiredAccuracy("NONE", 3, 0);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTrackingOptionsDesiredAccuracy.values().length];
                try {
                    iArr[RadarTrackingOptionsDesiredAccuracy.HIGH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTrackingOptionsDesiredAccuracy.MEDIUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTrackingOptionsDesiredAccuracy.LOW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RadarTrackingOptionsDesiredAccuracy.NONE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ RadarTrackingOptionsDesiredAccuracy[] $values() {
            return new RadarTrackingOptionsDesiredAccuracy[]{HIGH, MEDIUM, LOW, NONE};
        }

        static {
            RadarTrackingOptionsDesiredAccuracy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private RadarTrackingOptionsDesiredAccuracy(String str, int i, int i2) {
            this.desiredAccuracy = i2;
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RadarTrackingOptionsDesiredAccuracy valueOf(String str) {
            return (RadarTrackingOptionsDesiredAccuracy) Enum.valueOf(RadarTrackingOptionsDesiredAccuracy.class, str);
        }

        public static RadarTrackingOptionsDesiredAccuracy[] values() {
            return (RadarTrackingOptionsDesiredAccuracy[]) $VALUES.clone();
        }

        /* renamed from: getDesiredAccuracy$sdk_release, reason: from getter */
        public final int getDesiredAccuracy() {
            return this.desiredAccuracy;
        }

        public final String toRadarString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "none";
                        }
                        dmk.a();
                        return null;
                    }
                    return LOW_STR;
                }
                return MEDIUM_STR;
            }
            return HIGH_STR;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy$Companion;", "", "()V", "HIGH_STR", "", "LOW_STR", "MEDIUM_STR", "NONE_STR", "fromInt", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", RadarTrackingOptions.KEY_DESIRED_ACCURACY, "", "(Ljava/lang/Integer;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "fromRadarString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RadarTrackingOptionsDesiredAccuracy fromInt(Integer desiredAccuracy) {
                for (RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy : RadarTrackingOptionsDesiredAccuracy.values()) {
                    int desiredAccuracy2 = radarTrackingOptionsDesiredAccuracy.getDesiredAccuracy();
                    if (desiredAccuracy != null && desiredAccuracy.intValue() == desiredAccuracy2) {
                        return radarTrackingOptionsDesiredAccuracy;
                    }
                }
                return RadarTrackingOptionsDesiredAccuracy.MEDIUM;
            }

            public final RadarTrackingOptionsDesiredAccuracy fromRadarString(String desiredAccuracy) {
                if (desiredAccuracy != null) {
                    switch (desiredAccuracy.hashCode()) {
                        case -1078030475:
                            if (desiredAccuracy.equals(RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR)) {
                                return RadarTrackingOptionsDesiredAccuracy.MEDIUM;
                            }
                            break;
                        case 107348:
                            if (desiredAccuracy.equals(RadarTrackingOptionsDesiredAccuracy.LOW_STR)) {
                                return RadarTrackingOptionsDesiredAccuracy.LOW;
                            }
                            break;
                        case 3202466:
                            if (desiredAccuracy.equals(RadarTrackingOptionsDesiredAccuracy.HIGH_STR)) {
                                return RadarTrackingOptionsDesiredAccuracy.HIGH;
                            }
                            break;
                        case 3387192:
                            if (desiredAccuracy.equals("none")) {
                                return RadarTrackingOptionsDesiredAccuracy.NONE;
                            }
                            break;
                    }
                }
                return RadarTrackingOptionsDesiredAccuracy.MEDIUM;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\u0006\u00103\u001a\u000204J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00067"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService;", "", "text", "", RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "", RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_UPDATES_ONLY, "", RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_IMPORTANCE, RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_CHANNEL_NAME, "iconString", "iconColor", "deepLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivity", "()Ljava/lang/String;", "getChannelName", "getDeepLink", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconColor", "setIconColor", "(Ljava/lang/String;)V", "getIconString", "setIconString", "getId", "getImportance", "getText", "getTitle", "getUpdatesOnly", "()Z", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService;", "equals", "other", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RadarTrackingOptionsForegroundService {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String KEY_FOREGROUND_SERVICE_ACTIVITY = "activity";
        public static final String KEY_FOREGROUND_SERVICE_CHANNEL_NAME = "channelName";
        public static final String KEY_FOREGROUND_SERVICE_DEEP_LINK = "deepLink";
        public static final String KEY_FOREGROUND_SERVICE_ICON = "icon";
        public static final String KEY_FOREGROUND_SERVICE_ICON_COLOR = "iconColor";
        public static final String KEY_FOREGROUND_SERVICE_ICON_STRING = "iconString";
        public static final String KEY_FOREGROUND_SERVICE_ID = "id";
        public static final String KEY_FOREGROUND_SERVICE_IMPORTANCE = "importance";
        public static final String KEY_FOREGROUND_SERVICE_TEXT = "text";
        public static final String KEY_FOREGROUND_SERVICE_TITLE = "title";
        public static final String KEY_FOREGROUND_SERVICE_UPDATES_ONLY = "updatesOnly";
        private final String activity;
        private final String channelName;
        private final String deepLink;
        private final Integer icon;
        private String iconColor;
        private String iconString;
        private final Integer id;
        private final Integer importance;
        private final String text;
        private final String title;
        private final boolean updatesOnly;

        public /* synthetic */ RadarTrackingOptionsForegroundService(String str, String str2, Integer num, boolean z, String str3, Integer num2, Integer num3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & Barcode.FORMAT_UPC_A) != 0 ? null : str6, (i & Barcode.FORMAT_UPC_E) != 0 ? null : str7);
        }

        public static /* synthetic */ RadarTrackingOptionsForegroundService copy$default(RadarTrackingOptionsForegroundService radarTrackingOptionsForegroundService, String str, String str2, Integer num, boolean z, String str3, Integer num2, Integer num3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = radarTrackingOptionsForegroundService.text;
            }
            if ((i & 2) != 0) {
                str2 = radarTrackingOptionsForegroundService.title;
            }
            if ((i & 4) != 0) {
                num = radarTrackingOptionsForegroundService.icon;
            }
            if ((i & 8) != 0) {
                z = radarTrackingOptionsForegroundService.updatesOnly;
            }
            if ((i & 16) != 0) {
                str3 = radarTrackingOptionsForegroundService.activity;
            }
            if ((i & 32) != 0) {
                num2 = radarTrackingOptionsForegroundService.importance;
            }
            if ((i & 64) != 0) {
                num3 = radarTrackingOptionsForegroundService.id;
            }
            if ((i & 128) != 0) {
                str4 = radarTrackingOptionsForegroundService.channelName;
            }
            if ((i & 256) != 0) {
                str5 = radarTrackingOptionsForegroundService.iconString;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                str6 = radarTrackingOptionsForegroundService.iconColor;
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                str7 = radarTrackingOptionsForegroundService.deepLink;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str4;
            String str11 = str5;
            Integer num4 = num2;
            Integer num5 = num3;
            String str12 = str3;
            Integer num6 = num;
            return radarTrackingOptionsForegroundService.copy(str, str2, num6, z, str12, num4, num5, str10, str11, str8, str9);
        }

        public static final RadarTrackingOptionsForegroundService fromJson(JSONObject jSONObject) {
            return INSTANCE.fromJson(jSONObject);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component10, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component11, reason: from getter */
        public final String getDeepLink() {
            return this.deepLink;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUpdatesOnly() {
            return this.updatesOnly;
        }

        /* renamed from: component5, reason: from getter */
        public final String getActivity() {
            return this.activity;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getImportance() {
            return this.importance;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        /* renamed from: component8, reason: from getter */
        public final String getChannelName() {
            return this.channelName;
        }

        /* renamed from: component9, reason: from getter */
        public final String getIconString() {
            return this.iconString;
        }

        public final RadarTrackingOptionsForegroundService copy(String text, String title, Integer icon, boolean updatesOnly, String activity, Integer importance, Integer id, String channelName, String iconString, String iconColor, String deepLink) {
            return new RadarTrackingOptionsForegroundService(text, title, icon, updatesOnly, activity, importance, id, channelName, iconString, iconColor, deepLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadarTrackingOptionsForegroundService)) {
                return false;
            }
            RadarTrackingOptionsForegroundService radarTrackingOptionsForegroundService = (RadarTrackingOptionsForegroundService) other;
            if (Intrinsics.areEqual(this.text, radarTrackingOptionsForegroundService.text) && Intrinsics.areEqual(this.title, radarTrackingOptionsForegroundService.title) && Intrinsics.areEqual(this.icon, radarTrackingOptionsForegroundService.icon) && this.updatesOnly == radarTrackingOptionsForegroundService.updatesOnly && Intrinsics.areEqual(this.activity, radarTrackingOptionsForegroundService.activity) && Intrinsics.areEqual(this.importance, radarTrackingOptionsForegroundService.importance) && Intrinsics.areEqual(this.id, radarTrackingOptionsForegroundService.id) && Intrinsics.areEqual(this.channelName, radarTrackingOptionsForegroundService.channelName) && Intrinsics.areEqual(this.iconString, radarTrackingOptionsForegroundService.iconString) && Intrinsics.areEqual(this.iconColor, radarTrackingOptionsForegroundService.iconColor) && Intrinsics.areEqual(this.deepLink, radarTrackingOptionsForegroundService.deepLink)) {
                return true;
            }
            return false;
        }

        public final String getActivity() {
            return this.activity;
        }

        public final String getChannelName() {
            return this.channelName;
        }

        public final String getDeepLink() {
            return this.deepLink;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final String getIconColor() {
            return this.iconColor;
        }

        public final String getIconString() {
            return this.iconString;
        }

        public final Integer getId() {
            return this.id;
        }

        public final Integer getImportance() {
            return this.importance;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean getUpdatesOnly() {
            return this.updatesOnly;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            String str = this.text;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.title;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            Integer num = this.icon;
            if (num == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = num.hashCode();
            }
            int g = hdi.g((i3 + hashCode3) * 31, 31, this.updatesOnly);
            String str3 = this.activity;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i4 = (g + hashCode4) * 31;
            Integer num2 = this.importance;
            if (num2 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = num2.hashCode();
            }
            int i5 = (i4 + hashCode5) * 31;
            Integer num3 = this.id;
            if (num3 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = num3.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            String str4 = this.channelName;
            if (str4 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str4.hashCode();
            }
            int i7 = (i6 + hashCode7) * 31;
            String str5 = this.iconString;
            if (str5 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = str5.hashCode();
            }
            int i8 = (i7 + hashCode8) * 31;
            String str6 = this.iconColor;
            if (str6 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str6.hashCode();
            }
            int i9 = (i8 + hashCode9) * 31;
            String str7 = this.deepLink;
            if (str7 != null) {
                i = str7.hashCode();
            }
            return i9 + i;
        }

        public final void setIconColor(String str) {
            this.iconColor = str;
        }

        public final void setIconString(String str) {
            this.iconString = str;
        }

        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", this.text);
            jSONObject.put(KEY_FOREGROUND_SERVICE_TITLE, this.title);
            jSONObject.put(KEY_FOREGROUND_SERVICE_ICON, this.icon);
            jSONObject.put("iconString", this.iconString);
            jSONObject.put("iconColor", this.iconColor);
            jSONObject.put(KEY_FOREGROUND_SERVICE_ACTIVITY, this.activity);
            jSONObject.put(KEY_FOREGROUND_SERVICE_UPDATES_ONLY, this.updatesOnly);
            jSONObject.put(KEY_FOREGROUND_SERVICE_IMPORTANCE, this.importance);
            jSONObject.put(KEY_FOREGROUND_SERVICE_ID, this.id);
            jSONObject.put(KEY_FOREGROUND_SERVICE_CHANNEL_NAME, this.channelName);
            jSONObject.put("deepLink", this.deepLink);
            return jSONObject;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RadarTrackingOptionsForegroundService(text=");
            sb.append(this.text);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", updatesOnly=");
            sb.append(this.updatesOnly);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", importance=");
            sb.append(this.importance);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", channelName=");
            sb.append(this.channelName);
            sb.append(", iconString=");
            sb.append(this.iconString);
            sb.append(", iconColor=");
            sb.append(this.iconColor);
            sb.append(", deepLink=");
            return m51.m(sb, this.deepLink, ')');
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService$Companion;", "", "()V", "KEY_FOREGROUND_SERVICE_ACTIVITY", "", "KEY_FOREGROUND_SERVICE_CHANNEL_NAME", "KEY_FOREGROUND_SERVICE_DEEP_LINK", "KEY_FOREGROUND_SERVICE_ICON", "KEY_FOREGROUND_SERVICE_ICON_COLOR", "KEY_FOREGROUND_SERVICE_ICON_STRING", "KEY_FOREGROUND_SERVICE_ID", "KEY_FOREGROUND_SERVICE_IMPORTANCE", "KEY_FOREGROUND_SERVICE_TEXT", "KEY_FOREGROUND_SERVICE_TITLE", "KEY_FOREGROUND_SERVICE_UPDATES_ONLY", "fromJson", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RadarTrackingOptionsForegroundService fromJson(JSONObject obj) {
                String optString;
                String optString2;
                Integer valueOf;
                String optString3;
                String optString4;
                String optString5;
                Integer valueOf2;
                Integer valueOf3;
                String optString6;
                String str = null;
                if (obj == null) {
                    return null;
                }
                if (obj.isNull("text")) {
                    optString = null;
                } else {
                    optString = obj.optString("text");
                }
                if (obj.isNull(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE)) {
                    optString2 = null;
                } else {
                    optString2 = obj.optString(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE);
                }
                if (obj.isNull(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(obj.optInt(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON));
                }
                if (obj.isNull("iconString")) {
                    optString3 = null;
                } else {
                    optString3 = obj.optString("iconString");
                }
                if (obj.isNull("iconColor")) {
                    optString4 = null;
                } else {
                    optString4 = obj.optString("iconColor");
                }
                boolean optBoolean = obj.optBoolean(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_UPDATES_ONLY);
                if (obj.isNull(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY)) {
                    optString5 = null;
                } else {
                    optString5 = obj.optString(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
                }
                if (obj.isNull(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_IMPORTANCE)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(obj.optInt(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_IMPORTANCE));
                }
                if (obj.isNull(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf(obj.optInt(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID));
                }
                if (obj.isNull(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_CHANNEL_NAME)) {
                    optString6 = null;
                } else {
                    optString6 = obj.optString(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_CHANNEL_NAME);
                }
                if (!obj.isNull("deepLink")) {
                    str = obj.optString("deepLink");
                }
                return new RadarTrackingOptionsForegroundService(optString, optString2, valueOf, optBoolean, optString5, valueOf2, valueOf3, optString6, optString3, optString4, str);
            }

            private Companion() {
            }
        }

        public RadarTrackingOptionsForegroundService(String str, String str2, Integer num, boolean z, String str3, Integer num2, Integer num3, String str4, String str5, String str6, String str7) {
            this.text = str;
            this.title = str2;
            this.icon = num;
            this.updatesOnly = z;
            this.activity = str3;
            this.importance = num2;
            this.id = num3;
            this.channelName = str4;
            this.iconString = str5;
            this.iconColor = str6;
            this.deepLink = str7;
        }

        public RadarTrackingOptionsForegroundService() {
            this(null, null, null, false, null, null, null, null, null, null, null, 2047, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", "", RadarTrackingOptions.KEY_REPLAY, "", "(Ljava/lang/String;II)V", "getReplay$sdk_release", "()I", "toRadarString", "", "ALL", "STOPS", "NONE", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RadarTrackingOptionsReplay {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RadarTrackingOptionsReplay[] $VALUES;
        public static final String ALL_STR = "all";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final String NONE_STR = "none";
        public static final String STOPS_STR = "stops";
        private final int replay;
        public static final RadarTrackingOptionsReplay ALL = new RadarTrackingOptionsReplay("ALL", 0, 2);
        public static final RadarTrackingOptionsReplay STOPS = new RadarTrackingOptionsReplay("STOPS", 1, 1);
        public static final RadarTrackingOptionsReplay NONE = new RadarTrackingOptionsReplay("NONE", 2, 0);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTrackingOptionsReplay.values().length];
                try {
                    iArr[RadarTrackingOptionsReplay.STOPS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTrackingOptionsReplay.NONE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTrackingOptionsReplay.ALL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ RadarTrackingOptionsReplay[] $values() {
            return new RadarTrackingOptionsReplay[]{ALL, STOPS, NONE};
        }

        static {
            RadarTrackingOptionsReplay[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private RadarTrackingOptionsReplay(String str, int i, int i2) {
            this.replay = i2;
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RadarTrackingOptionsReplay valueOf(String str) {
            return (RadarTrackingOptionsReplay) Enum.valueOf(RadarTrackingOptionsReplay.class, str);
        }

        public static RadarTrackingOptionsReplay[] values() {
            return (RadarTrackingOptionsReplay[]) $VALUES.clone();
        }

        /* renamed from: getReplay$sdk_release, reason: from getter */
        public final int getReplay() {
            return this.replay;
        }

        public final String toRadarString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "all";
                    }
                    dmk.a();
                    return null;
                }
                return "none";
            }
            return STOPS_STR;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay$Companion;", "", "()V", "ALL_STR", "", "NONE_STR", "STOPS_STR", "fromInt", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", RadarTrackingOptions.KEY_REPLAY, "", "(Ljava/lang/Integer;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", "fromRadarString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RadarTrackingOptionsReplay fromInt(Integer replay) {
                for (RadarTrackingOptionsReplay radarTrackingOptionsReplay : RadarTrackingOptionsReplay.values()) {
                    int replay2 = radarTrackingOptionsReplay.getReplay();
                    if (replay != null && replay.intValue() == replay2) {
                        return radarTrackingOptionsReplay;
                    }
                }
                return RadarTrackingOptionsReplay.NONE;
            }

            public final RadarTrackingOptionsReplay fromRadarString(String replay) {
                if (replay != null) {
                    int hashCode = replay.hashCode();
                    if (hashCode != 96673) {
                        if (hashCode != 3387192) {
                            if (hashCode == 109770929 && replay.equals(RadarTrackingOptionsReplay.STOPS_STR)) {
                                return RadarTrackingOptionsReplay.STOPS;
                            }
                        } else if (replay.equals("none")) {
                            return RadarTrackingOptionsReplay.NONE;
                        }
                    } else if (replay.equals("all")) {
                        return RadarTrackingOptionsReplay.ALL;
                    }
                }
                return RadarTrackingOptionsReplay.NONE;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", "", RadarTrackingOptions.KEY_SYNC, "", "(Ljava/lang/String;II)V", "getSync$sdk_release", "()I", "toRadarString", "", "NONE", "STOPS_AND_EXITS", "ALL", "EVENTS", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RadarTrackingOptionsSync {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RadarTrackingOptionsSync[] $VALUES;
        public static final String ALL_STR = "all";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final String EVENTS_STR = "events";
        public static final String NONE_STR = "none";
        public static final String STOPS_AND_EXITS_STR = "stopsAndExits";
        private final int sync;
        public static final RadarTrackingOptionsSync NONE = new RadarTrackingOptionsSync("NONE", 0, 0);
        public static final RadarTrackingOptionsSync STOPS_AND_EXITS = new RadarTrackingOptionsSync("STOPS_AND_EXITS", 1, 1);
        public static final RadarTrackingOptionsSync ALL = new RadarTrackingOptionsSync("ALL", 2, 2);
        public static final RadarTrackingOptionsSync EVENTS = new RadarTrackingOptionsSync("EVENTS", 3, 3);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTrackingOptionsSync.values().length];
                try {
                    iArr[RadarTrackingOptionsSync.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTrackingOptionsSync.STOPS_AND_EXITS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTrackingOptionsSync.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RadarTrackingOptionsSync.EVENTS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ RadarTrackingOptionsSync[] $values() {
            return new RadarTrackingOptionsSync[]{NONE, STOPS_AND_EXITS, ALL, EVENTS};
        }

        static {
            RadarTrackingOptionsSync[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private RadarTrackingOptionsSync(String str, int i, int i2) {
            this.sync = i2;
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RadarTrackingOptionsSync valueOf(String str) {
            return (RadarTrackingOptionsSync) Enum.valueOf(RadarTrackingOptionsSync.class, str);
        }

        public static RadarTrackingOptionsSync[] values() {
            return (RadarTrackingOptionsSync[]) $VALUES.clone();
        }

        /* renamed from: getSync$sdk_release, reason: from getter */
        public final int getSync() {
            return this.sync;
        }

        public final String toRadarString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return EVENTS_STR;
                        }
                        dmk.a();
                        return null;
                    }
                    return "none";
                }
                return STOPS_AND_EXITS_STR;
            }
            return "all";
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync$Companion;", "", "()V", "ALL_STR", "", "EVENTS_STR", "NONE_STR", "STOPS_AND_EXITS_STR", "fromInt", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", RadarTrackingOptions.KEY_SYNC, "", "(Ljava/lang/Integer;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", "fromRadarString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RadarTrackingOptionsSync fromInt(Integer sync) {
                for (RadarTrackingOptionsSync radarTrackingOptionsSync : RadarTrackingOptionsSync.values()) {
                    int sync2 = radarTrackingOptionsSync.getSync();
                    if (sync != null && sync.intValue() == sync2) {
                        return radarTrackingOptionsSync;
                    }
                }
                return RadarTrackingOptionsSync.STOPS_AND_EXITS;
            }

            public final RadarTrackingOptionsSync fromRadarString(String sync) {
                if (sync != null) {
                    switch (sync.hashCode()) {
                        case -1291329255:
                            if (sync.equals(RadarTrackingOptionsSync.EVENTS_STR)) {
                                return RadarTrackingOptionsSync.EVENTS;
                            }
                            break;
                        case 96673:
                            if (sync.equals("all")) {
                                return RadarTrackingOptionsSync.ALL;
                            }
                            break;
                        case 3387192:
                            if (sync.equals("none")) {
                                return RadarTrackingOptionsSync.NONE;
                            }
                            break;
                        case 1965468495:
                            if (sync.equals(RadarTrackingOptionsSync.STOPS_AND_EXITS_STR)) {
                                return RadarTrackingOptionsSync.STOPS_AND_EXITS;
                            }
                            break;
                    }
                }
                return RadarTrackingOptionsSync.STOPS_AND_EXITS;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", "", RadarTrackingOptions.KEY_SYNC_GEOFENCES, "", "(Ljava/lang/String;II)V", "getSyncGeofences$sdk_release", "()I", "toRadarString", "", "NONE", "NEAREST", "CAMPAIGN", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RadarTrackingOptionsSyncGeofences {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RadarTrackingOptionsSyncGeofences[] $VALUES;
        public static final String CAMPAIGN_STR = "campaign-only";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final String NEAREST_STR = "nearest";
        public static final String NONE_STR = "none";
        private final int syncGeofences;
        public static final RadarTrackingOptionsSyncGeofences NONE = new RadarTrackingOptionsSyncGeofences("NONE", 0, 0);
        public static final RadarTrackingOptionsSyncGeofences NEAREST = new RadarTrackingOptionsSyncGeofences("NEAREST", 1, 1);
        public static final RadarTrackingOptionsSyncGeofences CAMPAIGN = new RadarTrackingOptionsSyncGeofences("CAMPAIGN", 2, 2);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTrackingOptionsSyncGeofences.values().length];
                try {
                    iArr[RadarTrackingOptionsSyncGeofences.NEAREST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTrackingOptionsSyncGeofences.CAMPAIGN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTrackingOptionsSyncGeofences.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ RadarTrackingOptionsSyncGeofences[] $values() {
            return new RadarTrackingOptionsSyncGeofences[]{NONE, NEAREST, CAMPAIGN};
        }

        static {
            RadarTrackingOptionsSyncGeofences[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private RadarTrackingOptionsSyncGeofences(String str, int i, int i2) {
            this.syncGeofences = i2;
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RadarTrackingOptionsSyncGeofences valueOf(String str) {
            return (RadarTrackingOptionsSyncGeofences) Enum.valueOf(RadarTrackingOptionsSyncGeofences.class, str);
        }

        public static RadarTrackingOptionsSyncGeofences[] values() {
            return (RadarTrackingOptionsSyncGeofences[]) $VALUES.clone();
        }

        /* renamed from: getSyncGeofences$sdk_release, reason: from getter */
        public final int getSyncGeofences() {
            return this.syncGeofences;
        }

        public final String toRadarString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "none";
                    }
                    dmk.a();
                    return null;
                }
                return CAMPAIGN_STR;
            }
            return NEAREST_STR;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences$Companion;", "", "()V", "CAMPAIGN_STR", "", "NEAREST_STR", "NONE_STR", "fromInt", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", RadarTrackingOptions.KEY_SYNC_GEOFENCES, "", "(Ljava/lang/Integer;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", "fromRadarString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RadarTrackingOptionsSyncGeofences fromInt(Integer syncGeofences) {
                for (RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences : RadarTrackingOptionsSyncGeofences.values()) {
                    int syncGeofences2 = radarTrackingOptionsSyncGeofences.getSyncGeofences();
                    if (syncGeofences != null && syncGeofences.intValue() == syncGeofences2) {
                        return radarTrackingOptionsSyncGeofences;
                    }
                }
                return RadarTrackingOptionsSyncGeofences.NONE;
            }

            public final RadarTrackingOptionsSyncGeofences fromRadarString(String syncGeofences) {
                if (Intrinsics.areEqual(syncGeofences, RadarTrackingOptionsSyncGeofences.NEAREST_STR)) {
                    return RadarTrackingOptionsSyncGeofences.NEAREST;
                }
                if (Intrinsics.areEqual(syncGeofences, RadarTrackingOptionsSyncGeofences.CAMPAIGN_STR)) {
                    return RadarTrackingOptionsSyncGeofences.CAMPAIGN;
                }
                return RadarTrackingOptionsSyncGeofences.NONE;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsType;", "", "type", "", "(Ljava/lang/String;II)V", "getType$sdk_release", "()I", "toRadarString", "", "DEFAULT", "ON_TRIP", "IN_GEOFENCE", "IS_USER", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RadarTrackingOptionsType {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RadarTrackingOptionsType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final String DEFAULT_STR = "default";
        public static final String IN_GEOFENCE_STR = "in-geofence";
        public static final String IS_USER_STR = "is-user";
        public static final String ON_TRIP_STR = "on-trip";
        private final int type;
        public static final RadarTrackingOptionsType DEFAULT = new RadarTrackingOptionsType("DEFAULT", 0, 0);
        public static final RadarTrackingOptionsType ON_TRIP = new RadarTrackingOptionsType("ON_TRIP", 1, 1);
        public static final RadarTrackingOptionsType IN_GEOFENCE = new RadarTrackingOptionsType("IN_GEOFENCE", 2, 2);
        public static final RadarTrackingOptionsType IS_USER = new RadarTrackingOptionsType("IS_USER", 3, 3);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTrackingOptionsType.values().length];
                try {
                    iArr[RadarTrackingOptionsType.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTrackingOptionsType.ON_TRIP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTrackingOptionsType.IN_GEOFENCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RadarTrackingOptionsType.IS_USER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ RadarTrackingOptionsType[] $values() {
            return new RadarTrackingOptionsType[]{DEFAULT, ON_TRIP, IN_GEOFENCE, IS_USER};
        }

        static {
            RadarTrackingOptionsType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private RadarTrackingOptionsType(String str, int i, int i2) {
            this.type = i2;
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RadarTrackingOptionsType valueOf(String str) {
            return (RadarTrackingOptionsType) Enum.valueOf(RadarTrackingOptionsType.class, str);
        }

        public static RadarTrackingOptionsType[] values() {
            return (RadarTrackingOptionsType[]) $VALUES.clone();
        }

        /* renamed from: getType$sdk_release, reason: from getter */
        public final int getType() {
            return this.type;
        }

        public final String toRadarString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return IS_USER_STR;
                        }
                        dmk.a();
                        return null;
                    }
                    return IN_GEOFENCE_STR;
                }
                return ON_TRIP_STR;
            }
            return "default";
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsType$Companion;", "", "()V", "DEFAULT_STR", "", "IN_GEOFENCE_STR", "IS_USER_STR", "ON_TRIP_STR", "fromRadarString", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsType;", "type", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RadarTrackingOptionsType fromRadarString(String type) {
                if (type != null) {
                    int hashCode = type.hashCode();
                    if (hashCode != -2029470936) {
                        if (hashCode != -1371972781) {
                            if (hashCode == 2036116110 && type.equals(RadarTrackingOptionsType.IS_USER_STR)) {
                                return RadarTrackingOptionsType.IS_USER;
                            }
                        } else if (type.equals(RadarTrackingOptionsType.ON_TRIP_STR)) {
                            return RadarTrackingOptionsType.ON_TRIP;
                        }
                    } else if (type.equals(RadarTrackingOptionsType.IN_GEOFENCE_STR)) {
                        return RadarTrackingOptionsType.IN_GEOFENCE;
                    }
                }
                return RadarTrackingOptionsType.DEFAULT;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$Companion;", "", "()V", "CONTINUOUS", "Lio/radar/sdk/RadarTrackingOptions;", "EFFICIENT", "KEY_BATCH_INTERVAL", "", "KEY_BATCH_SIZE", "KEY_BEACONS", "KEY_DESIRED_ACCURACY", "KEY_DESIRED_MOVING_UPDATE_INTERVAL", "KEY_DESIRED_STOPPED_UPDATE_INTERVAL", "KEY_DESIRED_SYNC_INTERVAL", "KEY_FASTEST_MOVING_UPDATE_INTERVAL", "KEY_FASTEST_STOPPED_UPDATE_INTERVAL", "KEY_FOREGROUND_SERVICE_ENABLED", "KEY_MOVING_GEOFENCE_RADIUS", "KEY_REPLAY", "KEY_START_TRACKING_AFTER", "KEY_STOPPED_GEOFENCE_RADIUS", "KEY_STOP_DISTANCE", "KEY_STOP_DURATION", "KEY_STOP_TRACKING_AFTER", "KEY_SYNC", "KEY_SYNC_GEOFENCES", "KEY_SYNC_GEOFENCES_LIMIT", "KEY_TYPE", "KEY_USE_MOTION", "KEY_USE_MOVING_GEOFENCE", "KEY_USE_PRESSURE", "KEY_USE_STOPPED_GEOFENCE", "RESPONSIVE", "fromJson", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v7 io.radar.sdk.RadarTrackingOptions, still in use, count: 2, list:
              (r2v7 io.radar.sdk.RadarTrackingOptions) from 0x0120: MOVE (r13v2 io.radar.sdk.RadarTrackingOptions) = (r2v7 io.radar.sdk.RadarTrackingOptions) (LINE:289)
              (r2v7 io.radar.sdk.RadarTrackingOptions) from 0x0104: MOVE (r13v5 io.radar.sdk.RadarTrackingOptions) = (r2v7 io.radar.sdk.RadarTrackingOptions) (LINE:261)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final io.radar.sdk.RadarTrackingOptions fromJson(org.json.JSONObject r29) {
            /*
                Method dump skipped, instructions count: 413
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.radar.sdk.RadarTrackingOptions.Companion.fromJson(org.json.JSONObject):io.radar.sdk.RadarTrackingOptions");
        }

        private Companion() {
        }
    }

    public /* synthetic */ RadarTrackingOptions(int i, int i2, int i3, int i4, int i5, RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy, int i6, int i7, Date date, Date date2, RadarTrackingOptionsReplay radarTrackingOptionsReplay, RadarTrackingOptionsSync radarTrackingOptionsSync, boolean z, int i8, boolean z2, int i9, RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences, int i10, boolean z3, boolean z4, boolean z5, boolean z6, int i11, int i12, RadarTrackingOptionsType radarTrackingOptionsType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, radarTrackingOptionsDesiredAccuracy, i6, i7, date, date2, radarTrackingOptionsReplay, radarTrackingOptionsSync, z, i8, z2, i9, radarTrackingOptionsSyncGeofences, i10, z3, z4, z5, z6, i11, i12, (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? RadarTrackingOptionsType.DEFAULT : radarTrackingOptionsType);
    }
}
