package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bx7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bx7[] $VALUES;
    public static final bx7 DYNAMIC_RANGE;
    public static final bx7 FPS_RANGE;
    public static final bx7 IMAGE_FORMAT;
    public static final bx7 VIDEO_STABILIZATION;

    /* JADX WARN: Type inference failed for: r0v0, types: [bx7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bx7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bx7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bx7, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DYNAMIC_RANGE", 0);
        DYNAMIC_RANGE = r0;
        ?? r1 = new Enum("FPS_RANGE", 1);
        FPS_RANGE = r1;
        ?? r2 = new Enum("VIDEO_STABILIZATION", 2);
        VIDEO_STABILIZATION = r2;
        ?? r3 = new Enum("IMAGE_FORMAT", 3);
        IMAGE_FORMAT = r3;
        bx7[] bx7VarArr = {r0, r1, r2, r3};
        $VALUES = bx7VarArr;
        $ENTRIES = new wg7(bx7VarArr);
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static bx7 valueOf(String str) {
        return (bx7) Enum.valueOf(bx7.class, str);
    }

    public static bx7[] values() {
        return (bx7[]) $VALUES.clone();
    }
}
