package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xee {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xee[] $VALUES;
    public static final xee Always;
    public static final xee Never;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xee] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xee] */
    static {
        ?? r0 = new Enum("Always", 0);
        Always = r0;
        ?? r1 = new Enum("Never", 1);
        Never = r1;
        xee[] xeeVarArr = {r0, r1};
        $VALUES = xeeVarArr;
        $ENTRIES = new wg7(xeeVarArr);
    }

    public static xee valueOf(String str) {
        return (xee) Enum.valueOf(xee.class, str);
    }

    public static xee[] values() {
        return (xee[]) $VALUES.clone();
    }
}
