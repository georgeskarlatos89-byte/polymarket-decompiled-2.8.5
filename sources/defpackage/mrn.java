package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mrn extends urn implements nqn {
    public final FileOutputStream a;
    public final File b;

    public mrn(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.nqn
    public final File zza() {
        return this.b;
    }
}
