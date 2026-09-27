package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iod {
    public final OutputConfiguration a;
    public long b = 1;

    public iod(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iod) {
            iod iodVar = (iod) obj;
            if (this.a.equals(iodVar.a) && this.b == iodVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 31;
        return Long.hashCode(this.b) ^ ((hashCode << 5) - hashCode);
    }
}
