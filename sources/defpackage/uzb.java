package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uzb extends wzb implements Iterator, xja {
    public final /* synthetic */ int e;

    public uzb(xzb xzbVar, int i) {
        this.e = i;
        xzbVar.getClass();
        this.d = xzbVar;
        this.b = -1;
        this.c = xzbVar.h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.a;
                xzb xzbVar = (xzb) this.d;
                if (i < xzbVar.f) {
                    this.a = i + 1;
                    this.b = i;
                    vzb vzbVar = new vzb(xzbVar, i);
                    e();
                    return vzbVar;
                }
                dmk.t();
                return null;
            case 1:
                b();
                int i2 = this.a;
                xzb xzbVar2 = (xzb) this.d;
                if (i2 < xzbVar2.f) {
                    this.a = i2 + 1;
                    this.b = i2;
                    Object obj = xzbVar2.a[i2];
                    e();
                    return obj;
                }
                dmk.t();
                return null;
            default:
                b();
                int i3 = this.a;
                xzb xzbVar3 = (xzb) this.d;
                if (i3 < xzbVar3.f) {
                    this.a = i3 + 1;
                    this.b = i3;
                    Object[] objArr = xzbVar3.b;
                    objArr.getClass();
                    Object obj2 = objArr[this.b];
                    e();
                    return obj2;
                }
                dmk.t();
                return null;
        }
    }
}
