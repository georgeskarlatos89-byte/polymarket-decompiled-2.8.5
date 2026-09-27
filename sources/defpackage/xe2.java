package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xe2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xe2[] $VALUES;
    public static final xe2 Adjacent;
    public static final xe2 Overlapping;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xe2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xe2] */
    static {
        ?? r0 = new Enum("Overlapping", 0);
        Overlapping = r0;
        ?? r1 = new Enum("Adjacent", 1);
        Adjacent = r1;
        xe2[] xe2VarArr = {r0, r1};
        $VALUES = xe2VarArr;
        $ENTRIES = new wg7(xe2VarArr);
    }

    public static xe2 valueOf(String str) {
        return (xe2) Enum.valueOf(xe2.class, str);
    }

    public static xe2[] values() {
        return (xe2[]) $VALUES.clone();
    }
}
