package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kvd extends ixh implements Parcelable, xch {
    public static final Parcelable.Creator<kvd> CREATOR = new jvd(0);
    public final zch b;
    public ych c;

    public kvd(Object obj, zch zchVar) {
        this.b = zchVar;
        kch h = qch.h();
        ych ychVar = new ych(h.g(), obj);
        if (!(h instanceof rw8)) {
            ychVar.b = new ych(1L, obj);
        }
        this.c = ychVar;
    }

    @Override // defpackage.hxh
    public final mxh O() {
        return this.c;
    }

    @Override // defpackage.hxh
    public final mxh U(mxh mxhVar, mxh mxhVar2, mxh mxhVar3) {
        if (this.b.j(((ych) mxhVar2).c, ((ych) mxhVar3).c)) {
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
        return this.b;
    }

    @Override // defpackage.nwh
    public final Object getValue() {
        return ((ych) qch.s(this.c, this)).c;
    }

    @Override // defpackage.hxh
    public final void l(mxh mxhVar) {
        this.c = (ych) mxhVar;
    }

    @Override // defpackage.qqc
    public final void setValue(Object obj) {
        kch h;
        ych ychVar = (ych) qch.f(this.c);
        if (!this.b.j(ychVar.c, obj)) {
            ych ychVar2 = this.c;
            synchronized (qch.c) {
                h = qch.h();
                ((ych) qch.n(ychVar2, this, h, ychVar)).c = obj;
            }
            qch.l(h, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((ych) qch.f(this.c)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        vwb vwbVar = vwb.l;
        zch zchVar = this.b;
        if (Intrinsics.areEqual(zchVar, vwbVar)) {
            i2 = 0;
        } else if (Intrinsics.areEqual(zchVar, vwb.q)) {
            i2 = 1;
        } else if (Intrinsics.areEqual(zchVar, nim.p)) {
            i2 = 2;
        } else {
            dmk.n("Only known types of MutableState's SnapshotMutationPolicy are supported");
            return;
        }
        parcel.writeInt(i2);
    }
}
