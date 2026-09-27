package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p0i {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ p0i[] $VALUES;
    public static final p0i CROPPED_RAW;
    public static final p0i DEFAULT;
    public static final p0i PREVIEW;
    public static final p0i PREVIEW_VIDEO_STILL;
    public static final p0i STILL_CAPTURE;
    public static final p0i VIDEO_CALL;
    public static final p0i VIDEO_RECORD;
    private final long value;

    static {
        p0i p0iVar = new p0i("DEFAULT", 0, 0);
        DEFAULT = p0iVar;
        p0i p0iVar2 = new p0i("PREVIEW", 1, 1);
        PREVIEW = p0iVar2;
        p0i p0iVar3 = new p0i("VIDEO_RECORD", 2, 3);
        VIDEO_RECORD = p0iVar3;
        p0i p0iVar4 = new p0i("STILL_CAPTURE", 3, 2);
        STILL_CAPTURE = p0iVar4;
        p0i p0iVar5 = new p0i("VIDEO_CALL", 4, 5);
        VIDEO_CALL = p0iVar5;
        p0i p0iVar6 = new p0i("PREVIEW_VIDEO_STILL", 5, 4);
        PREVIEW_VIDEO_STILL = p0iVar6;
        p0i p0iVar7 = new p0i("CROPPED_RAW", 6, 6);
        CROPPED_RAW = p0iVar7;
        p0i[] p0iVarArr = {p0iVar, p0iVar2, p0iVar3, p0iVar4, p0iVar5, p0iVar6, p0iVar7};
        $VALUES = p0iVarArr;
        $ENTRIES = new wg7(p0iVarArr);
    }

    public p0i(String str, int i, int i2) {
        this.value = i2;
    }

    public static p0i valueOf(String str) {
        return (p0i) Enum.valueOf(p0i.class, str);
    }

    public static p0i[] values() {
        return (p0i[]) $VALUES.clone();
    }

    public final long a() {
        return this.value;
    }
}
