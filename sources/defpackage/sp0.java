package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sp0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sp0[] $VALUES;
    public static final sp0 PhotoLibrary;
    public static final sp0 SharePosition;
    public static final sp0 TakePhoto;

    /* JADX WARN: Type inference failed for: r0v0, types: [sp0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sp0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [sp0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SharePosition", 0);
        SharePosition = r0;
        ?? r1 = new Enum("PhotoLibrary", 1);
        PhotoLibrary = r1;
        ?? r2 = new Enum("TakePhoto", 2);
        TakePhoto = r2;
        sp0[] sp0VarArr = {r0, r1, r2};
        $VALUES = sp0VarArr;
        $ENTRIES = new wg7(sp0VarArr);
    }

    public static sp0 valueOf(String str) {
        return (sp0) Enum.valueOf(sp0.class, str);
    }

    public static sp0[] values() {
        return (sp0[]) $VALUES.clone();
    }
}
