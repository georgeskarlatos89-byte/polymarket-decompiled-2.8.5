package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class knl implements twl, IInterface {
    public final IBinder f;

    public knl(IBinder iBinder) {
        this.f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }
}
