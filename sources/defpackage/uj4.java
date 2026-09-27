package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class uj4 {
    public static final /* synthetic */ long b = oo4.a.objectFieldOffset(uj4.class.getDeclaredField("_handled$volatile"));
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public uj4(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
