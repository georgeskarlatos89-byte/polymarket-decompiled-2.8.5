package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ru0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ru0[] $VALUES;
    public static final ru0 CHALLENGE;
    public static final ru0 OTP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ru0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ru0] */
    static {
        ?? r0 = new Enum("CHALLENGE", 0);
        CHALLENGE = r0;
        ?? r1 = new Enum("OTP", 1);
        OTP = r1;
        ru0[] ru0VarArr = {r0, r1};
        $VALUES = ru0VarArr;
        $ENTRIES = new wg7(ru0VarArr);
    }

    public static ru0 valueOf(String str) {
        return (ru0) Enum.valueOf(ru0.class, str);
    }

    public static ru0[] values() {
        return (ru0[]) $VALUES.clone();
    }
}
