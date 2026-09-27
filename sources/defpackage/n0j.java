package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class n0j implements jw2 {
    public static final n0j a = new Object();

    @Override // defpackage.jw2
    public final List a() {
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.jw2
    public final Member b() {
        return null;
    }

    @Override // defpackage.jw2
    public final boolean c() {
        return false;
    }

    @Override // defpackage.jw2
    public final Object call(Object[] objArr) {
        objArr.getClass();
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // defpackage.jw2
    public final Type getReturnType() {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }
}
