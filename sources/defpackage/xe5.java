package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xe5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xe5[] $VALUES;
    public static final xe5 CENTER_CROP;
    public static final xe5 FIT_CENTER;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xe5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xe5] */
    static {
        ?? r0 = new Enum("FIT_CENTER", 0);
        FIT_CENTER = r0;
        ?? r1 = new Enum("CENTER_CROP", 1);
        CENTER_CROP = r1;
        xe5[] xe5VarArr = {r0, r1};
        $VALUES = xe5VarArr;
        $ENTRIES = new wg7(xe5VarArr);
    }

    public static xe5 valueOf(String str) {
        return (xe5) Enum.valueOf(xe5.class, str);
    }

    public static xe5[] values() {
        return (xe5[]) $VALUES.clone();
    }
}
