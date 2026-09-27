package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kfi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kfi[] $VALUES;
    public static final kfi Composition;
    public static final kfi Owner;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kfi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kfi] */
    static {
        ?? r0 = new Enum("Composition", 0);
        Composition = r0;
        ?? r1 = new Enum("Owner", 1);
        Owner = r1;
        kfi[] kfiVarArr = {r0, r1};
        $VALUES = kfiVarArr;
        $ENTRIES = new wg7(kfiVarArr);
    }

    public static kfi valueOf(String str) {
        return (kfi) Enum.valueOf(kfi.class, str);
    }

    public static kfi[] values() {
        return (kfi[]) $VALUES.clone();
    }
}
