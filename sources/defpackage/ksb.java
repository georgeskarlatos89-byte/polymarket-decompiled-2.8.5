package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ksb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ksb[] $VALUES;
    public static final ksb Default;
    public static final ksb OkHttp;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ksb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ksb] */
    static {
        ?? r0 = new Enum("Default", 0);
        Default = r0;
        ?? r1 = new Enum("OkHttp", 1);
        OkHttp = r1;
        ksb[] ksbVarArr = {r0, r1};
        $VALUES = ksbVarArr;
        $ENTRIES = new wg7(ksbVarArr);
    }

    public static ksb valueOf(String str) {
        return (ksb) Enum.valueOf(ksb.class, str);
    }

    public static ksb[] values() {
        return (ksb[]) $VALUES.clone();
    }
}
