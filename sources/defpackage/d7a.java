package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d7a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ d7a[] $VALUES;
    public static final d7a Height;
    public static final d7a Width;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d7a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d7a] */
    static {
        ?? r0 = new Enum("Width", 0);
        Width = r0;
        ?? r1 = new Enum("Height", 1);
        Height = r1;
        d7a[] d7aVarArr = {r0, r1};
        $VALUES = d7aVarArr;
        $ENTRIES = new wg7(d7aVarArr);
    }

    public static d7a valueOf(String str) {
        return (d7a) Enum.valueOf(d7a.class, str);
    }

    public static d7a[] values() {
        return (d7a[]) $VALUES.clone();
    }
}
