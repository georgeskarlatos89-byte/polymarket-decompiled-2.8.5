package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hd2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ hd2[] $VALUES;
    public static final hd2 Fill;
    public static final hd2 Fit;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hd2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hd2] */
    static {
        ?? r0 = new Enum("Fit", 0);
        Fit = r0;
        ?? r1 = new Enum("Fill", 1);
        Fill = r1;
        hd2[] hd2VarArr = {r0, r1};
        $VALUES = hd2VarArr;
        $ENTRIES = new wg7(hd2VarArr);
    }

    public static hd2 valueOf(String str) {
        return (hd2) Enum.valueOf(hd2.class, str);
    }

    public static hd2[] values() {
        return (hd2[]) $VALUES.clone();
    }
}
