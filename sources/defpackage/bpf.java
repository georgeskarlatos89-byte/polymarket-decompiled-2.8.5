package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class bpf {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;

    static {
        int[] iArr = new int[aff.values().length];
        try {
            iArr[aff.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aff.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[aff.INV.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[tef.values().length];
        try {
            iArr2[tef.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[tef.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[tef.INV.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[tef.STAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[hff.values().length];
        try {
            iArr3[hff.LANGUAGE_VERSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[hff.COMPILER_VERSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[hff.API_VERSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[jm6.values().length];
        try {
            iArr4[jm6.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[jm6.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[jm6.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        d = iArr4;
        int[] iArr5 = new int[udf.values().length];
        try {
            iArr5[udf.RETURNS_CONSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[udf.CALLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[udf.RETURNS_NOT_NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        e = iArr5;
        int[] iArr6 = new int[vdf.values().length];
        try {
            iArr6[vdf.AT_MOST_ONCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr6[vdf.EXACTLY_ONCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[vdf.AT_LEAST_ONCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        f = iArr6;
        int[] iArr7 = new int[aef.values().length];
        try {
            iArr7[aef.TRUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr7[aef.FALSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr7[aef.NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        g = iArr7;
    }
}
