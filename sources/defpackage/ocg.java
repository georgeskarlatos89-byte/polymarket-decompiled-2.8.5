package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ocg extends fq8 implements Function3 {
    public static final ocg f = new ocg();

    public ocg() {
        super(3, eb8.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((eb8) obj).emit(obj2, (Continuation) obj3);
    }
}
