package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class cea {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            xga xgaVar = new xga(stringWriter);
            xgaVar.D(g1i.LENIENT);
            cgj.z.getClass();
            iea.f(xgaVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            dmk.i(e);
            return null;
        }
    }
}
