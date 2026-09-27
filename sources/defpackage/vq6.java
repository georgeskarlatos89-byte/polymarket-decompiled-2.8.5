package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALL_ATTRIBUTES_PRIVATE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vq6 {
    private static final /* synthetic */ vq6[] $VALUES;
    public static final vq6 ALL_ATTRIBUTES_PRIVATE;
    public static final vq6 BACKGROUND_POLLING_DISABLED;
    public static final vq6 BACKGROUND_POLLING_INTERVAL_MILLIS;
    public static final vq6 CONNECT_TIMEOUT_MILLIS;
    public static final vq6 CUSTOM_BASE_URI;
    public static final vq6 CUSTOM_EVENTS_URI;
    public static final vq6 CUSTOM_STREAM_URI;
    public static final vq6 DATA_STORE_TYPE;
    public static final vq6 DIAGNOSTIC_RECORDING_INTERVAL_MILLIS;
    public static final vq6 EVALUATION_REASONS_REQUESTED;
    public static final vq6 EVENTS_CAPACITY;
    public static final vq6 EVENTS_FLUSH_INTERVAL_MILLIS;
    public static final vq6 MAX_CACHED_USERS;
    public static final vq6 MOBILE_KEY_COUNT;
    public static final vq6 POLLING_INTERVAL_MILLIS;
    public static final vq6 RECONNECT_TIME_MILLIS;
    public static final vq6 SAMPLING_INTERVAL;
    public static final vq6 SOCKET_TIMEOUT_MILLIS;
    public static final vq6 START_WAIT_MILLIS;
    public static final vq6 STREAMING_DISABLED;
    public static final vq6 USER_KEYS_CAPACITY;
    public static final vq6 USER_KEYS_FLUSH_INTERVAL_MILLIS;
    public static final vq6 USE_REPORT;
    public static final vq6 USING_PROXY;
    public static final vq6 USING_PROXY_AUTHENTICATOR;
    public static final vq6 USING_RELAY_DAEMON;
    public final String name;
    public final fva type;

    static {
        fva fvaVar = fva.BOOLEAN;
        vq6 vq6Var = new vq6("ALL_ATTRIBUTES_PRIVATE", 0, "allAttributesPrivate", fvaVar);
        ALL_ATTRIBUTES_PRIVATE = vq6Var;
        fva fvaVar2 = fva.NUMBER;
        vq6 vq6Var2 = new vq6("CONNECT_TIMEOUT_MILLIS", 1, "connectTimeoutMillis", fvaVar2);
        CONNECT_TIMEOUT_MILLIS = vq6Var2;
        vq6 vq6Var3 = new vq6("CUSTOM_BASE_URI", 2, "customBaseURI", fvaVar);
        CUSTOM_BASE_URI = vq6Var3;
        vq6 vq6Var4 = new vq6("CUSTOM_EVENTS_URI", 3, "customEventsURI", fvaVar);
        CUSTOM_EVENTS_URI = vq6Var4;
        vq6 vq6Var5 = new vq6("CUSTOM_STREAM_URI", 4, "customStreamURI", fvaVar);
        CUSTOM_STREAM_URI = vq6Var5;
        vq6 vq6Var6 = new vq6("DATA_STORE_TYPE", 5, "dataStoreType", fva.STRING);
        DATA_STORE_TYPE = vq6Var6;
        vq6 vq6Var7 = new vq6("DIAGNOSTIC_RECORDING_INTERVAL_MILLIS", 6, "diagnosticRecordingIntervalMillis", fvaVar2);
        DIAGNOSTIC_RECORDING_INTERVAL_MILLIS = vq6Var7;
        vq6 vq6Var8 = new vq6("EVENTS_CAPACITY", 7, "eventsCapacity", fvaVar2);
        EVENTS_CAPACITY = vq6Var8;
        vq6 vq6Var9 = new vq6("EVENTS_FLUSH_INTERVAL_MILLIS", 8, "eventsFlushIntervalMillis", fvaVar2);
        EVENTS_FLUSH_INTERVAL_MILLIS = vq6Var9;
        vq6 vq6Var10 = new vq6("POLLING_INTERVAL_MILLIS", 9, "pollingIntervalMillis", fvaVar2);
        POLLING_INTERVAL_MILLIS = vq6Var10;
        vq6 vq6Var11 = new vq6("RECONNECT_TIME_MILLIS", 10, "reconnectTimeMillis", fvaVar2);
        RECONNECT_TIME_MILLIS = vq6Var11;
        vq6 vq6Var12 = new vq6("SAMPLING_INTERVAL", 11, "samplingInterval", fvaVar2);
        SAMPLING_INTERVAL = vq6Var12;
        vq6 vq6Var13 = new vq6("SOCKET_TIMEOUT_MILLIS", 12, "socketTimeoutMillis", fvaVar2);
        SOCKET_TIMEOUT_MILLIS = vq6Var13;
        vq6 vq6Var14 = new vq6("START_WAIT_MILLIS", 13, "startWaitMillis", fvaVar2);
        START_WAIT_MILLIS = vq6Var14;
        vq6 vq6Var15 = new vq6("STREAMING_DISABLED", 14, "streamingDisabled", fvaVar);
        STREAMING_DISABLED = vq6Var15;
        vq6 vq6Var16 = new vq6("USER_KEYS_CAPACITY", 15, "userKeysCapacity", fvaVar2);
        USER_KEYS_CAPACITY = vq6Var16;
        vq6 vq6Var17 = new vq6("USER_KEYS_FLUSH_INTERVAL_MILLIS", 16, "userKeysFlushIntervalMillis", fvaVar2);
        USER_KEYS_FLUSH_INTERVAL_MILLIS = vq6Var17;
        vq6 vq6Var18 = new vq6("USING_PROXY", 17, "usingProxy", fvaVar);
        USING_PROXY = vq6Var18;
        vq6 vq6Var19 = new vq6("USING_PROXY_AUTHENTICATOR", 18, "usingProxyAuthenticator", fvaVar);
        USING_PROXY_AUTHENTICATOR = vq6Var19;
        vq6 vq6Var20 = new vq6("USING_RELAY_DAEMON", 19, "usingRelayDaemon", fvaVar);
        USING_RELAY_DAEMON = vq6Var20;
        vq6 vq6Var21 = new vq6("BACKGROUND_POLLING_INTERVAL_MILLIS", 20, "backgroundPollingIntervalMillis", fvaVar2);
        BACKGROUND_POLLING_INTERVAL_MILLIS = vq6Var21;
        vq6 vq6Var22 = new vq6("BACKGROUND_POLLING_DISABLED", 21, "backgroundPollingDisabled", fvaVar);
        BACKGROUND_POLLING_DISABLED = vq6Var22;
        vq6 vq6Var23 = new vq6("EVALUATION_REASONS_REQUESTED", 22, "evaluationReasonsRequested", fvaVar);
        EVALUATION_REASONS_REQUESTED = vq6Var23;
        vq6 vq6Var24 = new vq6("MAX_CACHED_USERS", 23, "maxCachedUsers", fvaVar2);
        MAX_CACHED_USERS = vq6Var24;
        vq6 vq6Var25 = new vq6("MOBILE_KEY_COUNT", 24, "mobileKeyCount", fvaVar2);
        MOBILE_KEY_COUNT = vq6Var25;
        vq6 vq6Var26 = new vq6("USE_REPORT", 25, "useReport", fvaVar);
        USE_REPORT = vq6Var26;
        $VALUES = new vq6[]{vq6Var, vq6Var2, vq6Var3, vq6Var4, vq6Var5, vq6Var6, vq6Var7, vq6Var8, vq6Var9, vq6Var10, vq6Var11, vq6Var12, vq6Var13, vq6Var14, vq6Var15, vq6Var16, vq6Var17, vq6Var18, vq6Var19, vq6Var20, vq6Var21, vq6Var22, vq6Var23, vq6Var24, vq6Var25, vq6Var26};
    }

    public vq6(String str, int i, String str2, fva fvaVar) {
        this.name = str2;
        this.type = fvaVar;
    }

    public static vq6 valueOf(String str) {
        return (vq6) Enum.valueOf(vq6.class, str);
    }

    public static vq6[] values() {
        return (vq6[]) $VALUES.clone();
    }
}
