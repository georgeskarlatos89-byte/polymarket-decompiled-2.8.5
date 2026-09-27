package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fig extends Lambda implements Function1 {
    final /* synthetic */ gig h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fig(gig gigVar) {
        super(1);
        this.h = gigVar;
    }

    public final CharSequence a(Object obj) {
        if (obj == this.h) {
            return "(this)";
        }
        return String.valueOf(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(obj);
    }
}
