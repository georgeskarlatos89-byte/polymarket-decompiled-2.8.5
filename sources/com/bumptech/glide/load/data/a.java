package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import defpackage.xo5;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a implements xo5 {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final ParcelFileDescriptor b() {
        return this.a.rewind();
    }

    @Override // defpackage.xo5
    public final Object c() {
        return this.a.rewind();
    }

    @Override // defpackage.xo5
    public final void a() {
    }
}
