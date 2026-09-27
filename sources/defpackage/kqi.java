package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kqi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kqi[] $VALUES;
    public static final kqi CENTER;
    public static final kqi END;
    public static final kqi START;

    /* JADX WARN: Type inference failed for: r0v0, types: [kqi, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kqi, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kqi, java.lang.Enum] */
    static {
        ?? r0 = new Enum("START", 0);
        START = r0;
        ?? r1 = new Enum("CENTER", 1);
        CENTER = r1;
        ?? r2 = new Enum("END", 2);
        END = r2;
        kqi[] kqiVarArr = {r0, r1, r2};
        $VALUES = kqiVarArr;
        $ENTRIES = new wg7(kqiVarArr);
    }

    public static kqi valueOf(String str) {
        return (kqi) Enum.valueOf(kqi.class, str);
    }

    public static kqi[] values() {
        return (kqi[]) $VALUES.clone();
    }
}
