package io.radar.sdk.model;

import android.content.Context;
import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.hdi;
import defpackage.sv6;
import defpackage.woa;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.RadarSettings;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 Y2\u00020\u0001:\u0001YBá\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0002\u0010\u001eJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u000bHÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J÷\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0001J\u0013\u0010R\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0003HÖ\u0001J\u0006\u0010U\u001a\u00020VJ\t\u0010W\u001a\u00020XHÖ\u0001R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 ¨\u0006Z"}, d2 = {"Lio/radar/sdk/model/RadarSdkConfiguration;", "", RadarSdkConfiguration.MAX_CONCURRENT_JOBS, "", "schedulerRequiresNetwork", "", RadarSdkConfiguration.USE_PERSISTENCE, RadarSdkConfiguration.EXTEND_FLUSH_REPLAYS, RadarSdkConfiguration.USE_LOG_PERSISTENCE, RadarSdkConfiguration.USE_RADAR_MODIFIED_BEACON, RadarSdkConfiguration.LOG_LEVEL, "Lio/radar/sdk/Radar$RadarLogLevel;", RadarSdkConfiguration.START_TRACKING_ON_INITIALIZE, RadarSdkConfiguration.TRACK_ONCE_ON_APP_OPEN, RadarSdkConfiguration.USE_OPENED_APP_CONVERSION, RadarSdkConfiguration.USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF, RadarSdkConfiguration.LOCATION_MANAGER_TIMEOUT, RadarSdkConfiguration.SYNC_AFTER_SET_USER, RadarSdkConfiguration.USE_SYNC_REGION, RadarSdkConfiguration.STOP_DETECTION, RadarSdkConfiguration.BUFFER_GEOFENCE_ENTRIES, RadarSdkConfiguration.BUFFER_GEOFENCE_EXITS, RadarSdkConfiguration.DEFAULT_GEOFENCE_DWELL_THRESHOLD, RadarSdkConfiguration.MAX_REPLAY_BUFFER_SIZE, RadarSdkConfiguration.OFFLINE_EVENT_GENERATION_ENABLED, RadarSdkConfiguration.USE_OFFLINE_RTO_UPDATES, RadarSdkConfiguration.START_UPDATES_WHILE_IN_USE, RadarSdkConfiguration.REMOTE_TRACKING_OPTIONS, "", "Lio/radar/sdk/model/RadarRemoteTrackingOptions;", "(IZZZZZLio/radar/sdk/Radar$RadarLogLevel;ZZZZIZZZZZIIZZZLjava/util/List;)V", "getBufferGeofenceEntries", "()Z", "getBufferGeofenceExits", "getDefaultGeofenceDwellThreshold", "()I", "getExtendFlushReplays", "getLocationManagerTimeout", "getLogLevel", "()Lio/radar/sdk/Radar$RadarLogLevel;", "getMaxConcurrentJobs", "getMaxReplayBufferSize", "getOfflineEventGenerationEnabled", "getRemoteTrackingOptions", "()Ljava/util/List;", "getSchedulerRequiresNetwork", "getStartTrackingOnInitialize", "getStartUpdatesWhileInUse", "getStopDetection", "getSyncAfterSetUser", "getTrackOnceOnAppOpen", "getUseForegroundLocationUpdatedAtMsDiff", "getUseLogPersistence", "getUseOfflineRTOUpdates", "getUseOpenedAppConversion", "getUsePersistence", "getUseRadarModifiedBeacon", "getUseSyncRegion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RadarSdkConfiguration {
    private static final String BUFFER_GEOFENCE_ENTRIES = "bufferGeofenceEntries";
    private static final String BUFFER_GEOFENCE_EXITS = "bufferGeofenceExits";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEFAULT_GEOFENCE_DWELL_THRESHOLD = "defaultGeofenceDwellThreshold";
    private static final int DEFAULT_MAX_CONCURRENT_JOBS = 1;
    public static final int DEFAULT_MAX_REPLAY_BUFFER_SIZE = 120;
    private static final String EXTEND_FLUSH_REPLAYS = "extendFlushReplays";
    private static final String LOCATION_MANAGER_TIMEOUT = "locationManagerTimeout";
    private static final String LOG_LEVEL = "logLevel";
    private static final String MAX_CONCURRENT_JOBS = "maxConcurrentJobs";
    private static final String MAX_REPLAY_BUFFER_SIZE = "maxReplayBufferSize";
    private static final String OFFLINE_EVENT_GENERATION_ENABLED = "offlineEventGenerationEnabled";
    private static final String REMOTE_TRACKING_OPTIONS = "remoteTrackingOptions";
    private static final String SCHEDULER_REQUIRES_NETWORK = "networkAny";
    private static final String START_TRACKING_ON_INITIALIZE = "startTrackingOnInitialize";
    private static final String START_UPDATES_WHILE_IN_USE = "startUpdatesWhileInUse";
    private static final String STOP_DETECTION = "stopDetection";
    private static final String SYNC_AFTER_SET_USER = "syncAfterSetUser";
    private static final String TRACK_ONCE_ON_APP_OPEN = "trackOnceOnAppOpen";
    private static final String USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF = "useForegroundLocationUpdatedAtMsDiff";
    private static final String USE_LOG_PERSISTENCE = "useLogPersistence";
    private static final String USE_OFFLINE_RTO_UPDATES = "useOfflineRTOUpdates";
    private static final String USE_OPENED_APP_CONVERSION = "useOpenedAppConversion";
    private static final String USE_PERSISTENCE = "usePersistence";
    private static final String USE_RADAR_MODIFIED_BEACON = "useRadarModifiedBeacon";
    private static final String USE_SYNC_REGION = "useSyncRegion";
    private final boolean bufferGeofenceEntries;
    private final boolean bufferGeofenceExits;
    private final int defaultGeofenceDwellThreshold;
    private final boolean extendFlushReplays;
    private final int locationManagerTimeout;
    private final Radar.RadarLogLevel logLevel;
    private final int maxConcurrentJobs;
    private final int maxReplayBufferSize;
    private final boolean offlineEventGenerationEnabled;
    private final List<RadarRemoteTrackingOptions> remoteTrackingOptions;
    private final boolean schedulerRequiresNetwork;
    private final boolean startTrackingOnInitialize;
    private final boolean startUpdatesWhileInUse;
    private final boolean stopDetection;
    private final boolean syncAfterSetUser;
    private final boolean trackOnceOnAppOpen;
    private final boolean useForegroundLocationUpdatedAtMsDiff;
    private final boolean useLogPersistence;
    private final boolean useOfflineRTOUpdates;
    private final boolean useOpenedAppConversion;
    private final boolean usePersistence;
    private final boolean useRadarModifiedBeacon;
    private final boolean useSyncRegion;

    public /* synthetic */ RadarSdkConfiguration(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Radar.RadarLogLevel radarLogLevel, boolean z6, boolean z7, boolean z8, boolean z9, int i2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i3, int i4, boolean z15, boolean z16, boolean z17, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, z2, z3, z4, z5, radarLogLevel, z6, z7, (i5 & Barcode.FORMAT_UPC_A) != 0 ? false : z8, (i5 & Barcode.FORMAT_UPC_E) != 0 ? false : z9, (i5 & 2048) != 0 ? 0 : i2, (i5 & 4096) != 0 ? false : z10, (i5 & 8192) != 0 ? false : z11, (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z12, (32768 & i5) != 0 ? true : z13, (65536 & i5) != 0 ? true : z14, (131072 & i5) != 0 ? 0 : i3, (262144 & i5) != 0 ? 120 : i4, (524288 & i5) != 0 ? false : z15, (1048576 & i5) != 0 ? false : z16, (2097152 & i5) != 0 ? false : z17, (i5 & 4194304) != 0 ? null : list);
    }

    public static /* synthetic */ RadarSdkConfiguration copy$default(RadarSdkConfiguration radarSdkConfiguration, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Radar.RadarLogLevel radarLogLevel, boolean z6, boolean z7, boolean z8, boolean z9, int i2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i3, int i4, boolean z15, boolean z16, boolean z17, List list, int i5, Object obj) {
        List list2;
        boolean z18;
        int i6 = (i5 & 1) != 0 ? radarSdkConfiguration.maxConcurrentJobs : i;
        boolean z19 = (i5 & 2) != 0 ? radarSdkConfiguration.schedulerRequiresNetwork : z;
        boolean z20 = (i5 & 4) != 0 ? radarSdkConfiguration.usePersistence : z2;
        boolean z21 = (i5 & 8) != 0 ? radarSdkConfiguration.extendFlushReplays : z3;
        boolean z22 = (i5 & 16) != 0 ? radarSdkConfiguration.useLogPersistence : z4;
        boolean z23 = (i5 & 32) != 0 ? radarSdkConfiguration.useRadarModifiedBeacon : z5;
        Radar.RadarLogLevel radarLogLevel2 = (i5 & 64) != 0 ? radarSdkConfiguration.logLevel : radarLogLevel;
        boolean z24 = (i5 & 128) != 0 ? radarSdkConfiguration.startTrackingOnInitialize : z6;
        boolean z25 = (i5 & 256) != 0 ? radarSdkConfiguration.trackOnceOnAppOpen : z7;
        boolean z26 = (i5 & Barcode.FORMAT_UPC_A) != 0 ? radarSdkConfiguration.useOpenedAppConversion : z8;
        boolean z27 = (i5 & Barcode.FORMAT_UPC_E) != 0 ? radarSdkConfiguration.useForegroundLocationUpdatedAtMsDiff : z9;
        int i7 = (i5 & 2048) != 0 ? radarSdkConfiguration.locationManagerTimeout : i2;
        boolean z28 = (i5 & 4096) != 0 ? radarSdkConfiguration.syncAfterSetUser : z10;
        boolean z29 = (i5 & 8192) != 0 ? radarSdkConfiguration.useSyncRegion : z11;
        int i8 = i6;
        boolean z30 = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? radarSdkConfiguration.stopDetection : z12;
        boolean z31 = (i5 & 32768) != 0 ? radarSdkConfiguration.bufferGeofenceEntries : z13;
        boolean z32 = (i5 & 65536) != 0 ? radarSdkConfiguration.bufferGeofenceExits : z14;
        int i9 = (i5 & 131072) != 0 ? radarSdkConfiguration.defaultGeofenceDwellThreshold : i3;
        int i10 = (i5 & 262144) != 0 ? radarSdkConfiguration.maxReplayBufferSize : i4;
        boolean z33 = (i5 & 524288) != 0 ? radarSdkConfiguration.offlineEventGenerationEnabled : z15;
        boolean z34 = (i5 & 1048576) != 0 ? radarSdkConfiguration.useOfflineRTOUpdates : z16;
        boolean z35 = (i5 & 2097152) != 0 ? radarSdkConfiguration.startUpdatesWhileInUse : z17;
        if ((i5 & 4194304) != 0) {
            z18 = z35;
            list2 = radarSdkConfiguration.remoteTrackingOptions;
        } else {
            list2 = list;
            z18 = z35;
        }
        return radarSdkConfiguration.copy(i8, z19, z20, z21, z22, z23, radarLogLevel2, z24, z25, z26, z27, i7, z28, z29, z30, z31, z32, i9, i10, z33, z34, z18, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getUseOpenedAppConversion() {
        return this.useOpenedAppConversion;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getUseForegroundLocationUpdatedAtMsDiff() {
        return this.useForegroundLocationUpdatedAtMsDiff;
    }

    /* renamed from: component12, reason: from getter */
    public final int getLocationManagerTimeout() {
        return this.locationManagerTimeout;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getSyncAfterSetUser() {
        return this.syncAfterSetUser;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getUseSyncRegion() {
        return this.useSyncRegion;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getStopDetection() {
        return this.stopDetection;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getBufferGeofenceEntries() {
        return this.bufferGeofenceEntries;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getBufferGeofenceExits() {
        return this.bufferGeofenceExits;
    }

    /* renamed from: component18, reason: from getter */
    public final int getDefaultGeofenceDwellThreshold() {
        return this.defaultGeofenceDwellThreshold;
    }

    /* renamed from: component19, reason: from getter */
    public final int getMaxReplayBufferSize() {
        return this.maxReplayBufferSize;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSchedulerRequiresNetwork() {
        return this.schedulerRequiresNetwork;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getOfflineEventGenerationEnabled() {
        return this.offlineEventGenerationEnabled;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getUseOfflineRTOUpdates() {
        return this.useOfflineRTOUpdates;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getStartUpdatesWhileInUse() {
        return this.startUpdatesWhileInUse;
    }

    public final List<RadarRemoteTrackingOptions> component23() {
        return this.remoteTrackingOptions;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUsePersistence() {
        return this.usePersistence;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getExtendFlushReplays() {
        return this.extendFlushReplays;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseLogPersistence() {
        return this.useLogPersistence;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUseRadarModifiedBeacon() {
        return this.useRadarModifiedBeacon;
    }

    /* renamed from: component7, reason: from getter */
    public final Radar.RadarLogLevel getLogLevel() {
        return this.logLevel;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getStartTrackingOnInitialize() {
        return this.startTrackingOnInitialize;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getTrackOnceOnAppOpen() {
        return this.trackOnceOnAppOpen;
    }

    public final RadarSdkConfiguration copy(int maxConcurrentJobs, boolean schedulerRequiresNetwork, boolean usePersistence, boolean extendFlushReplays, boolean useLogPersistence, boolean useRadarModifiedBeacon, Radar.RadarLogLevel logLevel, boolean startTrackingOnInitialize, boolean trackOnceOnAppOpen, boolean useOpenedAppConversion, boolean useForegroundLocationUpdatedAtMsDiff, int locationManagerTimeout, boolean syncAfterSetUser, boolean useSyncRegion, boolean stopDetection, boolean bufferGeofenceEntries, boolean bufferGeofenceExits, int defaultGeofenceDwellThreshold, int maxReplayBufferSize, boolean offlineEventGenerationEnabled, boolean useOfflineRTOUpdates, boolean startUpdatesWhileInUse, List<RadarRemoteTrackingOptions> remoteTrackingOptions) {
        logLevel.getClass();
        return new RadarSdkConfiguration(maxConcurrentJobs, schedulerRequiresNetwork, usePersistence, extendFlushReplays, useLogPersistence, useRadarModifiedBeacon, logLevel, startTrackingOnInitialize, trackOnceOnAppOpen, useOpenedAppConversion, useForegroundLocationUpdatedAtMsDiff, locationManagerTimeout, syncAfterSetUser, useSyncRegion, stopDetection, bufferGeofenceEntries, bufferGeofenceExits, defaultGeofenceDwellThreshold, maxReplayBufferSize, offlineEventGenerationEnabled, useOfflineRTOUpdates, startUpdatesWhileInUse, remoteTrackingOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarSdkConfiguration)) {
            return false;
        }
        RadarSdkConfiguration radarSdkConfiguration = (RadarSdkConfiguration) other;
        if (this.maxConcurrentJobs == radarSdkConfiguration.maxConcurrentJobs && this.schedulerRequiresNetwork == radarSdkConfiguration.schedulerRequiresNetwork && this.usePersistence == radarSdkConfiguration.usePersistence && this.extendFlushReplays == radarSdkConfiguration.extendFlushReplays && this.useLogPersistence == radarSdkConfiguration.useLogPersistence && this.useRadarModifiedBeacon == radarSdkConfiguration.useRadarModifiedBeacon && this.logLevel == radarSdkConfiguration.logLevel && this.startTrackingOnInitialize == radarSdkConfiguration.startTrackingOnInitialize && this.trackOnceOnAppOpen == radarSdkConfiguration.trackOnceOnAppOpen && this.useOpenedAppConversion == radarSdkConfiguration.useOpenedAppConversion && this.useForegroundLocationUpdatedAtMsDiff == radarSdkConfiguration.useForegroundLocationUpdatedAtMsDiff && this.locationManagerTimeout == radarSdkConfiguration.locationManagerTimeout && this.syncAfterSetUser == radarSdkConfiguration.syncAfterSetUser && this.useSyncRegion == radarSdkConfiguration.useSyncRegion && this.stopDetection == radarSdkConfiguration.stopDetection && this.bufferGeofenceEntries == radarSdkConfiguration.bufferGeofenceEntries && this.bufferGeofenceExits == radarSdkConfiguration.bufferGeofenceExits && this.defaultGeofenceDwellThreshold == radarSdkConfiguration.defaultGeofenceDwellThreshold && this.maxReplayBufferSize == radarSdkConfiguration.maxReplayBufferSize && this.offlineEventGenerationEnabled == radarSdkConfiguration.offlineEventGenerationEnabled && this.useOfflineRTOUpdates == radarSdkConfiguration.useOfflineRTOUpdates && this.startUpdatesWhileInUse == radarSdkConfiguration.startUpdatesWhileInUse && Intrinsics.areEqual(this.remoteTrackingOptions, radarSdkConfiguration.remoteTrackingOptions)) {
            return true;
        }
        return false;
    }

    public final boolean getBufferGeofenceEntries() {
        return this.bufferGeofenceEntries;
    }

    public final boolean getBufferGeofenceExits() {
        return this.bufferGeofenceExits;
    }

    public final int getDefaultGeofenceDwellThreshold() {
        return this.defaultGeofenceDwellThreshold;
    }

    public final boolean getExtendFlushReplays() {
        return this.extendFlushReplays;
    }

    public final int getLocationManagerTimeout() {
        return this.locationManagerTimeout;
    }

    public final Radar.RadarLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final int getMaxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

    public final int getMaxReplayBufferSize() {
        return this.maxReplayBufferSize;
    }

    public final boolean getOfflineEventGenerationEnabled() {
        return this.offlineEventGenerationEnabled;
    }

    public final List<RadarRemoteTrackingOptions> getRemoteTrackingOptions() {
        return this.remoteTrackingOptions;
    }

    public final boolean getSchedulerRequiresNetwork() {
        return this.schedulerRequiresNetwork;
    }

    public final boolean getStartTrackingOnInitialize() {
        return this.startTrackingOnInitialize;
    }

    public final boolean getStartUpdatesWhileInUse() {
        return this.startUpdatesWhileInUse;
    }

    public final boolean getStopDetection() {
        return this.stopDetection;
    }

    public final boolean getSyncAfterSetUser() {
        return this.syncAfterSetUser;
    }

    public final boolean getTrackOnceOnAppOpen() {
        return this.trackOnceOnAppOpen;
    }

    public final boolean getUseForegroundLocationUpdatedAtMsDiff() {
        return this.useForegroundLocationUpdatedAtMsDiff;
    }

    public final boolean getUseLogPersistence() {
        return this.useLogPersistence;
    }

    public final boolean getUseOfflineRTOUpdates() {
        return this.useOfflineRTOUpdates;
    }

    public final boolean getUseOpenedAppConversion() {
        return this.useOpenedAppConversion;
    }

    public final boolean getUsePersistence() {
        return this.usePersistence;
    }

    public final boolean getUseRadarModifiedBeacon() {
        return this.useRadarModifiedBeacon;
    }

    public final boolean getUseSyncRegion() {
        return this.useSyncRegion;
    }

    public int hashCode() {
        int hashCode;
        int g = hdi.g(hdi.g(hdi.g(woa.b(this.maxReplayBufferSize, woa.b(this.defaultGeofenceDwellThreshold, hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(woa.b(this.locationManagerTimeout, hdi.g(hdi.g(hdi.g(hdi.g((this.logLevel.hashCode() + hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(Integer.hashCode(this.maxConcurrentJobs) * 31, 31, this.schedulerRequiresNetwork), 31, this.usePersistence), 31, this.extendFlushReplays), 31, this.useLogPersistence), 31, this.useRadarModifiedBeacon)) * 31, 31, this.startTrackingOnInitialize), 31, this.trackOnceOnAppOpen), 31, this.useOpenedAppConversion), 31, this.useForegroundLocationUpdatedAtMsDiff), 31), 31, this.syncAfterSetUser), 31, this.useSyncRegion), 31, this.stopDetection), 31, this.bufferGeofenceEntries), 31, this.bufferGeofenceExits), 31), 31), 31, this.offlineEventGenerationEnabled), 31, this.useOfflineRTOUpdates), 31, this.startUpdatesWhileInUse);
        List<RadarRemoteTrackingOptions> list = this.remoteTrackingOptions;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return g + hashCode;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(SCHEDULER_REQUIRES_NETWORK, Boolean.valueOf(this.schedulerRequiresNetwork));
        jSONObject.putOpt(MAX_CONCURRENT_JOBS, Integer.valueOf(this.maxConcurrentJobs));
        jSONObject.putOpt(USE_PERSISTENCE, Boolean.valueOf(this.usePersistence));
        jSONObject.putOpt(EXTEND_FLUSH_REPLAYS, Boolean.valueOf(this.extendFlushReplays));
        jSONObject.putOpt(USE_LOG_PERSISTENCE, Boolean.valueOf(this.useLogPersistence));
        jSONObject.putOpt(USE_RADAR_MODIFIED_BEACON, Boolean.valueOf(this.useRadarModifiedBeacon));
        String lowerCase = this.logLevel.toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        jSONObject.putOpt(LOG_LEVEL, lowerCase);
        jSONObject.putOpt(START_TRACKING_ON_INITIALIZE, Boolean.valueOf(this.startTrackingOnInitialize));
        jSONObject.putOpt(TRACK_ONCE_ON_APP_OPEN, Boolean.valueOf(this.trackOnceOnAppOpen));
        jSONObject.putOpt(USE_OPENED_APP_CONVERSION, Boolean.valueOf(this.useOpenedAppConversion));
        jSONObject.putOpt(USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF, Boolean.valueOf(this.useForegroundLocationUpdatedAtMsDiff));
        jSONObject.putOpt(LOCATION_MANAGER_TIMEOUT, Integer.valueOf(this.locationManagerTimeout));
        jSONObject.putOpt(SYNC_AFTER_SET_USER, Boolean.valueOf(this.syncAfterSetUser));
        jSONObject.putOpt(USE_SYNC_REGION, Boolean.valueOf(this.useSyncRegion));
        jSONObject.putOpt(STOP_DETECTION, Boolean.valueOf(this.stopDetection));
        jSONObject.putOpt(BUFFER_GEOFENCE_ENTRIES, Boolean.valueOf(this.bufferGeofenceEntries));
        jSONObject.putOpt(BUFFER_GEOFENCE_EXITS, Boolean.valueOf(this.bufferGeofenceExits));
        jSONObject.putOpt(DEFAULT_GEOFENCE_DWELL_THRESHOLD, Integer.valueOf(this.defaultGeofenceDwellThreshold));
        jSONObject.putOpt(MAX_REPLAY_BUFFER_SIZE, Integer.valueOf(this.maxReplayBufferSize));
        jSONObject.putOpt(OFFLINE_EVENT_GENERATION_ENABLED, Boolean.valueOf(this.offlineEventGenerationEnabled));
        jSONObject.putOpt(USE_OFFLINE_RTO_UPDATES, Boolean.valueOf(this.useOfflineRTOUpdates));
        jSONObject.putOpt(START_UPDATES_WHILE_IN_USE, Boolean.valueOf(this.startUpdatesWhileInUse));
        jSONObject.putOpt(REMOTE_TRACKING_OPTIONS, RadarRemoteTrackingOptions.INSTANCE.toJsonArray(this.remoteTrackingOptions));
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RadarSdkConfiguration(maxConcurrentJobs=");
        sb.append(this.maxConcurrentJobs);
        sb.append(", schedulerRequiresNetwork=");
        sb.append(this.schedulerRequiresNetwork);
        sb.append(", usePersistence=");
        sb.append(this.usePersistence);
        sb.append(", extendFlushReplays=");
        sb.append(this.extendFlushReplays);
        sb.append(", useLogPersistence=");
        sb.append(this.useLogPersistence);
        sb.append(", useRadarModifiedBeacon=");
        sb.append(this.useRadarModifiedBeacon);
        sb.append(", logLevel=");
        sb.append(this.logLevel);
        sb.append(", startTrackingOnInitialize=");
        sb.append(this.startTrackingOnInitialize);
        sb.append(", trackOnceOnAppOpen=");
        sb.append(this.trackOnceOnAppOpen);
        sb.append(", useOpenedAppConversion=");
        sb.append(this.useOpenedAppConversion);
        sb.append(", useForegroundLocationUpdatedAtMsDiff=");
        sb.append(this.useForegroundLocationUpdatedAtMsDiff);
        sb.append(", locationManagerTimeout=");
        sb.append(this.locationManagerTimeout);
        sb.append(", syncAfterSetUser=");
        sb.append(this.syncAfterSetUser);
        sb.append(", useSyncRegion=");
        sb.append(this.useSyncRegion);
        sb.append(", stopDetection=");
        sb.append(this.stopDetection);
        sb.append(", bufferGeofenceEntries=");
        sb.append(this.bufferGeofenceEntries);
        sb.append(", bufferGeofenceExits=");
        sb.append(this.bufferGeofenceExits);
        sb.append(", defaultGeofenceDwellThreshold=");
        sb.append(this.defaultGeofenceDwellThreshold);
        sb.append(", maxReplayBufferSize=");
        sb.append(this.maxReplayBufferSize);
        sb.append(", offlineEventGenerationEnabled=");
        sb.append(this.offlineEventGenerationEnabled);
        sb.append(", useOfflineRTOUpdates=");
        sb.append(this.useOfflineRTOUpdates);
        sb.append(", startUpdatesWhileInUse=");
        sb.append(this.startUpdatesWhileInUse);
        sb.append(", remoteTrackingOptions=");
        return sv6.r(sb, this.remoteTrackingOptions, ')');
    }

    public RadarSdkConfiguration(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Radar.RadarLogLevel radarLogLevel, boolean z6, boolean z7, boolean z8, boolean z9, int i2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i3, int i4, boolean z15, boolean z16, boolean z17, List<RadarRemoteTrackingOptions> list) {
        radarLogLevel.getClass();
        this.maxConcurrentJobs = i;
        this.schedulerRequiresNetwork = z;
        this.usePersistence = z2;
        this.extendFlushReplays = z3;
        this.useLogPersistence = z4;
        this.useRadarModifiedBeacon = z5;
        this.logLevel = radarLogLevel;
        this.startTrackingOnInitialize = z6;
        this.trackOnceOnAppOpen = z7;
        this.useOpenedAppConversion = z8;
        this.useForegroundLocationUpdatedAtMsDiff = z9;
        this.locationManagerTimeout = i2;
        this.syncAfterSetUser = z10;
        this.useSyncRegion = z11;
        this.stopDetection = z12;
        this.bufferGeofenceEntries = z13;
        this.bufferGeofenceExits = z14;
        this.defaultGeofenceDwellThreshold = i3;
        this.maxReplayBufferSize = i4;
        this.offlineEventGenerationEnabled = z15;
        this.useOfflineRTOUpdates = z16;
        this.startUpdatesWhileInUse = z17;
        this.remoteTrackingOptions = list;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lio/radar/sdk/model/RadarSdkConfiguration$Companion;", "", "()V", "BUFFER_GEOFENCE_ENTRIES", "", "BUFFER_GEOFENCE_EXITS", "DEFAULT_GEOFENCE_DWELL_THRESHOLD", "DEFAULT_MAX_CONCURRENT_JOBS", "", "DEFAULT_MAX_REPLAY_BUFFER_SIZE", "EXTEND_FLUSH_REPLAYS", "LOCATION_MANAGER_TIMEOUT", "LOG_LEVEL", "MAX_CONCURRENT_JOBS", "MAX_REPLAY_BUFFER_SIZE", "OFFLINE_EVENT_GENERATION_ENABLED", "REMOTE_TRACKING_OPTIONS", "SCHEDULER_REQUIRES_NETWORK", "START_TRACKING_ON_INITIALIZE", "START_UPDATES_WHILE_IN_USE", "STOP_DETECTION", "SYNC_AFTER_SET_USER", "TRACK_ONCE_ON_APP_OPEN", "USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF", "USE_LOG_PERSISTENCE", "USE_OFFLINE_RTO_UPDATES", "USE_OPENED_APP_CONVERSION", "USE_PERSISTENCE", "USE_RADAR_MODIFIED_BEACON", "USE_SYNC_REGION", "fromJson", "Lio/radar/sdk/model/RadarSdkConfiguration;", "json", "Lorg/json/JSONObject;", "updateSdkConfigurationFromServer", "", "context", "Landroid/content/Context;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarSdkConfiguration fromJson(JSONObject json) {
            JSONObject jSONObject;
            int i;
            if (json == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = json;
            }
            int optInt = jSONObject.optInt(RadarSdkConfiguration.MAX_REPLAY_BUFFER_SIZE, 120);
            if (optInt > 0 && optInt <= 120) {
                i = optInt;
            } else {
                i = 120;
            }
            int optInt2 = jSONObject.optInt(RadarSdkConfiguration.MAX_CONCURRENT_JOBS, 1);
            boolean optBoolean = jSONObject.optBoolean(RadarSdkConfiguration.SCHEDULER_REQUIRES_NETWORK, false);
            boolean optBoolean2 = jSONObject.optBoolean(RadarSdkConfiguration.USE_PERSISTENCE, false);
            boolean optBoolean3 = jSONObject.optBoolean(RadarSdkConfiguration.EXTEND_FLUSH_REPLAYS, false);
            boolean optBoolean4 = jSONObject.optBoolean(RadarSdkConfiguration.USE_LOG_PERSISTENCE, false);
            boolean optBoolean5 = jSONObject.optBoolean(RadarSdkConfiguration.USE_RADAR_MODIFIED_BEACON, false);
            String optString = jSONObject.optString(RadarSdkConfiguration.LOG_LEVEL, "info");
            optString.getClass();
            String upperCase = optString.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return new RadarSdkConfiguration(optInt2, optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, Radar.RadarLogLevel.valueOf(upperCase), jSONObject.optBoolean(RadarSdkConfiguration.START_TRACKING_ON_INITIALIZE, false), jSONObject.optBoolean(RadarSdkConfiguration.TRACK_ONCE_ON_APP_OPEN, false), jSONObject.optBoolean(RadarSdkConfiguration.USE_OPENED_APP_CONVERSION, true), jSONObject.optBoolean(RadarSdkConfiguration.USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF, false), jSONObject.optInt(RadarSdkConfiguration.LOCATION_MANAGER_TIMEOUT, 0), jSONObject.optBoolean(RadarSdkConfiguration.SYNC_AFTER_SET_USER, false), jSONObject.optBoolean(RadarSdkConfiguration.USE_SYNC_REGION, false), jSONObject.optBoolean(RadarSdkConfiguration.STOP_DETECTION, false), jSONObject.optBoolean(RadarSdkConfiguration.BUFFER_GEOFENCE_ENTRIES, true), jSONObject.optBoolean(RadarSdkConfiguration.BUFFER_GEOFENCE_EXITS, true), jSONObject.optInt(RadarSdkConfiguration.DEFAULT_GEOFENCE_DWELL_THRESHOLD, 0), i, jSONObject.optBoolean(RadarSdkConfiguration.OFFLINE_EVENT_GENERATION_ENABLED, false), jSONObject.optBoolean(RadarSdkConfiguration.USE_OFFLINE_RTO_UPDATES, false), jSONObject.optBoolean(RadarSdkConfiguration.START_UPDATES_WHILE_IN_USE, false), RadarRemoteTrackingOptions.INSTANCE.fromJsonArray(jSONObject.optJSONArray(RadarSdkConfiguration.REMOTE_TRACKING_OPTIONS)));
        }

        public final void updateSdkConfigurationFromServer(final Context context) {
            context.getClass();
            RadarApiClient.getConfig$sdk_release$default(Radar.INSTANCE.getApiClient$sdk_release(), "sdkConfigUpdate", false, null, new RadarApiClient.RadarGetConfigApiCallback() { // from class: io.radar.sdk.model.RadarSdkConfiguration$Companion$updateSdkConfigurationFromServer$1
                @Override // io.radar.sdk.RadarApiClient.RadarGetConfigApiCallback
                public void onComplete(Radar.RadarStatus status, RadarConfig config) {
                    status.getClass();
                    if (config == null) {
                        return;
                    }
                    RadarSettings.INSTANCE.setSdkConfiguration(context, config.getMeta().getSdkConfiguration());
                }
            }, 4, null);
        }

        private Companion() {
        }
    }
}
