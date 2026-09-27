package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class id7 {
    private static final /* synthetic */ id7[] $VALUES;
    public static final id7 AZTEC_LAYERS;
    public static final id7 CHARACTER_SET;
    public static final id7 CODE128_COMPACT;
    public static final id7 DATA_MATRIX_COMPACT;
    public static final id7 DATA_MATRIX_SHAPE;
    public static final id7 ERROR_CORRECTION;
    public static final id7 FORCE_C40;
    public static final id7 FORCE_CODE_SET;
    public static final id7 GS1_FORMAT;
    public static final id7 MARGIN;

    @Deprecated
    public static final id7 MAX_SIZE;

    @Deprecated
    public static final id7 MIN_SIZE;
    public static final id7 PDF417_AUTO_ECI;
    public static final id7 PDF417_COMPACT;
    public static final id7 PDF417_COMPACTION;
    public static final id7 PDF417_DIMENSIONS;
    public static final id7 QR_COMPACT;
    public static final id7 QR_MASK_PATTERN;
    public static final id7 QR_VERSION;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, id7] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, id7] */
    static {
        ?? r1 = new Enum("ERROR_CORRECTION", 0);
        ERROR_CORRECTION = r1;
        ?? r2 = new Enum("CHARACTER_SET", 1);
        CHARACTER_SET = r2;
        ?? r3 = new Enum("DATA_MATRIX_SHAPE", 2);
        DATA_MATRIX_SHAPE = r3;
        ?? r4 = new Enum("DATA_MATRIX_COMPACT", 3);
        DATA_MATRIX_COMPACT = r4;
        ?? r5 = new Enum("MIN_SIZE", 4);
        MIN_SIZE = r5;
        ?? r6 = new Enum("MAX_SIZE", 5);
        MAX_SIZE = r6;
        ?? r7 = new Enum("MARGIN", 6);
        MARGIN = r7;
        ?? r8 = new Enum("PDF417_COMPACT", 7);
        PDF417_COMPACT = r8;
        ?? r9 = new Enum("PDF417_COMPACTION", 8);
        PDF417_COMPACTION = r9;
        ?? r10 = new Enum("PDF417_DIMENSIONS", 9);
        PDF417_DIMENSIONS = r10;
        ?? r11 = new Enum("PDF417_AUTO_ECI", 10);
        PDF417_AUTO_ECI = r11;
        ?? r12 = new Enum("AZTEC_LAYERS", 11);
        AZTEC_LAYERS = r12;
        ?? r13 = new Enum("QR_VERSION", 12);
        QR_VERSION = r13;
        ?? r14 = new Enum("QR_MASK_PATTERN", 13);
        QR_MASK_PATTERN = r14;
        ?? r15 = new Enum("QR_COMPACT", 14);
        QR_COMPACT = r15;
        ?? r0 = new Enum("GS1_FORMAT", 15);
        GS1_FORMAT = r0;
        ?? r16 = new Enum("FORCE_CODE_SET", 16);
        FORCE_CODE_SET = r16;
        ?? r02 = new Enum("FORCE_C40", 17);
        FORCE_C40 = r02;
        ?? r17 = new Enum("CODE128_COMPACT", 18);
        CODE128_COMPACT = r17;
        $VALUES = new id7[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r16, r02, r17};
    }

    public static id7 valueOf(String str) {
        return (id7) Enum.valueOf(id7.class, str);
    }

    public static id7[] values() {
        return (id7[]) $VALUES.clone();
    }
}
