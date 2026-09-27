package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.dkn;
import defpackage.g5;
import defpackage.hxn;
import defpackage.ofl;
import defpackage.qw4;
import defpackage.ss9;
import defpackage.x5g;
import defpackage.zh4;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class Status extends g5 implements x5g, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final qw4 d;

    static {
        new Status(-1, null, null, null);
        e = new Status(0, null, null, null);
        f = new Status(14, null, null, null);
        g = new Status(8, null, null, null);
        h = new Status(15, null, null, null);
        i = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new ofl(21);
    }

    public Status(int i2, String str, PendingIntent pendingIntent, qw4 qw4Var) {
        this.a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = qw4Var;
    }

    public final boolean O() {
        if (this.a <= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.a != status.a || !dkn.b(this.b, status.b) || !dkn.b(this.c, status.c) || !dkn.b(this.d, status.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        ss9 ss9Var = new ss9(this);
        String str = this.b;
        if (str == null) {
            str = zh4.getStatusCodeString(this.a);
        }
        ss9Var.R(str, "statusCode");
        ss9Var.R(this.c, "resolution");
        return ss9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.j(parcel, 2, this.b);
        hxn.i(parcel, 3, this.c, i2);
        hxn.i(parcel, 4, this.d, i2);
        hxn.q(parcel, p);
    }

    @Override // defpackage.x5g
    public final Status c() {
        return this;
    }
}
