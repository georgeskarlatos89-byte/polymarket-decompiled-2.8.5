package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vqf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vqf[] $VALUES;
    public static final vqf Compact;
    public static final vqf Expanded;
    public static final vqf FullScreen;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vqf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vqf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vqf] */
    static {
        ?? r0 = new Enum("Compact", 0);
        Compact = r0;
        ?? r1 = new Enum("Expanded", 1);
        Expanded = r1;
        ?? r2 = new Enum("FullScreen", 2);
        FullScreen = r2;
        vqf[] vqfVarArr = {r0, r1, r2};
        $VALUES = vqfVarArr;
        $ENTRIES = new wg7(vqfVarArr);
    }

    public static vqf valueOf(String str) {
        return (vqf) Enum.valueOf(vqf.class, str);
    }

    public static vqf[] values() {
        return (vqf[]) $VALUES.clone();
    }
}
