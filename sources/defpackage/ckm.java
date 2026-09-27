package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import io.sentry.android.core.m0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ckm extends nuk implements b0o {
    public static final /* synthetic */ int h = 0;
    public final int g;

    public ckm(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 3);
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        arn.b(z);
        this.g = Arrays.hashCode(bArr);
    }

    public static byte[] S(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            dmk.i(e);
            return null;
        }
    }

    @Override // defpackage.nuk
    public final boolean P(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.g);
            return true;
        }
        xj9 zzd = zzd();
        parcel2.writeNoException();
        cjl.b(parcel2, zzd);
        return true;
    }

    public abstract byte[] R();

    public final boolean equals(Object obj) {
        xj9 zzd;
        if (obj instanceof b0o) {
            try {
                b0o b0oVar = (b0o) obj;
                if (b0oVar.zze() == this.g && (zzd = b0oVar.zzd()) != null) {
                    return Arrays.equals(R(), (byte[]) rfd.S(zzd));
                }
            } catch (RemoteException e) {
                m0.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g;
    }

    @Override // defpackage.b0o
    public final xj9 zzd() {
        return new rfd(R());
    }

    @Override // defpackage.b0o
    public final int zze() {
        return this.g;
    }
}
