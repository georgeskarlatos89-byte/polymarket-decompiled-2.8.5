package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qr7 {
    public final m8j a;
    public final int[] b;

    public qr7(int i, m8j m8jVar, int[] iArr) {
        if (iArr.length == 0) {
            q7m.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = m8jVar;
        this.b = iArr;
    }
}
