package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hvd extends ixh implements Parcelable, dpc, xch {
    public static final Parcelable.Creator<hvd> CREATOR = new ahc(18);
    public vch b;

    public hvd(int i) {
        kch h = qch.h();
        vch vchVar = new vch(h.g(), i);
        if (!(h instanceof rw8)) {
            vchVar.b = new vch(1L, i);
        }
        this.b = vchVar;
    }

    @Override // defpackage.hxh
    public final mxh O() {
        return this.b;
    }

    @Override // defpackage.hxh
    public final mxh U(mxh mxhVar, mxh mxhVar2, mxh mxhVar3) {
        if (((vch) mxhVar2).c == ((vch) mxhVar3).c) {
            return mxhVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.xch
    public final zch g() {
        return vwb.q;
    }

    @Override // defpackage.hxh
    public final void l(mxh mxhVar) {
        this.b = (vch) mxhVar;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((vch) qch.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(y());
    }

    public final int y() {
        return ((vch) qch.s(this.b, this)).c;
    }

    public final void z(int i) {
        kch h;
        vch vchVar = (vch) qch.f(this.b);
        if (vchVar.c != i) {
            vch vchVar2 = this.b;
            synchronized (qch.c) {
                h = qch.h();
                ((vch) qch.n(vchVar2, this, h, vchVar)).c = i;
            }
            qch.l(h, this);
        }
    }
}
