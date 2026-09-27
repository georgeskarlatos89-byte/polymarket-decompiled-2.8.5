package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bvf extends quf implements taa {
    public final zuf a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public bvf(zuf zufVar, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.a = zufVar;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.taa
    public final cuf a(xl8 xl8Var) {
        xl8Var.getClass();
        return ytn.a(this.b, xl8Var);
    }

    @Override // defpackage.taa
    public final Collection getAnnotations() {
        return ytn.b(this.b);
    }

    public final String toString() {
        String str;
        csc cscVar;
        StringBuilder sb = new StringBuilder(bvf.class.getName());
        sb.append(": ");
        if (this.d) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb.append(str);
        String str2 = this.c;
        if (str2 != null) {
            cscVar = csc.d(str2);
        } else {
            cscVar = null;
        }
        sb.append(cscVar);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
