package defpackage;

import java.io.File;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class huj implements zic {
    public static final huj b = new huj(0);
    public final /* synthetic */ int a;

    public /* synthetic */ huj(int i) {
        this.a = i;
    }

    @Override // defpackage.zic
    public final yic a(Object obj, int i, int i2, ild ildVar) {
        switch (this.a) {
            case 0:
                return new yic(new jfd(obj), new cu1(obj, 1));
            case 1:
                File file = (File) obj;
                return new yic(new jfd(file), new cu1(file, 0));
            default:
                return null;
        }
    }

    @Override // defpackage.zic
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
