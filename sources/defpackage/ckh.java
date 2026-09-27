package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ckh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ckh[] $VALUES;
    public static final ckh Square;
    public static final ckh Wide;
    private final float naturalHeight = 100.0f;
    private final float naturalWidth;

    static {
        ckh ckhVar = new ckh(100.0f, 0, "Square");
        Square = ckhVar;
        ckh ckhVar2 = new ckh(200.0f, 1, "Wide");
        Wide = ckhVar2;
        ckh[] ckhVarArr = {ckhVar, ckhVar2};
        $VALUES = ckhVarArr;
        $ENTRIES = new wg7(ckhVarArr);
    }

    public ckh(float f, int i, String str) {
        this.naturalWidth = f;
    }

    public static ckh valueOf(String str) {
        return (ckh) Enum.valueOf(ckh.class, str);
    }

    public static ckh[] values() {
        return (ckh[]) $VALUES.clone();
    }

    public final float a() {
        return this.naturalWidth / this.naturalHeight;
    }

    public final float b() {
        return this.naturalHeight;
    }

    public final float c() {
        return this.naturalWidth;
    }
}
