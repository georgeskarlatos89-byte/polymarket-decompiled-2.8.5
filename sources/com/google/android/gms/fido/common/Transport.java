package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.sv6;
import defpackage.vdm;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable"),
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new Object();
    private final String zzc;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class a extends Exception {
    }

    Transport(String str) {
        this.zzc = str;
    }

    public static Transport e(String str) {
        if (!str.equals("hybrid")) {
            for (Transport transport : values()) {
                if (str.equals(transport.zzc)) {
                    return transport;
                }
            }
            throw new Exception(sv6.n("Transport ", str, " not supported"));
        }
        vdm.a.c();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzc);
    }
}
