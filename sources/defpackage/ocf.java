package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ocf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ocf[] $VALUES;
    public static final ocf DEBUG;
    public static final ocf NONE;
    public static final ocf PRETTY;

    /* JADX WARN: Type inference failed for: r0v0, types: [ocf, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ocf, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ocf, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PRETTY", 0);
        PRETTY = r0;
        ?? r1 = new Enum("DEBUG", 1);
        DEBUG = r1;
        ?? r2 = new Enum("NONE", 2);
        NONE = r2;
        ocf[] ocfVarArr = {r0, r1, r2};
        $VALUES = ocfVarArr;
        $ENTRIES = new wg7(ocfVarArr);
    }

    public static ocf valueOf(String str) {
        return (ocf) Enum.valueOf(ocf.class, str);
    }

    public static ocf[] values() {
        return (ocf[]) $VALUES.clone();
    }
}
