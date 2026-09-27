package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yki {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yki[] $VALUES;
    public static final yki BottomLeft;
    public static final yki BottomRight;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yki] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yki] */
    static {
        ?? r0 = new Enum("BottomLeft", 0);
        BottomLeft = r0;
        ?? r1 = new Enum("BottomRight", 1);
        BottomRight = r1;
        yki[] ykiVarArr = {r0, r1};
        $VALUES = ykiVarArr;
        $ENTRIES = new wg7(ykiVarArr);
    }

    public static yki valueOf(String str) {
        return (yki) Enum.valueOf(yki.class, str);
    }

    public static yki[] values() {
        return (yki[]) $VALUES.clone();
    }
}
