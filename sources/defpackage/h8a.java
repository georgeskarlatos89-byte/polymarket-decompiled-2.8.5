package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h8a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ h8a[] $VALUES;
    public static final h8a DEFERRED;
    public static final h8a IGNORED;
    public static final h8a IMMINENT;
    public static final h8a SCHEDULED;

    /* JADX WARN: Type inference failed for: r0v0, types: [h8a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h8a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h8a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h8a, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IGNORED", 0);
        IGNORED = r0;
        ?? r1 = new Enum("SCHEDULED", 1);
        SCHEDULED = r1;
        ?? r2 = new Enum("DEFERRED", 2);
        DEFERRED = r2;
        ?? r3 = new Enum("IMMINENT", 3);
        IMMINENT = r3;
        h8a[] h8aVarArr = {r0, r1, r2, r3};
        $VALUES = h8aVarArr;
        $ENTRIES = new wg7(h8aVarArr);
    }

    public static h8a valueOf(String str) {
        return (h8a) Enum.valueOf(h8a.class, str);
    }

    public static h8a[] values() {
        return (h8a[]) $VALUES.clone();
    }
}
