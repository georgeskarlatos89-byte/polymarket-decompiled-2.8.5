package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rnb implements tnb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rnb[] $VALUES;
    public static final rnb Jpeg;
    public static final rnb Png;
    public static final rnb Webp;
    private final String value;

    static {
        rnb rnbVar = new rnb("Jpeg", 0, "image/jpeg");
        Jpeg = rnbVar;
        rnb rnbVar2 = new rnb("Png", 1, "image/png");
        Png = rnbVar2;
        rnb rnbVar3 = new rnb("Webp", 2, "image/webp");
        Webp = rnbVar3;
        rnb[] rnbVarArr = {rnbVar, rnbVar2, rnbVar3};
        $VALUES = rnbVarArr;
        $ENTRIES = new wg7(rnbVarArr);
    }

    public rnb(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static rnb valueOf(String str) {
        return (rnb) Enum.valueOf(rnb.class, str);
    }

    public static rnb[] values() {
        return (rnb[]) $VALUES.clone();
    }

    @Override // defpackage.tnb
    public final String getValue() {
        return this.value;
    }
}
