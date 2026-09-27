package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zq0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zq0[] $VALUES;
    public static final zq0 API_NOT_AVAILABLE;
    public static final zq0 APP_NOT_INSTALLED;
    public static final zq0 APP_UID_MISMATCH;
    public static final zq0 BACKEND_VERDICT_FAILED;
    public static final zq0 CANNOT_BIND_TO_SERVICE;
    public static final zq0 CLIENT_TRANSIENT_ERROR;
    public static final zq0 CLOUD_PROJECT_NUMBER_IS_INVALID;
    public static final zq0 GOOGLE_SERVER_UNAVAILABLE;
    public static final zq0 INTEGRITY_TOKEN_PROVIDER_INVALID;
    public static final zq0 INTERNAL_ERROR;
    public static final zq0 NETWORK_ERROR;
    public static final zq0 NO_ERROR;
    public static final zq0 PLAY_SERVICES_NOT_FOUND;
    public static final zq0 PLAY_SERVICES_VERSION_OUTDATED;
    public static final zq0 PLAY_STORE_NOT_FOUND;
    public static final zq0 PLAY_STORE_VERSION_OUTDATED;
    public static final zq0 REQUEST_HASH_TOO_LONG;
    public static final zq0 TOO_MANY_REQUESTS;
    public static final zq0 UNKNOWN;
    private final boolean isRetriable;

    static {
        zq0 zq0Var = new zq0("API_NOT_AVAILABLE", 0, false);
        API_NOT_AVAILABLE = zq0Var;
        zq0 zq0Var2 = new zq0("APP_NOT_INSTALLED", 1, false);
        APP_NOT_INSTALLED = zq0Var2;
        zq0 zq0Var3 = new zq0("APP_UID_MISMATCH", 2, false);
        APP_UID_MISMATCH = zq0Var3;
        zq0 zq0Var4 = new zq0("CANNOT_BIND_TO_SERVICE", 3, true);
        CANNOT_BIND_TO_SERVICE = zq0Var4;
        zq0 zq0Var5 = new zq0("CLIENT_TRANSIENT_ERROR", 4, true);
        CLIENT_TRANSIENT_ERROR = zq0Var5;
        zq0 zq0Var6 = new zq0("CLOUD_PROJECT_NUMBER_IS_INVALID", 5, false);
        CLOUD_PROJECT_NUMBER_IS_INVALID = zq0Var6;
        zq0 zq0Var7 = new zq0("GOOGLE_SERVER_UNAVAILABLE", 6, true);
        GOOGLE_SERVER_UNAVAILABLE = zq0Var7;
        zq0 zq0Var8 = new zq0("INTEGRITY_TOKEN_PROVIDER_INVALID", 7, false);
        INTEGRITY_TOKEN_PROVIDER_INVALID = zq0Var8;
        zq0 zq0Var9 = new zq0("INTERNAL_ERROR", 8, true);
        INTERNAL_ERROR = zq0Var9;
        zq0 zq0Var10 = new zq0("NO_ERROR", 9, false);
        NO_ERROR = zq0Var10;
        zq0 zq0Var11 = new zq0("NETWORK_ERROR", 10, true);
        NETWORK_ERROR = zq0Var11;
        zq0 zq0Var12 = new zq0("PLAY_SERVICES_NOT_FOUND", 11, false);
        PLAY_SERVICES_NOT_FOUND = zq0Var12;
        zq0 zq0Var13 = new zq0("PLAY_SERVICES_VERSION_OUTDATED", 12, false);
        PLAY_SERVICES_VERSION_OUTDATED = zq0Var13;
        zq0 zq0Var14 = new zq0("PLAY_STORE_NOT_FOUND", 13, true);
        PLAY_STORE_NOT_FOUND = zq0Var14;
        zq0 zq0Var15 = new zq0("PLAY_STORE_VERSION_OUTDATED", 14, false);
        PLAY_STORE_VERSION_OUTDATED = zq0Var15;
        zq0 zq0Var16 = new zq0("REQUEST_HASH_TOO_LONG", 15, false);
        REQUEST_HASH_TOO_LONG = zq0Var16;
        zq0 zq0Var17 = new zq0("TOO_MANY_REQUESTS", 16, true);
        TOO_MANY_REQUESTS = zq0Var17;
        zq0 zq0Var18 = new zq0("BACKEND_VERDICT_FAILED", 17, false);
        BACKEND_VERDICT_FAILED = zq0Var18;
        zq0 zq0Var19 = new zq0("UNKNOWN", 18, false);
        UNKNOWN = zq0Var19;
        zq0[] zq0VarArr = {zq0Var, zq0Var2, zq0Var3, zq0Var4, zq0Var5, zq0Var6, zq0Var7, zq0Var8, zq0Var9, zq0Var10, zq0Var11, zq0Var12, zq0Var13, zq0Var14, zq0Var15, zq0Var16, zq0Var17, zq0Var18, zq0Var19};
        $VALUES = zq0VarArr;
        $ENTRIES = new wg7(zq0VarArr);
    }

    public zq0(String str, int i, boolean z) {
        this.isRetriable = z;
    }

    public static zq0 valueOf(String str) {
        return (zq0) Enum.valueOf(zq0.class, str);
    }

    public static zq0[] values() {
        return (zq0[]) $VALUES.clone();
    }
}
