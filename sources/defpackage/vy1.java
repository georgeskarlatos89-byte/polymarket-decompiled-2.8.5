package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vy1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vy1[] $VALUES;
    public static final vy1 AlwaysAnimate;
    public static final vy1 NeverAnimate;
    public static final vy1 System;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vy1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vy1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vy1] */
    static {
        ?? r0 = new Enum("System", 0);
        System = r0;
        ?? r1 = new Enum("AlwaysAnimate", 1);
        AlwaysAnimate = r1;
        ?? r2 = new Enum("NeverAnimate", 2);
        NeverAnimate = r2;
        vy1[] vy1VarArr = {r0, r1, r2};
        $VALUES = vy1VarArr;
        $ENTRIES = new wg7(vy1VarArr);
    }

    public static vy1 valueOf(String str) {
        return (vy1) Enum.valueOf(vy1.class, str);
    }

    public static vy1[] values() {
        return (vy1[]) $VALUES.clone();
    }
}
