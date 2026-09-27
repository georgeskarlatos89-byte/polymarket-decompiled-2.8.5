package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import io.sentry.android.core.m0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class skl extends zgl implements rll {
    public final AtomicReference f;
    public boolean g;

    public skl() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(Bundle bundle, Class cls) {
        Object obj;
        if (bundle != null && obj != null) {
            try {
                return cls.cast(obj);
            } catch (ClassCastException e) {
                m0.q("AM", m51.k("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e);
                throw e;
            }
        }
        return null;
    }

    @Override // defpackage.rll
    public final void E(Bundle bundle) {
        AtomicReference atomicReference = this.f;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.g = true;
                } finally {
                    this.f.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zgl
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) dhl.a(parcel, Bundle.CREATOR);
            dhl.d(parcel);
            E(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final Bundle c(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f;
        synchronized (atomicReference) {
            if (!this.g) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f.get();
        }
        return bundle;
    }
}
