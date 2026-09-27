package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cbi extends k3h implements swh {
    @Override // defpackage.swh
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.i + ((int) ((q() + this.k) - this.i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            b(Integer.valueOf(((Number) objArr[((int) ((this.i + ((int) ((q() + this.k) - this.i))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
