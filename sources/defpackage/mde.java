package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mde {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mde[] $VALUES;
    public static final mde Production;
    public static final mde Test;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mde] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mde] */
    static {
        ?? r0 = new Enum("Production", 0);
        Production = r0;
        ?? r1 = new Enum("Test", 1);
        Test = r1;
        mde[] mdeVarArr = {r0, r1};
        $VALUES = mdeVarArr;
        $ENTRIES = new wg7(mdeVarArr);
    }

    public static mde valueOf(String str) {
        return (mde) Enum.valueOf(mde.class, str);
    }

    public static mde[] values() {
        return (mde[]) $VALUES.clone();
    }
}
