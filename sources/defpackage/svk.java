package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum svk {
    FREE("free"),
    FREE_RUNTIME("free_runtime"),
    MAX_RUNTIME("max_runtime"),
    TOTAL("total"),
    TOTAL_RUNTIME("total_runtime");

    private final String a;

    svk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
