package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sod {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sod[] $VALUES;
    public static final sod RENDER_OPEN;
    public static final sod RENDER_OPEN_OVERRIDE;
    public static final sod RENDER_OVERRIDE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sod] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sod] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sod] */
    static {
        ?? r0 = new Enum("RENDER_OVERRIDE", 0);
        RENDER_OVERRIDE = r0;
        ?? r1 = new Enum("RENDER_OPEN", 1);
        RENDER_OPEN = r1;
        ?? r2 = new Enum("RENDER_OPEN_OVERRIDE", 2);
        RENDER_OPEN_OVERRIDE = r2;
        sod[] sodVarArr = {r0, r1, r2};
        $VALUES = sodVarArr;
        $ENTRIES = new wg7(sodVarArr);
    }

    public static sod valueOf(String str) {
        return (sod) Enum.valueOf(sod.class, str);
    }

    public static sod[] values() {
        return (sod[]) $VALUES.clone();
    }
}
