package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class kmi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kmi[] $VALUES;
    public static final kmi Idle;
    public static final kmi Processing;
    public static final kmi Success;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kmi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kmi] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kmi] */
    static {
        ?? r0 = new Enum("Idle", 0);
        Idle = r0;
        ?? r1 = new Enum("Processing", 1);
        Processing = r1;
        ?? r2 = new Enum("Success", 2);
        Success = r2;
        kmi[] kmiVarArr = {r0, r1, r2};
        $VALUES = kmiVarArr;
        $ENTRIES = new wg7(kmiVarArr);
    }

    public static kmi valueOf(String str) {
        return (kmi) Enum.valueOf(kmi.class, str);
    }

    public static kmi[] values() {
        return (kmi[]) $VALUES.clone();
    }
}
