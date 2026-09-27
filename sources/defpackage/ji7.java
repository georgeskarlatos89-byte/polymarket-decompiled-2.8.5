package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ji7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ji7[] $VALUES;
    public static final ji7 BLANK_CLIENT_TOKEN;
    public static final ji7 OTP_EXPIRED;
    public static final ji7 OTP_INCORRECT_CODE;
    public static final ji7 OTP_MAX_RETRIES_REACHED;
    public static final ji7 UNKNOWN;
    private final String message;

    static {
        ji7 ji7Var = new ji7("BLANK_CLIENT_TOKEN", 0, "Client token is null or blank");
        BLANK_CLIENT_TOKEN = ji7Var;
        ji7 ji7Var2 = new ji7("OTP_INCORRECT_CODE", 1, "Incorrect verification code. Try again.");
        OTP_INCORRECT_CODE = ji7Var2;
        ji7 ji7Var3 = new ji7("OTP_MAX_RETRIES_REACHED", 2, "Max retries reached.");
        OTP_MAX_RETRIES_REACHED = ji7Var3;
        ji7 ji7Var4 = new ji7("OTP_EXPIRED", 3, "The code has expired. Request a new one.");
        OTP_EXPIRED = ji7Var4;
        ji7 ji7Var5 = new ji7("UNKNOWN", 4, "An unknown error occurred. Please try again later.");
        UNKNOWN = ji7Var5;
        ji7[] ji7VarArr = {ji7Var, ji7Var2, ji7Var3, ji7Var4, ji7Var5};
        $VALUES = ji7VarArr;
        $ENTRIES = new wg7(ji7VarArr);
    }

    public ji7(String str, int i, String str2) {
        this.message = str2;
    }

    public static ji7 valueOf(String str) {
        return (ji7) Enum.valueOf(ji7.class, str);
    }

    public static ji7[] values() {
        return (ji7[]) $VALUES.clone();
    }

    public final String a() {
        return this.message;
    }
}
