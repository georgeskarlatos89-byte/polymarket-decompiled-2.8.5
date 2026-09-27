package defpackage;

import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class kin {
    public static final void a(fv1 fv1Var) {
        fv1Var.getClass();
        fv1Var.a(new IOException("Channel was cancelled"));
    }

    public static e0d b(TypedValue typedValue, e0d e0dVar, e0d e0dVar2, String str, String str2) {
        e0dVar2.getClass();
        if (e0dVar != null && e0dVar != e0dVar2) {
            StringBuilder r = m51.r("Type is ", str, " but found ", str2, ": ");
            r.append(typedValue.data);
            throw new XmlPullParserException(r.toString());
        }
        if (e0dVar == null) {
            return e0dVar2;
        }
        return e0dVar;
    }
}
