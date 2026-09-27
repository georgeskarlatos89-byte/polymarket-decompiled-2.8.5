package defpackage;

import android.util.Size;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mdi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mdi[] $VALUES;
    public static final mdi MAXIMUM;
    public static final mdi MAXIMUM_16_9;
    public static final mdi MAXIMUM_4_3;
    public static final mdi NOT_SUPPORT;
    public static final mdi PREVIEW;
    public static final mdi RECORD;
    public static final mdi S1080P_16_9;
    public static final mdi S1080P_4_3;
    public static final mdi S1440P_16_9;
    public static final mdi S1440P_4_3;
    public static final mdi S720P_16_9;
    public static final mdi UHD;
    public static final mdi ULTRA_MAXIMUM;
    public static final mdi VGA;
    public static final mdi X_VGA;
    private final int id;
    private final Size relatedFixedSize;

    static {
        mdi mdiVar = new mdi("VGA", 0, 0, new Size(640, 480));
        VGA = mdiVar;
        mdi mdiVar2 = new mdi("X_VGA", 1, 1, new Size(Barcode.FORMAT_UPC_E, 768));
        X_VGA = mdiVar2;
        mdi mdiVar3 = new mdi("S720P_16_9", 2, 2, new Size(ConstantsKt.MIN_FRONT_CAMERA_WIDTH, ConstantsKt.MIN_FRONT_CAMERA_HEIGHT));
        S720P_16_9 = mdiVar3;
        mdi mdiVar4 = new mdi("PREVIEW", 3, 3, null);
        PREVIEW = mdiVar4;
        mdi mdiVar5 = new mdi("S1080P_4_3", 4, 4, new Size(1440, 1080));
        S1080P_4_3 = mdiVar5;
        mdi mdiVar6 = new mdi("S1080P_16_9", 5, 5, new Size(1920, 1080));
        S1080P_16_9 = mdiVar6;
        mdi mdiVar7 = new mdi("S1440P_4_3", 6, 6, new Size(1920, 1440));
        S1440P_4_3 = mdiVar7;
        mdi mdiVar8 = new mdi("S1440P_16_9", 7, 7, new Size(2560, 1440));
        S1440P_16_9 = mdiVar8;
        mdi mdiVar9 = new mdi("UHD", 8, 8, new Size(3840, 2160));
        UHD = mdiVar9;
        mdi mdiVar10 = new mdi("RECORD", 9, 9, null);
        RECORD = mdiVar10;
        mdi mdiVar11 = new mdi("MAXIMUM", 10, 10, null);
        MAXIMUM = mdiVar11;
        mdi mdiVar12 = new mdi("MAXIMUM_4_3", 11, 11, null);
        MAXIMUM_4_3 = mdiVar12;
        mdi mdiVar13 = new mdi("MAXIMUM_16_9", 12, 12, null);
        MAXIMUM_16_9 = mdiVar13;
        mdi mdiVar14 = new mdi("ULTRA_MAXIMUM", 13, 13, null);
        ULTRA_MAXIMUM = mdiVar14;
        mdi mdiVar15 = new mdi("NOT_SUPPORT", 14, 14, null);
        NOT_SUPPORT = mdiVar15;
        mdi[] mdiVarArr = {mdiVar, mdiVar2, mdiVar3, mdiVar4, mdiVar5, mdiVar6, mdiVar7, mdiVar8, mdiVar9, mdiVar10, mdiVar11, mdiVar12, mdiVar13, mdiVar14, mdiVar15};
        $VALUES = mdiVarArr;
        $ENTRIES = new wg7(mdiVarArr);
    }

    public mdi(String str, int i, int i2, Size size) {
        this.id = i2;
        this.relatedFixedSize = size;
    }

    public static mdi valueOf(String str) {
        return (mdi) Enum.valueOf(mdi.class, str);
    }

    public static mdi[] values() {
        return (mdi[]) $VALUES.clone();
    }

    public final int a() {
        return this.id;
    }

    public final Size b() {
        return this.relatedFixedSize;
    }
}
