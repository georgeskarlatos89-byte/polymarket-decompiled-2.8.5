package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nre {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nre[] $VALUES;
    public static final nre IDLE;
    public static final nre LOADING;
    public static final nre PAUSE;
    public static final nre PLAYING;
    public static final nre UNSET;

    /* JADX WARN: Type inference failed for: r0v0, types: [nre, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [nre, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [nre, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [nre, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [nre, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UNSET", 0);
        UNSET = r0;
        ?? r1 = new Enum("LOADING", 1);
        LOADING = r1;
        ?? r2 = new Enum("IDLE", 2);
        IDLE = r2;
        ?? r3 = new Enum("PAUSE", 3);
        PAUSE = r3;
        ?? r4 = new Enum("PLAYING", 4);
        PLAYING = r4;
        nre[] nreVarArr = {r0, r1, r2, r3, r4};
        $VALUES = nreVarArr;
        $ENTRIES = new wg7(nreVarArr);
    }

    public static nre valueOf(String str) {
        return (nre) Enum.valueOf(nre.class, str);
    }

    public static nre[] values() {
        return (nre[]) $VALUES.clone();
    }
}
