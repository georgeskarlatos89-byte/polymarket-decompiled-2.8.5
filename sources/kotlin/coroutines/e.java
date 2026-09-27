package kotlin.coroutines;

import defpackage.jw4;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class e {
    public static CoroutineContext.Element a(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        if (Intrinsics.areEqual(element.getKey(), fVar)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext b(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        if (Intrinsics.areEqual(element.getKey(), fVar)) {
            return g.a;
        }
        return element;
    }

    public static CoroutineContext c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        if (coroutineContext == g.a) {
            return element;
        }
        return (CoroutineContext) coroutineContext.fold(element, new jw4(2));
    }
}
