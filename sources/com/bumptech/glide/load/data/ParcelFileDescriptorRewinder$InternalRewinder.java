package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {
    public final ParcelFileDescriptor a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
