package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class r6a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ r6a[] $VALUES;
    public static final r6a Hidden;
    public static final r6a Intro;
    public static final r6a Rotating;
    public static final r6a Success;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r6a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r6a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r6a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, r6a] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        Hidden = r0;
        ?? r1 = new Enum("Intro", 1);
        Intro = r1;
        ?? r2 = new Enum("Rotating", 2);
        Rotating = r2;
        ?? r3 = new Enum("Success", 3);
        Success = r3;
        r6a[] r6aVarArr = {r0, r1, r2, r3};
        $VALUES = r6aVarArr;
        $ENTRIES = new wg7(r6aVarArr);
    }

    public static r6a valueOf(String str) {
        return (r6a) Enum.valueOf(r6a.class, str);
    }

    public static r6a[] values() {
        return (r6a[]) $VALUES.clone();
    }
}
