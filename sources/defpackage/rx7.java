package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rx7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rx7[] $VALUES;
    public static final rx7 Broken;
    public static final rx7 Content;
    public static final rx7 Error;
    public static final rx7 Loading;

    /* JADX WARN: Type inference failed for: r0v0, types: [rx7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rx7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [rx7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [rx7, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Loading", 0);
        Loading = r0;
        ?? r1 = new Enum("Error", 1);
        Error = r1;
        ?? r2 = new Enum("Broken", 2);
        Broken = r2;
        ?? r3 = new Enum("Content", 3);
        Content = r3;
        rx7[] rx7VarArr = {r0, r1, r2, r3};
        $VALUES = rx7VarArr;
        $ENTRIES = new wg7(rx7VarArr);
    }

    public static rx7 valueOf(String str) {
        return (rx7) Enum.valueOf(rx7.class, str);
    }

    public static rx7[] values() {
        return (rx7[]) $VALUES.clone();
    }
}
