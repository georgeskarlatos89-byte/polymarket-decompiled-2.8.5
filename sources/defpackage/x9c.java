package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum x9c {
    UNKNOWN(0),
    USE_AFTER_FREE(1),
    DOUBLE_FREE(2),
    INVALID_FREE(3),
    BUFFER_OVERFLOW(4),
    BUFFER_UNDERFLOW(5);

    private final int value;

    x9c(int i) {
        this.value = i;
    }

    public static void a(int i) {
        x9c[] values = values();
        int length = values.length;
        for (int i2 = 0; i2 < length && values[i2].value != i; i2++) {
        }
    }
}
