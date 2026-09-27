package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ytn {
    public static final cuf a(Annotation[] annotationArr, xl8 xl8Var) {
        Annotation annotation;
        annotationArr.getClass();
        xl8Var.getClass();
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                annotation = annotationArr[i];
                if (Intrinsics.areEqual(buf.a(vzm.m(vzm.l(annotation))).a(), xl8Var)) {
                    break;
                }
                i++;
            } else {
                annotation = null;
                break;
            }
        }
        if (annotation == null) {
            return null;
        }
        return new cuf(annotation);
    }

    public static final ArrayList b(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new cuf(annotation));
        }
        return arrayList;
    }

    public static List c(int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        return new ArrayList(i);
    }
}
