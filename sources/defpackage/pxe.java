package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class pxe implements oxe {
    private final Object[] a;
    public int b;

    public pxe(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            dmk.v("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // defpackage.oxe
    public boolean a(Object obj) {
        boolean z;
        obj.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                if (this.a[i2] == obj) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            int i3 = this.b;
            Object[] objArr = this.a;
            if (i3 >= objArr.length) {
                return false;
            }
            objArr[i3] = obj;
            this.b = i3 + 1;
            return true;
        }
        dmk.n("Already in the pool!");
        return false;
    }

    @Override // defpackage.oxe
    public Object c() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = this.a[i2];
        obj.getClass();
        this.a[i2] = null;
        this.b--;
        return obj;
    }
}
