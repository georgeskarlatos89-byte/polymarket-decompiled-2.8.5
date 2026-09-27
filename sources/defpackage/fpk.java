package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fpk {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[iok.values().length];
        try {
            iArr[iok.ENQUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iok.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[iok.SUCCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[iok.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[iok.BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[iok.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[n31.values().length];
        try {
            iArr2[n31.EXPONENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n31.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[v3d.values().length];
        try {
            iArr3[v3d.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[v3d.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[v3d.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[v3d.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[v3d.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        c = iArr3;
        int[] iArr4 = new int[dnd.values().length];
        try {
            iArr4[dnd.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[dnd.DROP_WORK_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
    }
}
