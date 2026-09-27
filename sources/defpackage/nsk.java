package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.Response;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nsk extends Lambda implements Function1 {
    public static final nsk h = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Response) obj).getClass();
        return new guk(Unit.INSTANCE);
    }
}
