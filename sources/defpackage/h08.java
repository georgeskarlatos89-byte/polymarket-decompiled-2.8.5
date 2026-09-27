package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class h08 implements v74 {
    public final File a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public h08(File file) {
        this.a = file;
    }

    @Override // defpackage.v74
    public final void close() {
        this.b.set(true);
    }
}
