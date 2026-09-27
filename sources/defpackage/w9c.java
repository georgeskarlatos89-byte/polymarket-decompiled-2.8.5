package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum w9c {
    GWP_ASAN(0),
    SCUDO(1);

    private final int value;

    w9c(int i) {
        this.value = i;
    }

    public static void a(int i) {
        w9c[] values = values();
        int length = values.length;
        for (int i2 = 0; i2 < length && values[i2].value != i; i2++) {
        }
    }
}
