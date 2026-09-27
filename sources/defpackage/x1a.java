package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class x1a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ x1a[] $VALUES;
    public static final x1a CreateAttach;
    public static final x1a SetupIntent;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x1a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x1a] */
    static {
        ?? r0 = new Enum("SetupIntent", 0);
        SetupIntent = r0;
        ?? r1 = new Enum("CreateAttach", 1);
        CreateAttach = r1;
        x1a[] x1aVarArr = {r0, r1};
        $VALUES = x1aVarArr;
        $ENTRIES = new wg7(x1aVarArr);
    }

    public static x1a valueOf(String str) {
        return (x1a) Enum.valueOf(x1a.class, str);
    }

    public static x1a[] values() {
        return (x1a[]) $VALUES.clone();
    }
}
