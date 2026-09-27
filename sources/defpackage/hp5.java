package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class hp5 extends IOException {
    public final int a;

    public hp5(int i) {
        this.a = i;
    }

    public hp5(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public hp5(String str, int i, Exception exc) {
        super(str, exc);
        this.a = i;
    }
}
