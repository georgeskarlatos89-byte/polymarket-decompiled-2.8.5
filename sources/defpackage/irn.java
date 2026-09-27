package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class irn extends qrn implements nqn {
    public final File a;

    public irn(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = file;
    }

    @Override // defpackage.nqn
    public final File zza() {
        return this.a;
    }
}
