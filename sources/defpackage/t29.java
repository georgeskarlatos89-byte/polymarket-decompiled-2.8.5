package defpackage;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class t29 implements Serializable {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ t29[] $VALUES;
    public static final t29 CHALLENGE_CLOSED;
    public static final t29 CHALLENGE_ERROR;
    public static final s29 Companion;
    public static final t29 ERROR;
    public static final t29 INSECURE_HTTP_REQUEST_ERROR;
    public static final t29 INTERNAL_ERROR;
    public static final t29 INVALID_CUSTOM_THEME;
    public static final t29 INVALID_DATA;
    public static final t29 NETWORK_ERROR;
    public static final t29 RATE_LIMITED;
    public static final t29 SESSION_TIMEOUT;
    public static final t29 TOKEN_TIMEOUT;
    private final int errorId;
    private final String message;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s29] */
    static {
        t29 t29Var = new t29(0, 7, "NETWORK_ERROR", "No internet connection");
        NETWORK_ERROR = t29Var;
        t29 t29Var2 = new t29(1, 8, "INVALID_DATA", "Invalid data is not accepted by endpoints");
        INVALID_DATA = t29Var2;
        t29 t29Var3 = new t29(2, 9, "CHALLENGE_ERROR", "Challenge encountered error on setup");
        CHALLENGE_ERROR = t29Var3;
        t29 t29Var4 = new t29(3, 10, "INTERNAL_ERROR", "hCaptcha client encountered an internal error");
        INTERNAL_ERROR = t29Var4;
        t29 t29Var5 = new t29(4, 15, "SESSION_TIMEOUT", "Session Timeout");
        SESSION_TIMEOUT = t29Var5;
        t29 t29Var6 = new t29(5, 16, "TOKEN_TIMEOUT", "Token Timeout");
        TOKEN_TIMEOUT = t29Var6;
        t29 t29Var7 = new t29(6, 30, "CHALLENGE_CLOSED", "Challenge Closed");
        CHALLENGE_CLOSED = t29Var7;
        t29 t29Var8 = new t29(7, 31, "RATE_LIMITED", "Rate Limited");
        RATE_LIMITED = t29Var8;
        t29 t29Var9 = new t29(8, 32, "INVALID_CUSTOM_THEME", "Invalid custom theme");
        INVALID_CUSTOM_THEME = t29Var9;
        t29 t29Var10 = new t29(9, 33, "INSECURE_HTTP_REQUEST_ERROR", "Insecure resource requested");
        INSECURE_HTTP_REQUEST_ERROR = t29Var10;
        t29 t29Var11 = new t29(10, 29, "ERROR", "Unknown error");
        ERROR = t29Var11;
        t29[] t29VarArr = {t29Var, t29Var2, t29Var3, t29Var4, t29Var5, t29Var6, t29Var7, t29Var8, t29Var9, t29Var10, t29Var11};
        $VALUES = t29VarArr;
        $ENTRIES = new wg7(t29VarArr);
        Companion = new Object();
    }

    public t29(int i, int i2, String str, String str2) {
        this.errorId = i2;
        this.message = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static t29 valueOf(String str) {
        return (t29) Enum.valueOf(t29.class, str);
    }

    public static t29[] values() {
        return (t29[]) $VALUES.clone();
    }

    public final int b() {
        return this.errorId;
    }

    public final String c() {
        return this.message;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.message;
    }
}
