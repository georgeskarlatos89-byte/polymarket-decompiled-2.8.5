package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class qff {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[fef.values().length];
        try {
            iArr[fef.FINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fef.OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fef.ABSTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fef.SEALED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[sic.values().length];
        try {
            iArr2[sic.FINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[sic.OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[sic.ABSTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[sic.SEALED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr3 = new int[kff.values().length];
        try {
            iArr3[kff.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[kff.PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[kff.PRIVATE_TO_THIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[kff.PROTECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[kff.PUBLIC.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[kff.LOCAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        int[] iArr4 = new int[v6g.values().length];
        try {
            iArr4[v6g.MustUse.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[v6g.ExplicitlyIgnorable.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[v6g.Unspecified.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        int[] iArr5 = new int[qef.values().length];
        try {
            iArr5[qef.MUST_USE.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[qef.EXPLICITLY_IGNORABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[qef.UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        int[] iArr6 = new int[mdf.values().length];
        try {
            iArr6[mdf.CLASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[mdf.INTERFACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[mdf.ENUM_CLASS.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr6[mdf.ENUM_ENTRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[mdf.ANNOTATION_CLASS.ordinal()] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[mdf.OBJECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[mdf.COMPANION_OBJECT.ordinal()] = 7;
        } catch (NoSuchFieldError unused27) {
        }
        b = iArr6;
        int[] iArr7 = new int[g44.values().length];
        try {
            iArr7[g44.CLASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr7[g44.INTERFACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr7[g44.ENUM_CLASS.ordinal()] = 3;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr7[g44.ENUM_ENTRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr7[g44.ANNOTATION_CLASS.ordinal()] = 5;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr7[g44.OBJECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused33) {
        }
        int[] iArr8 = new int[aff.values().length];
        try {
            iArr8[aff.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr8[aff.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr8[aff.INV.ordinal()] = 3;
        } catch (NoSuchFieldError unused36) {
        }
        c = iArr8;
        int[] iArr9 = new int[tef.values().length];
        try {
            iArr9[tef.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr9[tef.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr9[tef.INV.ordinal()] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr9[tef.STAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        d = iArr9;
        int[] iArr10 = new int[e4k.values().length];
        try {
            iArr10[e4k.IN_VARIANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr10[e4k.OUT_VARIANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr10[e4k.INVARIANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused43) {
        }
    }
}
